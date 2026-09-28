package org.apache.commons.math.optimization.linear;

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
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(1);
        int int5 = simplexSolver0.getIterations();
        int int6 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '4');
        int int2 = simplexSolver1.getMaxIterations();
        double double3 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = simplexSolver1.isOptimal(simplexTableau4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getIterations();
        int int10 = simplexSolver0.getIterations();
        int int11 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((int) (byte) 100);
        simplexSolver0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '4');
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 10);
        int int5 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        double double2 = simplexSolver0.epsilon;
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 0);
        double double6 = simplexSolver0.epsilon;
        int int7 = simplexSolver0.getMaxIterations();
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int11 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations(10);
        double double8 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) -1);
        simplexSolver0.setMaxIterations(0);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = simplexSolver0.isOptimal(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '4');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations(97);
        double double11 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction12 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray13 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList14 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, linearConstraintArray13);
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair18 = simplexSolver1.optimize(linearObjectiveFunction12, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList14, goalType16, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray13);
        org.junit.Assert.assertArrayEquals(linearConstraintArray13, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(10);
        simplexSolver0.setMaxIterations((int) (byte) 1);
        int int12 = simplexSolver0.getMaxIterations();
        int int13 = simplexSolver0.getMaxIterations();
        int int14 = simplexSolver0.getMaxIterations();
        double double15 = simplexSolver0.epsilon;
        int int16 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0E-6d + "'", double15 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '4');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations(97);
        double double11 = simplexSolver1.epsilon;
        java.lang.Class<?> wildcardClass12 = simplexSolver1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 52.0d + "'", double11 == 52.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((-1));
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getMaxIterations();
        double double8 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) -1);
        int int11 = simplexSolver0.getMaxIterations();
        int int12 = simplexSolver0.getIterations();
        int int13 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(1);
        simplexSolver0.setMaxIterations((-1));
        int int18 = simplexSolver0.getMaxIterations();
        double double19 = simplexSolver0.epsilon;
        double double20 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0E-6d + "'", double19 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0E-6d + "'", double20 == 1.0E-6d);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) (short) 1);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) -1);
        simplexSolver1.setMaxIterations(0);
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        double double9 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction10 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray11 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList12 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, linearConstraintArray11);
        org.apache.commons.math.optimization.GoalType goalType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair16 = simplexSolver1.optimize(linearObjectiveFunction10, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList12, goalType14, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(linearConstraintArray11);
        org.junit.Assert.assertArrayEquals(linearConstraintArray11, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        int int2 = simplexSolver0.getIterations();
        int int3 = simplexSolver0.getMaxIterations();
        int int4 = simplexSolver0.getIterations();
        int int5 = simplexSolver0.getIterations();
        double double6 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (byte) 1);
        simplexSolver0.setMaxIterations((int) (byte) 10);
        simplexSolver0.setMaxIterations((int) '#');
        int int10 = simplexSolver0.getMaxIterations();
        double double11 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (byte) 100);
        simplexSolver0.setMaxIterations((int) (byte) 100);
        int int16 = simplexSolver0.getIterations();
        int int17 = simplexSolver0.getMaxIterations();
        int int18 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau19 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0E-6d + "'", double11 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver0.getMaxIterations();
        double double8 = simplexSolver0.epsilon;
        double double9 = simplexSolver0.epsilon;
        int int10 = simplexSolver0.getMaxIterations();
        int int11 = simplexSolver0.getIterations();
        int int12 = simplexSolver0.getIterations();
        double double13 = simplexSolver0.epsilon;
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0E-6d + "'", double9 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0E-6d + "'", double13 == 1.0E-6d);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '4');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getIterations();
        int int6 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(0);
        simplexSolver1.setMaxIterations(0);
        int int11 = simplexSolver1.getMaxIterations();
        double double12 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = simplexSolver1.isOptimal(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0.0f);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 10);
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        double double9 = simplexSolver1.epsilon;
        double double10 = simplexSolver1.epsilon;
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        double double2 = simplexSolver0.epsilon;
        int int3 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((-1));
        simplexSolver0.setMaxIterations(1);
        double double8 = simplexSolver0.epsilon;
        int int9 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations(52);
        double double12 = simplexSolver0.epsilon;
        int int13 = simplexSolver0.getIterations();
        int int14 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.LinearObjectiveFunction linearObjectiveFunction15 = null;
        org.apache.commons.math.optimization.linear.LinearConstraint[] linearConstraintArray16 = new org.apache.commons.math.optimization.linear.LinearConstraint[] {};
        java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint> linearConstraintList17 = new java.util.ArrayList<org.apache.commons.math.optimization.linear.LinearConstraint>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList17, linearConstraintArray16);
        org.apache.commons.math.optimization.GoalType goalType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair21 = simplexSolver0.optimize(linearObjectiveFunction15, (java.util.Collection<org.apache.commons.math.optimization.linear.LinearConstraint>) linearConstraintList17, goalType19, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0E-6d + "'", double2 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0E-6d + "'", double8 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(linearConstraintArray16);
        org.junit.Assert.assertArrayEquals(linearConstraintArray16, new org.apache.commons.math.optimization.linear.LinearConstraint[] {});
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getMaxIterations();
        double double10 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations(0);
        int int13 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 1);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) (byte) 1);
        simplexSolver1.setMaxIterations(100);
        int int7 = simplexSolver1.getMaxIterations();
        double double8 = simplexSolver1.epsilon;
        double double9 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 100);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (byte) 1);
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int11 = simplexSolver0.getIterations();
        int int12 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau13 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10);
        int int2 = simplexSolver1.getMaxIterations();
        int int3 = simplexSolver1.getMaxIterations();
        int int4 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(52);
        simplexSolver1.setMaxIterations(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((-1));
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 1);
        simplexSolver0.setMaxIterations((int) 'a');
        simplexSolver0.setMaxIterations((int) (short) 100);
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations(1);
        int int17 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) ' ');
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(52);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations(1);
        int int6 = simplexSolver0.getMaxIterations();
        double double7 = simplexSolver0.epsilon;
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0E-6d + "'", double7 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int12 = simplexSolver0.getIterations();
        int int13 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations(1);
        simplexSolver0.setMaxIterations((-1));
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau18 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.solvePhase1(simplexTableau18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 0.0f);
        double double2 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (byte) 10);
        double double5 = simplexSolver1.epsilon;
        int int6 = simplexSolver1.getIterations();
        double double7 = simplexSolver1.epsilon;
        int int8 = simplexSolver1.getMaxIterations();
        double double9 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (byte) 1);
        double double6 = simplexSolver0.epsilon;
        java.lang.Class<?> wildcardClass7 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0E-6d + "'", double6 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver0.getIterations();
        int int8 = simplexSolver0.getIterations();
        int int9 = simplexSolver0.getMaxIterations();
        double double10 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((-1));
        java.lang.Class<?> wildcardClass13 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '4');
        double double2 = simplexSolver1.epsilon;
        double double3 = simplexSolver1.epsilon;
        simplexSolver1.setMaxIterations((int) (short) 10);
        simplexSolver1.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 52.0d + "'", double3 == 52.0d);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((-1));
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver0.getIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        double double3 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) '#');
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(1);
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = simplexSolver1.isOptimal(simplexTableau8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '4');
        double double2 = simplexSolver1.epsilon;
        int int3 = simplexSolver1.getIterations();
        double double4 = simplexSolver1.epsilon;
        int int5 = simplexSolver1.getMaxIterations();
        int int6 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 52.0d + "'", double2 == 52.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 52.0d + "'", double4 == 52.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        int int4 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        int int7 = simplexSolver0.getIterations();
        java.lang.Class<?> wildcardClass8 = simplexSolver0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((-1));
        int int6 = simplexSolver0.getIterations();
        int int7 = simplexSolver0.getMaxIterations();
        simplexSolver0.setMaxIterations((-1));
        double double10 = simplexSolver0.epsilon;
        int int11 = simplexSolver0.getIterations();
        double double12 = simplexSolver0.epsilon;
        int int13 = simplexSolver0.getIterations();
        double double14 = simplexSolver0.epsilon;
        int int15 = simplexSolver0.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau16 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau16);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (-1) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations(1);
        int int6 = simplexSolver0.getMaxIterations();
        int int7 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (short) 10);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = simplexSolver0.isOptimal(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) 10L);
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations(1);
        int int5 = simplexSolver1.getMaxIterations();
        double double6 = simplexSolver1.epsilon;
        int int7 = simplexSolver1.getMaxIterations();
        int int8 = simplexSolver1.getMaxIterations();
        simplexSolver1.setMaxIterations(100);
        int int11 = simplexSolver1.getMaxIterations();
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau12 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.solvePhase1(simplexTableau12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        int int1 = simplexSolver0.getIterations();
        int int2 = simplexSolver0.getIterations();
        double double3 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) '#');
        simplexSolver0.setMaxIterations((int) (byte) 1);
        simplexSolver0.setMaxIterations((int) (short) 10);
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = simplexSolver0.isOptimal(simplexTableau10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 1.0E-6d + "'", double3 == 1.0E-6d);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((-1));
        int int6 = simplexSolver0.getIterations();
        simplexSolver0.setMaxIterations((int) (byte) 1);
        int int9 = simplexSolver0.getIterations();
        double double10 = simplexSolver0.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau11 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver0.doIteration(simplexTableau11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver1 = new org.apache.commons.math.optimization.linear.SimplexSolver((double) '4');
        int int2 = simplexSolver1.getIterations();
        simplexSolver1.setMaxIterations((int) '4');
        double double5 = simplexSolver1.epsilon;
        org.apache.commons.math.optimization.linear.SimplexTableau simplexTableau6 = null;
        // The following exception was thrown during execution in test generation
        try {
            simplexSolver1.doIteration(simplexTableau6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        org.apache.commons.math.optimization.linear.SimplexSolver simplexSolver0 = new org.apache.commons.math.optimization.linear.SimplexSolver();
        double double1 = simplexSolver0.epsilon;
        simplexSolver0.setMaxIterations((int) (short) 0);
        simplexSolver0.setMaxIterations((int) (byte) 1);
        simplexSolver0.setMaxIterations((int) (short) 100);
        int int8 = simplexSolver0.getMaxIterations();
        int int9 = simplexSolver0.getIterations();
        double double10 = simplexSolver0.epsilon;
        int int11 = simplexSolver0.getMaxIterations();
        double double12 = simplexSolver0.epsilon;
        int int13 = simplexSolver0.getIterations();
        double double14 = simplexSolver0.epsilon;
        int int15 = simplexSolver0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 1.0E-6d + "'", double1 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0E-6d + "'", double10 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0E-6d + "'", double12 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0E-6d + "'", double14 == 1.0E-6d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }
}

