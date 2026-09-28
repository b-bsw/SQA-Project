package org.apache.commons.math.analysis.solvers;

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
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 100L);
        brentSolver0.setRelativeAccuracy((double) (short) 1);
        brentSolver0.setAbsoluteAccuracy((double) 1);
        double double13 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction11, 97.0d, (double) (-1L), (double) (short) 100);
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
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 32.0d + "'", double9 == 32.0d);
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(0.0d);
        double double12 = brentSolver0.getAbsoluteAccuracy();
        double double13 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 1);
        int int16 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1.0f));
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        double double12 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 1);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction12, (double) 100, 1.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        double double9 = brentSolver0.getRelativeAccuracy();
        int int10 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy(1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) -1);
        brentSolver0.setAbsoluteAccuracy(10.0d);
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        int int10 = brentSolver0.getMaximalIterationCount();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy(10.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve(univariateRealFunction14, (double) (short) 0, (double) ' ', (double) 0.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setRelativeAccuracy((double) '#');
        brentSolver0.setMaximalIterationCount(10);
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        java.lang.Class<?> wildcardClass11 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 35.0d + "'", double7 == 35.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int13 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 100.0f);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((-1.0d));
        brentSolver0.resetRelativeAccuracy();
        double double14 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.setRelativeAccuracy(10.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.setAbsoluteAccuracy((double) 100L);
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double10 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount(100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) 'a');
        double double12 = brentSolver0.getRelativeAccuracy();
        double double13 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int15 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 32.0d + "'", double13 == 32.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        brentSolver0.setAbsoluteAccuracy((double) (-1.0f));
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0);
        brentSolver0.setFunctionValueAccuracy((double) 52);
        brentSolver0.setFunctionValueAccuracy((double) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        brentSolver0.setAbsoluteAccuracy(100.0d);
        brentSolver0.setFunctionValueAccuracy((double) 52);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100);
        double double13 = brentSolver0.getAbsoluteAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.setAbsoluteAccuracy((double) 100L);
        brentSolver0.setFunctionValueAccuracy((double) 1);
        int int13 = brentSolver0.getIterationCount();
        double double14 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 10);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve(univariateRealFunction9, (double) 10.0f, (double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.setRelativeAccuracy(10.0d);
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount(1);
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.setRelativeAccuracy((double) (byte) 1);
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        brentSolver0.setAbsoluteAccuracy((double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 1L);
        brentSolver0.setRelativeAccuracy((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 32.0d + "'", double8 == 32.0d);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (short) 1);
        brentSolver0.setAbsoluteAccuracy(1.0E-14d);
        double double12 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int15 = brentSolver0.getIterationCount();
        double double16 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) -1);
        brentSolver0.setAbsoluteAccuracy(10.0d);
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy(100.0d);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction15 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve(univariateRealFunction15, (double) (short) 1, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve((double) (short) 100, 52.0d, (double) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        int int11 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass14 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 10);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass8 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy(1.0E-6d);
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.setFunctionValueAccuracy((-1.0d));
        brentSolver0.setRelativeAccuracy(97.0d);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        double double11 = brentSolver0.getRelativeAccuracy();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        int int13 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) 'a');
        double double12 = brentSolver0.getRelativeAccuracy();
        double double13 = brentSolver0.getFunctionValueAccuracy();
        double double14 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-14d + "'", double12 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-15d + "'", double14 == 1.0E-15d);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10.0f);
        brentSolver0.resetRelativeAccuracy();
        double double13 = brentSolver0.getFunctionValueAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        double double4 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 10);
        double double12 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy(0.0d);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction16 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double19 = brentSolver0.solve(univariateRealFunction16, (double) (-1), (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        int int6 = brentSolver0.getIterationCount();
        int int7 = brentSolver0.getMaximalIterationCount();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 1);
        int int10 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        int int12 = brentSolver0.getIterationCount();
        double double13 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 35);
        brentSolver0.setAbsoluteAccuracy(0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = brentSolver0.getRelativeAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 32.0d + "'", double7 == 32.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 100.0f);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(1.0E-14d);
        double double13 = brentSolver0.getFunctionValueAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        double double15 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-14d + "'", double13 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-14d + "'", double15 == 1.0E-14d);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.setRelativeAccuracy(10.0d);
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount(1);
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.resetAbsoluteAccuracy();
        int int15 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) ' ');
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double11 = brentSolver0.getRelativeAccuracy();
        int int12 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 1);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setRelativeAccuracy((double) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '4');
        int int11 = brentSolver0.getMaximalIterationCount();
        int int12 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int5 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        int int7 = brentSolver0.getMaximalIterationCount();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 35.0d + "'", double8 == 35.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 100);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        int int13 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        java.lang.Class<?> wildcardClass8 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        brentSolver0.resetAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction9 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve(univariateRealFunction9, (double) (short) 0, (double) 'a', (double) (short) 100);
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
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.setMaximalIterationCount(0);
        brentSolver0.setRelativeAccuracy((double) (short) 10);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 100);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        int int14 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 10L);
        double double17 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy(32.0d);
        double double20 = brentSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = brentSolver0.solve((double) (-1), 10.0d, (double) (byte) -1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 10);
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy((double) 32);
        brentSolver0.resetAbsoluteAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        int int15 = brentSolver0.getIterationCount();
        double double16 = brentSolver0.getRelativeAccuracy();
        int int17 = brentSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.getResult();
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
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-14d + "'", double16 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        int int9 = brentSolver0.getIterationCount();
        double double10 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.setAbsoluteAccuracy((double) 100L);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        double double13 = brentSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) -1);
        brentSolver0.setAbsoluteAccuracy(10.0d);
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        int int10 = brentSolver0.getMaximalIterationCount();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-15d + "'", double11 == 1.0E-15d);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
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
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        int int2 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.solve((double) 97, 0.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int7 = brentSolver0.getIterationCount();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        brentSolver0.resetFunctionValueAccuracy();
        int int11 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(35.0d, 1.0E-15d, 10.0d);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 0);
        double double5 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 1);
        brentSolver0.resetRelativeAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve(univariateRealFunction14, (double) (short) -1, (double) 35, (double) 100L);
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
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy(1.0d);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        double double12 = brentSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction13 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.solve(univariateRealFunction13, (double) 0.0f, (-1.0d), (double) 1.0f);
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
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) '4');
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) 'a');
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.solve(univariateRealFunction8, 10.0d, (double) 1L);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(97.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 0.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) ' ');
        brentSolver0.resetFunctionValueAccuracy();
        double double10 = brentSolver0.getRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.getResult();
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
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-14d + "'", double10 == 1.0E-14d);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setRelativeAccuracy((double) '#');
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10L);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction8 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve(univariateRealFunction8, (double) 100.0f, (double) ' ', (double) 1.0f);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.getFunctionValue();
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
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        double double11 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int13 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getRelativeAccuracy();
        int int7 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 100);
        double double10 = brentSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        brentSolver0.setFunctionValueAccuracy((double) 32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int10 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        brentSolver0.setRelativeAccuracy((double) 32);
        brentSolver0.setRelativeAccuracy(0.0d);
        double double17 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        brentSolver0.resetRelativeAccuracy();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        int int6 = brentSolver0.getIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve((double) 52, (double) 0L, (double) (short) 100);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        brentSolver0.setAbsoluteAccuracy((double) (short) 0);
        brentSolver0.setRelativeAccuracy((double) 52);
        double double16 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-15d + "'", double16 == 1.0E-15d);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        int int7 = brentSolver0.getMaximalIterationCount();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.solve((double) (byte) 0, 0.0d, (double) 10);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((-1.0d));
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 100);
        brentSolver0.resetRelativeAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        brentSolver0.resetRelativeAccuracy();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve((double) '#', 52.0d, (double) 52);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 100);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        int int14 = brentSolver0.getIterationCount();
        int int15 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int13 = brentSolver0.getMaximalIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction14 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double17 = brentSolver0.solve(univariateRealFunction14, (double) (-1.0f), (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 100);
        brentSolver0.resetRelativeAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = brentSolver0.solve((double) 10.0f, (double) (short) 1);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
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
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        int int6 = brentSolver0.getIterationCount();
        int int7 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double11 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-14d + "'", double11 == 1.0E-14d);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10.0f);
        brentSolver0.setFunctionValueAccuracy(1.0E-6d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.setRelativeAccuracy((double) 100);
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction10 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double14 = brentSolver0.solve(univariateRealFunction10, 0.0d, 52.0d, 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        brentSolver0.resetRelativeAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (byte) -1);
        brentSolver0.setMaximalIterationCount((int) '4');
        double double10 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (short) 1);
        brentSolver0.setAbsoluteAccuracy(1.0E-14d);
        double double12 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        int int11 = brentSolver0.getIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve((double) (short) 100, (double) 1L);
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
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) 'a');
        int int12 = brentSolver0.getIterationCount();
        double double13 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy(1.0E-15d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setRelativeAccuracy((double) 0);
        int int11 = brentSolver0.getIterationCount();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.resetRelativeAccuracy();
        int int12 = brentSolver0.getMaximalIterationCount();
        int int13 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 1);
        brentSolver0.setRelativeAccuracy((-1.0d));
        java.lang.Class<?> wildcardClass19 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) 'a');
        int int12 = brentSolver0.getIterationCount();
        double double13 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int15 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) '4');
        brentSolver0.resetMaximalIterationCount();
        int int11 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10.0f);
        double double15 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 52.0d + "'", double15 == 52.0d);
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1.0f));
        double double13 = brentSolver0.getFunctionValueAccuracy();
        double double14 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 1L);
        double double17 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy(0.0d);
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-15d + "'", double6 == 1.0E-15d);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) 100);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        int int14 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 10L);
        double double17 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        brentSolver0.setRelativeAccuracy((double) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.resetFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction11, (double) (byte) 10, (double) ' ', (-1.0d));
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.setFunctionValueAccuracy((double) 32);
        brentSolver0.resetAbsoluteAccuracy();
        double double14 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = brentSolver0.solve(univariateRealFunction17, (double) (short) 100, (double) ' ');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-14d + "'", double6 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-15d + "'", double8 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setRelativeAccuracy((double) '#');
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10L);
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount(52);
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.setAbsoluteAccuracy((double) 0L);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction12 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction12, (double) 10, (double) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-14d + "'", double5 == 1.0E-14d);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 100.0f);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((-1.0d));
        brentSolver0.resetRelativeAccuracy();
        double double14 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-14d + "'", double14 == 1.0E-14d);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        int int2 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 1L);
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.setAbsoluteAccuracy((double) (-1L));
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int11 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int5 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        int int4 = brentSolver0.getIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(10.0d);
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
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
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 100L);
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = brentSolver0.solve((double) 1.0f, 0.0d, (double) '4');
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        brentSolver0.setAbsoluteAccuracy(100.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve((double) 35, (double) (byte) 1, (double) (byte) 1);
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
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) -1);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy(52.0d);
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        double double10 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 1);
        brentSolver0.setMaximalIterationCount(97);
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction17 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double20 = brentSolver0.solve(univariateRealFunction17, (double) 10L, 0.0d);
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
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 100.0f);
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = brentSolver0.solve(1.0d, (double) 10L, 97.0d);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        int int7 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((double) 1L);
        int int10 = brentSolver0.getIterationCount();
        org.apache.commons.math.analysis.UnivariateRealFunction univariateRealFunction11 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.solve(univariateRealFunction11, (double) (byte) 10, (double) (short) -1, (double) 52);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.setMaximalIterationCount(0);
        int int10 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        double double13 = brentSolver0.getFunctionValueAccuracy();
        int int14 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int10 = brentSolver0.getMaximalIterationCount();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        double double13 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        double double15 = brentSolver0.getAbsoluteAccuracy();
        double double16 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-6d + "'", double15 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0E-6d + "'", double16 == 1.0E-6d);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((-1.0d));
        int int12 = brentSolver0.getIterationCount();
        double double13 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-14d + "'", double9 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-15d + "'", double13 == 1.0E-15d);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) ' ');
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = brentSolver0.getResult();
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
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 100);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 1L);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) -1);
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.resetRelativeAccuracy();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-15d + "'", double9 == 1.0E-15d);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((-1));
        double double12 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 10);
        brentSolver0.setFunctionValueAccuracy((double) (-1L));
        double double18 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        java.lang.Class<?> wildcardClass20 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-15d + "'", double12 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0E-6d + "'", double18 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 0);
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        double double13 = brentSolver0.getRelativeAccuracy();
        double double14 = brentSolver0.getFunctionValueAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        int int6 = brentSolver0.getIterationCount();
        double double7 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (-1L));
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount(35);
        brentSolver0.resetAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) '4');
        brentSolver0.setFunctionValueAccuracy((-1.0d));
        brentSolver0.setAbsoluteAccuracy((double) 10.0f);
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.resetFunctionValueAccuracy();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = brentSolver0.getResult();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        brentSolver0.resetAbsoluteAccuracy();
        double double4 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0E-6d + "'", double4 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setRelativeAccuracy((double) '#');
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10L);
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) '4');
        int int14 = brentSolver0.getIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) '4');
        java.lang.Class<?> wildcardClass17 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 35.0d + "'", double3 == 35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0E-6d + "'", double5 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 100);
        double double7 = brentSolver0.getRelativeAccuracy();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-14d + "'", double7 == 1.0E-14d);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setRelativeAccuracy((double) '#');
        brentSolver0.setMaximalIterationCount(10);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = brentSolver0.solve((double) '#', 32.0d, (double) (byte) 0);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.resetMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-14d + "'", double8 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.setAbsoluteAccuracy((double) 100L);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        double double13 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 100.0f);
        double double16 = brentSolver0.getAbsoluteAccuracy();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int9 = brentSolver0.getIterationCount();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        int int11 = brentSolver0.getIterationCount();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = brentSolver0.getFunctionValue();
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-15d + "'", double7 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(0.0d);
        int int7 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy(1.0E-6d);
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.setFunctionValueAccuracy(0.0d);
        brentSolver0.setRelativeAccuracy((-1.0d));
        int int16 = brentSolver0.getIterationCount();
        int int17 = brentSolver0.getIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getRelativeAccuracy();
        int int7 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 100);
        double double10 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        java.lang.Class<?> wildcardClass13 = brentSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-15d + "'", double10 == 1.0E-15d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }
}

