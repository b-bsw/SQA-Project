package org.apache.commons.math.analysis.solvers;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

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
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        int int6 = bisectionSolver0.getMaximalIterationCount();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10L);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        java.lang.Class<?> wildcardClass13 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int16 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setRelativeAccuracy((double) '#');
        bisectionSolver0.setRelativeAccuracy((double) (-1));
        double double5 = bisectionSolver0.getRelativeAccuracy();
        int int6 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy((double) 1L);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 100L);
        bisectionSolver0.setMaximalIterationCount(32);
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 10);
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int6 = bisectionSolver0.getMaximalIterationCount();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getIterationCount();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        java.lang.Class<?> wildcardClass12 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 'a');
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0.0f);
        int int13 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 97.0d + "'", double8 == 97.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 10);
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve((double) (short) 10, (double) 10, 97.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        double double10 = bisectionSolver0.getRelativeAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1.0f));
        double double15 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.solve(univariateRealFunction10, (double) 10L, (-1.0d), 32.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        bisectionSolver0.resetFunctionValueAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(52.0d);
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = bisectionSolver0.getMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        double double9 = bisectionSolver0.getRelativeAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 1);
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve((double) 10.0f, 1.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setRelativeAccuracy((double) '#');
        double double3 = bisectionSolver0.getRelativeAccuracy();
        int int4 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction6 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double9 = bisectionSolver0.solve(univariateRealFunction6, (double) '4', (double) 10.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy(1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int15 = bisectionSolver0.getMaximalIterationCount();
        double double16 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-6d + "'", double16 == 1.0E-6d);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 10);
        bisectionSolver0.resetRelativeAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int12 = bisectionSolver0.getIterationCount();
        int int13 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10.0f);
        bisectionSolver0.resetRelativeAccuracy();
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 32);
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(1.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.solve(univariateRealFunction13, (double) 100, (double) 97, (double) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        int int12 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve(univariateRealFunction14, (double) (-1L), (double) 1, (double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) '#');
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 1);
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 10);
        double double13 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(35.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (-1.0f));
        int int19 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100.0f);
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 'a');
        int int13 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = bisectionSolver0.getMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        double double9 = bisectionSolver0.getRelativeAccuracy();
        double double10 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 1);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setRelativeAccuracy((double) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve((double) 10.0f, (double) 1.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int10 = bisectionSolver0.getMaximalIterationCount();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double3 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 10);
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10.0f);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double3 = bisectionSolver0.getAbsoluteAccuracy();
        int int4 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        double double7 = bisectionSolver0.getRelativeAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int6 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        java.lang.Class<?> wildcardClass7 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        int int9 = bisectionSolver0.getIterationCount();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int10 = bisectionSolver0.getMaximalIterationCount();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(univariateRealFunction12, (double) 100L, (double) 0L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10.0f);
        bisectionSolver0.setFunctionValueAccuracy(97.0d);
        bisectionSolver0.setRelativeAccuracy(10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getIterationCount();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        bisectionSolver0.setRelativeAccuracy((double) 0);
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100.0f);
        bisectionSolver0.resetRelativeAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        double double14 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double18 = bisectionSolver0.getFunctionValueAccuracy();
        double double19 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-15d + "'", double18 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-15d + "'", double19 == 1.0E-15d);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.resetMaximalIterationCount();
        int int13 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        double double9 = bisectionSolver0.getRelativeAccuracy();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.setMaximalIterationCount(97);
        double double17 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getIterationCount();
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) ' ');
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.resetRelativeAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        int int9 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) 0L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int8 = bisectionSolver0.getMaximalIterationCount();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        int int14 = bisectionSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = bisectionSolver0.solve(univariateRealFunction15, 52.0d, (double) 1L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getIterationCount();
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) ' ');
        int int9 = bisectionSolver0.getIterationCount();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        int int11 = bisectionSolver0.getMaximalIterationCount();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0.0f);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 100L);
        bisectionSolver0.setFunctionValueAccuracy((double) 1);
        int int13 = bisectionSolver0.getIterationCount();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setMaximalIterationCount(10);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 1L);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) 0);
        bisectionSolver0.resetMaximalIterationCount();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(1.0E-14d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 100);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(52.0d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.setRelativeAccuracy((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = bisectionSolver0.solve((double) (byte) 100, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getIterationCount();
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) ' ');
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 10);
        int int13 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getIterationCount();
        int int6 = bisectionSolver0.getIterationCount();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 10);
        int int6 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        bisectionSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = bisectionSolver0.getMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 1.0f);
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        double double13 = bisectionSolver0.getAbsoluteAccuracy();
        double double14 = bisectionSolver0.getRelativeAccuracy();
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-15d + "'", double15 == 1.0E-15d);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) 10);
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        double double8 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        int int11 = bisectionSolver0.getIterationCount();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0.0f);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.setAbsoluteAccuracy((double) 100L);
        bisectionSolver0.setMaximalIterationCount((int) (short) 10);
        double double13 = bisectionSolver0.getFunctionValueAccuracy();
        double double14 = bisectionSolver0.getFunctionValueAccuracy();
        double double15 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.setMaximalIterationCount(32);
        int int10 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-6d);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 10);
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(32);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = bisectionSolver0.solve((double) (short) 100, (double) 97, (double) 97);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.setRelativeAccuracy((double) 100);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass14 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 10L);
        double double4 = bisectionSolver0.getFunctionValueAccuracy();
        int int5 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (short) -1);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 1L);
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 100);
        bisectionSolver0.setAbsoluteAccuracy(32.0d);
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getIterationCount();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        int int5 = bisectionSolver0.getIterationCount();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        double double7 = bisectionSolver0.getFunctionValueAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) 32);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double14 = bisectionSolver0.getAbsoluteAccuracy();
        int int15 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        int int18 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        double double11 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 1L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) 10L);
        bisectionSolver0.resetRelativeAccuracy();
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        double double6 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (-1.0f));
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.solve(univariateRealFunction11, (double) 10.0f, 10.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.setAbsoluteAccuracy(1.0E-14d);
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy(52.0d);
        bisectionSolver0.setFunctionValueAccuracy(0.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0.0f);
        bisectionSolver0.resetAbsoluteAccuracy();
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double9 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        int int12 = bisectionSolver0.getMaximalIterationCount();
        double double13 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        double double15 = bisectionSolver0.getAbsoluteAccuracy();
        int int16 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int18 = bisectionSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-6d + "'", double15 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100);
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 10);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) '#');
        bisectionSolver0.setFunctionValueAccuracy((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        bisectionSolver0.setFunctionValueAccuracy((double) (-1));
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        bisectionSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = bisectionSolver0.solve((double) 32, (double) (byte) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 0.0f);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(100.0d);
        bisectionSolver0.setRelativeAccuracy((double) 10);
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve((double) 100.0f, (double) 100.0f, (double) (byte) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        double double6 = bisectionSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass7 = bisectionSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.setMaximalIterationCount((int) (short) 0);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount(1);
        double double6 = bisectionSolver0.getFunctionValueAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = bisectionSolver0.solve((double) 10.0f, (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        double double5 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int10 = bisectionSolver0.getIterationCount();
        int int11 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        double double14 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 10);
        bisectionSolver0.resetRelativeAccuracy();
        double double8 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        int int11 = bisectionSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = bisectionSolver0.solve(univariateRealFunction12, 1.0E-14d, (double) 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        bisectionSolver0.setMaximalIterationCount(10);
        int int9 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 100);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy(52.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) 100L);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) 100.0f);
        bisectionSolver0.resetRelativeAccuracy();
        double double11 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) 0);
        int int14 = bisectionSolver0.getIterationCount();
        double double15 = bisectionSolver0.getRelativeAccuracy();
        double double16 = bisectionSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        double double7 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) '4');
        bisectionSolver0.resetMaximalIterationCount();
        int int11 = bisectionSolver0.getIterationCount();
        double double12 = bisectionSolver0.getAbsoluteAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 0);
        bisectionSolver0.setFunctionValueAccuracy((double) 52);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = bisectionSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        bisectionSolver0.setAbsoluteAccuracy(1.0E-14d);
        double double12 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int15 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (short) 100);
        int int20 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        int int7 = bisectionSolver0.getMaximalIterationCount();
        int int8 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        int int10 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        int int5 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (-1L));
        double double8 = bisectionSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(0.0d);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) 100L);
        int int12 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount(35);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.resetRelativeAccuracy();
        double double7 = bisectionSolver0.getRelativeAccuracy();
        int int8 = bisectionSolver0.getIterationCount();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve((double) '4', (double) 32);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) (byte) -1);
        bisectionSolver0.setAbsoluteAccuracy(10.0d);
        double double7 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.resetRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(0);
        bisectionSolver0.setAbsoluteAccuracy(35.0d);
        int int13 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        int int4 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setRelativeAccuracy((-1.0d));
        bisectionSolver0.setRelativeAccuracy((double) ' ');
        bisectionSolver0.setAbsoluteAccuracy((-1.0d));
        int int11 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) (byte) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount(100);
        bisectionSolver0.resetFunctionValueAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(10.0d);
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setRelativeAccuracy((double) '#');
        bisectionSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = bisectionSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        int int1 = bisectionSolver0.getMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = bisectionSolver0.solve(97.0d, (double) 32, (double) (short) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-15d + "'", double5 == 1.0E-15d);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        bisectionSolver0.setMaximalIterationCount((int) (byte) 1);
        double double9 = bisectionSolver0.getRelativeAccuracy();
        double double10 = bisectionSolver0.getAbsoluteAccuracy();
        double double11 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        double double14 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setMaximalIterationCount(1);
        int int17 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) (short) 100);
        int int20 = bisectionSolver0.getIterationCount();
        bisectionSolver0.setAbsoluteAccuracy(35.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double25 = bisectionSolver0.solve((double) 0.0f, (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        int int3 = bisectionSolver0.getMaximalIterationCount();
        int int4 = bisectionSolver0.getMaximalIterationCount();
        bisectionSolver0.setAbsoluteAccuracy((double) 10);
        bisectionSolver0.setMaximalIterationCount(0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = bisectionSolver0.solve(univariateRealFunction9, 0.0d, (double) 1L);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.MaxIterationsExceededException; message: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.MaxIterationsExceededException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetMaximalIterationCount();
        bisectionSolver0.setMaximalIterationCount((int) (byte) 100);
        bisectionSolver0.setAbsoluteAccuracy(100.0d);
        bisectionSolver0.setFunctionValueAccuracy(1.0E-15d);
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.setMaximalIterationCount((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        double double3 = bisectionSolver0.getRelativeAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (byte) -1);
        bisectionSolver0.resetFunctionValueAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        bisectionSolver0.resetAbsoluteAccuracy();
        double double9 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setFunctionValueAccuracy((double) (short) 1);
        int int12 = bisectionSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        org.apache.commons.math.analysis.solvers.BisectionSolver bisectionSolver0 = new org.apache.commons.math.analysis.solvers.BisectionSolver();
        bisectionSolver0.resetMaximalIterationCount();
        double double2 = bisectionSolver0.getFunctionValueAccuracy();
        bisectionSolver0.setRelativeAccuracy((double) (short) 0);
        bisectionSolver0.setAbsoluteAccuracy((double) '4');
        int int7 = bisectionSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }
}

