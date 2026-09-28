package org.apache.commons.math.analysis.solvers;

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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = brentSolver0.solve((double) (short) -1, 1.0d, (double) 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = brentSolver0.solve((-1.0d), (double) 'a', (double) (short) 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = brentSolver0.solve((double) (-1), (double) (short) 1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = brentSolver0.solve((double) (short) 1, (double) (short) 100);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = brentSolver0.solve((double) (short) 0, (double) 10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) (byte) 0, (double) '4', (double) (short) 1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = brentSolver0.solve((double) 10L, (double) (short) 100);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) 0L, (double) ' ');
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) 0, (double) 'a', 1.0E-15d);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) (-1.0f), (double) (byte) 1, 0.0d);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) (-1L), 1.0E-14d);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.setRelativeAccuracy((-1.0d));
        brentSolver0.setRelativeAccuracy((double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) ' ', 100.0d);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve((double) (byte) -1, (double) (short) 100);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = brentSolver0.solve(0.0d, 1.0E-14d);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) (short) 0, 100.0d);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) (-1.0f), (double) 0L);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) (-1.0f), (double) (byte) 100);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int10 = brentSolver0.getMaximalIterationCount();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve((double) (-1L), (double) 0L);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double5 = brentSolver0.solve(0.0d, 1.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) (-1L), 0.0d);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.setRelativeAccuracy((double) 100);
        brentSolver0.setFunctionValueAccuracy((double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) (-1L), (double) 0L);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = brentSolver0.solve((double) (short) -1, (double) '#');
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 10);
        double double6 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = brentSolver0.solve((double) 0L, (double) 100);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = brentSolver0.solve((double) (-1L), (double) 10, 0.0d);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) 10.0f, (double) (short) 100);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) (-1L), (double) (short) 10, (double) (short) 1);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve(1.0E-15d, 32.0d, (double) 1.0f);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) 10, (double) 100);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        double double3 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = brentSolver0.solve((double) 0, (double) 100L);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) 1L, (double) 100);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) (byte) 0, (double) 1L);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = brentSolver0.solve((double) '#', (double) (byte) 100);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) 0, (double) 10.0f);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) (short) -1, (double) 1L);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int8 = brentSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) '#', (double) 100L);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve(0.0d, 1.0E-6d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (byte) -1);
        brentSolver0.setAbsoluteAccuracy(10.0d);
        double double7 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) (short) -1, 100.0d);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) 0.0f, (double) 'a');
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.setFunctionValueAccuracy(35.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((-1.0d), (double) 100);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        int int9 = brentSolver0.getIterationCount();
        brentSolver0.setMaximalIterationCount((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = brentSolver0.solve((double) (short) 1, (double) (byte) 100, 35.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) (-1L), (double) 0.0f);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve(0.0d, (double) 1L);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve((double) (byte) 0, (double) (byte) 1);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve(0.0d, (double) 1.0f, 1.0E-6d);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve(0.0d, (double) '#');
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 10);
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        brentSolver0.setFunctionValueAccuracy((double) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve(10.0d, (double) (short) 100);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = brentSolver0.solve(0.0d, (double) ' ', 1.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        double double10 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) 10, (double) ' ');
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setRelativeAccuracy((double) '#');
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) 52, (double) 100L);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        int int4 = brentSolver0.getIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        double double8 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) (short) 1, (double) 100);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setRelativeAccuracy((double) '#');
        double double3 = brentSolver0.getRelativeAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) 1, (double) ' ');
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy(10.0d);
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) (byte) 0, (double) 1L);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        double double1 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(35.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = brentSolver0.solve(35.0d, (double) 'a');
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        int int6 = brentSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = brentSolver0.solve((double) 32, (double) 100);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = brentSolver0.solve((double) (byte) 1, 52.0d);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) (-1.0f), (double) 35, 32.0d);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setRelativeAccuracy((double) '#');
        brentSolver0.setMaximalIterationCount(10);
        double double5 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve(1.0d, (double) (byte) 10);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = brentSolver0.solve(0.0d, (double) 100L);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) (byte) 1, (double) (byte) 100);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        int int6 = brentSolver0.getMaximalIterationCount();
        int int7 = brentSolver0.getMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve(0.0d, (double) (byte) 100);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve(1.0E-15d, (double) 100L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int10 = brentSolver0.getMaximalIterationCount();
        int int11 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = brentSolver0.solve((double) 0L, (double) '#');
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double19 = brentSolver0.solve((double) (byte) -1, 1.0E-15d);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) (byte) -1, (double) 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        brentSolver0.setAbsoluteAccuracy((double) 100L);
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = brentSolver0.solve(0.0d, (double) ' ');
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) 1, (double) 100);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) 0L, 100.0d, (double) 10.0f);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.resetFunctionValueAccuracy();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve(0.0d, (double) 1, 1.0E-14d);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int5 = brentSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) (short) -1, (double) 10.0f);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) (-1.0f), (double) 10.0f);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve(0.0d, (double) 35, 1.0E-15d);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
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
        brentSolver0.setRelativeAccuracy(52.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = brentSolver0.solve((double) (byte) -1, 1.0E-6d);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
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
        double double15 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = brentSolver0.solve((double) (byte) 0, 52.0d);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(1.0E-14d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) '#', 52.0d);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = brentSolver0.solve((double) 1.0f, (double) (short) 10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        int int6 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) 10, 32.0d);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) 1, (double) '#');
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int8 = brentSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) (-1.0f), (double) '#', (double) (byte) 1);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        int int3 = brentSolver0.getIterationCount();
        double double4 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) 10, 100.0d, 35.0d);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) (-1), 52.0d);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(0.0d);
        brentSolver0.resetAbsoluteAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve(1.0E-15d, (double) ' ', (double) (byte) 10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        int int11 = brentSolver0.getMaximalIterationCount();
        double double12 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = brentSolver0.solve((double) ' ', (double) 100.0f);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(100.0d);
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) (short) 1, 10.0d);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setRelativeAccuracy((double) '#');
        brentSolver0.setMaximalIterationCount(10);
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        double double7 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) (short) 1, (double) 'a');
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        int int7 = brentSolver0.getMaximalIterationCount();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) 0L, 1.0E-14d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve((double) 0L, (double) ' ');
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
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
        double double15 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount(32);
        brentSolver0.setAbsoluteAccuracy((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double22 = brentSolver0.solve((double) 1L, 97.0d);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        double double11 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = brentSolver0.solve((-1.0d), (double) '4', (double) 1L);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve(0.0d, (double) 10.0f, 1.0E-14d);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) 32, (double) '#');
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = brentSolver0.getFunctionValueAccuracy();
        double double6 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) 0, (double) 100L, 52.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setRelativeAccuracy((double) '#');
        brentSolver0.setMaximalIterationCount(10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) 0, (double) 'a');
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int10 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(1.0E-6d);
        brentSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = brentSolver0.solve((double) (-1L), (double) 10L, 0.0d);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        int int6 = brentSolver0.getIterationCount();
        double double7 = brentSolver0.getRelativeAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) '#', 52.0d);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) (byte) 10, 35.0d);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        double double9 = brentSolver0.getRelativeAccuracy();
        double double10 = brentSolver0.getAbsoluteAccuracy();
        double double11 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) '4');
        int int14 = brentSolver0.getMaximalIterationCount();
        double double15 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = brentSolver0.solve((double) ' ', (double) '4');
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve(1.0E-15d, (double) (byte) 1);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 100);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = brentSolver0.solve((double) (-1), (double) 32, (double) 0.0f);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        double double10 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) 10L, 97.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        double double10 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = brentSolver0.solve((double) (short) 10, (double) 100L, (double) '#');
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        double double9 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve(0.0d, 100.0d);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        brentSolver0.resetRelativeAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double10 = brentSolver0.solve((double) (short) -1, (double) 52, (double) 1L);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve(0.0d, (double) (byte) 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve(0.0d, (double) (byte) 100);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = brentSolver0.solve((-1.0d), (double) 0L);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) 1L, 52.0d, 35.0d);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        double double8 = brentSolver0.getFunctionValueAccuracy();
        double double9 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) (-1L), 35.0d);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 100);
        brentSolver0.setRelativeAccuracy((double) (byte) 0);
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = brentSolver0.solve(0.0d, (double) ' ');
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve(0.0d, (double) 'a');
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = brentSolver0.solve((double) (byte) 0, (double) 1L);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        int int7 = brentSolver0.getMaximalIterationCount();
        int int8 = brentSolver0.getMaximalIterationCount();
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) 'a');
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        double double14 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = brentSolver0.solve((double) 1, (double) (short) 100);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        brentSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = brentSolver0.solve((double) 0.0f, (double) '#');
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve(0.0d, (double) 1);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
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
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = brentSolver0.solve(1.0E-14d, 35.0d);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        int int6 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 100L);
        double double9 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve(1.0E-6d, (double) 1.0f);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetFunctionValueAccuracy();
        double double9 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        brentSolver0.setRelativeAccuracy((double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = brentSolver0.solve((double) (short) -1, 97.0d, (double) 10L);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        brentSolver0.resetRelativeAccuracy();
        double double5 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) 0, (double) (short) 100);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = brentSolver0.solve(0.0d, 97.0d);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = brentSolver0.solve(1.0E-15d, (double) ' ');
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        int int11 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = brentSolver0.solve((double) (byte) 0, (double) 100.0f, 52.0d);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.setFunctionValueAccuracy(1.0E-15d);
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(32.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = brentSolver0.solve((double) 0.0f, (double) 100L, (double) 10);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 0);
        brentSolver0.setAbsoluteAccuracy((double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve(0.0d, 1.0d);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        double double7 = brentSolver0.getRelativeAccuracy();
        double double8 = brentSolver0.getFunctionValueAccuracy();
        int int9 = brentSolver0.getIterationCount();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double12 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        double double15 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = brentSolver0.solve((double) 10.0f, (double) 100);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        int int4 = brentSolver0.getIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy(10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve((double) (-1L), (double) 52, 0.0d);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) 1.0f, 35.0d);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) 1L, (double) 32);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 10);
        double double10 = brentSolver0.getAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) ' ', (double) 100);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 100);
        brentSolver0.setRelativeAccuracy(35.0d);
        brentSolver0.setRelativeAccuracy((double) 100.0f);
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve((-1.0d), (double) 'a', (double) (short) 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) 1L);
        brentSolver0.setAbsoluteAccuracy(0.0d);
        double double12 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double15 = brentSolver0.solve((double) 32, 52.0d);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        brentSolver0.setMaximalIterationCount((int) (short) 1);
        brentSolver0.setMaximalIterationCount((int) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) (byte) -1, (double) (short) 1);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double9 = brentSolver0.solve((double) (byte) 0, (double) 100.0f, (double) 10L);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
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
        brentSolver0.setMaximalIterationCount((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double20 = brentSolver0.solve((double) (byte) 1, 35.0d);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double7 = brentSolver0.getFunctionValueAccuracy();
        double double8 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) 0, 97.0d);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
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
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        int int14 = brentSolver0.getMaximalIterationCount();
        double double15 = brentSolver0.getFunctionValueAccuracy();
        double double16 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double21 = brentSolver0.solve((double) 0, 97.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        int int6 = brentSolver0.getIterationCount();
        double double7 = brentSolver0.getRelativeAccuracy();
        int int8 = brentSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) 35, (double) 100.0f, 52.0d);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) ' ', (double) 35);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetMaximalIterationCount();
        double double8 = brentSolver0.getRelativeAccuracy();
        double double9 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve((double) 10, 52.0d);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
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
        brentSolver0.setMaximalIterationCount((int) (byte) -1);
        double double14 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = brentSolver0.solve((double) 1, (double) ' ');
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = brentSolver0.solve((double) (byte) -1, 10.0d, (double) (short) 0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
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
        int int10 = brentSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve(0.0d, (double) (byte) 100, 1.0E-6d);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        int int4 = brentSolver0.getIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (short) -1);
        double double8 = brentSolver0.getAbsoluteAccuracy();
        int int9 = brentSolver0.getMaximalIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) 0.0f, (double) 35, 1.0E-14d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.setRelativeAccuracy((double) '#');
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) 10L);
        int int8 = brentSolver0.getMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) '#', (double) 100L);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        int int8 = brentSolver0.getIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) (byte) -1, (double) (byte) 10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        brentSolver0.setAbsoluteAccuracy((double) (byte) 10);
        brentSolver0.setAbsoluteAccuracy((double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = brentSolver0.solve((double) 0.0f, (double) 100.0f);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetMaximalIterationCount();
        int int5 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) (-1L));
        double double8 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve((double) (byte) -1, 97.0d, 35.0d);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy(1.0E-15d);
        double double9 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve(10.0d, 100.0d);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) '#');
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) 1);
        int int10 = brentSolver0.getIterationCount();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve(0.0d, 35.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
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
        double double15 = brentSolver0.getRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double18 = brentSolver0.solve(0.0d, (double) 10L);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        double double5 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) 100L);
        brentSolver0.setAbsoluteAccuracy((double) (byte) 0);
        brentSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve((double) (-1L), (double) 10, (double) (byte) 0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
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
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount((int) (byte) 100);
        double double20 = brentSolver0.getRelativeAccuracy();
        double double21 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double25 = brentSolver0.solve((double) 32, 35.0d);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        int int3 = brentSolver0.getMaximalIterationCount();
        int int4 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy((double) (byte) 10);
        brentSolver0.resetAbsoluteAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double12 = brentSolver0.solve(0.0d, (double) 1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        double double5 = brentSolver0.getRelativeAccuracy();
        double double6 = brentSolver0.getRelativeAccuracy();
        int int7 = brentSolver0.getIterationCount();
        brentSolver0.setAbsoluteAccuracy((double) 100);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = brentSolver0.solve((double) 0L, (double) ' ');
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setRelativeAccuracy((double) (byte) -1);
        brentSolver0.setFunctionValueAccuracy((double) (-1));
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setRelativeAccuracy(10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) 0L, 1.0E-6d);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setRelativeAccuracy((double) (short) 0);
        brentSolver0.resetMaximalIterationCount();
        brentSolver0.setMaximalIterationCount(100);
        brentSolver0.setFunctionValueAccuracy((double) (short) 10);
        int int10 = brentSolver0.getMaximalIterationCount();
        double double11 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 52);
        brentSolver0.setAbsoluteAccuracy((double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double21 = brentSolver0.solve((double) (short) 0, 35.0d);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setAbsoluteAccuracy(1.0d);
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setMaximalIterationCount((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double11 = brentSolver0.solve((double) 0L, 1.0d);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.setAbsoluteAccuracy((double) ' ');
        double double5 = brentSolver0.getRelativeAccuracy();
        int int6 = brentSolver0.getMaximalIterationCount();
        double double7 = brentSolver0.getAbsoluteAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((double) 10.0f, 52.0d);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        brentSolver0.resetMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        int int4 = brentSolver0.getMaximalIterationCount();
        int int5 = brentSolver0.getIterationCount();
        double double6 = brentSolver0.getRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) (short) 10);
        double double9 = brentSolver0.getRelativeAccuracy();
        int int10 = brentSolver0.getMaximalIterationCount();
        brentSolver0.setRelativeAccuracy(32.0d);
        brentSolver0.resetAbsoluteAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double16 = brentSolver0.solve(1.0d, (double) 32);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
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
        double double11 = brentSolver0.getFunctionValueAccuracy();
        double double12 = brentSolver0.getRelativeAccuracy();
        double double13 = brentSolver0.getAbsoluteAccuracy();
        double double14 = brentSolver0.getFunctionValueAccuracy();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double17 = brentSolver0.solve(0.0d, (double) 100);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.commons.math.analysis.solvers.BrentSolver brentSolver0 = new org.apache.commons.math.analysis.solvers.BrentSolver();
        int int1 = brentSolver0.getMaximalIterationCount();
        double double2 = brentSolver0.getFunctionValueAccuracy();
        double double3 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetRelativeAccuracy();
        brentSolver0.setMaximalIterationCount((int) '#');
        double double7 = brentSolver0.getFunctionValueAccuracy();
        brentSolver0.resetFunctionValueAccuracy();
        brentSolver0.setFunctionValueAccuracy((double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = brentSolver0.solve((-1.0d), (double) 100.0f);
    }
}

