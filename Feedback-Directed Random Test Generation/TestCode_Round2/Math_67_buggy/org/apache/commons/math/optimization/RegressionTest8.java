package org.apache.commons.math.optimization;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

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
    public void test4001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4001");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 2147483647, randomGenerator12);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(2147483647);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator9 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer10 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 1, randomGenerator9);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(100);
        int int13 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.resetAbsoluteAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test4003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4003");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int5 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator7 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 100, randomGenerator7);
        multiStartUnivariateRealOptimizer8.setMaximalIterationCount((int) (byte) 1);
        int int11 = multiStartUnivariateRealOptimizer8.getMaxEvaluations();
        int int12 = multiStartUnivariateRealOptimizer8.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test4004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4004");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int5 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        int int6 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator8 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer9 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 100, randomGenerator8);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4005");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 2147483647, randomGenerator6);
        org.apache.commons.math.random.RandomGenerator randomGenerator9 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer10 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer7, (int) (byte) 1, randomGenerator9);
        multiStartUnivariateRealOptimizer7.setMaximalIterationCount(52);
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer7, (int) (byte) 10, randomGenerator14);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer7.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test4006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4006");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) 10);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        org.apache.commons.math.optimization.GoalType goalType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = multiStartUnivariateRealOptimizer6.optimize(univariateRealFunction10, goalType11, (double) 0, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4007");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator6);
        int int8 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) -1, randomGenerator12);
        org.apache.commons.math.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer16 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) '#', randomGenerator15);
        int int17 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction18 = null;
        org.apache.commons.math.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = multiStartUnivariateRealOptimizer3.optimize(univariateRealFunction18, goalType19, (double) 1.0f, (double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4008");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 0);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) -1);
        int int12 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int13 = multiStartUnivariateRealOptimizer6.getEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(32);
        int int16 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int17 = multiStartUnivariateRealOptimizer6.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4009");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer11 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 2147483647, randomGenerator10);
        int int12 = multiStartUnivariateRealOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.resetAbsoluteAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4010");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '#');
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) 'a');
        int int9 = multiStartUnivariateRealOptimizer3.getEvaluations();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = multiStartUnivariateRealOptimizer3.getRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4011");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 10);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(10);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) 10);
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) 'a');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4012");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (short) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations(35);
        int int10 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test4013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4013");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(10);
        int int12 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) '4');
        int int15 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.random.RandomGenerator randomGenerator19 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer20 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 0, randomGenerator19);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4014");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = multiStartUnivariateRealOptimizer6.getRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4015");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) 10);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((-1));
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (short) 100, randomGenerator13);
        int int15 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int16 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(10);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4016");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 1, randomGenerator6);
        int int8 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        int int9 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int10 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = multiStartUnivariateRealOptimizer3.optimize(univariateRealFunction11, goalType12, (double) (byte) 100, (double) 'a', (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4017");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        org.apache.commons.math.random.RandomGenerator randomGenerator8 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer9 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 0, randomGenerator8);
        int int10 = multiStartUnivariateRealOptimizer9.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer9.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer9.setMaxEvaluations(0);
        int int14 = multiStartUnivariateRealOptimizer9.getMaximalIterationCount();
        int int15 = multiStartUnivariateRealOptimizer9.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
    }

    @Test
    public void test4018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4018");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int5 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int6 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        int int7 = multiStartUnivariateRealOptimizer3.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.setRelativeAccuracy((double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4019");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int12 = multiStartUnivariateRealOptimizer6.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = multiStartUnivariateRealOptimizer6.getOptima();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4020");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        multiStartUnivariateRealOptimizer3.setMaxEvaluations(0);
        org.apache.commons.math.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer11 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 52, randomGenerator10);
        multiStartUnivariateRealOptimizer11.setMaximalIterationCount((int) '4');
        int int14 = multiStartUnivariateRealOptimizer11.getIterationCount();
        int int15 = multiStartUnivariateRealOptimizer11.getMaximalIterationCount();
        int int16 = multiStartUnivariateRealOptimizer11.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer11.setAbsoluteAccuracy((double) 2147483647);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 52 + "'", int15 == 52);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4021");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 0);
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 2147483647, randomGenerator12);
        int int14 = multiStartUnivariateRealOptimizer13.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = multiStartUnivariateRealOptimizer13.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test4022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4022");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 0);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) -1);
        int int12 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 10, randomGenerator14);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray16 = multiStartUnivariateRealOptimizer15.getOptimaValues();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test4023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4023");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator11);
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer12, 0, randomGenerator14);
        multiStartUnivariateRealOptimizer12.setMaximalIterationCount((int) (byte) 0);
        int int18 = multiStartUnivariateRealOptimizer12.getEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction19 = null;
        org.apache.commons.math.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = multiStartUnivariateRealOptimizer12.optimize(univariateRealFunction19, goalType20, (double) 1L, 0.0d, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4024");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        multiStartUnivariateRealOptimizer3.setMaxEvaluations(0);
        org.apache.commons.math.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer11 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 52, randomGenerator10);
        multiStartUnivariateRealOptimizer11.setMaxEvaluations((int) (short) 10);
        int int14 = multiStartUnivariateRealOptimizer11.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = multiStartUnivariateRealOptimizer11.optimize(univariateRealFunction15, goalType16, (double) 100L, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test4025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4025");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4026");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 1, randomGenerator6);
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (short) -1);
        int int10 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 10, randomGenerator12);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer13.setRelativeAccuracy((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4027");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getEvaluations();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(0);
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int12 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(0);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = multiStartUnivariateRealOptimizer6.getFunctionValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4028");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(52);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = multiStartUnivariateRealOptimizer6.optimize(univariateRealFunction13, goalType14, (double) 1, (double) (short) -1, (double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4029");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) 'a');
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray9 = multiStartUnivariateRealOptimizer3.getOptimaValues();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4030");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getEvaluations();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4031");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int5 = multiStartUnivariateRealOptimizer3.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = multiStartUnivariateRealOptimizer3.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4032");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (short) 0);
        int int12 = multiStartUnivariateRealOptimizer6.getEvaluations();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) 100);
        int int15 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int16 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int17 = multiStartUnivariateRealOptimizer6.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4033");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator6);
        int int8 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) -1, randomGenerator12);
        org.apache.commons.math.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer16 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) '#', randomGenerator15);
        int int17 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int18 = multiStartUnivariateRealOptimizer3.getEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '4');
        int int21 = multiStartUnivariateRealOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = multiStartUnivariateRealOptimizer3.getFunctionValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test4034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4034");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) 10);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((-1));
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (short) 100, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (short) 1, randomGenerator16);
        int int18 = multiStartUnivariateRealOptimizer17.getMaxEvaluations();
        int int19 = multiStartUnivariateRealOptimizer17.getMaximalIterationCount();
        int int20 = multiStartUnivariateRealOptimizer17.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator22 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer23 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer17, 35, randomGenerator22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4035");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) 10);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((-1));
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) '4');
        org.apache.commons.math.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer16 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 0, randomGenerator15);
        org.apache.commons.math.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer19 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer16, 97, randomGenerator18);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test4036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4036");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(10);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        int int15 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int16 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = multiStartUnivariateRealOptimizer6.getRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test4037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4037");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '#');
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = multiStartUnivariateRealOptimizer3.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4038");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 100, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer14, (int) (short) 0, randomGenerator16);
        int int18 = multiStartUnivariateRealOptimizer17.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator20 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer21 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer17, (int) (short) -1, randomGenerator20);
        org.apache.commons.math.random.RandomGenerator randomGenerator23 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer24 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer17, (int) (short) -1, randomGenerator23);
        int int25 = multiStartUnivariateRealOptimizer24.getMaximalIterationCount();
        int int26 = multiStartUnivariateRealOptimizer24.getEvaluations();
        int int27 = multiStartUnivariateRealOptimizer24.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator29 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer30 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer24, (int) (byte) 1, randomGenerator29);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
    }

    @Test
    public void test4039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4039");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) -1, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer14, (int) (byte) 1, randomGenerator16);
        multiStartUnivariateRealOptimizer17.setMaxEvaluations((int) (byte) 1);
        int int20 = multiStartUnivariateRealOptimizer17.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction21 = null;
        org.apache.commons.math.optimization.GoalType goalType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double26 = multiStartUnivariateRealOptimizer17.optimize(univariateRealFunction21, goalType22, (double) 10.0f, (double) (short) 10, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4040");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int9 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) 100);
        int int13 = multiStartUnivariateRealOptimizer6.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = multiStartUnivariateRealOptimizer6.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4041");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator11);
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer12, 0, randomGenerator14);
        int int16 = multiStartUnivariateRealOptimizer15.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer19 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer15, (int) (byte) -1, randomGenerator18);
        int int20 = multiStartUnivariateRealOptimizer19.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator22 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer23 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer19, 1, randomGenerator22);
        org.apache.commons.math.random.RandomGenerator randomGenerator25 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer26 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer19, 10, randomGenerator25);
        int int27 = multiStartUnivariateRealOptimizer26.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer26.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4042");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.random.RandomGenerator randomGenerator8 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer9 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) '4', randomGenerator8);
        int int10 = multiStartUnivariateRealOptimizer9.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer9, (int) '#', randomGenerator12);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer9.setRelativeAccuracy((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4043");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) ' ');
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((-1));
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 100, randomGenerator14);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = multiStartUnivariateRealOptimizer3.getAbsoluteAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test4044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4044");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '#');
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) 'a');
        int int9 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator11);
        int int13 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.resetRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test4045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4045");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 2147483647, randomGenerator6);
        multiStartUnivariateRealOptimizer7.setMaxEvaluations((int) '4');
        int int10 = multiStartUnivariateRealOptimizer7.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer7.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test4046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4046");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = multiStartUnivariateRealOptimizer3.optimize(univariateRealFunction9, goalType10, (double) 'a', (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4047");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 0);
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int12 = multiStartUnivariateRealOptimizer6.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator14);
        int int16 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction19 = null;
        org.apache.commons.math.optimization.GoalType goalType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double23 = multiStartUnivariateRealOptimizer6.optimize(univariateRealFunction19, goalType20, (double) 100L, (double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4048");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int12 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int13 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test4049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4049");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) ' ');
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((-1));
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 100, randomGenerator14);
        org.apache.commons.math.random.RandomGenerator randomGenerator17 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer18 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (byte) 0, randomGenerator17);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = multiStartUnivariateRealOptimizer3.getAbsoluteAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test4050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4050");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 0, randomGenerator12);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.resetRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4051");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 1, randomGenerator13);
        int int15 = multiStartUnivariateRealOptimizer14.getEvaluations();
        int int16 = multiStartUnivariateRealOptimizer14.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = multiStartUnivariateRealOptimizer14.getRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test4052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4052");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(52);
        int int14 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int15 = multiStartUnivariateRealOptimizer6.getEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4053");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator9 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer10 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) ' ', randomGenerator9);
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator12);
        int int14 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int15 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int16 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int17 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator19 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer20 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 1, randomGenerator19);
        int int21 = multiStartUnivariateRealOptimizer20.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
    }

    @Test
    public void test4054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4054");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int9 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int12 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int13 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int14 = multiStartUnivariateRealOptimizer6.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator16);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = multiStartUnivariateRealOptimizer6.getRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4055");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) 10);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((-1));
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) 0);
        int int14 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(0);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.setRelativeAccuracy((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4056");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) ' ');
        int int11 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int12 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (short) -1);
        java.lang.Class<?> wildcardClass15 = multiStartUnivariateRealOptimizer3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4057");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        org.apache.commons.math.random.RandomGenerator randomGenerator8 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer9 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, 0, randomGenerator8);
        int int10 = multiStartUnivariateRealOptimizer9.getIterationCount();
        int int11 = multiStartUnivariateRealOptimizer9.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer9, (int) '#', randomGenerator13);
        int int15 = multiStartUnivariateRealOptimizer9.getIterationCount();
        multiStartUnivariateRealOptimizer9.setMaxEvaluations((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer9.resetAbsoluteAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4058");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int9 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int12 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((-1));
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(35);
        int int17 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4059");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '#');
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount(10);
        org.apache.commons.math.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer11 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator10);
        int int12 = multiStartUnivariateRealOptimizer11.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer11, 32, randomGenerator14);
        int int16 = multiStartUnivariateRealOptimizer11.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = multiStartUnivariateRealOptimizer11.optimize(univariateRealFunction17, goalType18, (double) (short) 10, (double) 100.0f, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test4060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4060");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) -1);
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) -1);
        int int13 = multiStartUnivariateRealOptimizer6.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.resetRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4061");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (short) 0);
        int int12 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int13 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = multiStartUnivariateRealOptimizer6.optimize(univariateRealFunction14, goalType15, (double) 0, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4062");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(10);
        int int12 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) '4');
        int int15 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int16 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double19 = multiStartUnivariateRealOptimizer6.getFunctionValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test4063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4063");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '#');
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount(10);
        int int9 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount(1);
        int int12 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test4064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4064");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getEvaluations();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(0);
        int int10 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = multiStartUnivariateRealOptimizer6.optimize(univariateRealFunction13, goalType14, (double) (byte) 0, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4065");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int12 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int13 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test4066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4066");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer11 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 2147483647, randomGenerator10);
        int int12 = multiStartUnivariateRealOptimizer11.getEvaluations();
        multiStartUnivariateRealOptimizer11.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer11, 52, randomGenerator16);
        multiStartUnivariateRealOptimizer17.setMaxEvaluations((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = multiStartUnivariateRealOptimizer17.getAbsoluteAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4067");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) -1);
        int int12 = multiStartUnivariateRealOptimizer6.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = multiStartUnivariateRealOptimizer6.getRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4068");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) '4');
        int int7 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 0);
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) '4', randomGenerator12);
        int int14 = multiStartUnivariateRealOptimizer13.getIterationCount();
        multiStartUnivariateRealOptimizer13.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4069");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '#');
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator9 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer10 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator9);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4070");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 0);
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 2147483647, randomGenerator12);
        int int14 = multiStartUnivariateRealOptimizer13.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer13, (int) (byte) 10, randomGenerator16);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer13.setRelativeAccuracy((double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test4071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4071");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount(1);
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (short) 1);
        int int13 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int14 = multiStartUnivariateRealOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.resetAbsoluteAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4072");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) ' ');
        int int11 = multiStartUnivariateRealOptimizer3.getEvaluations();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations(32);
        int int14 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations(97);
        org.apache.commons.math.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer19 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (byte) -1, randomGenerator18);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer19.setAbsoluteAccuracy((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test4073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4073");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int9 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(97);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray13 = multiStartUnivariateRealOptimizer6.getOptima();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4074");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        int int5 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        org.apache.commons.math.optimization.GoalType goalType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double10 = multiStartUnivariateRealOptimizer3.optimize(univariateRealFunction6, goalType7, 100.0d, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test4075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4075");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) '4');
        int int7 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4076");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) ' ');
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (byte) 10);
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 0, randomGenerator14);
        int int16 = multiStartUnivariateRealOptimizer15.getMaxEvaluations();
        int int17 = multiStartUnivariateRealOptimizer15.getMaxEvaluations();
        int int18 = multiStartUnivariateRealOptimizer15.getIterationCount();
        int int19 = multiStartUnivariateRealOptimizer15.getIterationCount();
        int int20 = multiStartUnivariateRealOptimizer15.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
    }

    @Test
    public void test4077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4077");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer3.getEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '#');
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator14);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer15.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4078");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4079");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) 10);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((-1));
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) '4');
        org.apache.commons.math.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer16 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 10, randomGenerator15);
        int int17 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
    }

    @Test
    public void test4080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4080");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        org.apache.commons.math.random.RandomGenerator randomGenerator8 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer9 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-1), randomGenerator8);
        multiStartUnivariateRealOptimizer9.setMaximalIterationCount((int) '4');
        multiStartUnivariateRealOptimizer9.setMaximalIterationCount((int) (short) -1);
    }

    @Test
    public void test4081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4081");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer3.getEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount(32);
        int int13 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int14 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.setAbsoluteAccuracy((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test4082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4082");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator11);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer12.setRelativeAccuracy((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test4083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4083");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int12 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test4084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4084");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) -1);
        int int12 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int13 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.setAbsoluteAccuracy((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test4085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4085");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '#');
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = multiStartUnivariateRealOptimizer3.getRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4086");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 0);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(10);
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(35);
        org.apache.commons.math.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer16 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (short) 10, randomGenerator15);
        int int17 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int18 = multiStartUnivariateRealOptimizer6.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4087");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 1, randomGenerator13);
        int int15 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int16 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int17 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int18 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int19 = multiStartUnivariateRealOptimizer6.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.setRelativeAccuracy((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test4088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4088");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 0);
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int12 = multiStartUnivariateRealOptimizer6.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator14);
        int int16 = multiStartUnivariateRealOptimizer15.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer15.setMaxEvaluations(52);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = multiStartUnivariateRealOptimizer15.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test4089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4089");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator6);
        org.apache.commons.math.random.RandomGenerator randomGenerator9 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer10 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (byte) -1, randomGenerator9);
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer10, 2147483647, randomGenerator12);
        org.apache.commons.math.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer16 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer13, 10, randomGenerator15);
        int int17 = multiStartUnivariateRealOptimizer16.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
    }

    @Test
    public void test4090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4090");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int5 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        int int6 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator8 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer9 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator8);
        int int10 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        org.apache.commons.math.optimization.GoalType goalType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double16 = multiStartUnivariateRealOptimizer3.optimize(univariateRealFunction11, goalType12, (double) (-1), (double) (short) 100, (double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4091");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(10);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.setRelativeAccuracy((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4092");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 100, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer14, (int) (byte) 100, randomGenerator16);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction18 = null;
        org.apache.commons.math.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double22 = multiStartUnivariateRealOptimizer14.optimize(univariateRealFunction18, goalType19, (double) (short) -1, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test4093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4093");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4094");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 1, randomGenerator6);
        int int8 = multiStartUnivariateRealOptimizer7.getEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = multiStartUnivariateRealOptimizer7.optimize(univariateRealFunction9, goalType10, (double) 1, 1.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4095");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        org.apache.commons.math.random.RandomGenerator randomGenerator8 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer9 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-1), randomGenerator8);
        multiStartUnivariateRealOptimizer9.setMaxEvaluations(1);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer9, 0, randomGenerator13);
        int int15 = multiStartUnivariateRealOptimizer9.getMaximalIterationCount();
        int int16 = multiStartUnivariateRealOptimizer9.getMaxEvaluations();
        int int17 = multiStartUnivariateRealOptimizer9.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator19 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer20 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer9, (int) ' ', randomGenerator19);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = multiStartUnivariateRealOptimizer20.getOptima();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4096");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 100, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 52, randomGenerator16);
        int int18 = multiStartUnivariateRealOptimizer17.getIterationCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4097");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        multiStartUnivariateRealOptimizer3.setMaxEvaluations(0);
        int int9 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int10 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int12 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4098");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer11 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 2147483647, randomGenerator10);
        int int12 = multiStartUnivariateRealOptimizer11.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer11.setAbsoluteAccuracy((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test4099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4099");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        int int10 = multiStartUnivariateRealOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.setAbsoluteAccuracy((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4100");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 100);
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4101");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 1, randomGenerator13);
        int int15 = multiStartUnivariateRealOptimizer14.getEvaluations();
        int int16 = multiStartUnivariateRealOptimizer14.getEvaluations();
        multiStartUnivariateRealOptimizer14.setMaxEvaluations((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer14.setRelativeAccuracy((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4102");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int5 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int6 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator8 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer9 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator8);
        int int10 = multiStartUnivariateRealOptimizer9.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer9.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer9.setRelativeAccuracy((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4103");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(10);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        int int15 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator17 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer18 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) 'a', randomGenerator17);
        int int19 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = multiStartUnivariateRealOptimizer6.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test4104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4104");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = multiStartUnivariateRealOptimizer3.getRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4105");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator6);
        int int8 = multiStartUnivariateRealOptimizer7.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer7.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = multiStartUnivariateRealOptimizer7.getRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4106");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 100, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer14, (int) (short) 0, randomGenerator16);
        int int18 = multiStartUnivariateRealOptimizer17.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator20 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer21 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer17, (int) (short) -1, randomGenerator20);
        org.apache.commons.math.random.RandomGenerator randomGenerator23 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer24 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer17, (int) (short) -1, randomGenerator23);
        int int25 = multiStartUnivariateRealOptimizer24.getMaximalIterationCount();
        int int26 = multiStartUnivariateRealOptimizer24.getEvaluations();
        int int27 = multiStartUnivariateRealOptimizer24.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator29 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer30 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer24, 35, randomGenerator29);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4107");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(100);
        int int13 = multiStartUnivariateRealOptimizer6.getEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4108");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 100, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer14, (int) (short) 0, randomGenerator16);
        int int18 = multiStartUnivariateRealOptimizer17.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator20 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer21 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer17, (int) (short) -1, randomGenerator20);
        int int22 = multiStartUnivariateRealOptimizer17.getMaximalIterationCount();
        int int23 = multiStartUnivariateRealOptimizer17.getEvaluations();
        java.lang.Class<?> wildcardClass24 = multiStartUnivariateRealOptimizer17.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test4109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4109");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(10);
        int int12 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int13 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int14 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 0, randomGenerator16);
        int int18 = multiStartUnivariateRealOptimizer17.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test4110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4110");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator11);
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer12, 0, randomGenerator14);
        multiStartUnivariateRealOptimizer15.setMaximalIterationCount((int) '4');
        multiStartUnivariateRealOptimizer15.setMaxEvaluations(0);
        int int20 = multiStartUnivariateRealOptimizer15.getEvaluations();
        int int21 = multiStartUnivariateRealOptimizer15.getEvaluations();
        int int22 = multiStartUnivariateRealOptimizer15.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
    }

    @Test
    public void test4111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4111");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        org.apache.commons.math.random.RandomGenerator randomGenerator8 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer9 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-1), randomGenerator8);
        multiStartUnivariateRealOptimizer9.setMaxEvaluations(1);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer9, 0, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer14, (int) (byte) -1, randomGenerator16);
        int int18 = multiStartUnivariateRealOptimizer14.getEvaluations();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4112");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator11);
        int int13 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) 100);
        int int16 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(2147483647);
        org.apache.commons.math.random.RandomGenerator randomGenerator20 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer21 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (short) -1, randomGenerator20);
        int int22 = multiStartUnivariateRealOptimizer21.getMaxEvaluations();
        java.lang.Class<?> wildcardClass23 = multiStartUnivariateRealOptimizer21.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4113");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 1, randomGenerator6);
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (short) -1);
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = multiStartUnivariateRealOptimizer3.getAbsoluteAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test4114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4114");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) '4');
        int int7 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 10, randomGenerator12);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
    }

    @Test
    public void test4115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4115");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 100);
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations(32);
        int int13 = multiStartUnivariateRealOptimizer6.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer16 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 100, randomGenerator15);
        int int17 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int18 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test4116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4116");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int8 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int9 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 32, randomGenerator11);
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) 100);
        int int15 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        java.lang.Class<?> wildcardClass16 = multiStartUnivariateRealOptimizer6.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4117");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer11 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 100, randomGenerator10);
        int int12 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int13 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int14 = multiStartUnivariateRealOptimizer6.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4118");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 1, randomGenerator13);
        int int15 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int16 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int17 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int18 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) 'a');
        org.apache.commons.math.random.RandomGenerator randomGenerator22 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer23 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) 'a', randomGenerator22);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4119");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator11);
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer12, 0, randomGenerator14);
        int int16 = multiStartUnivariateRealOptimizer15.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer19 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer15, (int) (byte) -1, randomGenerator18);
        int int20 = multiStartUnivariateRealOptimizer19.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator22 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer23 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer19, 1, randomGenerator22);
        org.apache.commons.math.random.RandomGenerator randomGenerator25 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer26 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer19, 10, randomGenerator25);
        int int27 = multiStartUnivariateRealOptimizer26.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double28 = multiStartUnivariateRealOptimizer26.getRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
    }

    @Test
    public void test4120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4120");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int5 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator7 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 32, randomGenerator7);
        int int9 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) ' ', randomGenerator11);
        int int13 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        int int14 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
    }

    @Test
    public void test4121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4121");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator6);
        int int8 = multiStartUnivariateRealOptimizer7.getMaxEvaluations();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        org.apache.commons.math.optimization.GoalType goalType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = multiStartUnivariateRealOptimizer7.optimize(univariateRealFunction9, goalType10, (double) 0L, 0.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: -1");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test4122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4122");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) '4');
        int int7 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations(0);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (byte) 1, randomGenerator13);
        int int15 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4123");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 100, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer14, (int) (short) 0, randomGenerator16);
        int int18 = multiStartUnivariateRealOptimizer17.getIterationCount();
        int int19 = multiStartUnivariateRealOptimizer17.getIterationCount();
        multiStartUnivariateRealOptimizer17.setMaximalIterationCount(0);
        int int22 = multiStartUnivariateRealOptimizer17.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer17.setAbsoluteAccuracy((double) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4124");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator11);
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer12, 0, randomGenerator14);
        multiStartUnivariateRealOptimizer15.setMaximalIterationCount((int) '4');
        int int18 = multiStartUnivariateRealOptimizer15.getMaxEvaluations();
        multiStartUnivariateRealOptimizer15.setMaximalIterationCount((-1));
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray21 = multiStartUnivariateRealOptimizer15.getOptimaValues();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
    }

    @Test
    public void test4125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4125");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) ' ');
        int int11 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 1, randomGenerator13);
        multiStartUnivariateRealOptimizer14.setMaximalIterationCount((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = multiStartUnivariateRealOptimizer14.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4126");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 100);
        int int11 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4127");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (-1), randomGenerator2);
        multiStartUnivariateRealOptimizer3.setMaxEvaluations(100);
    }

    @Test
    public void test4128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4128");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 2147483647, randomGenerator6);
        multiStartUnivariateRealOptimizer7.setMaxEvaluations((int) '4');
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer7, 0, randomGenerator11);
        multiStartUnivariateRealOptimizer12.setMaximalIterationCount((int) (byte) -1);
        int int15 = multiStartUnivariateRealOptimizer12.getEvaluations();
        multiStartUnivariateRealOptimizer12.setMaximalIterationCount(32);
        int int18 = multiStartUnivariateRealOptimizer12.getMaximalIterationCount();
        int int19 = multiStartUnivariateRealOptimizer12.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test4129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4129");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int12 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int13 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4130");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) -1, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer14, (int) (byte) 1, randomGenerator16);
        org.apache.commons.math.random.RandomGenerator randomGenerator19 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer20 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer14, (int) (byte) -1, randomGenerator19);
        org.apache.commons.math.random.RandomGenerator randomGenerator22 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer23 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer14, 1, randomGenerator22);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4131");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (short) 100);
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4132");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 1, randomGenerator13);
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) 0);
        int int17 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction20 = null;
        org.apache.commons.math.optimization.GoalType goalType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double24 = multiStartUnivariateRealOptimizer6.optimize(univariateRealFunction20, goalType21, (double) (byte) 100, (double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test4133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4133");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(32);
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test4134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4134");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 100, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer14, (int) (short) 0, randomGenerator16);
        int int18 = multiStartUnivariateRealOptimizer17.getIterationCount();
        int int19 = multiStartUnivariateRealOptimizer17.getIterationCount();
        multiStartUnivariateRealOptimizer17.setMaximalIterationCount(0);
        int int22 = multiStartUnivariateRealOptimizer17.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double23 = multiStartUnivariateRealOptimizer17.getFunctionValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test4135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4135");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '#');
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator9 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer10 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 0, randomGenerator9);
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4136");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 0);
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int12 = multiStartUnivariateRealOptimizer6.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator14);
        int int16 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int17 = multiStartUnivariateRealOptimizer6.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = multiStartUnivariateRealOptimizer6.getRelativeAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4137");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int10 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 1, randomGenerator13);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) 1);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((-1));
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.setRelativeAccuracy(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test4138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4138");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) '4');
        int int7 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 0);
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) '4', randomGenerator12);
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) '4');
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount(1);
        int int18 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
    }

    @Test
    public void test4139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4139");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) '4');
        int int7 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 0);
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) '4', randomGenerator12);
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test4140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4140");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer11 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 100, randomGenerator10);
        multiStartUnivariateRealOptimizer11.setMaximalIterationCount((int) '4');
        multiStartUnivariateRealOptimizer11.setMaxEvaluations((int) '4');
        org.apache.commons.math.random.RandomGenerator randomGenerator17 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer18 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer11, (int) (byte) 100, randomGenerator17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test4141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4141");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator11);
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer12, 0, randomGenerator14);
        int int16 = multiStartUnivariateRealOptimizer15.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer19 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer15, 1, randomGenerator18);
        multiStartUnivariateRealOptimizer15.setMaxEvaluations((int) (byte) -1);
        multiStartUnivariateRealOptimizer15.setMaxEvaluations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test4142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4142");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 1);
        int int9 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '#', randomGenerator11);
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer12, 0, randomGenerator14);
        int int16 = multiStartUnivariateRealOptimizer15.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer19 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer15, 1, randomGenerator18);
        multiStartUnivariateRealOptimizer15.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.random.RandomGenerator randomGenerator23 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer24 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer15, 100, randomGenerator23);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = multiStartUnivariateRealOptimizer24.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
    }

    @Test
    public void test4143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4143");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (byte) 100);
        multiStartUnivariateRealOptimizer3.setMaxEvaluations(0);
        org.apache.commons.math.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer11 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 52, randomGenerator10);
        int int12 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int13 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int14 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int15 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4144");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getEvaluations();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (byte) -1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = multiStartUnivariateRealOptimizer3.optimize(univariateRealFunction7, goalType8, 1.0d, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4145");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int11 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int12 = multiStartUnivariateRealOptimizer6.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4146");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer11 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 2147483647, randomGenerator10);
        int int12 = multiStartUnivariateRealOptimizer3.getEvaluations();
        int int13 = multiStartUnivariateRealOptimizer3.getIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer16 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 2147483647, randomGenerator15);
        int int17 = multiStartUnivariateRealOptimizer16.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray18 = multiStartUnivariateRealOptimizer16.getOptima();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4147");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (short) 100);
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer3.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = multiStartUnivariateRealOptimizer3.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test4148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4148");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 1, randomGenerator6);
        int int8 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.setRelativeAccuracy((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test4149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4149");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '#');
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount(10);
        multiStartUnivariateRealOptimizer3.setMaxEvaluations((int) (short) 0);
        int int11 = multiStartUnivariateRealOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.resetAbsoluteAccuracy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4150");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int5 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        int int6 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator8 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer9 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 1, randomGenerator8);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test4151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4151");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) '#');
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount(10);
        org.apache.commons.math.random.RandomGenerator randomGenerator10 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer11 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator10);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 0, randomGenerator13);
        multiStartUnivariateRealOptimizer14.setMaxEvaluations(52);
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray17 = multiStartUnivariateRealOptimizer14.getOptima();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test4152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4152");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (short) 0, randomGenerator2);
        // The following exception was thrown during execution in test generation
        try {
            double double4 = multiStartUnivariateRealOptimizer3.getResult();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4153");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) 'a', randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator9 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer10 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) ' ', randomGenerator9);
        org.apache.commons.math.random.RandomGenerator randomGenerator12 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer13 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (-1), randomGenerator12);
        int int14 = multiStartUnivariateRealOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer3.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4154");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 1, randomGenerator6);
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (short) -1);
        int int10 = multiStartUnivariateRealOptimizer3.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double[] doubleArray11 = multiStartUnivariateRealOptimizer3.getOptimaValues();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test4155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4155");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) (short) 1, randomGenerator6);
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount((int) (short) -1);
        int int10 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        int int11 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
    }

    @Test
    public void test4156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4156");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) 10);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((-1));
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (short) 100, randomGenerator13);
        org.apache.commons.math.random.RandomGenerator randomGenerator16 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer17 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (short) 1, randomGenerator16);
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((-1));
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount(10);
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer6.resetMaximalIterationCount();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test4157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4157");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator6 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer7 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 2147483647, randomGenerator6);
        org.apache.commons.math.random.RandomGenerator randomGenerator9 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer10 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer7, (int) (byte) 1, randomGenerator9);
        multiStartUnivariateRealOptimizer7.setMaximalIterationCount(52);
        org.apache.commons.math.random.RandomGenerator randomGenerator14 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer15 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer7, (int) (byte) 10, randomGenerator14);
        org.apache.commons.math.random.RandomGenerator randomGenerator17 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer18 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer7, 100, randomGenerator17);
        int int19 = multiStartUnivariateRealOptimizer18.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test4158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4158");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        int int5 = multiStartUnivariateRealOptimizer3.getEvaluations();
        org.apache.commons.math.random.RandomGenerator randomGenerator7 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer8 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, 32, randomGenerator7);
        int int9 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        org.apache.commons.math.random.RandomGenerator randomGenerator11 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer12 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer3, (int) ' ', randomGenerator11);
        int int13 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        multiStartUnivariateRealOptimizer3.setMaxEvaluations(52);
        multiStartUnivariateRealOptimizer3.setMaximalIterationCount(2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
    }

    @Test
    public void test4159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4159");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int8 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        int int9 = multiStartUnivariateRealOptimizer6.getIterationCount();
        int int10 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int11 = multiStartUnivariateRealOptimizer6.getIterationCount();
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) -1);
        org.apache.commons.math.random.RandomGenerator randomGenerator15 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer16 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) '4', randomGenerator15);
        org.apache.commons.math.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer19 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 100, randomGenerator18);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test4160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4160");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 0);
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (short) -1);
        int int12 = multiStartUnivariateRealOptimizer6.getMaximalIterationCount();
        int int13 = multiStartUnivariateRealOptimizer6.getEvaluations();
        int int14 = multiStartUnivariateRealOptimizer6.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = multiStartUnivariateRealOptimizer6.getFunctionValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4161");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        int int4 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int5 = multiStartUnivariateRealOptimizer3.getMaximalIterationCount();
        int int6 = multiStartUnivariateRealOptimizer3.getIterationCount();
        int int7 = multiStartUnivariateRealOptimizer3.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
    }

    @Test
    public void test4162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4162");
        org.apache.commons.math.optimization.UnivariateRealOptimizer univariateRealOptimizer0 = null;
        org.apache.commons.math.random.RandomGenerator randomGenerator2 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer3 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 10, randomGenerator2);
        org.apache.commons.math.random.RandomGenerator randomGenerator5 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer6 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer(univariateRealOptimizer0, (int) (byte) 0, randomGenerator5);
        int int7 = multiStartUnivariateRealOptimizer6.getMaxEvaluations();
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) ' ');
        multiStartUnivariateRealOptimizer6.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.random.RandomGenerator randomGenerator13 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer14 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, (int) (byte) 100, randomGenerator13);
        multiStartUnivariateRealOptimizer6.setMaximalIterationCount((int) (byte) 100);
        org.apache.commons.math.random.RandomGenerator randomGenerator18 = null;
        org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer multiStartUnivariateRealOptimizer19 = new org.apache.commons.math.optimization.MultiStartUnivariateRealOptimizer((org.apache.commons.math.optimization.UnivariateRealOptimizer) multiStartUnivariateRealOptimizer6, 0, randomGenerator18);
        int int20 = multiStartUnivariateRealOptimizer19.getEvaluations();
        int int21 = multiStartUnivariateRealOptimizer19.getEvaluations();
        // The following exception was thrown during execution in test generation
        try {
            multiStartUnivariateRealOptimizer19.setRelativeAccuracy((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }
}

