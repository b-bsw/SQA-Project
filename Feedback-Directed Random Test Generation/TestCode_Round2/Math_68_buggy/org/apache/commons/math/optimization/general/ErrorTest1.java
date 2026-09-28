package org.apache.commons.math.optimization.general;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

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
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair8 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setOrthoTolerance((double) '#');
        int int23 = levenbergMarquardtOptimizer19.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        double double33 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair36 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setOrthoTolerance(0.0d);
        int int11 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        levenbergMarquardtOptimizer8.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer18.setOrthoTolerance(0.0d);
        int int21 = levenbergMarquardtOptimizer18.getMaxEvaluations();
        levenbergMarquardtOptimizer18.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer18.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer18.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer18.setMaxIterations(1000);
        double double30 = levenbergMarquardtOptimizer18.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair37 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        int int19 = levenbergMarquardtOptimizer13.getIterations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setOrthoTolerance((double) '#');
        int int13 = levenbergMarquardtOptimizer9.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        double double20 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair8 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int42 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        double double45 = levenbergMarquardtOptimizer0.getRMS();
        int int46 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double47 = levenbergMarquardtOptimizer0.getRMS();
        int int48 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray49 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setOrthoTolerance(0.0d);
        int int22 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer19.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        int int32 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double33 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair34 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setOrthoTolerance(0.0d);
        int int11 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer8.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer8.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer8.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker21);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        int int26 = levenbergMarquardtOptimizer0.getIterations();
        int int27 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray28 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double2 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray3 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) (byte) 10);
        int int21 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        int int22 = levenbergMarquardtOptimizer12.getIterations();
        levenbergMarquardtOptimizer12.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer25.setOrthoTolerance(0.0d);
        int int28 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        levenbergMarquardtOptimizer25.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer25.setOrthoTolerance((-1.0d));
        int int33 = levenbergMarquardtOptimizer25.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setOrthoTolerance(0.0d);
        int int37 = levenbergMarquardtOptimizer34.getMaxEvaluations();
        levenbergMarquardtOptimizer34.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer34.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer34.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer34.setMaxIterations(1000);
        double double46 = levenbergMarquardtOptimizer34.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer47 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker48 = levenbergMarquardtOptimizer47.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker48);
        int int53 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray54 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        int int22 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int23 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair7 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double20 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer13.getIterations();
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        double double21 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer11.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer11.setMaxIterations(1000);
        double double23 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int33 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray36 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        int int19 = levenbergMarquardtOptimizer13.getIterations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        int int24 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double25 = levenbergMarquardtOptimizer0.getChiSquare();
        int int26 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer27.setOrthoTolerance(0.0d);
        int int30 = levenbergMarquardtOptimizer27.getMaxEvaluations();
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) (byte) 10);
        int int33 = levenbergMarquardtOptimizer27.getMaxIterations();
        levenbergMarquardtOptimizer27.setCostRelativeTolerance((double) 0L);
        int int36 = levenbergMarquardtOptimizer27.getJacobianEvaluations();
        double double37 = levenbergMarquardtOptimizer27.getRMS();
        levenbergMarquardtOptimizer27.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setOrthoTolerance(0.0d);
        int int43 = levenbergMarquardtOptimizer40.getMaxEvaluations();
        levenbergMarquardtOptimizer40.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker46 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        int int47 = levenbergMarquardtOptimizer40.getJacobianEvaluations();
        int int48 = levenbergMarquardtOptimizer40.getEvaluations();
        int int49 = levenbergMarquardtOptimizer40.getMaxIterations();
        int int50 = levenbergMarquardtOptimizer40.getJacobianEvaluations();
        int int51 = levenbergMarquardtOptimizer40.getMaxEvaluations();
        levenbergMarquardtOptimizer40.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker54 = levenbergMarquardtOptimizer40.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker54);
        double double56 = levenbergMarquardtOptimizer27.getChiSquare();
        int int57 = levenbergMarquardtOptimizer27.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker58);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray60 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setOrthoTolerance(0.0d);
        int int12 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer9.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer9.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer9.setMaxIterations(1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        double double23 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair42 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setOrthoTolerance((double) '#');
        int int21 = levenbergMarquardtOptimizer17.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        double double23 = levenbergMarquardtOptimizer17.getChiSquare();
        levenbergMarquardtOptimizer17.setCostRelativeTolerance((double) 1.0f);
        int int26 = levenbergMarquardtOptimizer17.getJacobianEvaluations();
        levenbergMarquardtOptimizer17.setParRelativeTolerance((double) ' ');
        double double29 = levenbergMarquardtOptimizer17.getRMS();
        levenbergMarquardtOptimizer17.setParRelativeTolerance(100.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker32);
        int int34 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray37 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer12.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer12.setMaxEvaluations(0);
        int int24 = levenbergMarquardtOptimizer12.getIterations();
        int int25 = levenbergMarquardtOptimizer12.getIterations();
        double double26 = levenbergMarquardtOptimizer12.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) '#');
        int int35 = levenbergMarquardtOptimizer31.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        int int40 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int41 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray42 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        int int20 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setOrthoTolerance((double) '#');
        int int29 = levenbergMarquardtOptimizer25.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        int int38 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int39 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int40 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker41 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair42 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setOrthoTolerance(0.0d);
        int int11 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        levenbergMarquardtOptimizer8.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int42 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker47 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair52 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setOrthoTolerance((double) '#');
        int int23 = levenbergMarquardtOptimizer19.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int31 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        double double34 = levenbergMarquardtOptimizer0.getRMS();
        int int35 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair36 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 32);
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        double double42 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '#');
        int int45 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair46 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setOrthoTolerance((double) '#');
        int int13 = levenbergMarquardtOptimizer9.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setOrthoTolerance((double) '#');
        int int23 = levenbergMarquardtOptimizer19.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int31 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setOrthoTolerance(0.0d);
        int int37 = levenbergMarquardtOptimizer34.getMaxEvaluations();
        levenbergMarquardtOptimizer34.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setInitialStepBoundFactor((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker43);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair45 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer12.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer12.setMaxEvaluations(0);
        int int24 = levenbergMarquardtOptimizer12.getIterations();
        int int25 = levenbergMarquardtOptimizer12.getIterations();
        double double26 = levenbergMarquardtOptimizer12.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) '#');
        int int35 = levenbergMarquardtOptimizer31.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int43 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray44 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int42 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker47 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        double double50 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker52 = levenbergMarquardtOptimizer51.getConvergenceChecker();
        levenbergMarquardtOptimizer51.setInitialStepBoundFactor(10.0d);
        int int55 = levenbergMarquardtOptimizer51.getEvaluations();
        levenbergMarquardtOptimizer51.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker58 = levenbergMarquardtOptimizer51.getConvergenceChecker();
        levenbergMarquardtOptimizer51.setParRelativeTolerance(0.0d);
        int int61 = levenbergMarquardtOptimizer51.getMaxIterations();
        levenbergMarquardtOptimizer51.setInitialStepBoundFactor((double) (-1.0f));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker64 = levenbergMarquardtOptimizer51.getConvergenceChecker();
        int int65 = levenbergMarquardtOptimizer51.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer66 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker67 = levenbergMarquardtOptimizer66.getConvergenceChecker();
        levenbergMarquardtOptimizer66.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer70 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker71 = levenbergMarquardtOptimizer70.getConvergenceChecker();
        levenbergMarquardtOptimizer70.setOrthoTolerance((double) '#');
        int int74 = levenbergMarquardtOptimizer70.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker75 = levenbergMarquardtOptimizer70.getConvergenceChecker();
        levenbergMarquardtOptimizer66.setConvergenceChecker(vectorialConvergenceChecker75);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer77 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer77.setOrthoTolerance(0.0d);
        int int80 = levenbergMarquardtOptimizer77.getMaxEvaluations();
        levenbergMarquardtOptimizer77.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer77.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker85 = levenbergMarquardtOptimizer77.getConvergenceChecker();
        levenbergMarquardtOptimizer66.setConvergenceChecker(vectorialConvergenceChecker85);
        levenbergMarquardtOptimizer51.setConvergenceChecker(vectorialConvergenceChecker85);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray89 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setOrthoTolerance(0.0d);
        int int11 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) (byte) 10);
        int int14 = levenbergMarquardtOptimizer8.getMaxIterations();
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) 0L);
        int int17 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer8.getEvaluations();
        double double19 = levenbergMarquardtOptimizer8.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer20.setOrthoTolerance(0.0d);
        int int23 = levenbergMarquardtOptimizer20.getMaxEvaluations();
        levenbergMarquardtOptimizer20.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer20.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer20.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer20.setMaxIterations(1000);
        double double32 = levenbergMarquardtOptimizer20.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker34);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker34);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker34);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray40 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer10.setOrthoTolerance(0.0d);
        int int13 = levenbergMarquardtOptimizer10.getMaxEvaluations();
        levenbergMarquardtOptimizer10.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer10.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer10.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer10.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer10.setMaxEvaluations(1000);
        int int27 = levenbergMarquardtOptimizer10.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker28);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray34 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setOrthoTolerance(0.0d);
        int int10 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        levenbergMarquardtOptimizer7.setCostRelativeTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        levenbergMarquardtOptimizer7.setParRelativeTolerance((double) 1);
        int int16 = levenbergMarquardtOptimizer7.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer12.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer12.setMaxEvaluations(0);
        int int24 = levenbergMarquardtOptimizer12.getIterations();
        int int25 = levenbergMarquardtOptimizer12.getIterations();
        double double26 = levenbergMarquardtOptimizer12.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) '#');
        int int35 = levenbergMarquardtOptimizer31.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        int int42 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double43 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        int int46 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair47 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setOrthoTolerance(0.0d);
        int int11 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setInitialStepBoundFactor((double) (byte) 10);
        int int17 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer8.getIterations();
        int int19 = levenbergMarquardtOptimizer8.getEvaluations();
        int int20 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        int int23 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray24 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair8 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        int int21 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        int int21 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer11.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer11.setMaxIterations(1000);
        double double23 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int33 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair36 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(97);
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer11.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer11.setMaxIterations(1000);
        double double23 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int34 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair35 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer11.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer11.setMaxIterations(1000);
        double double23 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double32 = levenbergMarquardtOptimizer31.getRMS();
        int int33 = levenbergMarquardtOptimizer31.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker34 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker34);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray38 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setOrthoTolerance(0.0d);
        int int11 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer8.setInitialStepBoundFactor((double) (byte) 10);
        int int17 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer8.getIterations();
        int int19 = levenbergMarquardtOptimizer8.getEvaluations();
        int int20 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray23 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer11.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer11.setMaxEvaluations(0);
        int int23 = levenbergMarquardtOptimizer11.getIterations();
        int int24 = levenbergMarquardtOptimizer11.getIterations();
        double double25 = levenbergMarquardtOptimizer11.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setOrthoTolerance((double) '#');
        int int34 = levenbergMarquardtOptimizer30.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker35);
        levenbergMarquardtOptimizer11.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer11.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 1);
        double double44 = levenbergMarquardtOptimizer11.getRMS();
        levenbergMarquardtOptimizer11.setMaxIterations((int) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker47 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker47);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray49 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        int int20 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setOrthoTolerance((double) '#');
        int int29 = levenbergMarquardtOptimizer25.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        double double34 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        int int37 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair40 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer21.setOrthoTolerance(0.0d);
        int int24 = levenbergMarquardtOptimizer21.getMaxEvaluations();
        levenbergMarquardtOptimizer21.setCostRelativeTolerance((double) (byte) 10);
        int int27 = levenbergMarquardtOptimizer21.getIterations();
        int int28 = levenbergMarquardtOptimizer21.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer29.setOrthoTolerance(0.0d);
        int int32 = levenbergMarquardtOptimizer29.getMaxEvaluations();
        levenbergMarquardtOptimizer29.setCostRelativeTolerance((double) (byte) 10);
        int int35 = levenbergMarquardtOptimizer29.getMaxIterations();
        levenbergMarquardtOptimizer29.setCostRelativeTolerance((double) 0L);
        int int38 = levenbergMarquardtOptimizer29.getMaxEvaluations();
        int int39 = levenbergMarquardtOptimizer29.getEvaluations();
        double double40 = levenbergMarquardtOptimizer29.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer41.setOrthoTolerance(0.0d);
        int int44 = levenbergMarquardtOptimizer41.getMaxEvaluations();
        levenbergMarquardtOptimizer41.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer41.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer41.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer41.setMaxIterations(1000);
        double double53 = levenbergMarquardtOptimizer41.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer54 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker55 = levenbergMarquardtOptimizer54.getConvergenceChecker();
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialConvergenceChecker55);
        levenbergMarquardtOptimizer29.setConvergenceChecker(vectorialConvergenceChecker55);
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker55);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker55);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair62 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double14 = levenbergMarquardtOptimizer13.getRMS();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (short) -1);
        double double17 = levenbergMarquardtOptimizer13.getChiSquare();
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) 0L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setOrthoTolerance((double) '#');
        int int24 = levenbergMarquardtOptimizer20.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        double double26 = levenbergMarquardtOptimizer20.getChiSquare();
        levenbergMarquardtOptimizer20.setCostRelativeTolerance((double) 1.0f);
        int int29 = levenbergMarquardtOptimizer20.getJacobianEvaluations();
        levenbergMarquardtOptimizer20.setOrthoTolerance((double) 10.0f);
        double double32 = levenbergMarquardtOptimizer20.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker33 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker33);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker33);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair38 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        int int23 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int24 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair25 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray44 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(10.0d);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer11.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer11.setMaxIterations(1000);
        double double23 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray30 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer11.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int16 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setInitialStepBoundFactor(10.0d);
        int int14 = levenbergMarquardtOptimizer10.getEvaluations();
        levenbergMarquardtOptimizer10.setOrthoTolerance((double) (short) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        int int22 = levenbergMarquardtOptimizer17.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        double double26 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair32 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100.0f);
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test665");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test666");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test667");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test668");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test669");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test670");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test671");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test672");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test673");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test674");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test675");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test676");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test677");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test678");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair8 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test679");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test680");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test681");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test682");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test683");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) 0);
        double double17 = levenbergMarquardtOptimizer13.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setOrthoTolerance((double) '#');
        int int26 = levenbergMarquardtOptimizer22.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker27);
        double double31 = levenbergMarquardtOptimizer0.getChiSquare();
        int int32 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int33 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int34 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray35 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test684");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxIterations(35);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test685");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test686");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test687");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test688");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test689");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setOrthoTolerance((double) '#');
        int int23 = levenbergMarquardtOptimizer19.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int31 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer34.setOrthoTolerance(0.0d);
        int int37 = levenbergMarquardtOptimizer34.getMaxEvaluations();
        levenbergMarquardtOptimizer34.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setInitialStepBoundFactor((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker43);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair47 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test690");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test691");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test692");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test693");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test694");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        int int19 = levenbergMarquardtOptimizer13.getIterations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double25 = levenbergMarquardtOptimizer24.getRMS();
        levenbergMarquardtOptimizer24.setParRelativeTolerance((double) (short) -1);
        double double28 = levenbergMarquardtOptimizer24.getChiSquare();
        levenbergMarquardtOptimizer24.setOrthoTolerance((double) 0L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) '#');
        int int35 = levenbergMarquardtOptimizer31.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        double double37 = levenbergMarquardtOptimizer31.getChiSquare();
        levenbergMarquardtOptimizer31.setCostRelativeTolerance((double) 1.0f);
        int int40 = levenbergMarquardtOptimizer31.getJacobianEvaluations();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) 10.0f);
        double double43 = levenbergMarquardtOptimizer31.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker44 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer24.setConvergenceChecker(vectorialConvergenceChecker44);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker44);
        int int47 = levenbergMarquardtOptimizer0.getIterations();
        int int48 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair49 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test695");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test696");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test697");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test698");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) ' ');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test699");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test700");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer12.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer12.setMaxEvaluations(0);
        int int24 = levenbergMarquardtOptimizer12.getIterations();
        int int25 = levenbergMarquardtOptimizer12.getIterations();
        double double26 = levenbergMarquardtOptimizer12.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) '#');
        int int35 = levenbergMarquardtOptimizer31.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10);
        int int42 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double43 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray44 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test701");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test702");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test703");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test704");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test705");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test706");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test707");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test708");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test709");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer7.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer7.setCostRelativeTolerance((double) (short) 10);
        double double17 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test710");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxEvaluations(97);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test711");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test712");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test713");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        int int22 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int23 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray24 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test714");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test715");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test716");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer7.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer7.setCostRelativeTolerance((double) (short) 10);
        double double17 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test717");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) 0);
        double double17 = levenbergMarquardtOptimizer13.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setOrthoTolerance((double) '#');
        int int26 = levenbergMarquardtOptimizer22.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker27);
        double double31 = levenbergMarquardtOptimizer0.getChiSquare();
        int int32 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int33 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray34 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test718");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test719");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) ' ');
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test720");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test721");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        int int22 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair23 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test722");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test723");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test724");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer11.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer11.setMaxIterations(1000);
        double double23 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test725");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test726");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test727");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        int int20 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test728");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test729");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setOrthoTolerance((double) '#');
        int int13 = levenbergMarquardtOptimizer9.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int19 = levenbergMarquardtOptimizer0.getIterations();
        double double20 = levenbergMarquardtOptimizer0.getRMS();
        int int21 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int22 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        double double25 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test730");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair7 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test731");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test732");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int42 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10.0f);
        int int47 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray48 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test733");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer12.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer12.setMaxEvaluations(0);
        int int24 = levenbergMarquardtOptimizer12.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setCostRelativeTolerance((double) 0);
        double double29 = levenbergMarquardtOptimizer25.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setOrthoTolerance((double) '#');
        int int38 = levenbergMarquardtOptimizer34.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker39 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker39);
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker39);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker39);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker39);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray48 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test734");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test735");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test736");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test737");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair5 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test738");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test739");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test740");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test741");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test742");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test743");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test744");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test745");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '4');
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test746");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test747");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test748");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        int int28 = levenbergMarquardtOptimizer22.getMaxIterations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) 0L);
        int int31 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        int int32 = levenbergMarquardtOptimizer22.getEvaluations();
        levenbergMarquardtOptimizer22.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer22.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer22.setOrthoTolerance((double) 10);
        double double39 = levenbergMarquardtOptimizer22.getChiSquare();
        levenbergMarquardtOptimizer22.setOrthoTolerance((double) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker42 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker42);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair44 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test749");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        int int15 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test750");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test751");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test752");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int23 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test753");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test754");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double23 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test755");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test756");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(Double.NaN);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test757");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test758");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair5 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test759");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test760");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test761");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer11.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(35);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray26 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test762");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair7 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test763");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test764");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test765");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test766");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) '#');
        int int11 = levenbergMarquardtOptimizer7.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        double double13 = levenbergMarquardtOptimizer7.getChiSquare();
        levenbergMarquardtOptimizer7.setCostRelativeTolerance((double) 1.0f);
        int int16 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) 10.0f);
        levenbergMarquardtOptimizer7.setParRelativeTolerance((double) 0L);
        levenbergMarquardtOptimizer7.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer7.setMaxEvaluations((int) (byte) 1);
        levenbergMarquardtOptimizer7.setParRelativeTolerance((double) (short) 100);
        int int27 = levenbergMarquardtOptimizer7.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker28);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test767");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test768");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        double double42 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair47 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test769");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 1);
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test770");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setOrthoTolerance((double) '#');
        int int23 = levenbergMarquardtOptimizer19.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        int int27 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double28 = levenbergMarquardtOptimizer0.getChiSquare();
        int int29 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int30 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray31 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test771");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test772");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test773");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test774");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) -1);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test775");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer4.setOrthoTolerance(0.0d);
        int int7 = levenbergMarquardtOptimizer4.getMaxEvaluations();
        levenbergMarquardtOptimizer4.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setInitialStepBoundFactor((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxIterations(35);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test776");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int2 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair3 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test777");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setOrthoTolerance(0.0d);
        int int18 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        levenbergMarquardtOptimizer15.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        int int22 = levenbergMarquardtOptimizer15.getJacobianEvaluations();
        int int23 = levenbergMarquardtOptimizer15.getEvaluations();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) (byte) 10);
        int int28 = levenbergMarquardtOptimizer15.getJacobianEvaluations();
        levenbergMarquardtOptimizer15.setCostRelativeTolerance((double) 10.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer31.setOrthoTolerance(0.0d);
        int int34 = levenbergMarquardtOptimizer31.getMaxEvaluations();
        levenbergMarquardtOptimizer31.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer31.setOrthoTolerance((-1.0d));
        int int39 = levenbergMarquardtOptimizer31.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer40 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer40.setOrthoTolerance(0.0d);
        int int43 = levenbergMarquardtOptimizer40.getMaxEvaluations();
        levenbergMarquardtOptimizer40.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer40.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer40.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer40.setMaxIterations(1000);
        double double52 = levenbergMarquardtOptimizer40.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer53 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker54 = levenbergMarquardtOptimizer53.getConvergenceChecker();
        levenbergMarquardtOptimizer40.setConvergenceChecker(vectorialConvergenceChecker54);
        levenbergMarquardtOptimizer31.setConvergenceChecker(vectorialConvergenceChecker54);
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker54);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker54);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray61 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test778");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer11.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer11.setMaxIterations(1000);
        double double23 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) '#');
        int int35 = levenbergMarquardtOptimizer31.getEvaluations();
        levenbergMarquardtOptimizer31.setMaxEvaluations((int) (byte) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker38);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker44 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray45 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test779");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer5 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer5.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setOrthoTolerance((double) '#');
        int int13 = levenbergMarquardtOptimizer9.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer5.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker14);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        int int19 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test780");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair24 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test781");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair7 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test782");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test783");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 2147483647);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test784");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray4 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test785");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer11.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer11.setMaxIterations(1000);
        double double23 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 100);
        int int31 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double32 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray33 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test786");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test787");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1000);
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test788");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test789");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test790");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray16 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test791");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1L);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 2147483647);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test792");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test793");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer7.setOrthoTolerance(0.0d);
        int int10 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        levenbergMarquardtOptimizer7.setCostRelativeTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        levenbergMarquardtOptimizer7.setParRelativeTolerance((double) 1);
        int int16 = levenbergMarquardtOptimizer7.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker17);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test794");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer13.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer13.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer13.setMaxIterations(1000);
        double double25 = levenbergMarquardtOptimizer13.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker26);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int29 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair30 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test795");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair7 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test796");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test797");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test798");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setOrthoTolerance(0.0d);
        int int12 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) (byte) 10);
        int int15 = levenbergMarquardtOptimizer9.getMaxIterations();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) 0L);
        int int18 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        double double19 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer9.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test799");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test800");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 97);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test801");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double20 = levenbergMarquardtOptimizer0.getRMS();
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test802");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 10);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test803");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test804");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int18 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test805");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test806");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test807");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) '#');
        int int17 = levenbergMarquardtOptimizer13.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        double double19 = levenbergMarquardtOptimizer13.getChiSquare();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) 1000);
        int int24 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker26);
        int int28 = levenbergMarquardtOptimizer13.getEvaluations();
        double double29 = levenbergMarquardtOptimizer13.getChiSquare();
        int int30 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker31);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer33 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker34 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer33.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer33.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer33.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer33.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer33.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer33.setMaxEvaluations(100);
        int int47 = levenbergMarquardtOptimizer33.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker48 = levenbergMarquardtOptimizer33.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker48);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair52 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test808");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test809");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1L);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test810");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test811");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test812");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test813");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray26 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test814");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(100.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setInitialStepBoundFactor(10.0d);
        int int19 = levenbergMarquardtOptimizer15.getMaxIterations();
        int int20 = levenbergMarquardtOptimizer15.getIterations();
        levenbergMarquardtOptimizer15.setInitialStepBoundFactor((double) 100.0f);
        int int23 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        int int24 = levenbergMarquardtOptimizer15.getIterations();
        int int25 = levenbergMarquardtOptimizer15.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        double double27 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker28);
        int int30 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray31 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test815");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int2 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray3 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test816");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int18 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test817");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test818");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        double double17 = levenbergMarquardtOptimizer0.getRMS();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test819");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        int int14 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setOrthoTolerance(0.0d);
        int int18 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        levenbergMarquardtOptimizer15.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer15.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer15.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer15.setMaxIterations(1000);
        double double27 = levenbergMarquardtOptimizer15.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker29);
        levenbergMarquardtOptimizer15.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker33 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        double double38 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair39 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test820");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int2 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(32);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray7 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test821");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getEvaluations();
        int int7 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test822");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test823");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test824");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test825");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test826");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double12 = levenbergMarquardtOptimizer11.getRMS();
        levenbergMarquardtOptimizer11.setParRelativeTolerance((double) (short) -1);
        double double15 = levenbergMarquardtOptimizer11.getChiSquare();
        int int16 = levenbergMarquardtOptimizer11.getJacobianEvaluations();
        int int17 = levenbergMarquardtOptimizer11.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker18);
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test827");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test828");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test829");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        int int19 = levenbergMarquardtOptimizer13.getIterations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 32);
        int int26 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray27 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test830");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setOrthoTolerance(0.0d);
        int int11 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        levenbergMarquardtOptimizer8.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer8.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker16);
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int19 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test831");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test832");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        int int22 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int23 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray24 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test833");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test834");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) ' ');
        int int21 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test835");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer12.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer12.setMaxEvaluations(0);
        int int24 = levenbergMarquardtOptimizer12.getIterations();
        int int25 = levenbergMarquardtOptimizer12.getIterations();
        double double26 = levenbergMarquardtOptimizer12.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) '#');
        int int35 = levenbergMarquardtOptimizer31.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        int int42 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double43 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray46 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test836");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test837");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 'a');
        int int10 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test838");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test839");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test840");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair2 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test841");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test842");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1L));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer12.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer12.setMaxEvaluations(0);
        int int24 = levenbergMarquardtOptimizer12.getIterations();
        int int25 = levenbergMarquardtOptimizer12.getIterations();
        double double26 = levenbergMarquardtOptimizer12.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) '#');
        int int35 = levenbergMarquardtOptimizer31.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        int int40 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int41 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray42 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test843");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test844");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) -1);
        int int21 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test845");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray25 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test846");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test847");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test848");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double5 = levenbergMarquardtOptimizer0.getChiSquare();
        int int6 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) '#');
        int int11 = levenbergMarquardtOptimizer7.getIterations();
        int int12 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        levenbergMarquardtOptimizer7.setMaxEvaluations(100);
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) (byte) 0);
        int int17 = levenbergMarquardtOptimizer7.getEvaluations();
        levenbergMarquardtOptimizer7.setCostRelativeTolerance((double) (-1.0f));
        int int20 = levenbergMarquardtOptimizer7.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        double double22 = levenbergMarquardtOptimizer7.getRMS();
        int int23 = levenbergMarquardtOptimizer7.getEvaluations();
        int int24 = levenbergMarquardtOptimizer7.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setOrthoTolerance((double) '#');
        int int29 = levenbergMarquardtOptimizer25.getIterations();
        int int30 = levenbergMarquardtOptimizer25.getMaxEvaluations();
        levenbergMarquardtOptimizer25.setMaxEvaluations(100);
        levenbergMarquardtOptimizer25.setOrthoTolerance((double) (byte) 0);
        int int35 = levenbergMarquardtOptimizer25.getEvaluations();
        int int36 = levenbergMarquardtOptimizer25.getIterations();
        levenbergMarquardtOptimizer25.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setOrthoTolerance((double) '#');
        int int43 = levenbergMarquardtOptimizer39.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker44 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        double double45 = levenbergMarquardtOptimizer39.getChiSquare();
        levenbergMarquardtOptimizer39.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer39.setParRelativeTolerance((double) 1000);
        int int50 = levenbergMarquardtOptimizer39.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer51 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker52 = levenbergMarquardtOptimizer51.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setConvergenceChecker(vectorialConvergenceChecker52);
        int int54 = levenbergMarquardtOptimizer39.getEvaluations();
        double double55 = levenbergMarquardtOptimizer39.getChiSquare();
        int int56 = levenbergMarquardtOptimizer39.getIterations();
        levenbergMarquardtOptimizer39.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer39.setMaxIterations((int) '4');
        levenbergMarquardtOptimizer39.setMaxIterations(100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker63 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setConvergenceChecker(vectorialConvergenceChecker63);
        levenbergMarquardtOptimizer7.setConvergenceChecker(vectorialConvergenceChecker63);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker63);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray67 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test849");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair8 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test850");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        int int20 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setOrthoTolerance((double) '#');
        int int29 = levenbergMarquardtOptimizer25.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        double double34 = levenbergMarquardtOptimizer0.getChiSquare();
        double double35 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        int int39 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int40 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int45 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int46 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair47 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test851");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer14.setOrthoTolerance(0.0d);
        int int17 = levenbergMarquardtOptimizer14.getMaxEvaluations();
        levenbergMarquardtOptimizer14.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer14.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer14.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer14.setMaxIterations(1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test852");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test853");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setOrthoTolerance((double) '#');
        int int23 = levenbergMarquardtOptimizer19.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        int int27 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double28 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray29 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test854");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test855");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        double double18 = levenbergMarquardtOptimizer0.getRMS();
        int int19 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test856");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        double double4 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray5 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test857");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int42 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        double double45 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair46 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test858");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test859");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double18 = levenbergMarquardtOptimizer0.getChiSquare();
        double double19 = levenbergMarquardtOptimizer0.getChiSquare();
        int int20 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test860");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test861");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 100);
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        int int20 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test862");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        int int1 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int2 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair3 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test863");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setOrthoTolerance((double) '#');
        int int24 = levenbergMarquardtOptimizer20.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer16.setInitialStepBoundFactor(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer29 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double30 = levenbergMarquardtOptimizer29.getRMS();
        int int31 = levenbergMarquardtOptimizer29.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer29.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker32);
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair37 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test864");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) 0);
        double double17 = levenbergMarquardtOptimizer13.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setOrthoTolerance((double) '#');
        int int26 = levenbergMarquardtOptimizer22.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker27);
        double double31 = levenbergMarquardtOptimizer0.getChiSquare();
        int int32 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair33 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test865");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer10 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer10.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setInitialStepBoundFactor(10.0d);
        int int14 = levenbergMarquardtOptimizer10.getEvaluations();
        levenbergMarquardtOptimizer10.setOrthoTolerance((double) (short) 1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer17 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer17.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        int int22 = levenbergMarquardtOptimizer17.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer17.getConvergenceChecker();
        levenbergMarquardtOptimizer10.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test866");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test867");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test868");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer11.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer11.setMaxIterations(1000);
        double double23 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray31 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test869");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int42 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        double double45 = levenbergMarquardtOptimizer0.getRMS();
        int int46 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double47 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations(52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair50 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test870");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 0);
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test871");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setOrthoTolerance((double) '#');
        int int16 = levenbergMarquardtOptimizer12.getIterations();
        int int17 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setMaxEvaluations(100);
        levenbergMarquardtOptimizer12.setMaxIterations((int) (byte) 100);
        int int22 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setParRelativeTolerance((double) 100L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray27 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test872");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        int int8 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test873");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setOrthoTolerance(0.0d);
        int int12 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer9.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer9.setInitialStepBoundFactor((double) 10);
        double double19 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer20 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer20.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer24.setOrthoTolerance((double) '#');
        int int28 = levenbergMarquardtOptimizer24.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker29);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer31.setOrthoTolerance(0.0d);
        int int34 = levenbergMarquardtOptimizer31.getMaxEvaluations();
        levenbergMarquardtOptimizer31.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer31.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer31.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer31.setMaxIterations(1000);
        double double43 = levenbergMarquardtOptimizer31.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer44 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker45 = levenbergMarquardtOptimizer44.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setConvergenceChecker(vectorialConvergenceChecker45);
        levenbergMarquardtOptimizer20.setConvergenceChecker(vectorialConvergenceChecker45);
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker45);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker45);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        int int52 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer53 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker54 = levenbergMarquardtOptimizer53.getConvergenceChecker();
        levenbergMarquardtOptimizer53.setOrthoTolerance((double) '#');
        int int57 = levenbergMarquardtOptimizer53.getMaxEvaluations();
        int int58 = levenbergMarquardtOptimizer53.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer59 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker60 = levenbergMarquardtOptimizer59.getConvergenceChecker();
        levenbergMarquardtOptimizer59.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker63 = levenbergMarquardtOptimizer59.getConvergenceChecker();
        levenbergMarquardtOptimizer53.setConvergenceChecker(vectorialConvergenceChecker63);
        int int65 = levenbergMarquardtOptimizer53.getEvaluations();
        levenbergMarquardtOptimizer53.setCostRelativeTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker68 = levenbergMarquardtOptimizer53.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker68);
        int int70 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray73 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test874");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test875");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test876");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair19 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test877");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0.0f);
        int int17 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test878");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) '#');
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) -1);
        int int16 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int17 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test879");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test880");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test881");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test882");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int3 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int5 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test883");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100.0f);
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test884");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test885");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        int int13 = levenbergMarquardtOptimizer0.getEvaluations();
        double double14 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test886");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10L);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test887");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test888");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100);
        double double14 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxIterations((-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test889");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        int int16 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test890");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        int int15 = levenbergMarquardtOptimizer0.getEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test891");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        double double23 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray24 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test892");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) '4');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair6 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test893");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair18 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test894");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (byte) 0);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray19 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test895");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test896");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0L);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer7 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) '#');
        int int11 = levenbergMarquardtOptimizer7.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        double double13 = levenbergMarquardtOptimizer7.getChiSquare();
        levenbergMarquardtOptimizer7.setCostRelativeTolerance((double) 1.0f);
        int int16 = levenbergMarquardtOptimizer7.getJacobianEvaluations();
        levenbergMarquardtOptimizer7.setOrthoTolerance((double) 10.0f);
        double double19 = levenbergMarquardtOptimizer7.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer7.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker20);
        int int22 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int23 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair26 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test897");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test898");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations(0);
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        int int19 = levenbergMarquardtOptimizer13.getIterations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) -1);
        double double26 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair27 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test899");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        int int13 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test900");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test901");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test902");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        int int3 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test903");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test904");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair6 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test905");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        double double11 = levenbergMarquardtOptimizer0.getChiSquare();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setInitialStepBoundFactor((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker22);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 0);
        int int26 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int27 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        int int30 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray31 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test906");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test907");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test908");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair9 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test909");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0);
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test910");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double7 = levenbergMarquardtOptimizer0.getRMS();
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray9 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test911");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int14 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test912");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) -1);
        int int14 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        double double21 = levenbergMarquardtOptimizer15.getChiSquare();
        levenbergMarquardtOptimizer15.setCostRelativeTolerance((double) 1.0f);
        int int24 = levenbergMarquardtOptimizer15.getJacobianEvaluations();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) 10.0f);
        double double27 = levenbergMarquardtOptimizer15.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer28 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer28.setOrthoTolerance(0.0d);
        int int31 = levenbergMarquardtOptimizer28.getMaxEvaluations();
        levenbergMarquardtOptimizer28.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer28.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer28.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer28.setMaxIterations(1000);
        double double40 = levenbergMarquardtOptimizer28.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker41 = levenbergMarquardtOptimizer28.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setConvergenceChecker(vectorialConvergenceChecker41);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker41);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 100);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair46 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test913");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        double double11 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        int int19 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        int int20 = levenbergMarquardtOptimizer12.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer21 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer21.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer25.setOrthoTolerance((double) '#');
        int int29 = levenbergMarquardtOptimizer25.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker30 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer21.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker30);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        int int36 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int37 = levenbergMarquardtOptimizer0.getIterations();
        double double38 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair39 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test914");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(100.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test915");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test916");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test917");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 2147483647);
        int int10 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test918");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test919");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '#');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test920");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray8 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test921");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        double double8 = levenbergMarquardtOptimizer0.getRMS();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test922");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair6 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test923");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(Double.NaN);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray12 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test924");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test925");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 0);
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test926");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setOrthoTolerance((double) '#');
        int int17 = levenbergMarquardtOptimizer13.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        double double19 = levenbergMarquardtOptimizer13.getChiSquare();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) 1000);
        int int24 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer25 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer25.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker26);
        int int28 = levenbergMarquardtOptimizer13.getEvaluations();
        double double29 = levenbergMarquardtOptimizer13.getChiSquare();
        int int30 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker31);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair35 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test927");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (byte) 10);
        int int19 = levenbergMarquardtOptimizer13.getMaxIterations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) 0L);
        int int22 = levenbergMarquardtOptimizer13.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setMaxEvaluations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker26 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker26);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test928");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker4 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double5 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair6 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test929");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) 'a');
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(97);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray23 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test930");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(Double.NaN);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray10 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test931");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test932");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker11 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test933");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setOrthoTolerance(1.0d);
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer12.setOrthoTolerance(0.0d);
        int int15 = levenbergMarquardtOptimizer12.getMaxEvaluations();
        levenbergMarquardtOptimizer12.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer12.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer12.setMaxEvaluations(0);
        int int24 = levenbergMarquardtOptimizer12.getIterations();
        int int25 = levenbergMarquardtOptimizer12.getIterations();
        double double26 = levenbergMarquardtOptimizer12.getChiSquare();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer27 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer27.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer31 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker32 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer31.setOrthoTolerance((double) '#');
        int int35 = levenbergMarquardtOptimizer31.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer31.getConvergenceChecker();
        levenbergMarquardtOptimizer27.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer12.setMaxIterations((int) (byte) 100);
        int int43 = levenbergMarquardtOptimizer12.getJacobianEvaluations();
        levenbergMarquardtOptimizer12.setOrthoTolerance((double) 1.0f);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer46 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer46.setOrthoTolerance(0.0d);
        int int49 = levenbergMarquardtOptimizer46.getMaxEvaluations();
        levenbergMarquardtOptimizer46.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker52 = levenbergMarquardtOptimizer46.getConvergenceChecker();
        levenbergMarquardtOptimizer46.setInitialStepBoundFactor((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker55 = levenbergMarquardtOptimizer46.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker55);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker57 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker57);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray59 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test934");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(10);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer8 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer8.setOrthoTolerance(0.0d);
        int int11 = levenbergMarquardtOptimizer8.getMaxEvaluations();
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) (byte) 10);
        int int14 = levenbergMarquardtOptimizer8.getMaxIterations();
        levenbergMarquardtOptimizer8.setCostRelativeTolerance((double) 0L);
        int int17 = levenbergMarquardtOptimizer8.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker18 = levenbergMarquardtOptimizer8.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setOrthoTolerance(0.0d);
        int int22 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer19.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer19.setInitialStepBoundFactor((double) 10);
        double double29 = levenbergMarquardtOptimizer19.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer34 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker35 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer34.setOrthoTolerance((double) '#');
        int int38 = levenbergMarquardtOptimizer34.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker39 = levenbergMarquardtOptimizer34.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker39);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer41 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer41.setOrthoTolerance(0.0d);
        int int44 = levenbergMarquardtOptimizer41.getMaxEvaluations();
        levenbergMarquardtOptimizer41.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer41.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer41.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer41.setMaxIterations(1000);
        double double53 = levenbergMarquardtOptimizer41.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer54 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker55 = levenbergMarquardtOptimizer54.getConvergenceChecker();
        levenbergMarquardtOptimizer41.setConvergenceChecker(vectorialConvergenceChecker55);
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker55);
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker55);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer59 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker60 = levenbergMarquardtOptimizer59.getConvergenceChecker();
        levenbergMarquardtOptimizer59.setOrthoTolerance((double) '#');
        int int63 = levenbergMarquardtOptimizer59.getMaxEvaluations();
        int int64 = levenbergMarquardtOptimizer59.getMaxEvaluations();
        levenbergMarquardtOptimizer59.setParRelativeTolerance(10.0d);
        int int67 = levenbergMarquardtOptimizer59.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker68 = levenbergMarquardtOptimizer59.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker68);
        levenbergMarquardtOptimizer8.setConvergenceChecker(vectorialConvergenceChecker68);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker68);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer72 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker73 = levenbergMarquardtOptimizer72.getConvergenceChecker();
        levenbergMarquardtOptimizer72.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer72.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer78 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer78.setOrthoTolerance(0.0d);
        int int81 = levenbergMarquardtOptimizer78.getMaxEvaluations();
        int int82 = levenbergMarquardtOptimizer78.getEvaluations();
        int int83 = levenbergMarquardtOptimizer78.getIterations();
        int int84 = levenbergMarquardtOptimizer78.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker85 = levenbergMarquardtOptimizer78.getConvergenceChecker();
        levenbergMarquardtOptimizer72.setConvergenceChecker(vectorialConvergenceChecker85);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker85);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair88 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test935");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 1);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 10);
        int int7 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test936");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setMaxIterations(1000);
        int int12 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        double double15 = levenbergMarquardtOptimizer0.getChiSquare();
        int int16 = levenbergMarquardtOptimizer0.getMaxIterations();
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        double double20 = levenbergMarquardtOptimizer0.getChiSquare();
        double double21 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray23 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test937");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair13 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test938");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        int int17 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int18 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(97);
        int int21 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair22 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test939");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair5 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test940");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        int int11 = levenbergMarquardtOptimizer0.getMaxIterations();
        double double12 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(1.0d);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test941");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1.0f));
        int int15 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 10L);
        int int18 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 100L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray21 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test942");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setInitialStepBoundFactor((double) (byte) -1);
        levenbergMarquardtOptimizer11.setParRelativeTolerance((double) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker19);
        int int21 = levenbergMarquardtOptimizer0.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker22 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray23 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test943");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker17 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer16.setOrthoTolerance((double) '#');
        int int20 = levenbergMarquardtOptimizer16.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer16.getConvergenceChecker();
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker21);
        levenbergMarquardtOptimizer12.setInitialStepBoundFactor((double) 1);
        double double25 = levenbergMarquardtOptimizer12.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer26 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double27 = levenbergMarquardtOptimizer26.getRMS();
        int int28 = levenbergMarquardtOptimizer26.getEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker29 = levenbergMarquardtOptimizer26.getConvergenceChecker();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker31 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setCostRelativeTolerance((double) 0);
        double double34 = levenbergMarquardtOptimizer30.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer35.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer39 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker40 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer39.setOrthoTolerance((double) '#');
        int int43 = levenbergMarquardtOptimizer39.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker44 = levenbergMarquardtOptimizer39.getConvergenceChecker();
        levenbergMarquardtOptimizer35.setConvergenceChecker(vectorialConvergenceChecker44);
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker44);
        levenbergMarquardtOptimizer26.setConvergenceChecker(vectorialConvergenceChecker44);
        levenbergMarquardtOptimizer12.setConvergenceChecker(vectorialConvergenceChecker44);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker44);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        int int52 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair53 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test944");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer4 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer4.setOrthoTolerance((double) '#');
        int int8 = levenbergMarquardtOptimizer4.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker9 = levenbergMarquardtOptimizer4.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker9);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer11.setOrthoTolerance(0.0d);
        int int14 = levenbergMarquardtOptimizer11.getMaxEvaluations();
        levenbergMarquardtOptimizer11.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer11.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer11.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer11.setMaxIterations(1000);
        double double23 = levenbergMarquardtOptimizer11.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer24 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker25 = levenbergMarquardtOptimizer24.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker25);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker25);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker28 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 'a');
        int int31 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair32 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test945");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int42 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 97);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker47 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setMaxEvaluations(2147483647);
        double double50 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair53 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test946");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray17 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test947");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 0.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test948");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) 0);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (-1));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test949");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 100L);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1));
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((-1.0d));
        int int13 = levenbergMarquardtOptimizer0.getMaxIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer14 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer14.setOrthoTolerance((double) '#');
        int int18 = levenbergMarquardtOptimizer14.getMaxEvaluations();
        int int19 = levenbergMarquardtOptimizer14.getMaxEvaluations();
        levenbergMarquardtOptimizer14.setParRelativeTolerance(10.0d);
        int int22 = levenbergMarquardtOptimizer14.getMaxEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer14.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 52);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray29 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test950");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getIterations();
        int int7 = levenbergMarquardtOptimizer0.getEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int9 = levenbergMarquardtOptimizer0.getEvaluations();
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 35);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray15 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test951");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) -1);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) '4');
        double double22 = levenbergMarquardtOptimizer0.getChiSquare();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray23 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test952");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        double double4 = levenbergMarquardtOptimizer0.getChiSquare();
        int int5 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0L);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1000);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray14 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test953");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 100L);
        int int42 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) -1);
        int int45 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray46 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test954");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair11 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test955");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair10 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test956");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer12 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker13 = levenbergMarquardtOptimizer12.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker13);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance(10.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        double double19 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair20 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test957");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker14 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) 0);
        double double17 = levenbergMarquardtOptimizer13.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer18 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer18.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setOrthoTolerance((double) '#');
        int int26 = levenbergMarquardtOptimizer22.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker27 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer18.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer13.setConvergenceChecker(vectorialConvergenceChecker27);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker27);
        double double31 = levenbergMarquardtOptimizer0.getChiSquare();
        int int32 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int33 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int34 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair35 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test958");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (short) 10);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 10);
        double double10 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test959");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) '4');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) -1);
        int int11 = levenbergMarquardtOptimizer0.getIterations();
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        double double13 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair14 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test960");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 100L);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair8 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test961");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer6 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer6.setCostRelativeTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer6.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker10);
        int int12 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0.0f);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker15 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double16 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxIterations(1);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer19 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer19.setOrthoTolerance(0.0d);
        int int22 = levenbergMarquardtOptimizer19.getMaxEvaluations();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) (byte) 10);
        int int25 = levenbergMarquardtOptimizer19.getMaxIterations();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance((double) 0L);
        int int28 = levenbergMarquardtOptimizer19.getJacobianEvaluations();
        double double29 = levenbergMarquardtOptimizer19.getRMS();
        levenbergMarquardtOptimizer19.setCostRelativeTolerance(0.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer32 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer32.setOrthoTolerance(0.0d);
        int int35 = levenbergMarquardtOptimizer32.getMaxEvaluations();
        levenbergMarquardtOptimizer32.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker38 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        int int39 = levenbergMarquardtOptimizer32.getJacobianEvaluations();
        int int40 = levenbergMarquardtOptimizer32.getEvaluations();
        int int41 = levenbergMarquardtOptimizer32.getMaxIterations();
        int int42 = levenbergMarquardtOptimizer32.getJacobianEvaluations();
        int int43 = levenbergMarquardtOptimizer32.getMaxEvaluations();
        levenbergMarquardtOptimizer32.setMaxIterations(0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker46 = levenbergMarquardtOptimizer32.getConvergenceChecker();
        levenbergMarquardtOptimizer19.setConvergenceChecker(vectorialConvergenceChecker46);
        double double48 = levenbergMarquardtOptimizer19.getChiSquare();
        int int49 = levenbergMarquardtOptimizer19.getMaxIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker50 = levenbergMarquardtOptimizer19.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker50);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray52 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test962");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(0.0d);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 2147483647);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray13 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test963");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        int int5 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(100);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setMaxIterations((int) ' ');
        levenbergMarquardtOptimizer0.setOrthoTolerance(100.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer16 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer16.setOrthoTolerance(0.0d);
        int int19 = levenbergMarquardtOptimizer16.getMaxEvaluations();
        levenbergMarquardtOptimizer16.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer16.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer16.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer16.setMaxIterations(1000);
        double double28 = levenbergMarquardtOptimizer16.getChiSquare();
        int int29 = levenbergMarquardtOptimizer16.getJacobianEvaluations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer30 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer30.setOrthoTolerance(0.0d);
        int int33 = levenbergMarquardtOptimizer30.getMaxEvaluations();
        levenbergMarquardtOptimizer30.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer30.getConvergenceChecker();
        int int37 = levenbergMarquardtOptimizer30.getJacobianEvaluations();
        int int38 = levenbergMarquardtOptimizer30.getEvaluations();
        levenbergMarquardtOptimizer30.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer30.setMaxIterations((-1));
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer43 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer43.setOrthoTolerance(0.0d);
        int int46 = levenbergMarquardtOptimizer43.getMaxEvaluations();
        levenbergMarquardtOptimizer43.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer43.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer43.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer43.setMaxIterations(2147483647);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer55 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker56 = levenbergMarquardtOptimizer55.getConvergenceChecker();
        levenbergMarquardtOptimizer43.setConvergenceChecker(vectorialConvergenceChecker56);
        levenbergMarquardtOptimizer43.setMaxEvaluations(1000);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker60 = levenbergMarquardtOptimizer43.getConvergenceChecker();
        levenbergMarquardtOptimizer30.setConvergenceChecker(vectorialConvergenceChecker60);
        levenbergMarquardtOptimizer16.setConvergenceChecker(vectorialConvergenceChecker60);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker60);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair64 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test964");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(35);
        int int11 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test965");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance(Double.NaN);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        double double9 = levenbergMarquardtOptimizer0.getChiSquare();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker10 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 100);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer13 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer13.setOrthoTolerance(0.0d);
        int int16 = levenbergMarquardtOptimizer13.getMaxEvaluations();
        levenbergMarquardtOptimizer13.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker19 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer13.setParRelativeTolerance((double) (short) 1);
        levenbergMarquardtOptimizer13.setMaxIterations((int) (short) -1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer13.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        int int26 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int27 = levenbergMarquardtOptimizer0.getEvaluations();
        int int28 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair29 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test966");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int8 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 0);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (byte) 10);
        int int13 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 10.0f);
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int20 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int21 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray22 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test967");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 0);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker7 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setParRelativeTolerance(0.0d);
        int int10 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (-1.0f));
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test968");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 1);
        int int8 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double9 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair12 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test969");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) (short) -1);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1.0f));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray6 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test970");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        int int14 = levenbergMarquardtOptimizer0.getIterations();
        double double15 = levenbergMarquardtOptimizer0.getRMS();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair16 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test971");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        double double1 = levenbergMarquardtOptimizer0.getRMS();
        int int2 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 1);
        int int5 = levenbergMarquardtOptimizer0.getIterations();
        double double6 = levenbergMarquardtOptimizer0.getRMS();
        int int7 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker8 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1000);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setInitialStepBoundFactor(10.0d);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer15.setOrthoTolerance(0.0d);
        int int18 = levenbergMarquardtOptimizer15.getMaxEvaluations();
        levenbergMarquardtOptimizer15.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker21 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setInitialStepBoundFactor((double) (byte) 10);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker24 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker24);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker24);
        double double27 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1.0f);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray30 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test972");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        levenbergMarquardtOptimizer0.setMaxEvaluations(0);
        int int12 = levenbergMarquardtOptimizer0.getIterations();
        double double13 = levenbergMarquardtOptimizer0.getChiSquare();
        int int14 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int15 = levenbergMarquardtOptimizer0.getIterations();
        int int16 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair17 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test973");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setMaxIterations((int) (byte) 100);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair5 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test974");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(10.0d);
        int int4 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 1);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setMaxIterations(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray11 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test975");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int6 = levenbergMarquardtOptimizer0.getMaxIterations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 0L);
        int int9 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getEvaluations();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) 'a');
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 0L);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) 10);
        double double17 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (short) 10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray20 = levenbergMarquardtOptimizer0.getCovariances();
    }

    @Test
    public void test976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test976");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        int int9 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        int int10 = levenbergMarquardtOptimizer0.getIterations();
        int int11 = levenbergMarquardtOptimizer0.getEvaluations();
        int int12 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 'a');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair15 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test977");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) 10);
        double double10 = levenbergMarquardtOptimizer0.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer11 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker12 = levenbergMarquardtOptimizer11.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setOrthoTolerance((double) '#');
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer15 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker16 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer15.setOrthoTolerance((double) '#');
        int int19 = levenbergMarquardtOptimizer15.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker20 = levenbergMarquardtOptimizer15.getConvergenceChecker();
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker20);
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer22.setOrthoTolerance(0.0d);
        int int25 = levenbergMarquardtOptimizer22.getMaxEvaluations();
        levenbergMarquardtOptimizer22.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer22.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer22.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer22.setMaxIterations(1000);
        double double34 = levenbergMarquardtOptimizer22.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer35 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker36 = levenbergMarquardtOptimizer35.getConvergenceChecker();
        levenbergMarquardtOptimizer22.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer11.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker36);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) ' ');
        int int42 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker43 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double44 = levenbergMarquardtOptimizer0.getRMS();
        int int45 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair46 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test978");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (short) 1);
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker6 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (-1L));
        levenbergMarquardtOptimizer0.setMaxEvaluations(1000);
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) (short) 100);
        levenbergMarquardtOptimizer0.setMaxEvaluations((int) (byte) 0);
        int int17 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setInitialStepBoundFactor(1.0d);
        int int20 = levenbergMarquardtOptimizer0.getMaxIterations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair21 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test979");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer0.setOrthoTolerance(0.0d);
        int int3 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer0.setOrthoTolerance((-1.0d));
        int int8 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer9 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        levenbergMarquardtOptimizer9.setOrthoTolerance(0.0d);
        int int12 = levenbergMarquardtOptimizer9.getMaxEvaluations();
        levenbergMarquardtOptimizer9.setCostRelativeTolerance((double) (byte) 10);
        levenbergMarquardtOptimizer9.setOrthoTolerance((-1.0d));
        levenbergMarquardtOptimizer9.setMaxEvaluations((-1));
        levenbergMarquardtOptimizer9.setMaxIterations(1000);
        double double21 = levenbergMarquardtOptimizer9.getRMS();
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer22 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker23 = levenbergMarquardtOptimizer22.getConvergenceChecker();
        levenbergMarquardtOptimizer9.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setConvergenceChecker(vectorialConvergenceChecker23);
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (-1L));
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.commons.math.optimization.VectorialPointValuePair vectorialPointValuePair28 = levenbergMarquardtOptimizer0.doOptimize();
    }

    @Test
    public void test980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test980");
        org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new org.apache.commons.math.optimization.general.LevenbergMarquardtOptimizer();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker1 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        levenbergMarquardtOptimizer0.setOrthoTolerance((double) '#');
        int int4 = levenbergMarquardtOptimizer0.getIterations();
        org.apache.commons.math.optimization.VectorialConvergenceChecker vectorialConvergenceChecker5 = levenbergMarquardtOptimizer0.getConvergenceChecker();
        double double6 = levenbergMarquardtOptimizer0.getChiSquare();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) 1.0f);
        levenbergMarquardtOptimizer0.setParRelativeTolerance((double) 1000);
        int int11 = levenbergMarquardtOptimizer0.getJacobianEvaluations();
        double double12 = levenbergMarquardtOptimizer0.getRMS();
        levenbergMarquardtOptimizer0.setCostRelativeTolerance((double) (byte) 10);
        int int15 = levenbergMarquardtOptimizer0.getMaxEvaluations();
        double double16 = levenbergMarquardtOptimizer0.getRMS();
        int int17 = levenbergMarquardtOptimizer0.getEvaluations();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double[][] doubleArray18 = levenbergMarquardtOptimizer0.getCovariances();
    }
}

