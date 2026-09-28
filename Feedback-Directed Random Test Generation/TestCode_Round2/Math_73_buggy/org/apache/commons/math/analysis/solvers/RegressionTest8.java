package org.apache.commons.math.analysis.solvers;

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
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10);
        brentSolver0.resetMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-15d + "'", double3 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test4002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test4002");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.resetFunctionValueAccuracy();
        int int7 = brentSolver0.getMaximalIterationCount();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-15d + "'", double2 == 1.0E-15d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-14d + "'", double3 == 1.0E-14d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }
}

