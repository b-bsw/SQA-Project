package org.apache.commons.math3.optimization.direct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

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
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1501");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        int int10 = cMAESOptimizer7.getEvaluations();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1502");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        int int11 = cMAESOptimizer10.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1503");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsMeanHistory();
        int int14 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1504");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray91 = cMAESOptimizer88.getLowerBound();
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1505");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList40 = cMAESOptimizer39.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray41 = cMAESOptimizer39.getStartPoint();
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1506");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator17, true, pointValuePairConvergenceChecker27);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray43);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList56 = cMAESOptimizer55.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList57 = cMAESOptimizer55.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer55.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray43, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator53, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10, 0, (double) 100.0f, false, 0, 1, randomGenerator53, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray64 = cMAESOptimizer63.getStartPoint();
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1507");
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
        int int19 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1508");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1509");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1510");
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
        int int43 = cMAESOptimizer41.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray44 = cMAESOptimizer41.getStartPoint();
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1511");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int4 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1512");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer11.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer11.doOptimize();
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1513");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair4 = cMAESOptimizer0.doOptimize();
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1514");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1515");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        int int12 = cMAESOptimizer8.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer8.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer8.doOptimize();
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1516");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        int int10 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1517");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        int int12 = cMAESOptimizer10.getEvaluations();
        int int13 = cMAESOptimizer10.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1518");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray9, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator16, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9);
        double[] doubleArray33 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray33);
        org.apache.commons.math3.random.RandomGenerator randomGenerator40 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray48 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray48);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker50 = cMAESOptimizer49.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray33, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator40, true, pointValuePairConvergenceChecker50);
        org.apache.commons.math3.random.RandomGenerator randomGenerator57 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray33, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator57, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray9, 100, (double) 100.0f, false, (int) (byte) 1, 0, randomGenerator57, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray63 = cMAESOptimizer62.getLowerBound();
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1519");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer8.getStatisticsMeanHistory();
        int int14 = cMAESOptimizer8.getEvaluations();
        int int15 = cMAESOptimizer8.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1520");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int7 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1521");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1522");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer12.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer12.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1523");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1524");
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
        int int38 = cMAESOptimizer36.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType39 = cMAESOptimizer36.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList40 = cMAESOptimizer36.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList41 = cMAESOptimizer36.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList42 = cMAESOptimizer36.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList43 = cMAESOptimizer36.getStatisticsSigmaHistory();
        int int44 = cMAESOptimizer36.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray45 = cMAESOptimizer36.getLowerBound();
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1525");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        int int10 = cMAESOptimizer8.getEvaluations();
        int int11 = cMAESOptimizer8.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer8.getConvergenceChecker();
        int int13 = cMAESOptimizer8.getEvaluations();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer8.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1526");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer10.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1527");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer8.getGoalType();
        int int10 = cMAESOptimizer8.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer8.doOptimize();
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1528");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        int int3 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1529");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair4 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1530");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11, 0, (double) 10.0f, false, (int) (byte) 100, (int) ' ', randomGenerator58, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray11);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList80 = cMAESOptimizer79.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray81 = cMAESOptimizer79.getLowerBound();
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1531");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1532");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1533");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1534");
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
        java.util.List<java.lang.Double> doubleList60 = cMAESOptimizer59.getStatisticsSigmaHistory();
        int int61 = cMAESOptimizer59.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair62 = cMAESOptimizer59.doOptimize();
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1535");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1536");
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
        java.util.List<java.lang.Double> doubleList87 = cMAESOptimizer84.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair88 = cMAESOptimizer84.doOptimize();
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1537");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1538");
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
        double[] doubleArray79 = cMAESOptimizer76.getStartPoint();
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1539");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1540");
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
        org.apache.commons.math3.optimization.GoalType goalType69 = cMAESOptimizer67.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList70 = cMAESOptimizer67.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray71 = cMAESOptimizer67.getUpperBound();
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1541");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList65 = cMAESOptimizer62.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList66 = cMAESOptimizer62.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType67 = cMAESOptimizer62.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray68 = cMAESOptimizer62.getStartPoint();
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1542");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1543");
        double[] doubleArray13 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray33 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray33);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray13, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator23, true, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13);
        double[] doubleArray53 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray53);
        org.apache.commons.math3.random.RandomGenerator randomGenerator60 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray68 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray68);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray53, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator60, true, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13, (int) (short) -1, (double) '4', false, (int) (short) 1, (-1), randomGenerator60, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList76 = cMAESOptimizer75.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair77 = cMAESOptimizer75.doOptimize();
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1544");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray9);
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer14.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer14.getUpperBound();
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1545");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1546");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1547");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray12);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList42 = cMAESOptimizer41.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray43 = cMAESOptimizer41.getStartPoint();
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1548");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        int int13 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1549");
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
        int int43 = cMAESOptimizer42.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer42.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList45 = cMAESOptimizer42.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray46 = cMAESOptimizer42.getLowerBound();
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1550");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer6.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer6.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer6.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer6.doOptimize();
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1551");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12);
        double[] doubleArray29 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray29);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray29);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray29);
        double[] doubleArray47 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray47);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray47);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray47);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray47);
        org.apache.commons.math3.random.RandomGenerator randomGenerator57 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray67 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray67);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray67);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray67);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray67);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker72 = cMAESOptimizer71.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray47, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator57, true, pointValuePairConvergenceChecker72);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray29, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator57, false);
        double[] doubleArray83 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray83);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList85 = cMAESOptimizer84.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList86 = cMAESOptimizer84.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker87 = cMAESOptimizer84.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray12, (int) (byte) 1, (double) 'a', true, (int) '#', 0, randomGenerator57, false, pointValuePairConvergenceChecker87);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair93 = cMAESOptimizer92.doOptimize();
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1552");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1553");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer97 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer98 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray99 = cMAESOptimizer98.getStartPoint();
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1554");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer14.getStartPoint();
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1555");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer12.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1556");
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
        org.apache.commons.math3.optimization.GoalType goalType19 = cMAESOptimizer12.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1557");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1558");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray66 = cMAESOptimizer65.getUpperBound();
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1559");
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
        java.util.List<java.lang.Double> doubleList39 = cMAESOptimizer38.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType40 = cMAESOptimizer38.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray41 = cMAESOptimizer38.getLowerBound();
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1560");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        double[] doubleArray28 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray28);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator38 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray48 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray48);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray48);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer51 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray48);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray48);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker53 = cMAESOptimizer52.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray28, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator38, true, pointValuePairConvergenceChecker53);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator38, false);
        double[] doubleArray70 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray70);
        org.apache.commons.math3.random.RandomGenerator randomGenerator78 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray86 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray86);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList88 = cMAESOptimizer87.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList89 = cMAESOptimizer87.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker90 = cMAESOptimizer87.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray70, 100, (double) 1, false, (int) (byte) 0, (int) (byte) 100, randomGenerator78, true, pointValuePairConvergenceChecker90);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10, (int) (short) 0, (double) 1, false, (int) '#', (int) '4', randomGenerator78, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray95 = cMAESOptimizer94.getStartPoint();
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1561");
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
        org.apache.commons.math3.optimization.PointValuePair pointValuePair43 = cMAESOptimizer42.doOptimize();
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1562");
        double[] doubleArray13 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray33 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray33);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray13, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator23, true, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray13);
        double[] doubleArray56 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray56);
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList69 = cMAESOptimizer68.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList70 = cMAESOptimizer68.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker71 = cMAESOptimizer68.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray56, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator66, true, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray13, (int) (short) 100, (double) (-1), false, (int) (short) 1, 0, randomGenerator66, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray13);
        int int76 = cMAESOptimizer75.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType77 = cMAESOptimizer75.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker78 = cMAESOptimizer75.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair79 = cMAESOptimizer75.doOptimize();
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1563");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1564");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1565");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        int int10 = cMAESOptimizer7.getEvaluations();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1566");
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
        int int90 = cMAESOptimizer88.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray91 = cMAESOptimizer88.getUpperBound();
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1567");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList56 = cMAESOptimizer55.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray57 = cMAESOptimizer55.getStartPoint();
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1568");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer12.getGoalType();
        int int16 = cMAESOptimizer12.getMaxEvaluations();
        int int17 = cMAESOptimizer12.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1569");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1570");
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
        int int65 = cMAESOptimizer62.getEvaluations();
        int int66 = cMAESOptimizer62.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair67 = cMAESOptimizer62.doOptimize();
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1571");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer15.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer15.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer15.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer15.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer15.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = cMAESOptimizer15.getStartPoint();
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1572");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1573");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer6.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer6.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer6.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer6.getStartPoint();
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1574");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        int int15 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer12.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer12.getStatisticsFitnessHistory();
        int int19 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1575");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1));
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1576");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer0.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1577");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer0.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer0.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker6 = cMAESOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair7 = cMAESOptimizer0.doOptimize();
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1578");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair20 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1579");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        int int11 = cMAESOptimizer10.getMaxEvaluations();
        int int12 = cMAESOptimizer10.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1580");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray12);
        java.util.List<java.lang.Double> doubleList42 = cMAESOptimizer41.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray43 = cMAESOptimizer41.getStartPoint();
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1581");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        int int13 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1582");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer8.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer8.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1583");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1));
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair3 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1584");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1585");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray10);
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10, (int) '4', (double) '4', true, (int) (byte) 100, (int) (short) 10, randomGenerator55, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        int int78 = cMAESOptimizer77.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair79 = cMAESOptimizer77.doOptimize();
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1586");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1587");
        double[] doubleArray13 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray33 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray33);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray13, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator23, true, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray13);
        double[] doubleArray56 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray56);
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList69 = cMAESOptimizer68.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList70 = cMAESOptimizer68.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker71 = cMAESOptimizer68.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray56, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator66, true, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray13, (int) (short) 100, (double) (-1), false, (int) (short) 1, 0, randomGenerator66, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray13);
        int int76 = cMAESOptimizer75.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType77 = cMAESOptimizer75.getGoalType();
        int int78 = cMAESOptimizer75.getEvaluations();
        java.util.List<java.lang.Double> doubleList79 = cMAESOptimizer75.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray80 = cMAESOptimizer75.getStartPoint();
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1588");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator17 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray25 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray25);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList27 = cMAESOptimizer26.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList28 = cMAESOptimizer26.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker29 = cMAESOptimizer26.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9, 100, (double) 1, false, (int) (byte) 0, (int) (byte) 100, randomGenerator17, true, pointValuePairConvergenceChecker29);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList32 = cMAESOptimizer31.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList33 = cMAESOptimizer31.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList34 = cMAESOptimizer31.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray35 = cMAESOptimizer31.getLowerBound();
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1589");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1590");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        double[] doubleArray39 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray39);
        double[] doubleArray53 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray53);
        org.apache.commons.math3.random.RandomGenerator randomGenerator60 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray68 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray68);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray53, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator60, true, pointValuePairConvergenceChecker70);
        double[] doubleArray79 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray79);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList81 = cMAESOptimizer80.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList82 = cMAESOptimizer80.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker83 = cMAESOptimizer80.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray39, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator60, true, pointValuePairConvergenceChecker83);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8, (int) '#', (double) (byte) 0, true, (int) 'a', (int) 'a', randomGenerator60, true);
        java.util.List<java.lang.Double> doubleList87 = cMAESOptimizer86.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType88 = cMAESOptimizer86.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray89 = cMAESOptimizer86.getLowerBound();
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1591");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsSigmaHistory();
        int int10 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1592");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray62 = cMAESOptimizer61.getStartPoint();
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1593");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType21 = cMAESOptimizer12.getGoalType();
        int int22 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray23 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1594");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        int int11 = cMAESOptimizer10.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer10.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1595");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        int int6 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1596");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair2 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1597");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer10.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1598");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1599");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1600");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList62 = cMAESOptimizer60.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray63 = cMAESOptimizer60.getStartPoint();
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1601");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer13.getUpperBound();
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1602");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer6.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer6.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer6.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer6.doOptimize();
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1603");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer6.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer6.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1604");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer6.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer6.getStatisticsMeanHistory();
        int int9 = cMAESOptimizer6.getEvaluations();
        int int10 = cMAESOptimizer6.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1605");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer88.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList90 = cMAESOptimizer88.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray91 = cMAESOptimizer88.getStartPoint();
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1606");
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
        int int19 = cMAESOptimizer12.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1607");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer14.getUpperBound();
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1608");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1609");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        int int71 = cMAESOptimizer70.getEvaluations();
        int int72 = cMAESOptimizer70.getMaxEvaluations();
        int int73 = cMAESOptimizer70.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList74 = cMAESOptimizer70.getStatisticsDHistory();
        int int75 = cMAESOptimizer70.getEvaluations();
        int int76 = cMAESOptimizer70.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair77 = cMAESOptimizer70.doOptimize();
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1610");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1611");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray2 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1612");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        double[] doubleArray24 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray24);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray56);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer57.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator48, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator48, true);
        double[] doubleArray70 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray70);
        org.apache.commons.math3.random.RandomGenerator randomGenerator77 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray85 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray85);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker87 = cMAESOptimizer86.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray70, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator77, true, pointValuePairConvergenceChecker87);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8, (int) (short) 10, (double) (byte) 100, true, (int) '4', (int) (short) 1, randomGenerator48, true, pointValuePairConvergenceChecker87);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList92 = cMAESOptimizer91.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray93 = cMAESOptimizer91.getLowerBound();
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1613");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1614");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray26);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray58 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray58);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator50, true, pointValuePairConvergenceChecker60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator50, true);
        double[] doubleArray72 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray72);
        org.apache.commons.math3.random.RandomGenerator randomGenerator79 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray87 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray87);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer88.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray72, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator79, true, pointValuePairConvergenceChecker89);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray10, (int) (short) 10, (double) (byte) 100, true, (int) '4', (int) (short) 1, randomGenerator50, true, pointValuePairConvergenceChecker89);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        java.util.List<java.lang.Double> doubleList96 = cMAESOptimizer95.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray97 = cMAESOptimizer95.getStartPoint();
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1615");
        double[] doubleArray13 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray33 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray33);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray13, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator23, true, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13);
        double[] doubleArray53 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray53);
        org.apache.commons.math3.random.RandomGenerator randomGenerator60 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray68 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray68);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray53, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator60, true, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13, (int) (short) -1, (double) '4', false, (int) (short) 1, (-1), randomGenerator60, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.optimization.GoalType goalType76 = cMAESOptimizer75.getGoalType();
        java.util.List<java.lang.Double> doubleList77 = cMAESOptimizer75.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray78 = cMAESOptimizer75.getLowerBound();
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1616");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1617");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray26);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray58 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray58);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator50, true, pointValuePairConvergenceChecker60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator50, true);
        double[] doubleArray72 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray72);
        org.apache.commons.math3.random.RandomGenerator randomGenerator79 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray87 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray87);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer88.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray72, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator79, true, pointValuePairConvergenceChecker89);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray10, (int) (short) 10, (double) (byte) 100, true, (int) '4', (int) (short) 1, randomGenerator50, true, pointValuePairConvergenceChecker89);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair96 = cMAESOptimizer95.doOptimize();
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1618");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1619");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1620");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1621");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair88 = cMAESOptimizer86.doOptimize();
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1622");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1623");
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
        org.apache.commons.math3.optimization.GoalType goalType71 = cMAESOptimizer67.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray72 = cMAESOptimizer67.getUpperBound();
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1624");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1625");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1626");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        int int9 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1627");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1628");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1629");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getEvaluations();
        int int14 = cMAESOptimizer10.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer10.getGoalType();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1630");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer6.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer6.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1631");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer12.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsDHistory();
        int int16 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1632");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer12.getGoalType();
        int int14 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1633");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        int int15 = cMAESOptimizer12.getEvaluations();
        int int16 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1634");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1635");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1636");
        double[] doubleArray14 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray14);
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray34 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray34);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray14, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator24, true, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray14);
        double[] doubleArray54 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray54);
        org.apache.commons.math3.random.RandomGenerator randomGenerator61 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray69 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray69);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker71 = cMAESOptimizer70.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray54, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator61, true, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray14, (int) (short) -1, (double) '4', false, (int) (short) 1, (-1), randomGenerator61, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray14);
        org.apache.commons.math3.optimization.GoalType goalType78 = cMAESOptimizer77.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker79 = cMAESOptimizer77.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair80 = cMAESOptimizer77.doOptimize();
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1637");
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
        int int38 = cMAESOptimizer36.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType39 = cMAESOptimizer36.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList40 = cMAESOptimizer36.getStatisticsMeanHistory();
        int int41 = cMAESOptimizer36.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList42 = cMAESOptimizer36.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray43 = cMAESOptimizer36.getUpperBound();
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1638");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair9 = cMAESOptimizer8.doOptimize();
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1639");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1640");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1641");
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
        int int90 = cMAESOptimizer88.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair91 = cMAESOptimizer88.doOptimize();
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1642");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray11);
        double[] doubleArray28 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray28);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker45 = cMAESOptimizer44.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray28, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator35, true, pointValuePairConvergenceChecker45);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator35, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11);
        java.util.List<java.lang.Double> doubleList51 = cMAESOptimizer50.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray52 = cMAESOptimizer50.getStartPoint();
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1643");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getMaxEvaluations();
        int int10 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer8.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getStartPoint();
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1644");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer15.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer15.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer15.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer15.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker20 = cMAESOptimizer15.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = cMAESOptimizer15.getUpperBound();
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1645");
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
        int int37 = cMAESOptimizer34.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList38 = cMAESOptimizer34.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList39 = cMAESOptimizer34.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray40 = cMAESOptimizer34.getStartPoint();
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1646");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer10.getGoalType();
        int int16 = cMAESOptimizer10.getMaxEvaluations();
        int int17 = cMAESOptimizer10.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1647");
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
        int int79 = cMAESOptimizer76.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray80 = cMAESOptimizer76.getLowerBound();
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1648");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<java.lang.Double> doubleList1 = cMAESOptimizer0.getStatisticsSigmaHistory();
        int int2 = cMAESOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer0.getLowerBound();
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1649");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer6.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer6.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1650");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        int int71 = cMAESOptimizer70.getEvaluations();
        int int72 = cMAESOptimizer70.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList73 = cMAESOptimizer70.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray74 = cMAESOptimizer70.getLowerBound();
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1651");
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
        java.util.List<java.lang.Double> doubleList87 = cMAESOptimizer84.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer84.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair89 = cMAESOptimizer84.doOptimize();
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1652");
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
        org.apache.commons.math3.optimization.GoalType goalType37 = cMAESOptimizer36.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray38 = cMAESOptimizer36.getUpperBound();
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1653");
        double[] doubleArray14 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray14);
        org.apache.commons.math3.random.RandomGenerator randomGenerator21 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray29 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray29);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker31 = cMAESOptimizer30.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray14, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator21, true, pointValuePairConvergenceChecker31);
        org.apache.commons.math3.random.RandomGenerator randomGenerator38 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray14, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator38, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray14);
        double[] doubleArray57 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray57);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray57);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray57);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray57);
        org.apache.commons.math3.random.RandomGenerator randomGenerator67 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray77 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray77);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray77);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker82 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray57, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator67, true, pointValuePairConvergenceChecker82);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray14, (int) (byte) -1, (double) ' ', true, (int) (byte) -1, (int) (short) 10, randomGenerator67, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair89 = cMAESOptimizer88.doOptimize();
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1654");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer12.getStatisticsMeanHistory();
        int int14 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1655");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        double[] doubleArray31 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray31);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray31);
        org.apache.commons.math3.random.RandomGenerator randomGenerator41 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer43.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList45 = cMAESOptimizer43.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker46 = cMAESOptimizer43.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray31, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator41, true, pointValuePairConvergenceChecker46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray31);
        double[] doubleArray63 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray63);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray63);
        org.apache.commons.math3.random.RandomGenerator randomGenerator73 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList76 = cMAESOptimizer75.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList77 = cMAESOptimizer75.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker78 = cMAESOptimizer75.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray63, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator73, true, pointValuePairConvergenceChecker78);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray31, (int) (byte) 100, 1.0d, false, (int) (short) 100, (int) (short) -1, randomGenerator73, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray10, (int) (byte) 10, (double) 1.0f, true, (int) (byte) 100, (int) (byte) 10, randomGenerator73, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray85 = cMAESOptimizer84.getStartPoint();
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1656");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        int int2 = cMAESOptimizer0.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer0.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair6 = cMAESOptimizer0.doOptimize();
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1657");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9);
        int int70 = cMAESOptimizer69.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair71 = cMAESOptimizer69.doOptimize();
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1658");
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
        java.util.List<java.lang.Double> doubleList76 = cMAESOptimizer75.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray77 = cMAESOptimizer75.getLowerBound();
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1659");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer16.getStartPoint();
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1660");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        int int13 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1661");
        double[] doubleArray13 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray23 = cMAESOptimizer22.getLowerBound();
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1662");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray46 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray46);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer50 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray46);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker51 = cMAESOptimizer50.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray26, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator36, true, pointValuePairConvergenceChecker51);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray8, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator36, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray55 = cMAESOptimizer54.getUpperBound();
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1663");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        int int9 = cMAESOptimizer6.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1664");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1665");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer7.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer7.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1666");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray8);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray26);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray58 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray58);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator50, true, pointValuePairConvergenceChecker60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator50, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray8, (int) (short) 10, (double) 0L, false, (int) (short) -1, (-1), randomGenerator50, false);
        int int66 = cMAESOptimizer65.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair67 = cMAESOptimizer65.doOptimize();
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1667");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        double[] doubleArray29 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray29);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker46 = cMAESOptimizer45.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray29, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator36, true, pointValuePairConvergenceChecker46);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray29, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator53, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray10, 30000, (double) 1, true, 30000, (int) (short) 0, randomGenerator53, true, pointValuePairConvergenceChecker60);
        java.util.List<java.lang.Double> doubleList62 = cMAESOptimizer61.getStatisticsSigmaHistory();
        int int63 = cMAESOptimizer61.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker64 = cMAESOptimizer61.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray65 = cMAESOptimizer61.getLowerBound();
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1668");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1669");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray23, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator30, true);
        double[] doubleArray45 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray45);
        double[] doubleArray59 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray59);
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray74 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray74);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer75.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray59, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator66, true, pointValuePairConvergenceChecker76);
        double[] doubleArray85 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray85);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList87 = cMAESOptimizer86.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList88 = cMAESOptimizer86.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer86.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray45, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator66, true, pointValuePairConvergenceChecker89);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray23, 10, (double) 1L, false, (int) (short) 10, (int) (byte) 0, randomGenerator66, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9, 1, (double) (-1.0f), false, 1, 1, randomGenerator66, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray97 = cMAESOptimizer96.getStartPoint();
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1670");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1671");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer14.getLowerBound();
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1672");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray11);
        double[] doubleArray30 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.random.RandomGenerator randomGenerator37 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray30, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator37, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray30);
        double[] doubleArray54 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray54);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray54);
        org.apache.commons.math3.random.RandomGenerator randomGenerator62 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray70 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray70);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList72 = cMAESOptimizer71.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer71.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer71.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray54, 100, (double) 1, false, (int) (byte) 0, (int) (byte) 100, randomGenerator62, true, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray30, 30000, (double) '#', false, 0, 100, randomGenerator62, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray11, (int) ' ', (double) (-1), false, (int) (byte) 1, 1, randomGenerator62, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray81 = cMAESOptimizer80.getUpperBound();
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1673");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker61 = cMAESOptimizer60.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair62 = cMAESOptimizer60.doOptimize();
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1674");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1675");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        int int8 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1676");
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
        org.apache.commons.math3.optimization.GoalType goalType62 = cMAESOptimizer59.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray63 = cMAESOptimizer59.getUpperBound();
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1677");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator15, true);
        double[] doubleArray30 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray30);
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray59 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray59);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker61 = cMAESOptimizer60.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray44, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator51, true, pointValuePairConvergenceChecker61);
        double[] doubleArray70 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray70);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList72 = cMAESOptimizer71.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer71.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer71.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray30, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator51, true, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray8, 10, (double) 1L, false, (int) (short) 10, (int) (byte) 0, randomGenerator51, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray8);
        java.util.List<java.lang.Double> doubleList79 = cMAESOptimizer78.getStatisticsFitnessHistory();
        int int80 = cMAESOptimizer78.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray81 = cMAESOptimizer78.getStartPoint();
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1678");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer12.getConvergenceChecker();
        int int15 = cMAESOptimizer12.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType16 = cMAESOptimizer12.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1679");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1680");
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
        java.util.List<java.lang.Double> doubleList87 = cMAESOptimizer84.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList88 = cMAESOptimizer84.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList89 = cMAESOptimizer84.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray90 = cMAESOptimizer84.getLowerBound();
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1681");
        double[] doubleArray14 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray14);
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray34 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray34);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray14, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator24, true, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray14);
        double[] doubleArray54 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray54);
        org.apache.commons.math3.random.RandomGenerator randomGenerator61 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray69 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray69);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker71 = cMAESOptimizer70.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray54, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator61, true, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray14, (int) (short) -1, (double) '4', false, (int) (short) 1, (-1), randomGenerator61, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray14);
        int int78 = cMAESOptimizer77.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray79 = cMAESOptimizer77.getStartPoint();
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1682");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair36 = cMAESOptimizer34.doOptimize();
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1683");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        int int13 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1684");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1685");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int12 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1686");
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
        double[] doubleArray35 = cMAESOptimizer34.getStartPoint();
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1687");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray91 = cMAESOptimizer90.getLowerBound();
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1688");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer6.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer6.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer6.getGoalType();
        int int10 = cMAESOptimizer6.getEvaluations();
        int int11 = cMAESOptimizer6.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer6.getStartPoint();
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1689");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList36 = cMAESOptimizer34.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray37 = cMAESOptimizer34.getStartPoint();
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1690");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        int int10 = cMAESOptimizer8.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair12 = cMAESOptimizer8.doOptimize();
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1691");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair5 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1692");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray12);
        double[] doubleArray55 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray55);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray55);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList68 = cMAESOptimizer67.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList69 = cMAESOptimizer67.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray55, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator65, true, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray12, (int) (short) 100, (double) (-1), false, (int) (short) 1, 0, randomGenerator65, false);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList74 = cMAESOptimizer73.getStatisticsMeanHistory();
        int int75 = cMAESOptimizer73.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList76 = cMAESOptimizer73.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList77 = cMAESOptimizer73.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList78 = cMAESOptimizer73.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray79 = cMAESOptimizer73.getLowerBound();
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1693");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType16 = cMAESOptimizer12.getGoalType();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1694");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray24 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray24);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker26 = cMAESOptimizer25.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator16, true, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray9, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator33, false);
        double[] doubleArray48 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray48);
        org.apache.commons.math3.random.RandomGenerator randomGenerator55 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray63 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker65 = cMAESOptimizer64.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray48, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator55, true, pointValuePairConvergenceChecker65);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray9, (-1), (double) (short) 10, false, (int) ' ', (-1), randomGenerator55, true);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray69 = cMAESOptimizer68.getStartPoint();
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1695");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList53 = cMAESOptimizer52.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList54 = cMAESOptimizer52.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair55 = cMAESOptimizer52.doOptimize();
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1696");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        int int19 = cMAESOptimizer18.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer18.getUpperBound();
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1697");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        int int2 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1698");
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
        java.util.List<java.lang.Double> doubleList60 = cMAESOptimizer59.getStatisticsSigmaHistory();
        int int61 = cMAESOptimizer59.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray62 = cMAESOptimizer59.getStartPoint();
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1699");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9);
        double[] doubleArray27 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray27);
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray59 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray59);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker61 = cMAESOptimizer60.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray44, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator51, true, pointValuePairConvergenceChecker61);
        double[] doubleArray72 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray72);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray72);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray72);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray72);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer76.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray27, (int) '#', (double) (short) 1, true, (int) (byte) 100, (int) '#', randomGenerator51, true, pointValuePairConvergenceChecker77);
        double[] doubleArray86 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray86);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer87.getConvergenceChecker();
        int int89 = cMAESOptimizer87.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker90 = cMAESOptimizer87.getConvergenceChecker();
        int int91 = cMAESOptimizer87.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker92 = cMAESOptimizer87.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9, (int) 'a', (double) (short) 1, true, 0, (int) 'a', randomGenerator51, true, pointValuePairConvergenceChecker92);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        int int95 = cMAESOptimizer94.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList96 = cMAESOptimizer94.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList97 = cMAESOptimizer94.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList98 = cMAESOptimizer94.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray99 = cMAESOptimizer94.getStartPoint();
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1700");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1701");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        int int9 = cMAESOptimizer6.getEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer6.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer6.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer6.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer6.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1702");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1703");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1704");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList65 = cMAESOptimizer62.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray66 = cMAESOptimizer62.getLowerBound();
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1705");
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
        org.apache.commons.math3.optimization.GoalType goalType77 = cMAESOptimizer76.getGoalType();
        int int78 = cMAESOptimizer76.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList79 = cMAESOptimizer76.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray80 = cMAESOptimizer76.getLowerBound();
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1706");
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
        int int37 = cMAESOptimizer34.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList38 = cMAESOptimizer34.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList39 = cMAESOptimizer34.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair40 = cMAESOptimizer34.doOptimize();
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1707");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        int int71 = cMAESOptimizer70.getEvaluations();
        int int72 = cMAESOptimizer70.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer70.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer70.getConvergenceChecker();
        int int75 = cMAESOptimizer70.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray76 = cMAESOptimizer70.getStartPoint();
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1708");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1709");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer0.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker3 = cMAESOptimizer0.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer0.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1710");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        int int5 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1711");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker73 = cMAESOptimizer72.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray74 = cMAESOptimizer72.getStartPoint();
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1712");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1713");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12);
        double[] doubleArray29 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray29);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker46 = cMAESOptimizer45.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray29, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator36, true, pointValuePairConvergenceChecker46);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray29, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator53, false);
        double[] doubleArray65 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray65);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray65);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray65);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray65);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator53, false, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray76 = cMAESOptimizer75.getStartPoint();
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1714");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer10.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1715");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer16.getStartPoint();
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1716");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        int int13 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer7.getGoalType();
        int int15 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1717");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer16.getUpperBound();
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1718");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer10.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer10.getGoalType();
        int int15 = cMAESOptimizer10.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType16 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1719");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getEvaluations();
        int int14 = cMAESOptimizer10.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer10.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer10.getStatisticsMeanHistory();
        int int17 = cMAESOptimizer10.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1720");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList60 = cMAESOptimizer59.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList61 = cMAESOptimizer59.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker62 = cMAESOptimizer59.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray63 = cMAESOptimizer59.getStartPoint();
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1721");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray23 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray23);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker25 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator15, true, pointValuePairConvergenceChecker25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray8);
        java.util.List<java.lang.Double> doubleList28 = cMAESOptimizer27.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray29 = cMAESOptimizer27.getLowerBound();
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1722");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1723");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray11);
        double[] doubleArray30 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer33 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray30);
        double[] doubleArray47 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray47);
        org.apache.commons.math3.random.RandomGenerator randomGenerator54 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray62 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray62);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker64 = cMAESOptimizer63.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray47, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator54, true, pointValuePairConvergenceChecker64);
        org.apache.commons.math3.random.RandomGenerator randomGenerator71 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray47, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator71, false);
        double[] doubleArray83 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer84 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray83);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray83);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray83);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray83);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer87.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray30, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator71, false, pointValuePairConvergenceChecker88);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray11, 10, (double) 30000, true, (int) (byte) 10, 0, randomGenerator71, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray93 = cMAESOptimizer92.getLowerBound();
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1724");
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
        org.apache.commons.math3.optimization.GoalType goalType71 = cMAESOptimizer67.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList72 = cMAESOptimizer67.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer67.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray74 = cMAESOptimizer67.getUpperBound();
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1725");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1726");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        org.apache.commons.math3.optimization.GoalType goalType7 = cMAESOptimizer6.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer6.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer6.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer6.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1727");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList76 = cMAESOptimizer75.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer75.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType78 = cMAESOptimizer75.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList79 = cMAESOptimizer75.getStatisticsDHistory();
        int int80 = cMAESOptimizer75.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair81 = cMAESOptimizer75.doOptimize();
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1728");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        int int3 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1729");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1730");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1731");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray78 = cMAESOptimizer76.getUpperBound();
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1732");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        int int9 = cMAESOptimizer6.getEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer6.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer6.getStatisticsDHistory();
        int int12 = cMAESOptimizer6.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1733");
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
        java.util.List<java.lang.Double> doubleList60 = cMAESOptimizer59.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList61 = cMAESOptimizer59.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray62 = cMAESOptimizer59.getLowerBound();
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1734");
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
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker96 = cMAESOptimizer92.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray97 = cMAESOptimizer92.getLowerBound();
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1735");
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
        int int38 = cMAESOptimizer36.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType39 = cMAESOptimizer36.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList40 = cMAESOptimizer36.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList41 = cMAESOptimizer36.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList42 = cMAESOptimizer36.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList43 = cMAESOptimizer36.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList44 = cMAESOptimizer36.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList45 = cMAESOptimizer36.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray46 = cMAESOptimizer36.getLowerBound();
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1736");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer18.getLowerBound();
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1737");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList96 = cMAESOptimizer94.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker97 = cMAESOptimizer94.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray98 = cMAESOptimizer94.getLowerBound();
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1738");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray24 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray24);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker26 = cMAESOptimizer25.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator16, true, pointValuePairConvergenceChecker26);
        double[] doubleArray40 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray40);
        double[] doubleArray54 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray54);
        org.apache.commons.math3.random.RandomGenerator randomGenerator61 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray69 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray69);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker71 = cMAESOptimizer70.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray54, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator61, true, pointValuePairConvergenceChecker71);
        double[] doubleArray80 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray80);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList82 = cMAESOptimizer81.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList83 = cMAESOptimizer81.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker84 = cMAESOptimizer81.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray40, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator61, true, pointValuePairConvergenceChecker84);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9, (int) '#', (double) (byte) 0, true, (int) 'a', (int) 'a', randomGenerator61, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray89 = cMAESOptimizer88.getStartPoint();
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1739");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        int int15 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1740");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray42 = cMAESOptimizer41.getUpperBound();
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1741");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer15.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer15.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer15.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer15.getStartPoint();
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1742");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        int int13 = cMAESOptimizer12.getEvaluations();
        int int14 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1743");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator15, true);
        double[] doubleArray30 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray30);
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray59 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray59);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker61 = cMAESOptimizer60.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray44, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator51, true, pointValuePairConvergenceChecker61);
        double[] doubleArray70 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray70);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList72 = cMAESOptimizer71.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer71.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer71.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray30, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator51, true, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray8, 10, (double) 1L, false, (int) (short) 10, (int) (byte) 0, randomGenerator51, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray79 = cMAESOptimizer78.getLowerBound();
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1744");
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
        double[] doubleArray81 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray81);
        org.apache.commons.math3.random.RandomGenerator randomGenerator88 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray81, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator88, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10, 30000, (double) 100, true, (int) (short) 1, 10, randomGenerator88, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray94 = cMAESOptimizer93.getUpperBound();
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1745");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        int int9 = cMAESOptimizer6.getEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer6.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer6.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer6.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer6.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1746");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray49 = cMAESOptimizer48.getUpperBound();
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1747");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList3 = cMAESOptimizer1.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1748");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer6.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer6.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer6.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer6.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer6.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer6.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer6.getStatisticsDHistory();
        int int16 = cMAESOptimizer6.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer6.getStartPoint();
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1749");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer10.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1750");
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
        org.apache.commons.math3.optimization.PointValuePair pointValuePair78 = cMAESOptimizer75.doOptimize();
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1751");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray9);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer14.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer14.getLowerBound();
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1752");
        double[] doubleArray11 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray11);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray11);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = cMAESOptimizer18.doOptimize();
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1753");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray12);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList25 = cMAESOptimizer24.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList26 = cMAESOptimizer24.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator22, true, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12);
        org.apache.commons.math3.random.RandomGenerator randomGenerator35 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray12, (-1), (double) 10.0f, false, (int) (short) -1, 10, randomGenerator35, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray12);
        java.util.List<java.lang.Double> doubleList39 = cMAESOptimizer38.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray40 = cMAESOptimizer38.getStartPoint();
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1754");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        int int11 = cMAESOptimizer7.getEvaluations();
        int int12 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1755");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer1.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int4 = cMAESOptimizer1.getMaxEvaluations();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1756");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1757");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.random.RandomGenerator randomGenerator14 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray7, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator14, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray7);
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer17.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer17.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType20 = cMAESOptimizer17.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = cMAESOptimizer17.getLowerBound();
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1758");
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
        int int15 = cMAESOptimizer6.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1759");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker71 = cMAESOptimizer69.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray72 = cMAESOptimizer69.getUpperBound();
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1760");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer6.getStatisticsDHistory();
        int int8 = cMAESOptimizer6.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList9 = cMAESOptimizer6.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1761");
        double[] doubleArray13 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray33 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray33);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray13, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator23, true, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray13);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList44 = cMAESOptimizer43.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray45 = cMAESOptimizer43.getLowerBound();
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1762");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        int int6 = cMAESOptimizer1.getEvaluations();
        int int7 = cMAESOptimizer1.getEvaluations();
        int int8 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1763");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        int int9 = cMAESOptimizer6.getEvaluations();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer6.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer6.getStatisticsDHistory();
        int int12 = cMAESOptimizer6.getEvaluations();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer6.getStatisticsSigmaHistory();
        int int14 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer6.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer6.doOptimize();
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1764");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        int int13 = cMAESOptimizer12.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        int int15 = cMAESOptimizer12.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer12.getStatisticsDHistory();
        int int17 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1765");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1766");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1767");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1768");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker5 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1769");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1770");
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
        org.apache.commons.math3.optimization.GoalType goalType73 = cMAESOptimizer72.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer72.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList75 = cMAESOptimizer72.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray76 = cMAESOptimizer72.getLowerBound();
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1771");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        double[] doubleArray23 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray23);
        org.apache.commons.math3.random.RandomGenerator randomGenerator30 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer32 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray23, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator30, true);
        double[] doubleArray45 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray45);
        double[] doubleArray59 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray59);
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray74 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray74);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker76 = cMAESOptimizer75.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray59, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator66, true, pointValuePairConvergenceChecker76);
        double[] doubleArray85 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray85);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList87 = cMAESOptimizer86.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList88 = cMAESOptimizer86.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer86.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray45, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator66, true, pointValuePairConvergenceChecker89);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray23, 10, (double) 1L, false, (int) (short) 10, (int) (byte) 0, randomGenerator66, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9, 1, (double) (-1.0f), false, 1, 1, randomGenerator66, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray97 = cMAESOptimizer96.getUpperBound();
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1772");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer6.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer6.getStatisticsSigmaHistory();
        int int11 = cMAESOptimizer6.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer6.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer6.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer6.getStatisticsDHistory();
        int int15 = cMAESOptimizer6.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer6.getUpperBound();
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1773");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1774");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType4 = cMAESOptimizer1.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1775");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsDHistory();
        int int16 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1776");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer12.getGoalType();
        int int16 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1777");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType16 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1778");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        int int12 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1779");
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
        java.util.List<java.lang.Double> doubleList85 = cMAESOptimizer84.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList86 = cMAESOptimizer84.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair87 = cMAESOptimizer84.doOptimize();
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1780");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer8.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer8.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer8.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer8.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer8.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1781");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList38 = cMAESOptimizer34.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray39 = cMAESOptimizer34.getLowerBound();
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1782");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList62 = cMAESOptimizer60.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList63 = cMAESOptimizer60.getStatisticsDHistory();
        int int64 = cMAESOptimizer60.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray65 = cMAESOptimizer60.getLowerBound();
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1783");
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
        org.apache.commons.math3.optimization.GoalType goalType56 = cMAESOptimizer55.getGoalType();
        java.util.List<java.lang.Double> doubleList57 = cMAESOptimizer55.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList58 = cMAESOptimizer55.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray59 = cMAESOptimizer55.getStartPoint();
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1784");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer10.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer10.getGoalType();
        int int15 = cMAESOptimizer10.getEvaluations();
        int int16 = cMAESOptimizer10.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1785");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer15.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer15.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType18 = cMAESOptimizer15.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer15.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList20 = cMAESOptimizer15.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer15.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray22 = cMAESOptimizer15.getStartPoint();
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1786");
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray28 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray28);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker30 = cMAESOptimizer29.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator20, true, pointValuePairConvergenceChecker30);
        org.apache.commons.math3.random.RandomGenerator randomGenerator37 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray13, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator37, false);
        double[] doubleArray52 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer53 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray52);
        org.apache.commons.math3.random.RandomGenerator randomGenerator59 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray67 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray67);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker69 = cMAESOptimizer68.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray52, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator59, true, pointValuePairConvergenceChecker69);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray13, (-1), (double) (short) 10, false, (int) ' ', (-1), randomGenerator59, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray13);
        org.apache.commons.math3.optimization.GoalType goalType77 = cMAESOptimizer76.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray78 = cMAESOptimizer76.getLowerBound();
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1787");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer8.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer8.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer8.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1788");
        double[] doubleArray13 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator20 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray28 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray28);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker30 = cMAESOptimizer29.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator20, true, pointValuePairConvergenceChecker30);
        org.apache.commons.math3.random.RandomGenerator randomGenerator37 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray13, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator37, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray45 = cMAESOptimizer44.getLowerBound();
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1789");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1790");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.GoalType goalType8 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer7.getGoalType();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1791");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1));
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int6 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1792");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1793");
        double[] doubleArray5 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer6 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray5);
        int int7 = cMAESOptimizer6.getEvaluations();
        int int8 = cMAESOptimizer6.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer6.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer6.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer6.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer6.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer6.getLowerBound();
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1794");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray43 = cMAESOptimizer42.getStartPoint();
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1795");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1796");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        int int13 = cMAESOptimizer12.getMaxEvaluations();
        int int14 = cMAESOptimizer12.getEvaluations();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        int int16 = cMAESOptimizer12.getMaxEvaluations();
        int int17 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1797");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray12);
        org.apache.commons.math3.random.RandomGenerator randomGenerator19 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray27 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray27);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker29 = cMAESOptimizer28.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator19, true, pointValuePairConvergenceChecker29);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray12, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator36, false);
        double[] doubleArray51 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer52 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray51);
        org.apache.commons.math3.random.RandomGenerator randomGenerator58 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray66 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray66);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker68 = cMAESOptimizer67.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray51, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator58, true, pointValuePairConvergenceChecker68);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray12, (-1), (double) (short) 10, false, (int) ' ', (-1), randomGenerator58, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray12);
        int int75 = cMAESOptimizer74.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair76 = cMAESOptimizer74.doOptimize();
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1798");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray9);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray26);
        double[] doubleArray44 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray44);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray44);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray44);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator54 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray64 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray64);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker69 = cMAESOptimizer68.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray44, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator54, true, pointValuePairConvergenceChecker69);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator54, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray9, (int) '4', (double) '4', true, (int) (byte) 100, (int) (short) 10, randomGenerator54, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray9);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList76 = cMAESOptimizer75.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker77 = cMAESOptimizer75.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList78 = cMAESOptimizer75.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray79 = cMAESOptimizer75.getStartPoint();
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1799");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1800");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        int int13 = cMAESOptimizer12.getEvaluations();
        int int14 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1801");
        double[] doubleArray15 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer21 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer22 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer23 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray15);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray15);
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator65 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray42, (-1), (double) 10.0f, false, (int) (short) -1, 10, randomGenerator65, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray15, 0, 1.0d, false, (int) (short) -1, (int) (byte) 100, randomGenerator65, false);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray70 = cMAESOptimizer69.getLowerBound();
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1802");
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
        org.apache.commons.math3.optimization.GoalType goalType69 = cMAESOptimizer67.getGoalType();
        int int70 = cMAESOptimizer67.getEvaluations();
        int int71 = cMAESOptimizer67.getEvaluations();
        int int72 = cMAESOptimizer67.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray73 = cMAESOptimizer67.getStartPoint();
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1803");
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
        int int37 = cMAESOptimizer36.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer36.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray39 = cMAESOptimizer36.getLowerBound();
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1804");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        int int15 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer12.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1805");
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
        java.util.List<java.lang.Double> doubleList26 = cMAESOptimizer25.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList27 = cMAESOptimizer25.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair28 = cMAESOptimizer25.doOptimize();
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1806");
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
        double[] doubleArray16 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1807");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1808");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray12 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1809");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1810");
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
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1811");
        double[] doubleArray13 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray33 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray33);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray13, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator23, true, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13);
        double[] doubleArray53 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer54 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray53);
        org.apache.commons.math3.random.RandomGenerator randomGenerator60 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray68 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray68);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker70 = cMAESOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray53, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator60, true, pointValuePairConvergenceChecker70);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13, (int) (short) -1, (double) '4', false, (int) (short) 1, (-1), randomGenerator60, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        int int76 = cMAESOptimizer75.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray77 = cMAESOptimizer75.getStartPoint();
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1812");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1813");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsDHistory();
        int int14 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1814");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray4 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1815");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair39 = cMAESOptimizer38.doOptimize();
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1816");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer12.getStatisticsMeanHistory();
        int int16 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1817");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer15.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer15.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer15.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList19 = cMAESOptimizer15.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList20 = cMAESOptimizer15.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer15.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray22 = cMAESOptimizer15.getUpperBound();
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1818");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        int int13 = cMAESOptimizer12.getEvaluations();
        int int14 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1819");
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
        int int20 = cMAESOptimizer12.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList22 = cMAESOptimizer12.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList23 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray24 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1820");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType16 = cMAESOptimizer7.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1821");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer16.getLowerBound();
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1822");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray10);
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10, (int) '4', (double) '4', true, (int) (byte) 100, (int) (short) 10, randomGenerator55, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker78 = cMAESOptimizer77.getConvergenceChecker();
        int int79 = cMAESOptimizer77.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray80 = cMAESOptimizer77.getStartPoint();
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1823");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray6);
        int int9 = cMAESOptimizer8.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer8.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer8.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer8.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer8.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer8.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer8.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer8.getUpperBound();
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1824");
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
        int int38 = cMAESOptimizer36.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType39 = cMAESOptimizer36.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList40 = cMAESOptimizer36.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray41 = cMAESOptimizer36.getUpperBound();
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1825");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer15.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer15.getStatisticsMeanHistory();
        int int18 = cMAESOptimizer15.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = cMAESOptimizer15.doOptimize();
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1826");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        java.util.List<java.lang.Double> doubleList71 = cMAESOptimizer70.getStatisticsFitnessHistory();
        int int72 = cMAESOptimizer70.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray73 = cMAESOptimizer70.getStartPoint();
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1827");
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
        int int60 = cMAESOptimizer59.getEvaluations();
        java.util.List<java.lang.Double> doubleList61 = cMAESOptimizer59.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker62 = cMAESOptimizer59.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray63 = cMAESOptimizer59.getLowerBound();
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1828");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        int int10 = cMAESOptimizer7.getEvaluations();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer7.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1829");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        int int14 = cMAESOptimizer12.getEvaluations();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer12.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker18 = cMAESOptimizer12.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray19 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1830");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1831");
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
        int int31 = cMAESOptimizer29.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair32 = cMAESOptimizer29.doOptimize();
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1832");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1833");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker2 = cMAESOptimizer1.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray3 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1834");
        double[] doubleArray14 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray14);
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray34 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray34);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray14, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator24, true, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray14);
        double[] doubleArray57 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray57);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray57);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray57);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray57);
        org.apache.commons.math3.random.RandomGenerator randomGenerator67 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList70 = cMAESOptimizer69.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList71 = cMAESOptimizer69.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker72 = cMAESOptimizer69.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray57, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator67, true, pointValuePairConvergenceChecker72);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray14, (int) (short) 100, (double) (-1), false, (int) (short) 1, 0, randomGenerator67, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer76 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair78 = cMAESOptimizer77.doOptimize();
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1835");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer10.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList18 = cMAESOptimizer10.getStatisticsDHistory();
        int int19 = cMAESOptimizer10.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1836");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker14 = cMAESOptimizer7.getConvergenceChecker();
        int int15 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1837");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray9);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer14.getUpperBound();
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1838");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1839");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer14.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer14.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer14.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer14.getUpperBound();
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1840");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList39 = cMAESOptimizer37.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList40 = cMAESOptimizer37.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray41 = cMAESOptimizer37.getStartPoint();
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1841");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1842");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.random.RandomGenerator randomGenerator15 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray8, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator15, true);
        double[] doubleArray30 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer31 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray30);
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator51 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray59 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray59);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker61 = cMAESOptimizer60.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray44, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator51, true, pointValuePairConvergenceChecker61);
        double[] doubleArray70 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray70);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList72 = cMAESOptimizer71.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList73 = cMAESOptimizer71.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker74 = cMAESOptimizer71.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray30, (int) (short) 0, (double) '4', false, 100, (int) (byte) -1, randomGenerator51, true, pointValuePairConvergenceChecker74);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer77 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray8, 10, (double) 1L, false, (int) (short) 10, (int) (byte) 0, randomGenerator51, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer78 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray8);
        java.util.List<java.lang.Double> doubleList79 = cMAESOptimizer78.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList80 = cMAESOptimizer78.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray81 = cMAESOptimizer78.getStartPoint();
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1843");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer12.getStatisticsMeanHistory();
        int int14 = cMAESOptimizer12.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray15 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1844");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray25);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray25);
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray57 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray57);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray42, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator49, true, pointValuePairConvergenceChecker59);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator49, true);
        double[] doubleArray71 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray71);
        org.apache.commons.math3.random.RandomGenerator randomGenerator78 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray86 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray86);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker88 = cMAESOptimizer87.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray71, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator78, true, pointValuePairConvergenceChecker88);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray9, (int) (short) 10, (double) (byte) 100, true, (int) '4', (int) (short) 1, randomGenerator49, true, pointValuePairConvergenceChecker88);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList94 = cMAESOptimizer93.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray95 = cMAESOptimizer93.getLowerBound();
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1845");
        double[] doubleArray13 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray13);
        org.apache.commons.math3.random.RandomGenerator randomGenerator23 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray33 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer34 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray33);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray33);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker38 = cMAESOptimizer37.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer39 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray13, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator23, true, pointValuePairConvergenceChecker38);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray13);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray13);
        double[] doubleArray56 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray56);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray56);
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList69 = cMAESOptimizer68.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList70 = cMAESOptimizer68.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker71 = cMAESOptimizer68.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray56, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator66, true, pointValuePairConvergenceChecker71);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray13, (int) (short) 100, (double) (-1), false, (int) (short) 1, 0, randomGenerator66, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray13);
        int int76 = cMAESOptimizer75.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType77 = cMAESOptimizer75.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker78 = cMAESOptimizer75.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType79 = cMAESOptimizer75.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray80 = cMAESOptimizer75.getUpperBound();
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1846");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer16.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer16.getStartPoint();
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1847");
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
        int int19 = cMAESOptimizer12.getMaxEvaluations();
        int int20 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList21 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair22 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1848");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList39 = cMAESOptimizer38.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray40 = cMAESOptimizer38.getUpperBound();
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1849");
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
        java.util.List<java.lang.Double> doubleList37 = cMAESOptimizer34.getStatisticsFitnessHistory();
        int int38 = cMAESOptimizer34.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList39 = cMAESOptimizer34.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair40 = cMAESOptimizer34.doOptimize();
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1850");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int12 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1851");
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
        java.util.List<java.lang.Double> doubleList73 = cMAESOptimizer72.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray74 = cMAESOptimizer72.getUpperBound();
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1852");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray9);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray9);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray26);
        double[] doubleArray44 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray44);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray44);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray44);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator54 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray64 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer67 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray64);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray64);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker69 = cMAESOptimizer68.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray44, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator54, true, pointValuePairConvergenceChecker69);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer72 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray26, (int) (short) 0, (double) (byte) -1, false, (int) (short) 100, (int) (byte) -1, randomGenerator54, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer74 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray9, (int) '4', (double) '4', true, (int) (byte) 100, (int) (short) 10, randomGenerator54, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer75 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray9);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList76 = cMAESOptimizer75.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList77 = cMAESOptimizer75.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList78 = cMAESOptimizer75.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray79 = cMAESOptimizer75.getStartPoint();
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1853");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair11 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1854");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        int int12 = cMAESOptimizer7.getEvaluations();
        int int13 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer7.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1855");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList7 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair8 = cMAESOptimizer1.doOptimize();
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1856");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer88.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray90 = cMAESOptimizer88.getStartPoint();
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1857");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray11);
        double[] doubleArray42 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray42);
        org.apache.commons.math3.random.RandomGenerator randomGenerator49 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray57 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray57);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray42, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator49, true, pointValuePairConvergenceChecker59);
        org.apache.commons.math3.random.RandomGenerator randomGenerator66 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray42, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator66, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray11, 100, (double) (byte) 10, true, (int) (short) -1, (int) (short) 10, randomGenerator66, true);
        int int71 = cMAESOptimizer70.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair72 = cMAESOptimizer70.doOptimize();
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1858");
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
        double[] doubleArray54 = cMAESOptimizer52.getLowerBound();
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1859");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList10 = cMAESOptimizer7.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker11 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1860");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray8);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray26);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray58 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray58);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator50, true, pointValuePairConvergenceChecker60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator50, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer65 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray8, (int) (short) 10, (double) 0L, false, (int) (short) -1, (-1), randomGenerator50, false);
        int int66 = cMAESOptimizer65.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray67 = cMAESOptimizer65.getUpperBound();
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1861");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList60 = cMAESOptimizer59.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList61 = cMAESOptimizer59.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker62 = cMAESOptimizer59.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair63 = cMAESOptimizer59.doOptimize();
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1862");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getEvaluations();
        int int14 = cMAESOptimizer10.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer10.getGoalType();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1863");
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
        java.util.List<java.lang.Double> doubleList78 = cMAESOptimizer76.getStatisticsSigmaHistory();
        int int79 = cMAESOptimizer76.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray80 = cMAESOptimizer76.getUpperBound();
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1864");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer0 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList1 = cMAESOptimizer0.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList2 = cMAESOptimizer0.getStatisticsMeanHistory();
        int int3 = cMAESOptimizer0.getMaxEvaluations();
        int int4 = cMAESOptimizer0.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer0.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer0.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer0.getStartPoint();
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1865");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList86 = cMAESOptimizer84.getStatisticsMeanHistory();
        int int87 = cMAESOptimizer84.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray88 = cMAESOptimizer84.getUpperBound();
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1866");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer7.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair16 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1867");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a');
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType3 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1868");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer19 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer20 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList21 = cMAESOptimizer20.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray22 = cMAESOptimizer20.getUpperBound();
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1869");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer70 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        int int71 = cMAESOptimizer70.getEvaluations();
        int int72 = cMAESOptimizer70.getMaxEvaluations();
        int int73 = cMAESOptimizer70.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList74 = cMAESOptimizer70.getStatisticsDHistory();
        int int75 = cMAESOptimizer70.getEvaluations();
        int int76 = cMAESOptimizer70.getEvaluations();
        java.util.List<java.lang.Double> doubleList77 = cMAESOptimizer70.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList78 = cMAESOptimizer70.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair79 = cMAESOptimizer70.doOptimize();
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1870");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer8.getLowerBound();
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1871");
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
        org.apache.commons.math3.optimization.GoalType goalType69 = cMAESOptimizer67.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList70 = cMAESOptimizer67.getStatisticsDHistory();
        int int71 = cMAESOptimizer67.getEvaluations();
        java.util.List<java.lang.Double> doubleList72 = cMAESOptimizer67.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList73 = cMAESOptimizer67.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair74 = cMAESOptimizer67.doOptimize();
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1872");
        double[] doubleArray12 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray12);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray12);
        org.apache.commons.math3.random.RandomGenerator randomGenerator22 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer24 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList25 = cMAESOptimizer24.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList26 = cMAESOptimizer24.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker27 = cMAESOptimizer24.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray12, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator22, true, pointValuePairConvergenceChecker27);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray12);
        double[] doubleArray44 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray44);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer46 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray44);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray44);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray44);
        org.apache.commons.math3.random.RandomGenerator randomGenerator54 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList57 = cMAESOptimizer56.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList58 = cMAESOptimizer56.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer56.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer60 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray44, 100, (double) (-1L), true, (int) 'a', (int) (short) 0, randomGenerator54, true, pointValuePairConvergenceChecker59);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer62 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray12, (int) (byte) 100, 1.0d, false, (int) (short) 100, (int) (short) -1, randomGenerator54, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray12);
        int int64 = cMAESOptimizer63.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray65 = cMAESOptimizer63.getStartPoint();
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1873");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray26);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray58 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray58);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator50, true, pointValuePairConvergenceChecker60);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer63 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator50, true);
        double[] doubleArray72 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer73 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray72);
        org.apache.commons.math3.random.RandomGenerator randomGenerator79 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray87 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray87);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker89 = cMAESOptimizer88.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray72, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator79, true, pointValuePairConvergenceChecker89);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray10, (int) (short) 10, (double) (byte) 100, true, (int) '4', (int) (short) 1, randomGenerator50, true, pointValuePairConvergenceChecker89);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer92 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer94 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList96 = cMAESOptimizer95.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray97 = cMAESOptimizer95.getUpperBound();
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1874");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer12.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1875");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker10 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray11 = cMAESOptimizer7.getStartPoint();
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1876");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        int int15 = cMAESOptimizer12.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList16 = cMAESOptimizer12.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer12.getConvergenceChecker();
        int int18 = cMAESOptimizer12.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer12.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList20 = cMAESOptimizer12.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray21 = cMAESOptimizer12.getUpperBound();
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1877");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer10.getGoalType();
        int int12 = cMAESOptimizer10.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer10.getStatisticsSigmaHistory();
        int int14 = cMAESOptimizer10.getEvaluations();
        int int15 = cMAESOptimizer10.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer10.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType17 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1878");
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
        int int37 = cMAESOptimizer36.getEvaluations();
        java.util.List<java.lang.Double> doubleList38 = cMAESOptimizer36.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray39 = cMAESOptimizer36.getLowerBound();
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1879");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair10 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1880");
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
        int int93 = cMAESOptimizer92.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType94 = cMAESOptimizer92.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray95 = cMAESOptimizer92.getLowerBound();
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1881");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer15.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer15.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList18 = cMAESOptimizer15.getStatisticsSigmaHistory();
        int int19 = cMAESOptimizer15.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType20 = cMAESOptimizer15.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair21 = cMAESOptimizer15.doOptimize();
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1882");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType13 = cMAESOptimizer10.getGoalType();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer10.getGoalType();
        int int15 = cMAESOptimizer10.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType16 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1883");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker9 = cMAESOptimizer7.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        int int11 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1884");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList74 = cMAESOptimizer71.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray75 = cMAESOptimizer71.getUpperBound();
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1885");
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
        java.util.List<java.lang.Double> doubleList95 = cMAESOptimizer94.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList96 = cMAESOptimizer94.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray97 = cMAESOptimizer94.getUpperBound();
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1886");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList5 = cMAESOptimizer1.getStatisticsDHistory();
        int int6 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        int int9 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray10 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1887");
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
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList65 = cMAESOptimizer62.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList66 = cMAESOptimizer62.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray67 = cMAESOptimizer62.getStartPoint();
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1888");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer10.getGoalType();
        java.util.List<java.lang.Double> doubleList13 = cMAESOptimizer10.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer10.getStartPoint();
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1889");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        double[] doubleArray26 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer29 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray26);
        double[] doubleArray43 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray43);
        org.apache.commons.math3.random.RandomGenerator randomGenerator50 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray58 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray58);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer59.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray43, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator50, true, pointValuePairConvergenceChecker60);
        org.apache.commons.math3.random.RandomGenerator randomGenerator67 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer69 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray43, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator67, false);
        double[] doubleArray79 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray79);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray79);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray79);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer83 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray79);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker84 = cMAESOptimizer83.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer85 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray26, (int) '4', (double) 1L, true, (int) (short) 10, 10, randomGenerator67, false, pointValuePairConvergenceChecker84);
        org.apache.commons.math3.random.RandomGenerator randomGenerator91 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer93 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) ' ', doubleArray26, 100, (double) 10L, false, (int) (byte) 100, (int) (byte) -1, randomGenerator91, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer95 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray10, (int) (short) 0, (double) (-1.0f), true, 10, 0, randomGenerator91, true);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer96 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer97 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer98 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray99 = cMAESOptimizer98.getLowerBound();
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1890");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        int int13 = cMAESOptimizer12.getMaxEvaluations();
        int int14 = cMAESOptimizer12.getEvaluations();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer12.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer12.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer12.getStartPoint();
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1891");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.GoalType goalType10 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        int int13 = cMAESOptimizer7.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType14 = cMAESOptimizer7.getGoalType();
        java.util.List<java.lang.Double> doubleList15 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray17 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1892");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray10);
        int int17 = cMAESOptimizer16.getEvaluations();
        int int18 = cMAESOptimizer16.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair19 = cMAESOptimizer16.doOptimize();
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1893");
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
        int int60 = cMAESOptimizer59.getEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType61 = cMAESOptimizer59.getGoalType();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker62 = cMAESOptimizer59.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair63 = cMAESOptimizer59.doOptimize();
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1894");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer15.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer15.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType18 = cMAESOptimizer15.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer15.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer15.getLowerBound();
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1895");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int12 = cMAESOptimizer10.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair14 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1896");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray7);
        int int11 = cMAESOptimizer10.getMaxEvaluations();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer10.getGoalType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair13 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1897");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        double[] doubleArray24 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray24);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer28 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray24);
        double[] doubleArray41 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray41);
        org.apache.commons.math3.random.RandomGenerator randomGenerator48 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray56 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer57 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray56);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker58 = cMAESOptimizer57.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer59 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray41, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator48, true, pointValuePairConvergenceChecker58);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray24, (int) (short) 1, (double) (byte) 10, false, (int) (short) 1, (int) (short) 100, randomGenerator48, true);
        double[] doubleArray70 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer71 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray70);
        org.apache.commons.math3.random.RandomGenerator randomGenerator77 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray85 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray85);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker87 = cMAESOptimizer86.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray70, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator77, true, pointValuePairConvergenceChecker87);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer89 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100, doubleArray8, (int) (short) 10, (double) (byte) 100, true, (int) '4', (int) (short) 1, randomGenerator48, true, pointValuePairConvergenceChecker87);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer90 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(30000, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer91 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray92 = cMAESOptimizer91.getStartPoint();
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1898");
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
        int int19 = cMAESOptimizer12.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray20 = cMAESOptimizer12.getLowerBound();
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1899");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray6);
        org.apache.commons.math3.random.RandomGenerator randomGenerator13 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) 'a', doubleArray6, 1, (double) (-1), true, (int) 'a', (-1), randomGenerator13, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer15.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList17 = cMAESOptimizer15.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType18 = cMAESOptimizer15.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList19 = cMAESOptimizer15.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair20 = cMAESOptimizer15.doOptimize();
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1900");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        int int9 = cMAESOptimizer7.getEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer7.getLowerBound();
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1901");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1902");
        double[] doubleArray8 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray8);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray8);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker13 = cMAESOptimizer12.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer12.getStatisticsDHistory();
        int int15 = cMAESOptimizer12.getMaxEvaluations();
        int int16 = cMAESOptimizer12.getEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer12.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair18 = cMAESOptimizer12.doOptimize();
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1903");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray83 = cMAESOptimizer82.getUpperBound();
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1904");
        double[] doubleArray14 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer17 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer18 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray14);
        org.apache.commons.math3.random.RandomGenerator randomGenerator24 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray34 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer36 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer37 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray34);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer38 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray34);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer38.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer40 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1), doubleArray14, (int) (byte) 1, (double) '4', true, (int) (short) 0, (int) (short) 100, randomGenerator24, true, pointValuePairConvergenceChecker39);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer42 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer43 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer44 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray14);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(100, doubleArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray46 = cMAESOptimizer45.getStartPoint();
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1905");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(1);
        int int2 = cMAESOptimizer1.getMaxEvaluations();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList4 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray5 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1906");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsFitnessHistory();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<java.lang.Double> doubleList6 = cMAESOptimizer1.getStatisticsFitnessHistory();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray9 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1907");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer10.getEvaluations();
        int int14 = cMAESOptimizer10.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer10.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer10.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer10.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1908");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer7.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair15 = cMAESOptimizer7.doOptimize();
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1909");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<java.lang.Double> doubleList8 = cMAESOptimizer7.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsDHistory();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsMeanHistory();
        org.apache.commons.math3.optimization.GoalType goalType12 = cMAESOptimizer7.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1910");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        double[] doubleArray29 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray29);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker46 = cMAESOptimizer45.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray29, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator36, true, pointValuePairConvergenceChecker46);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray29, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator53, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray10, 30000, (double) 1, true, 30000, (int) (short) 0, randomGenerator53, true, pointValuePairConvergenceChecker60);
        java.util.List<java.lang.Double> doubleList62 = cMAESOptimizer61.getStatisticsSigmaHistory();
        int int63 = cMAESOptimizer61.getMaxEvaluations();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker64 = cMAESOptimizer61.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray65 = cMAESOptimizer61.getUpperBound();
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1911");
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
        double[] doubleArray79 = cMAESOptimizer78.getUpperBound();
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1912");
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
        org.apache.commons.math3.optimization.PointValuePair pointValuePair92 = cMAESOptimizer90.doOptimize();
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1913");
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
        int int37 = cMAESOptimizer36.getEvaluations();
        java.util.List<java.lang.Double> doubleList38 = cMAESOptimizer36.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker39 = cMAESOptimizer36.getConvergenceChecker();
        int int40 = cMAESOptimizer36.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray41 = cMAESOptimizer36.getUpperBound();
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1914");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer10.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList12 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray13 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1915");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType15 = cMAESOptimizer10.getGoalType();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer10.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair17 = cMAESOptimizer10.doOptimize();
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1916");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList8 = cMAESOptimizer7.getStatisticsDHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList9 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList10 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList11 = cMAESOptimizer7.getStatisticsDHistory();
        int int12 = cMAESOptimizer7.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList14 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList15 = cMAESOptimizer7.getStatisticsMeanHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList16 = cMAESOptimizer7.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker17 = cMAESOptimizer7.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer7.getUpperBound();
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1917");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((-1));
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker4 = cMAESOptimizer1.getConvergenceChecker();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList6 = cMAESOptimizer1.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray7 = cMAESOptimizer1.getStartPoint();
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1918");
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
        java.util.List<java.lang.Double> doubleList48 = cMAESOptimizer46.getStatisticsFitnessHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray49 = cMAESOptimizer46.getStartPoint();
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1919");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray39 = cMAESOptimizer38.getUpperBound();
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1920");
        double[] doubleArray9 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray9);
        org.apache.commons.math3.random.RandomGenerator randomGenerator16 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray24 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer25 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray24);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker26 = cMAESOptimizer25.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer27 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray9, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator16, true, pointValuePairConvergenceChecker26);
        org.apache.commons.math3.random.RandomGenerator randomGenerator33 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer35 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray9, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator33, false);
        double[] doubleArray48 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer49 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray48);
        org.apache.commons.math3.random.RandomGenerator randomGenerator55 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray63 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer64 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray63);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker65 = cMAESOptimizer64.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray48, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator55, true, pointValuePairConvergenceChecker65);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '4', doubleArray9, (-1), (double) (short) 10, false, (int) ' ', (-1), randomGenerator55, true);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList69 = cMAESOptimizer68.getStatisticsDHistory();
        java.util.List<java.lang.Double> doubleList70 = cMAESOptimizer68.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray71 = cMAESOptimizer68.getUpperBound();
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1921");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer16 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList17 = cMAESOptimizer16.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray18 = cMAESOptimizer16.getStartPoint();
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1922");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray7);
        org.apache.commons.math3.optimization.GoalType goalType11 = cMAESOptimizer10.getGoalType();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer10.getStatisticsFitnessHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer10.getLowerBound();
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1923");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer14 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer15 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray10);
        double[] doubleArray29 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer30 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray29);
        org.apache.commons.math3.random.RandomGenerator randomGenerator36 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray44 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer45 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray44);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker46 = cMAESOptimizer45.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer47 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray29, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator36, true, pointValuePairConvergenceChecker46);
        org.apache.commons.math3.random.RandomGenerator randomGenerator53 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer55 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray29, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator53, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(10);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker59 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker60 = cMAESOptimizer58.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer61 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 0, doubleArray10, 30000, (double) 1, true, 30000, (int) (short) 0, randomGenerator53, true, pointValuePairConvergenceChecker60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray62 = cMAESOptimizer61.getUpperBound();
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1924");
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
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer48 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray49 = cMAESOptimizer48.getLowerBound();
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1925");
        double[] doubleArray10 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer11 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer12 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer13 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) '#', doubleArray10);
        double[] doubleArray25 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer26 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray25);
        double[] doubleArray40 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer41 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray40);
        org.apache.commons.math3.random.RandomGenerator randomGenerator47 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        double[] doubleArray55 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer56 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray55);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker57 = cMAESOptimizer56.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer58 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray40, 100, (double) 30000, false, (int) (byte) 10, (int) '4', randomGenerator47, true, pointValuePairConvergenceChecker57);
        org.apache.commons.math3.random.RandomGenerator randomGenerator64 = org.apache.commons.math3.optimization.direct.CMAESOptimizer.DEFAULT_RANDOMGENERATOR;
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer66 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) -1, doubleArray40, (int) (short) 1, (double) ' ', false, (int) (short) 1, (int) (byte) -1, randomGenerator64, false);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer68 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) -1, doubleArray25, (int) (short) 10, (double) (short) 100, false, (-1), (int) (short) 0, randomGenerator64, false);
        double[] doubleArray78 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer79 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray78);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer80 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray78);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer81 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 1, doubleArray78);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer82 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10, doubleArray78);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker83 = cMAESOptimizer82.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList84 = cMAESOptimizer82.getStatisticsDHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker85 = cMAESOptimizer82.getConvergenceChecker();
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer86 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 100, doubleArray10, (-1), (double) 10L, true, (int) 'a', (int) (byte) -1, randomGenerator64, false, pointValuePairConvergenceChecker85);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer87 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer88 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 10, doubleArray10);
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList89 = cMAESOptimizer88.getStatisticsDHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math3.optimization.PointValuePair pointValuePair90 = cMAESOptimizer88.doOptimize();
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1926");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (short) 100);
        org.apache.commons.math3.optimization.GoalType goalType2 = cMAESOptimizer1.getGoalType();
        int int3 = cMAESOptimizer1.getMaxEvaluations();
        int int4 = cMAESOptimizer1.getEvaluations();
        java.util.List<java.lang.Double> doubleList5 = cMAESOptimizer1.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.GoalType goalType6 = cMAESOptimizer1.getGoalType();
        java.util.List<java.lang.Double> doubleList7 = cMAESOptimizer1.getStatisticsSigmaHistory();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray8 = cMAESOptimizer1.getUpperBound();
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1927");
        double[] doubleArray7 = new double[] { 10.0d, (byte) 1, 'a', (-1) };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer8 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer9 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer(0, doubleArray7);
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer10 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 1, doubleArray7);
        java.util.List<java.lang.Double> doubleList11 = cMAESOptimizer10.getStatisticsSigmaHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker12 = cMAESOptimizer10.getConvergenceChecker();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList13 = cMAESOptimizer10.getStatisticsMeanHistory();
        java.util.List<java.lang.Double> doubleList14 = cMAESOptimizer10.getStatisticsFitnessHistory();
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker15 = cMAESOptimizer10.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray16 = cMAESOptimizer10.getUpperBound();
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1928");
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer1 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 10);
        java.util.List<java.lang.Double> doubleList2 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<java.lang.Double> doubleList3 = cMAESOptimizer1.getStatisticsSigmaHistory();
        java.util.List<org.apache.commons.math3.linear.RealMatrix> realMatrixList4 = cMAESOptimizer1.getStatisticsMeanHistory();
        int int5 = cMAESOptimizer1.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray6 = cMAESOptimizer1.getLowerBound();
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test1929");
        double[] doubleArray6 = new double[] { 10.0d, (byte) 0, 100, 'a', 100 };
        org.apache.commons.math3.optimization.direct.CMAESOptimizer cMAESOptimizer7 = new org.apache.commons.math3.optimization.direct.CMAESOptimizer((int) (byte) 0, doubleArray6);
        org.apache.commons.math3.optimization.ConvergenceChecker<org.apache.commons.math3.optimization.PointValuePair> pointValuePairConvergenceChecker8 = cMAESOptimizer7.getConvergenceChecker();
        org.apache.commons.math3.optimization.GoalType goalType9 = cMAESOptimizer7.getGoalType();
        int int10 = cMAESOptimizer7.getMaxEvaluations();
        int int11 = cMAESOptimizer7.getEvaluations();
        java.util.List<java.lang.Double> doubleList12 = cMAESOptimizer7.getStatisticsFitnessHistory();
        int int13 = cMAESOptimizer7.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[] doubleArray14 = cMAESOptimizer7.getStartPoint();
    }
}

