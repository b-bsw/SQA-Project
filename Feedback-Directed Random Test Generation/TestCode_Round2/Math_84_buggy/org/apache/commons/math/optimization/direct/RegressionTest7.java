package org.apache.commons.math.optimization.direct;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

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
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        int int3 = multiDirectional2.getEvaluations();
        int int4 = multiDirectional2.getEvaluations();
        multiDirectional2.setMaxEvaluations(35);
        multiDirectional2.setMaxIterations((int) (byte) 0);
        int int9 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getEvaluations();
        multiDirectional6.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional6.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker12);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional16.setMaxIterations(100);
        int int19 = multiDirectional16.getEvaluations();
        multiDirectional16.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = multiDirectional16.getConvergenceChecker();
        multiDirectional16.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional25.setMaxIterations(100);
        int int28 = multiDirectional25.getEvaluations();
        multiDirectional25.setMaxEvaluations((int) ' ');
        double[] doubleArray31 = new double[] {};
        double[][] doubleArray32 = new double[][] { doubleArray31 };
        multiDirectional25.setStartConfiguration(doubleArray32);
        multiDirectional16.setStartConfiguration(doubleArray32);
        multiDirectional0.setStartConfiguration(doubleArray32);
        multiDirectional0.setMaxEvaluations((int) 'a');
        multiDirectional0.setMaxIterations((int) (short) 0);
        java.lang.Class<?> wildcardClass40 = multiDirectional0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxIterations(1);
        multiDirectional0.setMaxIterations((int) (short) -1);
        int int11 = multiDirectional0.getIterations();
        int int12 = multiDirectional0.getMaxEvaluations();
        int int13 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction14 = null;
        org.apache.commons.math.optimization.GoalType goalType15 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (-1L));
        int int19 = multiDirectional18.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int21 = multiDirectional20.getMaxEvaluations();
        int int22 = multiDirectional20.getMaxIterations();
        double[] doubleArray24 = new double[] { 100 };
        multiDirectional20.setStartConfiguration(doubleArray24);
        int int26 = multiDirectional20.getMaxEvaluations();
        int int27 = multiDirectional20.getEvaluations();
        int int28 = multiDirectional20.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getIterations();
        int int31 = multiDirectional29.getMaxEvaluations();
        int int32 = multiDirectional29.getEvaluations();
        int int33 = multiDirectional29.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int35 = multiDirectional34.getIterations();
        int int36 = multiDirectional34.getEvaluations();
        int int37 = multiDirectional34.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional38.setMaxIterations(100);
        int int41 = multiDirectional38.getEvaluations();
        multiDirectional38.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker44 = multiDirectional38.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional45.setMaxIterations(100);
        int int48 = multiDirectional45.getEvaluations();
        multiDirectional45.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional51 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional51.setMaxIterations(100);
        int int54 = multiDirectional51.getEvaluations();
        multiDirectional51.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker57 = multiDirectional51.getConvergenceChecker();
        multiDirectional45.setConvergenceChecker(realConvergenceChecker57);
        multiDirectional38.setConvergenceChecker(realConvergenceChecker57);
        multiDirectional34.setConvergenceChecker(realConvergenceChecker57);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional61 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional61.setMaxIterations(100);
        int int64 = multiDirectional61.getEvaluations();
        multiDirectional61.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker67 = multiDirectional61.getConvergenceChecker();
        multiDirectional34.setConvergenceChecker(realConvergenceChecker67);
        multiDirectional29.setConvergenceChecker(realConvergenceChecker67);
        multiDirectional20.setConvergenceChecker(realConvergenceChecker67);
        int int71 = multiDirectional20.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional72 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int73 = multiDirectional72.getMaxEvaluations();
        multiDirectional72.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker76 = multiDirectional72.getConvergenceChecker();
        int int77 = multiDirectional72.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional78 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int79 = multiDirectional78.getMaxEvaluations();
        multiDirectional78.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker82 = multiDirectional78.getConvergenceChecker();
        double[] doubleArray83 = new double[] {};
        multiDirectional78.setStartConfiguration(doubleArray83);
        multiDirectional72.setStartConfiguration(doubleArray83);
        multiDirectional20.setStartConfiguration(doubleArray83);
        multiDirectional18.setStartConfiguration(doubleArray83);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair88 = multiDirectional0.optimize(multivariateRealFunction14, goalType15, doubleArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker57);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2147483647 + "'", int73 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2147483647 + "'", int79 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker82);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) '4');
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional5.setMaxIterations(100);
        int int8 = multiDirectional5.getEvaluations();
        multiDirectional5.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = multiDirectional5.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional12.setMaxIterations(100);
        int int15 = multiDirectional12.getEvaluations();
        multiDirectional12.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional18.getConvergenceChecker();
        multiDirectional12.setConvergenceChecker(realConvergenceChecker24);
        multiDirectional5.setConvergenceChecker(realConvergenceChecker24);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker24);
        int int28 = multiDirectional0.getMaxEvaluations();
        int int29 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxIterations(35);
        int int32 = multiDirectional0.getIterations();
        int int33 = multiDirectional0.getMaxIterations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator34 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.iterateSimplex(realPointValuePairComparator34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 35 + "'", int33 == 35);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (byte) 10);
        multiDirectional0.setMaxIterations(0);
        int int7 = multiDirectional0.getEvaluations();
        int int8 = multiDirectional0.getMaxIterations();
        int int9 = multiDirectional0.getMaxEvaluations();
        int int10 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getMaxEvaluations();
        multiDirectional11.setMaxIterations((int) (byte) 0);
        multiDirectional11.setMaxIterations((int) (short) 0);
        multiDirectional11.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional19.setMaxIterations(100);
        int int22 = multiDirectional19.getEvaluations();
        multiDirectional19.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker25 = multiDirectional19.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int27 = multiDirectional26.getMaxEvaluations();
        multiDirectional26.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional26.getConvergenceChecker();
        double[] doubleArray31 = new double[] {};
        multiDirectional26.setStartConfiguration(doubleArray31);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional26.getConvergenceChecker();
        int int34 = multiDirectional26.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional35.setMaxIterations(100);
        int int38 = multiDirectional35.getEvaluations();
        multiDirectional35.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional41.setMaxIterations(100);
        int int44 = multiDirectional41.getEvaluations();
        multiDirectional41.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional47 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional47.setMaxIterations(100);
        int int50 = multiDirectional47.getEvaluations();
        multiDirectional47.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker53 = multiDirectional47.getConvergenceChecker();
        multiDirectional41.setConvergenceChecker(realConvergenceChecker53);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int56 = multiDirectional55.getMaxEvaluations();
        multiDirectional55.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker59 = multiDirectional55.getConvergenceChecker();
        double[] doubleArray60 = new double[] {};
        multiDirectional55.setStartConfiguration(doubleArray60);
        multiDirectional41.setStartConfiguration(doubleArray60);
        multiDirectional35.setStartConfiguration(doubleArray60);
        multiDirectional26.setStartConfiguration(doubleArray60);
        multiDirectional19.setStartConfiguration(doubleArray60);
        multiDirectional11.setStartConfiguration(doubleArray60);
        multiDirectional0.setStartConfiguration(doubleArray60);
        int int68 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker59);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1), (double) 0.0f);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional6.getConvergenceChecker();
        int int13 = multiDirectional6.getMaxIterations();
        multiDirectional6.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int17 = multiDirectional16.getMaxEvaluations();
        int int18 = multiDirectional16.getMaxIterations();
        double[] doubleArray20 = new double[] { 100 };
        multiDirectional16.setStartConfiguration(doubleArray20);
        multiDirectional6.setStartConfiguration(doubleArray20);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int26 = multiDirectional25.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional27 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional27.setMaxIterations(100);
        multiDirectional27.setMaxEvaluations((int) (short) 1);
        int int32 = multiDirectional27.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int34 = multiDirectional33.getMaxEvaluations();
        multiDirectional33.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional33.getConvergenceChecker();
        double[] doubleArray38 = new double[] {};
        multiDirectional33.setStartConfiguration(doubleArray38);
        multiDirectional27.setStartConfiguration(doubleArray38);
        multiDirectional25.setStartConfiguration(doubleArray38);
        multiDirectional6.setStartConfiguration(doubleArray38);
        multiDirectional5.setStartConfiguration(doubleArray38);
        multiDirectional2.setStartConfiguration(doubleArray38);
        int int45 = multiDirectional2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        int int3 = multiDirectional0.getEvaluations();
        int int4 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations((int) (short) 100);
        int int7 = multiDirectional0.getIterations();
        int int8 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker9);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        double[] doubleArray5 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray5);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional9.setMaxIterations(100);
        int int12 = multiDirectional9.getEvaluations();
        multiDirectional9.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional15.setMaxIterations(100);
        int int18 = multiDirectional15.getEvaluations();
        multiDirectional15.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional21.setMaxIterations(100);
        int int24 = multiDirectional21.getEvaluations();
        multiDirectional21.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional21.getConvergenceChecker();
        multiDirectional15.setConvergenceChecker(realConvergenceChecker27);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getMaxEvaluations();
        multiDirectional29.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional29.getConvergenceChecker();
        double[] doubleArray34 = new double[] {};
        multiDirectional29.setStartConfiguration(doubleArray34);
        multiDirectional15.setStartConfiguration(doubleArray34);
        multiDirectional9.setStartConfiguration(doubleArray34);
        multiDirectional0.setStartConfiguration(doubleArray34);
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator39 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.iterateSimplex(realPointValuePairComparator39);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 10, (double) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (double) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional5.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker6);
        int int8 = multiDirectional2.getMaxIterations();
        int int9 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) 100.0f);
        int int3 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getMaxEvaluations();
        int int3 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional4.setMaxIterations(100);
        int int7 = multiDirectional4.getEvaluations();
        multiDirectional4.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional4.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional11.setMaxIterations(100);
        int int14 = multiDirectional11.getEvaluations();
        multiDirectional11.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional17.setMaxIterations(100);
        int int20 = multiDirectional17.getEvaluations();
        multiDirectional17.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = multiDirectional17.getConvergenceChecker();
        multiDirectional11.setConvergenceChecker(realConvergenceChecker23);
        multiDirectional4.setConvergenceChecker(realConvergenceChecker23);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker23);
        int int27 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int31 = multiDirectional30.getMaxEvaluations();
        int int32 = multiDirectional30.getMaxIterations();
        multiDirectional30.setMaxEvaluations((int) (byte) 0);
        multiDirectional30.setMaxEvaluations((int) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        int int40 = multiDirectional39.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker41 = multiDirectional39.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int43 = multiDirectional42.getMaxEvaluations();
        int int44 = multiDirectional42.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional45.setMaxIterations(100);
        multiDirectional45.setMaxEvaluations((int) (short) 1);
        int int50 = multiDirectional45.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional51 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int52 = multiDirectional51.getMaxEvaluations();
        multiDirectional51.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker55 = multiDirectional51.getConvergenceChecker();
        double[] doubleArray56 = new double[] {};
        multiDirectional51.setStartConfiguration(doubleArray56);
        multiDirectional45.setStartConfiguration(doubleArray56);
        multiDirectional42.setStartConfiguration(doubleArray56);
        multiDirectional39.setStartConfiguration(doubleArray56);
        multiDirectional30.setStartConfiguration(doubleArray56);
        multiDirectional0.setStartConfiguration(doubleArray56);
        int int63 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10, (double) 35);
        multiDirectional2.setMaxEvaluations((int) 'a');
        multiDirectional2.setMaxIterations(1);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 100, (double) 97);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        int int3 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 2147483647, (double) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, 100.0d);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional9.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getIterations();
        int int13 = multiDirectional11.getMaxEvaluations();
        int int14 = multiDirectional11.getEvaluations();
        int int15 = multiDirectional11.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int17 = multiDirectional16.getMaxEvaluations();
        int int18 = multiDirectional16.getMaxIterations();
        double[] doubleArray20 = new double[] { 100 };
        multiDirectional16.setStartConfiguration(doubleArray20);
        int int22 = multiDirectional16.getEvaluations();
        int int23 = multiDirectional16.getMaxIterations();
        int int24 = multiDirectional16.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional25.setMaxIterations(100);
        int int28 = multiDirectional25.getEvaluations();
        multiDirectional25.setMaxEvaluations((int) ' ');
        double[] doubleArray31 = new double[] {};
        double[][] doubleArray32 = new double[][] { doubleArray31 };
        multiDirectional25.setStartConfiguration(doubleArray32);
        multiDirectional16.setStartConfiguration(doubleArray32);
        multiDirectional11.setStartConfiguration(doubleArray32);
        multiDirectional9.setStartConfiguration(doubleArray32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int38 = multiDirectional37.getMaxEvaluations();
        int int39 = multiDirectional37.getMaxIterations();
        double[] doubleArray41 = new double[] { 100 };
        multiDirectional37.setStartConfiguration(doubleArray41);
        multiDirectional9.setStartConfiguration(doubleArray41);
        multiDirectional6.setStartConfiguration(doubleArray41);
        multiDirectional0.setStartConfiguration(doubleArray41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional3.setMaxIterations(100);
        int int6 = multiDirectional3.getEvaluations();
        multiDirectional3.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = multiDirectional3.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        multiDirectional10.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = multiDirectional10.getConvergenceChecker();
        double[] doubleArray15 = new double[] {};
        multiDirectional10.setStartConfiguration(doubleArray15);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional10.getConvergenceChecker();
        int int18 = multiDirectional10.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional19.setMaxIterations(100);
        int int22 = multiDirectional19.getEvaluations();
        multiDirectional19.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional25.setMaxIterations(100);
        int int28 = multiDirectional25.getEvaluations();
        multiDirectional25.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        int int34 = multiDirectional31.getEvaluations();
        multiDirectional31.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional31.getConvergenceChecker();
        multiDirectional25.setConvergenceChecker(realConvergenceChecker37);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getMaxEvaluations();
        multiDirectional39.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker43 = multiDirectional39.getConvergenceChecker();
        double[] doubleArray44 = new double[] {};
        multiDirectional39.setStartConfiguration(doubleArray44);
        multiDirectional25.setStartConfiguration(doubleArray44);
        multiDirectional19.setStartConfiguration(doubleArray44);
        multiDirectional10.setStartConfiguration(doubleArray44);
        multiDirectional3.setStartConfiguration(doubleArray44);
        multiDirectional0.setStartConfiguration(doubleArray44);
        int int51 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 10);
        int int3 = multiDirectional2.getMaxEvaluations();
        int int4 = multiDirectional2.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional5.setMaxIterations(100);
        int int8 = multiDirectional5.getMaxEvaluations();
        multiDirectional5.setMaxEvaluations((int) (byte) 1);
        multiDirectional5.setMaxEvaluations((int) (byte) 1);
        int int13 = multiDirectional5.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int17 = multiDirectional16.getIterations();
        multiDirectional16.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional20.setMaxIterations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        multiDirectional23.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional23.getConvergenceChecker();
        double[] doubleArray28 = new double[] {};
        multiDirectional23.setStartConfiguration(doubleArray28);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional23.getConvergenceChecker();
        multiDirectional20.setConvergenceChecker(realConvergenceChecker30);
        multiDirectional16.setConvergenceChecker(realConvergenceChecker30);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional16.getConvergenceChecker();
        multiDirectional5.setConvergenceChecker(realConvergenceChecker33);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations(52);
        int int4 = multiDirectional0.getMaxEvaluations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.iterateSimplex(realPointValuePairComparator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (-1.0d));
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 10, (double) 1L);
        multiDirectional5.setMaxIterations((int) (short) -1);
        int int8 = multiDirectional5.getEvaluations();
        multiDirectional5.setMaxIterations((int) (short) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getIterations();
        int int13 = multiDirectional11.getMaxEvaluations();
        multiDirectional11.setMaxEvaluations(2147483647);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int17 = multiDirectional16.getMaxEvaluations();
        int int18 = multiDirectional16.getMaxIterations();
        double[] doubleArray20 = new double[] { 100 };
        multiDirectional16.setStartConfiguration(doubleArray20);
        multiDirectional11.setStartConfiguration(doubleArray20);
        multiDirectional5.setStartConfiguration(doubleArray20);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional5.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (byte) 10);
        multiDirectional0.setMaxIterations(0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional7.setMaxIterations(100);
        multiDirectional7.setMaxEvaluations((int) (short) 1);
        multiDirectional7.setMaxEvaluations((int) (short) 1);
        int int14 = multiDirectional7.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional15.setMaxIterations(100);
        int int18 = multiDirectional15.getEvaluations();
        multiDirectional15.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional21.setMaxIterations(100);
        int int24 = multiDirectional21.getEvaluations();
        multiDirectional21.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional21.getConvergenceChecker();
        multiDirectional15.setConvergenceChecker(realConvergenceChecker27);
        multiDirectional7.setConvergenceChecker(realConvergenceChecker27);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int31 = multiDirectional30.getMaxEvaluations();
        int int32 = multiDirectional30.getMaxIterations();
        double[] doubleArray34 = new double[] { 100 };
        multiDirectional30.setStartConfiguration(doubleArray34);
        int int36 = multiDirectional30.getMaxEvaluations();
        int int37 = multiDirectional30.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int39 = multiDirectional38.getMaxEvaluations();
        int int40 = multiDirectional38.getMaxIterations();
        double[] doubleArray42 = new double[] { 100 };
        multiDirectional38.setStartConfiguration(doubleArray42);
        multiDirectional30.setStartConfiguration(doubleArray42);
        multiDirectional7.setStartConfiguration(doubleArray42);
        multiDirectional0.setStartConfiguration(doubleArray42);
        int int47 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        int int5 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int7 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional6.getConvergenceChecker();
        double[] doubleArray11 = new double[] {};
        multiDirectional6.setStartConfiguration(doubleArray11);
        multiDirectional0.setStartConfiguration(doubleArray11);
        int int14 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        int int3 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional4.setMaxIterations(100);
        int int7 = multiDirectional4.getEvaluations();
        multiDirectional4.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional4.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional11.setMaxIterations(100);
        int int14 = multiDirectional11.getEvaluations();
        multiDirectional11.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional17.setMaxIterations(100);
        int int20 = multiDirectional17.getEvaluations();
        multiDirectional17.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = multiDirectional17.getConvergenceChecker();
        multiDirectional11.setConvergenceChecker(realConvergenceChecker23);
        multiDirectional4.setConvergenceChecker(realConvergenceChecker23);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker23);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional27 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional27.setMaxIterations(100);
        int int30 = multiDirectional27.getEvaluations();
        multiDirectional27.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional27.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker33);
        int int35 = multiDirectional0.getMaxEvaluations();
        int int36 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional7.setMaxIterations(100);
        int int10 = multiDirectional7.getMaxEvaluations();
        multiDirectional7.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional7.getConvergenceChecker();
        int int14 = multiDirectional7.getMaxIterations();
        multiDirectional7.setMaxIterations((int) (byte) 100);
        int int17 = multiDirectional7.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional7.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker18);
        int int20 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(0);
        int int23 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional2.setMaxIterations(100);
        multiDirectional2.setMaxEvaluations((int) (short) 1);
        multiDirectional2.setMaxEvaluations((int) (short) 1);
        int int9 = multiDirectional2.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional10.setMaxIterations(100);
        int int13 = multiDirectional10.getEvaluations();
        multiDirectional10.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional16.setMaxIterations(100);
        int int19 = multiDirectional16.getEvaluations();
        multiDirectional16.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = multiDirectional16.getConvergenceChecker();
        multiDirectional10.setConvergenceChecker(realConvergenceChecker22);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker22);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int26 = multiDirectional25.getMaxEvaluations();
        int int27 = multiDirectional25.getMaxIterations();
        double[] doubleArray29 = new double[] { 100 };
        multiDirectional25.setStartConfiguration(doubleArray29);
        int int31 = multiDirectional25.getMaxEvaluations();
        int int32 = multiDirectional25.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int34 = multiDirectional33.getMaxEvaluations();
        int int35 = multiDirectional33.getMaxIterations();
        double[] doubleArray37 = new double[] { 100 };
        multiDirectional33.setStartConfiguration(doubleArray37);
        multiDirectional25.setStartConfiguration(doubleArray37);
        multiDirectional2.setStartConfiguration(doubleArray37);
        multiDirectional0.setStartConfiguration(doubleArray37);
        int int42 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker43 = multiDirectional0.getConvergenceChecker();
        int int44 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker45 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker45);
        int int47 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int8 = multiDirectional7.getIterations();
        int int9 = multiDirectional7.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        int int12 = multiDirectional10.getMaxIterations();
        double[] doubleArray14 = new double[] { 100 };
        multiDirectional10.setStartConfiguration(doubleArray14);
        int int16 = multiDirectional10.getEvaluations();
        int int17 = multiDirectional10.getMaxIterations();
        int int18 = multiDirectional10.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional19.setMaxIterations(100);
        int int22 = multiDirectional19.getEvaluations();
        multiDirectional19.setMaxEvaluations((int) ' ');
        double[] doubleArray25 = new double[] {};
        double[][] doubleArray26 = new double[][] { doubleArray25 };
        multiDirectional19.setStartConfiguration(doubleArray26);
        multiDirectional10.setStartConfiguration(doubleArray26);
        multiDirectional7.setStartConfiguration(doubleArray26);
        multiDirectional0.setStartConfiguration(doubleArray26);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int32 = multiDirectional31.getMaxEvaluations();
        multiDirectional31.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker35 = multiDirectional31.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int37 = multiDirectional36.getMaxEvaluations();
        multiDirectional36.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker40 = multiDirectional36.getConvergenceChecker();
        multiDirectional31.setConvergenceChecker(realConvergenceChecker40);
        int int42 = multiDirectional31.getEvaluations();
        int int43 = multiDirectional31.getEvaluations();
        int int44 = multiDirectional31.getMaxEvaluations();
        multiDirectional31.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional47 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int48 = multiDirectional47.getIterations();
        int int49 = multiDirectional47.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker50 = multiDirectional47.getConvergenceChecker();
        int int51 = multiDirectional47.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker52 = multiDirectional47.getConvergenceChecker();
        multiDirectional31.setConvergenceChecker(realConvergenceChecker52);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker57 = multiDirectional56.getConvergenceChecker();
        multiDirectional31.setConvergenceChecker(realConvergenceChecker57);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker57);
        int int60 = multiDirectional0.getIterations();
        multiDirectional0.setMaxEvaluations((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker52);
        org.junit.Assert.assertNotNull(realConvergenceChecker57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (-1L));
        int int3 = multiDirectional2.getIterations();
        int int4 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional5.setMaxIterations(100);
        multiDirectional5.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional5.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getMaxEvaluations();
        multiDirectional11.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional17.setMaxEvaluations((int) (short) -1);
        int int20 = multiDirectional17.getIterations();
        multiDirectional17.setMaxIterations((int) '#');
        int int23 = multiDirectional17.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional24.setMaxIterations(100);
        int int27 = multiDirectional24.getEvaluations();
        multiDirectional24.setMaxEvaluations((int) ' ');
        double[] doubleArray30 = new double[] {};
        double[][] doubleArray31 = new double[][] { doubleArray30 };
        multiDirectional24.setStartConfiguration(doubleArray31);
        multiDirectional17.setStartConfiguration(doubleArray31);
        multiDirectional11.setStartConfiguration(doubleArray31);
        multiDirectional5.setStartConfiguration(doubleArray31);
        multiDirectional2.setStartConfiguration(doubleArray31);
        int int37 = multiDirectional2.getEvaluations();
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction38 = null;
        org.apache.commons.math.optimization.GoalType goalType39 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional(100.0d, (double) (-1));
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int46 = multiDirectional45.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional47 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional47.setMaxIterations(100);
        multiDirectional47.setMaxEvaluations((int) (short) 1);
        int int52 = multiDirectional47.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int54 = multiDirectional53.getMaxEvaluations();
        multiDirectional53.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker57 = multiDirectional53.getConvergenceChecker();
        double[] doubleArray58 = new double[] {};
        multiDirectional53.setStartConfiguration(doubleArray58);
        multiDirectional47.setStartConfiguration(doubleArray58);
        multiDirectional45.setStartConfiguration(doubleArray58);
        multiDirectional42.setStartConfiguration(doubleArray58);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair63 = multiDirectional2.optimize(multivariateRealFunction38, goalType39, doubleArray58);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker57);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxIterations(0);
        int int6 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        multiDirectional12.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int16 = multiDirectional15.getIterations();
        int int17 = multiDirectional15.getEvaluations();
        int int18 = multiDirectional15.getMaxIterations();
        double[] doubleArray19 = new double[] {};
        multiDirectional15.setStartConfiguration(doubleArray19);
        multiDirectional12.setStartConfiguration(doubleArray19);
        multiDirectional9.setStartConfiguration(doubleArray19);
        multiDirectional0.setStartConfiguration(doubleArray19);
        int int24 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations(0);
        java.lang.Class<?> wildcardClass27 = multiDirectional0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        int int3 = multiDirectional0.getMaxIterations();
        int int4 = multiDirectional0.getIterations();
        int int5 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) '4');
        int int8 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 2147483647, (double) (byte) -1);
        multiDirectional2.setMaxEvaluations((int) 'a');
        multiDirectional2.setMaxIterations((int) (byte) 100);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) '4');
        int int3 = multiDirectional2.getMaxIterations();
        multiDirectional2.setMaxIterations(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int3 = multiDirectional2.getIterations();
        multiDirectional2.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        multiDirectional9.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional9.getConvergenceChecker();
        double[] doubleArray14 = new double[] {};
        multiDirectional9.setStartConfiguration(doubleArray14);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional9.getConvergenceChecker();
        multiDirectional6.setConvergenceChecker(realConvergenceChecker16);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker16);
        int int19 = multiDirectional2.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker20 = multiDirectional2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker20);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        multiDirectional0.setMaxIterations((int) (short) 0);
        multiDirectional0.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int9 = multiDirectional8.getMaxEvaluations();
        int int10 = multiDirectional8.getMaxIterations();
        int int11 = multiDirectional8.getMaxEvaluations();
        int int12 = multiDirectional8.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        int int15 = multiDirectional13.getMaxIterations();
        double[] doubleArray17 = new double[] { 100 };
        multiDirectional13.setStartConfiguration(doubleArray17);
        int int19 = multiDirectional13.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int21 = multiDirectional20.getMaxEvaluations();
        int int22 = multiDirectional20.getMaxIterations();
        double[] doubleArray24 = new double[] { 100 };
        multiDirectional20.setStartConfiguration(doubleArray24);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = multiDirectional20.getConvergenceChecker();
        multiDirectional13.setConvergenceChecker(realConvergenceChecker26);
        multiDirectional8.setConvergenceChecker(realConvergenceChecker26);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker26);
        multiDirectional0.setMaxEvaluations(100);
        int int32 = multiDirectional0.getMaxEvaluations();
        int int33 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        double[] doubleArray5 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray5);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        int int9 = multiDirectional0.getIterations();
        int int10 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional15.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int18 = multiDirectional17.getMaxEvaluations();
        int int19 = multiDirectional17.getMaxIterations();
        double[] doubleArray21 = new double[] { 100 };
        multiDirectional17.setStartConfiguration(doubleArray21);
        int int23 = multiDirectional17.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int25 = multiDirectional24.getMaxEvaluations();
        int int26 = multiDirectional24.getMaxIterations();
        double[] doubleArray28 = new double[] { 100 };
        multiDirectional24.setStartConfiguration(doubleArray28);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional24.getConvergenceChecker();
        multiDirectional17.setConvergenceChecker(realConvergenceChecker30);
        multiDirectional15.setConvergenceChecker(realConvergenceChecker30);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker30);
        int int34 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations(1);
        int int37 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int39 = multiDirectional38.getIterations();
        int int40 = multiDirectional38.getMaxEvaluations();
        int int41 = multiDirectional38.getEvaluations();
        int int42 = multiDirectional38.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int44 = multiDirectional43.getMaxEvaluations();
        int int45 = multiDirectional43.getMaxIterations();
        double[] doubleArray47 = new double[] { 100 };
        multiDirectional43.setStartConfiguration(doubleArray47);
        int int49 = multiDirectional43.getEvaluations();
        int int50 = multiDirectional43.getMaxIterations();
        int int51 = multiDirectional43.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional52 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional52.setMaxIterations(100);
        int int55 = multiDirectional52.getEvaluations();
        multiDirectional52.setMaxEvaluations((int) ' ');
        double[] doubleArray58 = new double[] {};
        double[][] doubleArray59 = new double[][] { doubleArray58 };
        multiDirectional52.setStartConfiguration(doubleArray59);
        multiDirectional43.setStartConfiguration(doubleArray59);
        multiDirectional38.setStartConfiguration(doubleArray59);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional65 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker66 = multiDirectional65.getConvergenceChecker();
        multiDirectional38.setConvergenceChecker(realConvergenceChecker66);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker66);
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator69 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.iterateSimplex(realPointValuePairComparator69);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertNotNull(realConvergenceChecker66);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        double[] doubleArray5 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray5);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional9.setMaxIterations(100);
        int int12 = multiDirectional9.getEvaluations();
        multiDirectional9.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional15.setMaxIterations(100);
        int int18 = multiDirectional15.getEvaluations();
        multiDirectional15.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional21.setMaxIterations(100);
        int int24 = multiDirectional21.getEvaluations();
        multiDirectional21.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional21.getConvergenceChecker();
        multiDirectional15.setConvergenceChecker(realConvergenceChecker27);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getMaxEvaluations();
        multiDirectional29.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional29.getConvergenceChecker();
        double[] doubleArray34 = new double[] {};
        multiDirectional29.setStartConfiguration(doubleArray34);
        multiDirectional15.setStartConfiguration(doubleArray34);
        multiDirectional9.setStartConfiguration(doubleArray34);
        multiDirectional0.setStartConfiguration(doubleArray34);
        int int39 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker40 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker40);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNull(realConvergenceChecker42);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(100.0d, (double) (byte) 100);
        int int3 = multiDirectional2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(10.0d, (double) 0);
        int int3 = multiDirectional2.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional2.getConvergenceChecker();
        multiDirectional2.setMaxIterations(2147483647);
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        int int11 = multiDirectional9.getMaxIterations();
        double[] doubleArray13 = new double[] { 100 };
        multiDirectional9.setStartConfiguration(doubleArray13);
        int int15 = multiDirectional9.getMaxEvaluations();
        int int16 = multiDirectional9.getEvaluations();
        int int17 = multiDirectional9.getEvaluations();
        multiDirectional9.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int21 = multiDirectional20.getIterations();
        int int22 = multiDirectional20.getMaxEvaluations();
        int int23 = multiDirectional20.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int25 = multiDirectional24.getMaxEvaluations();
        int int26 = multiDirectional24.getMaxIterations();
        double[] doubleArray28 = new double[] { 100 };
        multiDirectional24.setStartConfiguration(doubleArray28);
        multiDirectional20.setStartConfiguration(doubleArray28);
        multiDirectional9.setStartConfiguration(doubleArray28);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getIterations();
        int int34 = multiDirectional32.getEvaluations();
        int int35 = multiDirectional32.getMaxIterations();
        double[] doubleArray36 = new double[] {};
        multiDirectional32.setStartConfiguration(doubleArray36);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = multiDirectional32.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        multiDirectional41.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional44 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int45 = multiDirectional44.getIterations();
        int int46 = multiDirectional44.getEvaluations();
        int int47 = multiDirectional44.getMaxIterations();
        double[] doubleArray48 = new double[] {};
        multiDirectional44.setStartConfiguration(doubleArray48);
        multiDirectional41.setStartConfiguration(doubleArray48);
        multiDirectional32.setStartConfiguration(doubleArray48);
        multiDirectional9.setStartConfiguration(doubleArray48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair53 = multiDirectional2.optimize(multivariateRealFunction7, goalType8, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = multiDirectional0.getConvergenceChecker();
        int int6 = multiDirectional0.getIterations();
        int int7 = multiDirectional0.getIterations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator8 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.iterateSimplex(realPointValuePairComparator8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(realConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(10.0d, (double) 32);
        int int3 = multiDirectional2.getEvaluations();
        int int4 = multiDirectional2.getMaxEvaluations();
        int int5 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getEvaluations();
        multiDirectional6.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional12.setMaxIterations(100);
        int int15 = multiDirectional12.getEvaluations();
        multiDirectional12.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional12.getConvergenceChecker();
        multiDirectional6.setConvergenceChecker(realConvergenceChecker18);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int21 = multiDirectional20.getMaxEvaluations();
        multiDirectional20.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional20.getConvergenceChecker();
        double[] doubleArray25 = new double[] {};
        multiDirectional20.setStartConfiguration(doubleArray25);
        multiDirectional6.setStartConfiguration(doubleArray25);
        multiDirectional0.setStartConfiguration(doubleArray25);
        int int29 = multiDirectional0.getEvaluations();
        int int30 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker31 = multiDirectional0.getConvergenceChecker();
        int int32 = multiDirectional0.getMaxIterations();
        int int33 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(realConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 10, (double) (short) -1);
        int int6 = multiDirectional5.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int8 = multiDirectional7.getIterations();
        int int9 = multiDirectional7.getEvaluations();
        int int10 = multiDirectional7.getEvaluations();
        int int11 = multiDirectional7.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional12.setMaxIterations(100);
        int int15 = multiDirectional12.getEvaluations();
        multiDirectional12.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional12.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional19.setMaxIterations(100);
        int int22 = multiDirectional19.getEvaluations();
        multiDirectional19.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional25.setMaxIterations(100);
        int int28 = multiDirectional25.getEvaluations();
        multiDirectional25.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker31 = multiDirectional25.getConvergenceChecker();
        multiDirectional19.setConvergenceChecker(realConvergenceChecker31);
        multiDirectional12.setConvergenceChecker(realConvergenceChecker31);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional34.setMaxIterations(100);
        multiDirectional34.setMaxEvaluations((int) (short) 1);
        multiDirectional34.setMaxEvaluations((int) (short) 1);
        int int41 = multiDirectional34.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional42.setMaxIterations(100);
        int int45 = multiDirectional42.getEvaluations();
        multiDirectional42.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional48.setMaxIterations(100);
        int int51 = multiDirectional48.getEvaluations();
        multiDirectional48.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker54 = multiDirectional48.getConvergenceChecker();
        multiDirectional42.setConvergenceChecker(realConvergenceChecker54);
        multiDirectional34.setConvergenceChecker(realConvergenceChecker54);
        multiDirectional12.setConvergenceChecker(realConvergenceChecker54);
        multiDirectional7.setConvergenceChecker(realConvergenceChecker54);
        int int59 = multiDirectional7.getMaxIterations();
        multiDirectional7.setMaxIterations(1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker62 = multiDirectional7.getConvergenceChecker();
        multiDirectional5.setConvergenceChecker(realConvergenceChecker62);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker62);
        int int65 = multiDirectional2.getIterations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator66 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker54);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (short) -1);
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction3 = null;
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        int int7 = multiDirectional5.getMaxIterations();
        double[] doubleArray9 = new double[] { 100 };
        multiDirectional5.setStartConfiguration(doubleArray9);
        int int11 = multiDirectional5.getEvaluations();
        int int12 = multiDirectional5.getMaxIterations();
        int int13 = multiDirectional5.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional14.setMaxIterations(100);
        int int17 = multiDirectional14.getEvaluations();
        multiDirectional14.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker20 = multiDirectional14.getConvergenceChecker();
        multiDirectional14.setMaxIterations(1);
        multiDirectional14.setMaxIterations((int) (short) -1);
        int int25 = multiDirectional14.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int27 = multiDirectional26.getMaxEvaluations();
        multiDirectional26.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional26.getConvergenceChecker();
        double[] doubleArray31 = new double[] {};
        multiDirectional26.setStartConfiguration(doubleArray31);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional26.getConvergenceChecker();
        int int34 = multiDirectional26.getMaxEvaluations();
        int int35 = multiDirectional26.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int37 = multiDirectional36.getIterations();
        int int38 = multiDirectional36.getMaxEvaluations();
        int int39 = multiDirectional36.getEvaluations();
        int int40 = multiDirectional36.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int42 = multiDirectional41.getMaxEvaluations();
        int int43 = multiDirectional41.getMaxIterations();
        double[] doubleArray45 = new double[] { 100 };
        multiDirectional41.setStartConfiguration(doubleArray45);
        int int47 = multiDirectional41.getEvaluations();
        int int48 = multiDirectional41.getMaxIterations();
        int int49 = multiDirectional41.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional50 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional50.setMaxIterations(100);
        int int53 = multiDirectional50.getEvaluations();
        multiDirectional50.setMaxEvaluations((int) ' ');
        double[] doubleArray56 = new double[] {};
        double[][] doubleArray57 = new double[][] { doubleArray56 };
        multiDirectional50.setStartConfiguration(doubleArray57);
        multiDirectional41.setStartConfiguration(doubleArray57);
        multiDirectional36.setStartConfiguration(doubleArray57);
        multiDirectional26.setStartConfiguration(doubleArray57);
        multiDirectional14.setStartConfiguration(doubleArray57);
        multiDirectional5.setStartConfiguration(doubleArray57);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional66 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int67 = multiDirectional66.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional68 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional68.setMaxIterations(100);
        multiDirectional68.setMaxEvaluations((int) (short) 1);
        int int73 = multiDirectional68.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional74 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int75 = multiDirectional74.getMaxEvaluations();
        multiDirectional74.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker78 = multiDirectional74.getConvergenceChecker();
        double[] doubleArray79 = new double[] {};
        multiDirectional74.setStartConfiguration(doubleArray79);
        multiDirectional68.setStartConfiguration(doubleArray79);
        multiDirectional66.setStartConfiguration(doubleArray79);
        multiDirectional5.setStartConfiguration(doubleArray79);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair84 = multiDirectional2.optimize(multivariateRealFunction3, goalType4, doubleArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2147483647 + "'", int75 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker78);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertArrayEquals(doubleArray79, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        int int4 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker5);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional9.setMaxEvaluations((int) (short) -1);
        int int12 = multiDirectional9.getIterations();
        multiDirectional9.setMaxIterations((int) '#');
        int int15 = multiDirectional9.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional16.setMaxIterations(100);
        int int19 = multiDirectional16.getEvaluations();
        multiDirectional16.setMaxEvaluations((int) ' ');
        double[] doubleArray22 = new double[] {};
        double[][] doubleArray23 = new double[][] { doubleArray22 };
        multiDirectional16.setStartConfiguration(doubleArray23);
        multiDirectional9.setStartConfiguration(doubleArray23);
        multiDirectional0.setStartConfiguration(doubleArray23);
        multiDirectional0.setMaxIterations((int) ' ');
        int int29 = multiDirectional0.getMaxIterations();
        int int30 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 32 + "'", int29 == 32);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int4 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional3.getConvergenceChecker();
        double[] doubleArray8 = new double[] {};
        multiDirectional3.setStartConfiguration(doubleArray8);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional3.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker10);
        int int12 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) '#', (double) 'a');
        multiDirectional15.setMaxIterations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getIterations();
        int int20 = multiDirectional18.getEvaluations();
        int int21 = multiDirectional18.getEvaluations();
        int int22 = multiDirectional18.getMaxEvaluations();
        double[] doubleArray23 = new double[] {};
        multiDirectional18.setStartConfiguration(doubleArray23);
        multiDirectional15.setStartConfiguration(doubleArray23);
        multiDirectional0.setStartConfiguration(doubleArray23);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, 0.0d);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional2.getConvergenceChecker();
        multiDirectional2.setMaxEvaluations((int) (short) 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 97, (double) 1);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        double[] doubleArray5 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray5);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        int int9 = multiDirectional0.getIterations();
        int int10 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getMaxEvaluations();
        multiDirectional11.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional11.getConvergenceChecker();
        multiDirectional11.setMaxEvaluations((int) (byte) -1);
        int int18 = multiDirectional11.getIterations();
        int int19 = multiDirectional11.getIterations();
        int int20 = multiDirectional11.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker21 = multiDirectional11.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker21);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 1, (double) (short) 100);
        int int3 = multiDirectional2.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getIterations();
        int int6 = multiDirectional4.getEvaluations();
        int int7 = multiDirectional4.getMaxIterations();
        multiDirectional4.setMaxIterations((int) (byte) -1);
        multiDirectional4.setMaxIterations((int) '4');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int13 = multiDirectional12.getIterations();
        int int14 = multiDirectional12.getEvaluations();
        int int15 = multiDirectional12.getEvaluations();
        int int16 = multiDirectional12.getMaxEvaluations();
        double[] doubleArray17 = new double[] {};
        multiDirectional12.setStartConfiguration(doubleArray17);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 100.0f, (double) (-1.0f));
        multiDirectional21.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int25 = multiDirectional24.getMaxEvaluations();
        multiDirectional24.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional24.getConvergenceChecker();
        multiDirectional24.setMaxEvaluations((int) (byte) -1);
        int int31 = multiDirectional24.getIterations();
        int int32 = multiDirectional24.getIterations();
        int int33 = multiDirectional24.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int35 = multiDirectional34.getIterations();
        int int36 = multiDirectional34.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int38 = multiDirectional37.getMaxEvaluations();
        int int39 = multiDirectional37.getMaxIterations();
        double[] doubleArray41 = new double[] { 100 };
        multiDirectional37.setStartConfiguration(doubleArray41);
        int int43 = multiDirectional37.getEvaluations();
        int int44 = multiDirectional37.getMaxIterations();
        int int45 = multiDirectional37.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional46.setMaxIterations(100);
        int int49 = multiDirectional46.getEvaluations();
        multiDirectional46.setMaxEvaluations((int) ' ');
        double[] doubleArray52 = new double[] {};
        double[][] doubleArray53 = new double[][] { doubleArray52 };
        multiDirectional46.setStartConfiguration(doubleArray53);
        multiDirectional37.setStartConfiguration(doubleArray53);
        multiDirectional34.setStartConfiguration(doubleArray53);
        multiDirectional24.setStartConfiguration(doubleArray53);
        int int58 = multiDirectional24.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional59 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int60 = multiDirectional59.getIterations();
        int int61 = multiDirectional59.getMaxEvaluations();
        int int62 = multiDirectional59.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional63 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int64 = multiDirectional63.getMaxEvaluations();
        int int65 = multiDirectional63.getMaxIterations();
        double[] doubleArray67 = new double[] { 100 };
        multiDirectional63.setStartConfiguration(doubleArray67);
        multiDirectional59.setStartConfiguration(doubleArray67);
        multiDirectional24.setStartConfiguration(doubleArray67);
        multiDirectional21.setStartConfiguration(doubleArray67);
        multiDirectional12.setStartConfiguration(doubleArray67);
        multiDirectional4.setStartConfiguration(doubleArray67);
        multiDirectional2.setStartConfiguration(doubleArray67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2147483647 + "'", int65 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getMaxEvaluations();
        int int7 = multiDirectional0.getEvaluations();
        int int8 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getIterations();
        int int13 = multiDirectional11.getMaxEvaluations();
        int int14 = multiDirectional11.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int16 = multiDirectional15.getMaxEvaluations();
        int int17 = multiDirectional15.getMaxIterations();
        double[] doubleArray19 = new double[] { 100 };
        multiDirectional15.setStartConfiguration(doubleArray19);
        multiDirectional11.setStartConfiguration(doubleArray19);
        multiDirectional0.setStartConfiguration(doubleArray19);
        java.lang.Class<?> wildcardClass23 = multiDirectional0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        double[] doubleArray5 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray5);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        int int9 = multiDirectional0.getIterations();
        int int10 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional15.setMaxEvaluations((int) (short) -1);
        int int18 = multiDirectional15.getIterations();
        multiDirectional15.setMaxIterations((int) '#');
        int int21 = multiDirectional15.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        int int25 = multiDirectional22.getEvaluations();
        multiDirectional22.setMaxEvaluations((int) ' ');
        double[] doubleArray28 = new double[] {};
        double[][] doubleArray29 = new double[][] { doubleArray28 };
        multiDirectional22.setStartConfiguration(doubleArray29);
        multiDirectional15.setStartConfiguration(doubleArray29);
        int int32 = multiDirectional15.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional15.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker33);
        int int35 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional36.setMaxIterations(100);
        int int39 = multiDirectional36.getMaxEvaluations();
        multiDirectional36.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = multiDirectional36.getConvergenceChecker();
        int int43 = multiDirectional36.getMaxIterations();
        int int44 = multiDirectional36.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker45 = multiDirectional36.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker45);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 100 + "'", int43 == 100);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker45);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 1, 100.0d);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int4 = multiDirectional3.getMaxEvaluations();
        int int5 = multiDirectional3.getMaxIterations();
        multiDirectional3.setMaxEvaluations((int) (byte) 0);
        int int8 = multiDirectional3.getIterations();
        int int9 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxEvaluations((int) (short) 1);
        int int12 = multiDirectional3.getIterations();
        int int13 = multiDirectional3.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional16.setMaxEvaluations((int) (short) -1);
        int int19 = multiDirectional16.getIterations();
        multiDirectional16.setMaxIterations((int) '#');
        int int22 = multiDirectional16.getMaxIterations();
        int int23 = multiDirectional16.getMaxEvaluations();
        int int24 = multiDirectional16.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional25.setMaxIterations(100);
        int int28 = multiDirectional25.getEvaluations();
        multiDirectional25.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker31 = multiDirectional25.getConvergenceChecker();
        multiDirectional25.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional34.setMaxIterations(100);
        int int37 = multiDirectional34.getEvaluations();
        multiDirectional34.setMaxEvaluations((int) ' ');
        double[] doubleArray40 = new double[] {};
        double[][] doubleArray41 = new double[][] { doubleArray40 };
        multiDirectional34.setStartConfiguration(doubleArray41);
        multiDirectional25.setStartConfiguration(doubleArray41);
        multiDirectional16.setStartConfiguration(doubleArray41);
        multiDirectional3.setStartConfiguration(doubleArray41);
        int int46 = multiDirectional3.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional49 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 100);
        int int50 = multiDirectional49.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional51 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional51.setMaxIterations(100);
        multiDirectional51.setMaxEvaluations((int) (short) 1);
        int int56 = multiDirectional51.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int58 = multiDirectional57.getMaxEvaluations();
        multiDirectional57.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker61 = multiDirectional57.getConvergenceChecker();
        double[] doubleArray62 = new double[] {};
        multiDirectional57.setStartConfiguration(doubleArray62);
        multiDirectional51.setStartConfiguration(doubleArray62);
        multiDirectional49.setStartConfiguration(doubleArray62);
        multiDirectional3.setStartConfiguration(doubleArray62);
        multiDirectional2.setStartConfiguration(doubleArray62);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker61);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 10, (double) 1L);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional2.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getIterations();
        int int6 = multiDirectional4.getEvaluations();
        int int7 = multiDirectional4.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional8.setMaxIterations(100);
        int int11 = multiDirectional8.getEvaluations();
        multiDirectional8.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = multiDirectional8.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional15.setMaxIterations(100);
        int int18 = multiDirectional15.getEvaluations();
        multiDirectional15.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional21.setMaxIterations(100);
        int int24 = multiDirectional21.getEvaluations();
        multiDirectional21.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional21.getConvergenceChecker();
        multiDirectional15.setConvergenceChecker(realConvergenceChecker27);
        multiDirectional8.setConvergenceChecker(realConvergenceChecker27);
        multiDirectional4.setConvergenceChecker(realConvergenceChecker27);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        int int34 = multiDirectional31.getEvaluations();
        multiDirectional31.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional31.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional38.setMaxIterations(100);
        int int41 = multiDirectional38.getEvaluations();
        multiDirectional38.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional44 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional44.setMaxIterations(100);
        int int47 = multiDirectional44.getEvaluations();
        multiDirectional44.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker50 = multiDirectional44.getConvergenceChecker();
        multiDirectional38.setConvergenceChecker(realConvergenceChecker50);
        multiDirectional31.setConvergenceChecker(realConvergenceChecker50);
        multiDirectional4.setConvergenceChecker(realConvergenceChecker50);
        multiDirectional4.setMaxIterations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional58 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (-1.0d));
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional61 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional64 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        int int65 = multiDirectional64.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional66 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int67 = multiDirectional66.getIterations();
        int int68 = multiDirectional66.getEvaluations();
        int int69 = multiDirectional66.getMaxIterations();
        double[] doubleArray70 = new double[] {};
        multiDirectional66.setStartConfiguration(doubleArray70);
        multiDirectional64.setStartConfiguration(doubleArray70);
        multiDirectional61.setStartConfiguration(doubleArray70);
        multiDirectional58.setStartConfiguration(doubleArray70);
        multiDirectional4.setStartConfiguration(doubleArray70);
        multiDirectional2.setStartConfiguration(doubleArray70);
        java.lang.Class<?> wildcardClass77 = multiDirectional2.getClass();
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker50);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2147483647 + "'", int65 == 2147483647);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2147483647 + "'", int69 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) (byte) 1);
        multiDirectional0.setMaxEvaluations((int) (byte) 1);
        multiDirectional0.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        int int12 = multiDirectional10.getMaxIterations();
        double[] doubleArray14 = new double[] { 100 };
        multiDirectional10.setStartConfiguration(doubleArray14);
        multiDirectional0.setStartConfiguration(doubleArray14);
        int int17 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getMaxEvaluations();
        multiDirectional18.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = multiDirectional18.getConvergenceChecker();
        multiDirectional18.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker25 = multiDirectional18.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker25);
        multiDirectional0.setMaxEvaluations((int) 'a');
        int int29 = multiDirectional0.getIterations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator30 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.iterateSimplex(realPointValuePairComparator30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker22);
        org.junit.Assert.assertNotNull(realConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(1);
        int int4 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        int int8 = multiDirectional7.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getIterations();
        int int11 = multiDirectional9.getEvaluations();
        int int12 = multiDirectional9.getMaxIterations();
        double[] doubleArray13 = new double[] {};
        multiDirectional9.setStartConfiguration(doubleArray13);
        multiDirectional7.setStartConfiguration(doubleArray13);
        multiDirectional0.setStartConfiguration(doubleArray13);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 10, 100.0d);
        multiDirectional19.setMaxIterations(52);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        int int25 = multiDirectional22.getEvaluations();
        multiDirectional22.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int31 = multiDirectional30.getIterations();
        multiDirectional30.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int35 = multiDirectional34.getIterations();
        int int36 = multiDirectional34.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int38 = multiDirectional37.getMaxEvaluations();
        int int39 = multiDirectional37.getMaxIterations();
        double[] doubleArray41 = new double[] { 100 };
        multiDirectional37.setStartConfiguration(doubleArray41);
        int int43 = multiDirectional37.getEvaluations();
        int int44 = multiDirectional37.getMaxIterations();
        int int45 = multiDirectional37.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional46.setMaxIterations(100);
        int int49 = multiDirectional46.getEvaluations();
        multiDirectional46.setMaxEvaluations((int) ' ');
        double[] doubleArray52 = new double[] {};
        double[][] doubleArray53 = new double[][] { doubleArray52 };
        multiDirectional46.setStartConfiguration(doubleArray53);
        multiDirectional37.setStartConfiguration(doubleArray53);
        multiDirectional34.setStartConfiguration(doubleArray53);
        multiDirectional30.setStartConfiguration(doubleArray53);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional58 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int59 = multiDirectional58.getMaxEvaluations();
        multiDirectional58.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker62 = multiDirectional58.getConvergenceChecker();
        double[] doubleArray63 = new double[] {};
        multiDirectional58.setStartConfiguration(doubleArray63);
        multiDirectional30.setStartConfiguration(doubleArray63);
        multiDirectional22.setStartConfiguration(doubleArray63);
        multiDirectional19.setStartConfiguration(doubleArray63);
        multiDirectional0.setStartConfiguration(doubleArray63);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker62);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1L, (double) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 10, (double) 1L);
        multiDirectional5.setMaxIterations((int) (short) -1);
        int int8 = multiDirectional5.getEvaluations();
        multiDirectional5.setMaxIterations((int) (short) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getIterations();
        int int13 = multiDirectional11.getMaxEvaluations();
        multiDirectional11.setMaxEvaluations(2147483647);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int17 = multiDirectional16.getMaxEvaluations();
        int int18 = multiDirectional16.getMaxIterations();
        double[] doubleArray20 = new double[] { 100 };
        multiDirectional16.setStartConfiguration(doubleArray20);
        multiDirectional11.setStartConfiguration(doubleArray20);
        multiDirectional5.setStartConfiguration(doubleArray20);
        multiDirectional2.setStartConfiguration(doubleArray20);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        double[] doubleArray5 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray5);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        int int9 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxIterations((int) (short) 10);
        multiDirectional0.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = multiDirectional0.getConvergenceChecker();
        int int15 = multiDirectional0.getMaxIterations();
        int int16 = multiDirectional0.getIterations();
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction17 = null;
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int20 = multiDirectional19.getMaxEvaluations();
        int int21 = multiDirectional19.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        int int25 = multiDirectional22.getEvaluations();
        multiDirectional22.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional22.getConvergenceChecker();
        multiDirectional22.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        int int34 = multiDirectional31.getEvaluations();
        multiDirectional31.setMaxEvaluations((int) ' ');
        double[] doubleArray37 = new double[] {};
        double[][] doubleArray38 = new double[][] { doubleArray37 };
        multiDirectional31.setStartConfiguration(doubleArray38);
        multiDirectional22.setStartConfiguration(doubleArray38);
        multiDirectional19.setStartConfiguration(doubleArray38);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional42.setMaxIterations(100);
        int int45 = multiDirectional42.getMaxEvaluations();
        multiDirectional42.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker48 = multiDirectional42.getConvergenceChecker();
        int int49 = multiDirectional42.getMaxIterations();
        int int50 = multiDirectional42.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker51 = multiDirectional42.getConvergenceChecker();
        multiDirectional19.setConvergenceChecker(realConvergenceChecker51);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional53.setMaxIterations(100);
        multiDirectional53.setMaxEvaluations((int) (short) 1);
        multiDirectional53.setMaxEvaluations((int) (short) 1);
        multiDirectional53.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional62 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int63 = multiDirectional62.getMaxEvaluations();
        int int64 = multiDirectional62.getMaxIterations();
        double[] doubleArray66 = new double[] { 100 };
        multiDirectional62.setStartConfiguration(doubleArray66);
        int int68 = multiDirectional62.getMaxEvaluations();
        int int69 = multiDirectional62.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional70 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int71 = multiDirectional70.getMaxEvaluations();
        int int72 = multiDirectional70.getMaxIterations();
        double[] doubleArray74 = new double[] { 100 };
        multiDirectional70.setStartConfiguration(doubleArray74);
        multiDirectional62.setStartConfiguration(doubleArray74);
        multiDirectional53.setStartConfiguration(doubleArray74);
        multiDirectional19.setStartConfiguration(doubleArray74);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair79 = multiDirectional0.optimize(multivariateRealFunction17, goalType18, doubleArray74);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 100 + "'", int49 == 100);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker51);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2147483647 + "'", int72 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional2.setMaxIterations(10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = null;
        multiDirectional5.setConvergenceChecker(realConvergenceChecker7);
        int int9 = multiDirectional5.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional10.setMaxIterations(100);
        int int13 = multiDirectional10.getEvaluations();
        multiDirectional10.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional10.getConvergenceChecker();
        multiDirectional10.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int20 = multiDirectional19.getMaxEvaluations();
        multiDirectional19.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = multiDirectional19.getConvergenceChecker();
        double[] doubleArray24 = new double[] {};
        multiDirectional19.setStartConfiguration(doubleArray24);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = multiDirectional19.getConvergenceChecker();
        int int27 = multiDirectional19.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional28.setMaxIterations(100);
        int int31 = multiDirectional28.getEvaluations();
        multiDirectional28.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional34.setMaxIterations(100);
        int int37 = multiDirectional34.getEvaluations();
        multiDirectional34.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional40.setMaxIterations(100);
        int int43 = multiDirectional40.getEvaluations();
        multiDirectional40.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker46 = multiDirectional40.getConvergenceChecker();
        multiDirectional34.setConvergenceChecker(realConvergenceChecker46);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int49 = multiDirectional48.getMaxEvaluations();
        multiDirectional48.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker52 = multiDirectional48.getConvergenceChecker();
        double[] doubleArray53 = new double[] {};
        multiDirectional48.setStartConfiguration(doubleArray53);
        multiDirectional34.setStartConfiguration(doubleArray53);
        multiDirectional28.setStartConfiguration(doubleArray53);
        multiDirectional19.setStartConfiguration(doubleArray53);
        multiDirectional10.setStartConfiguration(doubleArray53);
        multiDirectional5.setStartConfiguration(doubleArray53);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional60 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int61 = multiDirectional60.getIterations();
        int int62 = multiDirectional60.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker63 = multiDirectional60.getConvergenceChecker();
        multiDirectional5.setConvergenceChecker(realConvergenceChecker63);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker63);
        multiDirectional2.setMaxEvaluations((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker52);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker63);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker2 = multiDirectional0.getConvergenceChecker();
        int int3 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getMaxEvaluations();
        int int6 = multiDirectional4.getMaxIterations();
        double[] doubleArray8 = new double[] { 100 };
        multiDirectional4.setStartConfiguration(doubleArray8);
        multiDirectional0.setStartConfiguration(doubleArray8);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = multiDirectional0.getConvergenceChecker();
        int int12 = multiDirectional0.getMaxEvaluations();
        int int13 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) -1, (double) 52);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker2 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations(0);
        java.lang.Class<?> wildcardClass5 = multiDirectional0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        int int3 = multiDirectional0.getEvaluations();
        int int4 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional5.setMaxIterations(100);
        int int8 = multiDirectional5.getEvaluations();
        multiDirectional5.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = multiDirectional5.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional12.setMaxIterations(100);
        int int15 = multiDirectional12.getEvaluations();
        multiDirectional12.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional18.getConvergenceChecker();
        multiDirectional12.setConvergenceChecker(realConvergenceChecker24);
        multiDirectional5.setConvergenceChecker(realConvergenceChecker24);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional27 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional27.setMaxIterations(100);
        multiDirectional27.setMaxEvaluations((int) (short) 1);
        multiDirectional27.setMaxEvaluations((int) (short) 1);
        int int34 = multiDirectional27.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional35.setMaxIterations(100);
        int int38 = multiDirectional35.getEvaluations();
        multiDirectional35.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional41.setMaxIterations(100);
        int int44 = multiDirectional41.getEvaluations();
        multiDirectional41.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker47 = multiDirectional41.getConvergenceChecker();
        multiDirectional35.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional27.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional5.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker47);
        int int52 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations(10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker55 = multiDirectional0.getConvergenceChecker();
        int int56 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations(10);
        int int59 = multiDirectional0.getIterations();
        int int60 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        int int5 = multiDirectional0.getMaxIterations();
        int int6 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional7.setMaxIterations(100);
        multiDirectional7.setMaxEvaluations((int) (short) 1);
        int int12 = multiDirectional7.getEvaluations();
        multiDirectional7.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional7.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker15);
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction17 = null;
        org.apache.commons.math.optimization.GoalType goalType18 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = multiDirectional21.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional26.setMaxIterations(100);
        multiDirectional26.setMaxEvaluations((int) (short) 1);
        int int31 = multiDirectional26.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxEvaluations();
        multiDirectional32.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker36 = multiDirectional32.getConvergenceChecker();
        double[] doubleArray37 = new double[] {};
        multiDirectional32.setStartConfiguration(doubleArray37);
        multiDirectional26.setStartConfiguration(doubleArray37);
        multiDirectional25.setStartConfiguration(doubleArray37);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional41.setMaxIterations(100);
        int int44 = multiDirectional41.getEvaluations();
        multiDirectional41.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional47 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional47.setMaxIterations(100);
        int int50 = multiDirectional47.getEvaluations();
        multiDirectional47.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker53 = multiDirectional47.getConvergenceChecker();
        multiDirectional41.setConvergenceChecker(realConvergenceChecker53);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int56 = multiDirectional55.getMaxEvaluations();
        multiDirectional55.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker59 = multiDirectional55.getConvergenceChecker();
        double[] doubleArray60 = new double[] {};
        multiDirectional55.setStartConfiguration(doubleArray60);
        multiDirectional41.setStartConfiguration(doubleArray60);
        multiDirectional25.setStartConfiguration(doubleArray60);
        multiDirectional21.setStartConfiguration(doubleArray60);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair65 = multiDirectional0.optimize(multivariateRealFunction17, goalType18, doubleArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertNotNull(realConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker59);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        multiDirectional0.setMaxIterations((int) (byte) 1);
        multiDirectional0.setMaxEvaluations((int) '#');
        multiDirectional0.setMaxEvaluations((int) (short) 10);
        int int11 = multiDirectional0.getEvaluations();
        int int12 = multiDirectional0.getMaxEvaluations();
        int int13 = multiDirectional0.getMaxEvaluations();
        int int14 = multiDirectional0.getMaxIterations();
        int int15 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(10.0d, (double) 32);
        int int3 = multiDirectional2.getIterations();
        int int4 = multiDirectional2.getEvaluations();
        multiDirectional2.setMaxEvaluations((int) '4');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int8 = multiDirectional7.getMaxEvaluations();
        multiDirectional7.setMaxIterations((int) (byte) 0);
        int int11 = multiDirectional7.getMaxEvaluations();
        multiDirectional7.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional14.setMaxIterations(100);
        multiDirectional14.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional14.getConvergenceChecker();
        multiDirectional7.setConvergenceChecker(realConvergenceChecker19);
        multiDirectional7.setMaxEvaluations(2147483647);
        int int23 = multiDirectional7.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int25 = multiDirectional24.getMaxEvaluations();
        int int26 = multiDirectional24.getEvaluations();
        int int27 = multiDirectional24.getMaxEvaluations();
        int int28 = multiDirectional24.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getIterations();
        int int31 = multiDirectional29.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxEvaluations();
        int int34 = multiDirectional32.getMaxIterations();
        double[] doubleArray36 = new double[] { 100 };
        multiDirectional32.setStartConfiguration(doubleArray36);
        int int38 = multiDirectional32.getEvaluations();
        int int39 = multiDirectional32.getMaxIterations();
        int int40 = multiDirectional32.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional41.setMaxIterations(100);
        int int44 = multiDirectional41.getEvaluations();
        multiDirectional41.setMaxEvaluations((int) ' ');
        double[] doubleArray47 = new double[] {};
        double[][] doubleArray48 = new double[][] { doubleArray47 };
        multiDirectional41.setStartConfiguration(doubleArray48);
        multiDirectional32.setStartConfiguration(doubleArray48);
        multiDirectional29.setStartConfiguration(doubleArray48);
        multiDirectional24.setStartConfiguration(doubleArray48);
        multiDirectional7.setStartConfiguration(doubleArray48);
        multiDirectional2.setStartConfiguration(doubleArray48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getMaxIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        int int5 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) '4');
        multiDirectional2.setMaxIterations((int) (short) 1);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        int int7 = multiDirectional0.getMaxIterations();
        int int8 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getMaxEvaluations();
        multiDirectional11.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional11.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int17 = multiDirectional16.getMaxEvaluations();
        multiDirectional16.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker20 = multiDirectional16.getConvergenceChecker();
        multiDirectional11.setConvergenceChecker(realConvergenceChecker20);
        int int22 = multiDirectional11.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional23.setMaxIterations(100);
        int int26 = multiDirectional23.getEvaluations();
        multiDirectional23.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional29.setMaxIterations(100);
        int int32 = multiDirectional29.getEvaluations();
        multiDirectional29.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker35 = multiDirectional29.getConvergenceChecker();
        multiDirectional23.setConvergenceChecker(realConvergenceChecker35);
        multiDirectional11.setConvergenceChecker(realConvergenceChecker35);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker35);
        multiDirectional0.setMaxIterations((int) (byte) 0);
        multiDirectional0.setMaxEvaluations((int) ' ');
        int int43 = multiDirectional0.getMaxIterations();
        int int44 = multiDirectional0.getIterations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator45 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.iterateSimplex(realPointValuePairComparator45);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.optimization.OptimizationException; message: org.apache.commons.math.MaxIterationsExceededException: Maximal number of iterations (0) exceeded");
        } catch (org.apache.commons.math.optimization.OptimizationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional7.setMaxIterations(100);
        int int10 = multiDirectional7.getEvaluations();
        multiDirectional7.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional13.setMaxIterations(100);
        int int16 = multiDirectional13.getEvaluations();
        multiDirectional13.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional13.getConvergenceChecker();
        multiDirectional7.setConvergenceChecker(realConvergenceChecker19);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker19);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        multiDirectional22.setMaxEvaluations((int) (short) 1);
        multiDirectional22.setMaxEvaluations((int) (short) 1);
        int int29 = multiDirectional22.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional30.setMaxIterations(100);
        int int33 = multiDirectional30.getEvaluations();
        multiDirectional30.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional36.setMaxIterations(100);
        int int39 = multiDirectional36.getEvaluations();
        multiDirectional36.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = multiDirectional36.getConvergenceChecker();
        multiDirectional30.setConvergenceChecker(realConvergenceChecker42);
        multiDirectional22.setConvergenceChecker(realConvergenceChecker42);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker42);
        int int46 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker47 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int49 = multiDirectional48.getMaxEvaluations();
        int int50 = multiDirectional48.getMaxIterations();
        double[] doubleArray52 = new double[] { 100 };
        multiDirectional48.setStartConfiguration(doubleArray52);
        int int54 = multiDirectional48.getEvaluations();
        int int55 = multiDirectional48.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker56 = multiDirectional48.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker56);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional60 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10, (double) ' ');
        int int61 = multiDirectional60.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional62 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional62.setMaxIterations(100);
        multiDirectional62.setMaxEvaluations((int) (short) 1);
        multiDirectional62.setMaxEvaluations((int) (short) 1);
        int int69 = multiDirectional62.getMaxEvaluations();
        int int70 = multiDirectional62.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker71 = multiDirectional62.getConvergenceChecker();
        multiDirectional60.setConvergenceChecker(realConvergenceChecker71);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker71);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker74 = multiDirectional0.getConvergenceChecker();
        int int75 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(realConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker71);
        org.junit.Assert.assertNotNull(realConvergenceChecker74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        double[] doubleArray5 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray5);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        int int9 = multiDirectional0.getIterations();
        int int10 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        multiDirectional13.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional13.getConvergenceChecker();
        multiDirectional13.setMaxEvaluations((int) (byte) -1);
        int int20 = multiDirectional13.getIterations();
        int int21 = multiDirectional13.getIterations();
        int int22 = multiDirectional13.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional23.setMaxIterations(100);
        int int26 = multiDirectional23.getMaxEvaluations();
        multiDirectional23.setMaxEvaluations((int) (byte) 1);
        multiDirectional23.setMaxEvaluations((int) (byte) 1);
        multiDirectional23.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int34 = multiDirectional33.getMaxEvaluations();
        int int35 = multiDirectional33.getMaxIterations();
        double[] doubleArray37 = new double[] { 100 };
        multiDirectional33.setStartConfiguration(doubleArray37);
        multiDirectional23.setStartConfiguration(doubleArray37);
        multiDirectional13.setStartConfiguration(doubleArray37);
        multiDirectional0.setStartConfiguration(doubleArray37);
        multiDirectional0.setMaxEvaluations((int) (byte) 100);
        int int44 = multiDirectional0.getIterations();
        int int45 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, 100.0d);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional2.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getIterations();
        int int6 = multiDirectional4.getMaxEvaluations();
        int int7 = multiDirectional4.getEvaluations();
        int int8 = multiDirectional4.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        int int11 = multiDirectional9.getMaxIterations();
        double[] doubleArray13 = new double[] { 100 };
        multiDirectional9.setStartConfiguration(doubleArray13);
        int int15 = multiDirectional9.getEvaluations();
        int int16 = multiDirectional9.getMaxIterations();
        int int17 = multiDirectional9.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        double[] doubleArray24 = new double[] {};
        double[][] doubleArray25 = new double[][] { doubleArray24 };
        multiDirectional18.setStartConfiguration(doubleArray25);
        multiDirectional9.setStartConfiguration(doubleArray25);
        multiDirectional4.setStartConfiguration(doubleArray25);
        multiDirectional2.setStartConfiguration(doubleArray25);
        int int30 = multiDirectional2.getMaxEvaluations();
        int int31 = multiDirectional2.getIterations();
        int int32 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional33.setMaxIterations(100);
        int int36 = multiDirectional33.getMaxEvaluations();
        int int37 = multiDirectional33.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int39 = multiDirectional38.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker40 = null;
        multiDirectional38.setConvergenceChecker(realConvergenceChecker40);
        int int42 = multiDirectional38.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int44 = multiDirectional43.getMaxEvaluations();
        int int45 = multiDirectional43.getMaxIterations();
        double[] doubleArray47 = new double[] { 100 };
        multiDirectional43.setStartConfiguration(doubleArray47);
        int int49 = multiDirectional43.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional50 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int51 = multiDirectional50.getMaxEvaluations();
        int int52 = multiDirectional50.getMaxIterations();
        double[] doubleArray54 = new double[] { 100 };
        multiDirectional50.setStartConfiguration(doubleArray54);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker56 = multiDirectional50.getConvergenceChecker();
        multiDirectional43.setConvergenceChecker(realConvergenceChecker56);
        multiDirectional38.setConvergenceChecker(realConvergenceChecker56);
        multiDirectional38.setMaxEvaluations((int) (short) 1);
        int int61 = multiDirectional38.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional62 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional62.setMaxIterations(100);
        int int65 = multiDirectional62.getEvaluations();
        multiDirectional62.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional68 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional68.setMaxIterations(100);
        int int71 = multiDirectional68.getEvaluations();
        multiDirectional68.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker74 = multiDirectional68.getConvergenceChecker();
        multiDirectional62.setConvergenceChecker(realConvergenceChecker74);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional76 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int77 = multiDirectional76.getMaxEvaluations();
        multiDirectional76.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker80 = multiDirectional76.getConvergenceChecker();
        double[] doubleArray81 = new double[] {};
        multiDirectional76.setStartConfiguration(doubleArray81);
        multiDirectional62.setStartConfiguration(doubleArray81);
        multiDirectional38.setStartConfiguration(doubleArray81);
        multiDirectional33.setStartConfiguration(doubleArray81);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker86 = multiDirectional33.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker86);
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker74);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2147483647 + "'", int77 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker80);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker86);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, 100.0d);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional2.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getIterations();
        int int6 = multiDirectional4.getMaxEvaluations();
        int int7 = multiDirectional4.getEvaluations();
        int int8 = multiDirectional4.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        int int11 = multiDirectional9.getMaxIterations();
        double[] doubleArray13 = new double[] { 100 };
        multiDirectional9.setStartConfiguration(doubleArray13);
        int int15 = multiDirectional9.getEvaluations();
        int int16 = multiDirectional9.getMaxIterations();
        int int17 = multiDirectional9.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        double[] doubleArray24 = new double[] {};
        double[][] doubleArray25 = new double[][] { doubleArray24 };
        multiDirectional18.setStartConfiguration(doubleArray25);
        multiDirectional9.setStartConfiguration(doubleArray25);
        multiDirectional4.setStartConfiguration(doubleArray25);
        multiDirectional2.setStartConfiguration(doubleArray25);
        int int30 = multiDirectional2.getMaxEvaluations();
        int int31 = multiDirectional2.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional32.setMaxIterations(100);
        multiDirectional32.setMaxEvaluations((int) (byte) 10);
        multiDirectional32.setMaxIterations(0);
        int int39 = multiDirectional32.getEvaluations();
        int int40 = multiDirectional32.getMaxIterations();
        int int41 = multiDirectional32.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int43 = multiDirectional42.getMaxEvaluations();
        int int44 = multiDirectional42.getMaxIterations();
        double[] doubleArray46 = new double[] { 100 };
        multiDirectional42.setStartConfiguration(doubleArray46);
        int int48 = multiDirectional42.getMaxEvaluations();
        int int49 = multiDirectional42.getEvaluations();
        int int50 = multiDirectional42.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        multiDirectional53.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int57 = multiDirectional56.getIterations();
        int int58 = multiDirectional56.getEvaluations();
        int int59 = multiDirectional56.getMaxIterations();
        double[] doubleArray60 = new double[] {};
        multiDirectional56.setStartConfiguration(doubleArray60);
        multiDirectional53.setStartConfiguration(doubleArray60);
        multiDirectional42.setStartConfiguration(doubleArray60);
        multiDirectional32.setStartConfiguration(doubleArray60);
        multiDirectional2.setStartConfiguration(doubleArray60);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional66 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int67 = multiDirectional66.getIterations();
        int int68 = multiDirectional66.getMaxEvaluations();
        int int69 = multiDirectional66.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker70 = multiDirectional66.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker70);
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 10 + "'", int41 == 10);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker70);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        multiDirectional0.setMaxEvaluations(97);
        multiDirectional0.setMaxIterations(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) 1L);
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction3 = null;
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional8.setMaxIterations(100);
        int int11 = multiDirectional8.getMaxEvaluations();
        multiDirectional8.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = multiDirectional8.getConvergenceChecker();
        int int15 = multiDirectional8.getMaxIterations();
        multiDirectional8.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getMaxEvaluations();
        int int20 = multiDirectional18.getMaxIterations();
        double[] doubleArray22 = new double[] { 100 };
        multiDirectional18.setStartConfiguration(doubleArray22);
        multiDirectional8.setStartConfiguration(doubleArray22);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional27 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int28 = multiDirectional27.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional29.setMaxIterations(100);
        multiDirectional29.setMaxEvaluations((int) (short) 1);
        int int34 = multiDirectional29.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int36 = multiDirectional35.getMaxEvaluations();
        multiDirectional35.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker39 = multiDirectional35.getConvergenceChecker();
        double[] doubleArray40 = new double[] {};
        multiDirectional35.setStartConfiguration(doubleArray40);
        multiDirectional29.setStartConfiguration(doubleArray40);
        multiDirectional27.setStartConfiguration(doubleArray40);
        multiDirectional8.setStartConfiguration(doubleArray40);
        multiDirectional7.setStartConfiguration(doubleArray40);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair46 = multiDirectional2.optimize(multivariateRealFunction3, goalType4, doubleArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        int int4 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker5);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional9.setMaxEvaluations((int) (short) -1);
        int int12 = multiDirectional9.getIterations();
        multiDirectional9.setMaxIterations((int) '#');
        int int15 = multiDirectional9.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional16.setMaxIterations(100);
        int int19 = multiDirectional16.getEvaluations();
        multiDirectional16.setMaxEvaluations((int) ' ');
        double[] doubleArray22 = new double[] {};
        double[][] doubleArray23 = new double[][] { doubleArray22 };
        multiDirectional16.setStartConfiguration(doubleArray23);
        multiDirectional9.setStartConfiguration(doubleArray23);
        multiDirectional0.setStartConfiguration(doubleArray23);
        multiDirectional0.setMaxIterations((int) (short) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional29.setMaxIterations(100);
        multiDirectional29.setMaxEvaluations((int) (short) 1);
        multiDirectional29.setMaxEvaluations((int) (short) 1);
        int int36 = multiDirectional29.getMaxEvaluations();
        int int37 = multiDirectional29.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int39 = multiDirectional38.getMaxEvaluations();
        int int40 = multiDirectional38.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional41.setMaxIterations(100);
        int int44 = multiDirectional41.getEvaluations();
        multiDirectional41.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker47 = multiDirectional41.getConvergenceChecker();
        multiDirectional41.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional50 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional50.setMaxIterations(100);
        int int53 = multiDirectional50.getEvaluations();
        multiDirectional50.setMaxEvaluations((int) ' ');
        double[] doubleArray56 = new double[] {};
        double[][] doubleArray57 = new double[][] { doubleArray56 };
        multiDirectional50.setStartConfiguration(doubleArray57);
        multiDirectional41.setStartConfiguration(doubleArray57);
        multiDirectional38.setStartConfiguration(doubleArray57);
        multiDirectional29.setStartConfiguration(doubleArray57);
        multiDirectional0.setStartConfiguration(doubleArray57);
        int int63 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 10, (double) 1L);
        int int3 = multiDirectional2.getMaxIterations();
        int int4 = multiDirectional2.getIterations();
        int int5 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional6.getConvergenceChecker();
        int int13 = multiDirectional6.getMaxIterations();
        int int14 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional19.setMaxEvaluations((int) (short) -1);
        int int22 = multiDirectional19.getIterations();
        multiDirectional19.setMaxIterations((int) '#');
        int int25 = multiDirectional19.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional26.setMaxIterations(100);
        int int29 = multiDirectional26.getEvaluations();
        multiDirectional26.setMaxEvaluations((int) ' ');
        double[] doubleArray32 = new double[] {};
        double[][] doubleArray33 = new double[][] { doubleArray32 };
        multiDirectional26.setStartConfiguration(doubleArray33);
        multiDirectional19.setStartConfiguration(doubleArray33);
        multiDirectional6.setStartConfiguration(doubleArray33);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (-1.0d));
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        int int46 = multiDirectional45.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional47 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int48 = multiDirectional47.getIterations();
        int int49 = multiDirectional47.getEvaluations();
        int int50 = multiDirectional47.getMaxIterations();
        double[] doubleArray51 = new double[] {};
        multiDirectional47.setStartConfiguration(doubleArray51);
        multiDirectional45.setStartConfiguration(doubleArray51);
        multiDirectional42.setStartConfiguration(doubleArray51);
        multiDirectional39.setStartConfiguration(doubleArray51);
        multiDirectional6.setStartConfiguration(doubleArray51);
        multiDirectional2.setStartConfiguration(doubleArray51);
        multiDirectional2.setMaxEvaluations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker60 = multiDirectional2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35 + "'", int25 == 35);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker60);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional2.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getMaxEvaluations();
        int int6 = multiDirectional4.getMaxIterations();
        double[] doubleArray8 = new double[] { 100 };
        multiDirectional4.setStartConfiguration(doubleArray8);
        int int10 = multiDirectional4.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getMaxEvaluations();
        int int13 = multiDirectional11.getMaxIterations();
        double[] doubleArray15 = new double[] { 100 };
        multiDirectional11.setStartConfiguration(doubleArray15);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional11.getConvergenceChecker();
        multiDirectional4.setConvergenceChecker(realConvergenceChecker17);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker17);
        int int20 = multiDirectional2.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker21 = multiDirectional2.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 'a');
        multiDirectional24.setMaxIterations((int) (byte) 1);
        int int27 = multiDirectional24.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getIterations();
        int int30 = multiDirectional28.getEvaluations();
        int int31 = multiDirectional28.getMaxIterations();
        multiDirectional28.setMaxIterations((int) (byte) -1);
        int int34 = multiDirectional28.getIterations();
        int int35 = multiDirectional28.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional36.setMaxIterations(100);
        int int39 = multiDirectional36.getEvaluations();
        multiDirectional36.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional42.setMaxIterations(100);
        int int45 = multiDirectional42.getEvaluations();
        multiDirectional42.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional48.setMaxIterations(100);
        int int51 = multiDirectional48.getEvaluations();
        multiDirectional48.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker54 = multiDirectional48.getConvergenceChecker();
        multiDirectional42.setConvergenceChecker(realConvergenceChecker54);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int57 = multiDirectional56.getMaxEvaluations();
        multiDirectional56.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker60 = multiDirectional56.getConvergenceChecker();
        double[] doubleArray61 = new double[] {};
        multiDirectional56.setStartConfiguration(doubleArray61);
        multiDirectional42.setStartConfiguration(doubleArray61);
        multiDirectional36.setStartConfiguration(doubleArray61);
        multiDirectional28.setStartConfiguration(doubleArray61);
        multiDirectional24.setStartConfiguration(doubleArray61);
        multiDirectional2.setStartConfiguration(doubleArray61);
        int int68 = multiDirectional2.getIterations();
        int int69 = multiDirectional2.getMaxIterations();
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker60);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2147483647 + "'", int69 == 2147483647);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations((int) ' ');
        int int10 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) '4');
        int int13 = multiDirectional0.getMaxIterations();
        int int14 = multiDirectional0.getMaxEvaluations();
        int int15 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxIterations(52);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 32, (double) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int6 = multiDirectional5.getIterations();
        multiDirectional5.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getIterations();
        int int11 = multiDirectional9.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int13 = multiDirectional12.getMaxEvaluations();
        int int14 = multiDirectional12.getMaxIterations();
        double[] doubleArray16 = new double[] { 100 };
        multiDirectional12.setStartConfiguration(doubleArray16);
        int int18 = multiDirectional12.getEvaluations();
        int int19 = multiDirectional12.getMaxIterations();
        int int20 = multiDirectional12.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional21.setMaxIterations(100);
        int int24 = multiDirectional21.getEvaluations();
        multiDirectional21.setMaxEvaluations((int) ' ');
        double[] doubleArray27 = new double[] {};
        double[][] doubleArray28 = new double[][] { doubleArray27 };
        multiDirectional21.setStartConfiguration(doubleArray28);
        multiDirectional12.setStartConfiguration(doubleArray28);
        multiDirectional9.setStartConfiguration(doubleArray28);
        multiDirectional5.setStartConfiguration(doubleArray28);
        multiDirectional2.setStartConfiguration(doubleArray28);
        int int34 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker2 = multiDirectional0.getConvergenceChecker();
        int int3 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getIterations();
        int int6 = multiDirectional4.getMaxEvaluations();
        multiDirectional4.setMaxEvaluations(2147483647);
        int int9 = multiDirectional4.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        multiDirectional10.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional16.setMaxEvaluations((int) (short) -1);
        int int19 = multiDirectional16.getIterations();
        multiDirectional16.setMaxIterations((int) '#');
        int int22 = multiDirectional16.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional23.setMaxIterations(100);
        int int26 = multiDirectional23.getEvaluations();
        multiDirectional23.setMaxEvaluations((int) ' ');
        double[] doubleArray29 = new double[] {};
        double[][] doubleArray30 = new double[][] { doubleArray29 };
        multiDirectional23.setStartConfiguration(doubleArray30);
        multiDirectional16.setStartConfiguration(doubleArray30);
        multiDirectional10.setStartConfiguration(doubleArray30);
        multiDirectional4.setStartConfiguration(doubleArray30);
        multiDirectional0.setStartConfiguration(doubleArray30);
        int int36 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional0.getConvergenceChecker();
        int int38 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 0, (double) (short) 100);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getMaxEvaluations();
        int int7 = multiDirectional0.getEvaluations();
        int int8 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        int int11 = multiDirectional9.getMaxIterations();
        double[] doubleArray13 = new double[] { 100 };
        multiDirectional9.setStartConfiguration(doubleArray13);
        int int15 = multiDirectional9.getEvaluations();
        int int16 = multiDirectional9.getMaxIterations();
        int int17 = multiDirectional9.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional18.getConvergenceChecker();
        multiDirectional18.setMaxIterations(1);
        multiDirectional18.setMaxIterations((int) (short) -1);
        int int29 = multiDirectional18.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int31 = multiDirectional30.getMaxEvaluations();
        multiDirectional30.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker34 = multiDirectional30.getConvergenceChecker();
        double[] doubleArray35 = new double[] {};
        multiDirectional30.setStartConfiguration(doubleArray35);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional30.getConvergenceChecker();
        int int38 = multiDirectional30.getMaxEvaluations();
        int int39 = multiDirectional30.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int41 = multiDirectional40.getIterations();
        int int42 = multiDirectional40.getMaxEvaluations();
        int int43 = multiDirectional40.getEvaluations();
        int int44 = multiDirectional40.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int46 = multiDirectional45.getMaxEvaluations();
        int int47 = multiDirectional45.getMaxIterations();
        double[] doubleArray49 = new double[] { 100 };
        multiDirectional45.setStartConfiguration(doubleArray49);
        int int51 = multiDirectional45.getEvaluations();
        int int52 = multiDirectional45.getMaxIterations();
        int int53 = multiDirectional45.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional54 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional54.setMaxIterations(100);
        int int57 = multiDirectional54.getEvaluations();
        multiDirectional54.setMaxEvaluations((int) ' ');
        double[] doubleArray60 = new double[] {};
        double[][] doubleArray61 = new double[][] { doubleArray60 };
        multiDirectional54.setStartConfiguration(doubleArray61);
        multiDirectional45.setStartConfiguration(doubleArray61);
        multiDirectional40.setStartConfiguration(doubleArray61);
        multiDirectional30.setStartConfiguration(doubleArray61);
        multiDirectional18.setStartConfiguration(doubleArray61);
        multiDirectional9.setStartConfiguration(doubleArray61);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional70 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int71 = multiDirectional70.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional72 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional72.setMaxIterations(100);
        multiDirectional72.setMaxEvaluations((int) (short) 1);
        int int77 = multiDirectional72.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional78 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int79 = multiDirectional78.getMaxEvaluations();
        multiDirectional78.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker82 = multiDirectional78.getConvergenceChecker();
        double[] doubleArray83 = new double[] {};
        multiDirectional78.setStartConfiguration(doubleArray83);
        multiDirectional72.setStartConfiguration(doubleArray83);
        multiDirectional70.setStartConfiguration(doubleArray83);
        multiDirectional9.setStartConfiguration(doubleArray83);
        multiDirectional0.setStartConfiguration(doubleArray83);
        int int89 = multiDirectional0.getMaxEvaluations();
        int int90 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (short) 1);
        multiDirectional0.setMaxEvaluations((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker34);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2147483647 + "'", int79 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker82);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 2147483647 + "'", int89 == 2147483647);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2147483647 + "'", int90 == 2147483647);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1.0f, 10.0d);
        int int3 = multiDirectional2.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional4.setMaxIterations(100);
        multiDirectional4.setMaxEvaluations((int) (short) 1);
        multiDirectional4.setMaxIterations((int) (byte) 1);
        multiDirectional4.setMaxEvaluations((int) '#');
        int int13 = multiDirectional4.getIterations();
        int int14 = multiDirectional4.getMaxEvaluations();
        multiDirectional4.setMaxEvaluations(0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional20.setMaxIterations(100);
        int int23 = multiDirectional20.getMaxEvaluations();
        multiDirectional20.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = multiDirectional20.getConvergenceChecker();
        int int27 = multiDirectional20.getMaxIterations();
        int int28 = multiDirectional20.getMaxEvaluations();
        multiDirectional20.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional33.setMaxEvaluations((int) (short) -1);
        int int36 = multiDirectional33.getIterations();
        multiDirectional33.setMaxIterations((int) '#');
        int int39 = multiDirectional33.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional40.setMaxIterations(100);
        int int43 = multiDirectional40.getEvaluations();
        multiDirectional40.setMaxEvaluations((int) ' ');
        double[] doubleArray46 = new double[] {};
        double[][] doubleArray47 = new double[][] { doubleArray46 };
        multiDirectional40.setStartConfiguration(doubleArray47);
        multiDirectional33.setStartConfiguration(doubleArray47);
        multiDirectional20.setStartConfiguration(doubleArray47);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (-1.0d));
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional59 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        int int60 = multiDirectional59.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional61 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int62 = multiDirectional61.getIterations();
        int int63 = multiDirectional61.getEvaluations();
        int int64 = multiDirectional61.getMaxIterations();
        double[] doubleArray65 = new double[] {};
        multiDirectional61.setStartConfiguration(doubleArray65);
        multiDirectional59.setStartConfiguration(doubleArray65);
        multiDirectional56.setStartConfiguration(doubleArray65);
        multiDirectional53.setStartConfiguration(doubleArray65);
        multiDirectional20.setStartConfiguration(doubleArray65);
        multiDirectional19.setStartConfiguration(doubleArray65);
        multiDirectional4.setStartConfiguration(doubleArray65);
        multiDirectional2.setStartConfiguration(doubleArray65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getMaxEvaluations();
        int int7 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional8.setMaxIterations(100);
        int int11 = multiDirectional8.getEvaluations();
        multiDirectional8.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional14.setMaxIterations(100);
        int int17 = multiDirectional14.getEvaluations();
        multiDirectional14.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker20 = multiDirectional14.getConvergenceChecker();
        multiDirectional8.setConvergenceChecker(realConvergenceChecker20);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int23 = multiDirectional22.getMaxEvaluations();
        int int24 = multiDirectional22.getMaxIterations();
        double[] doubleArray26 = new double[] { 100 };
        multiDirectional22.setStartConfiguration(doubleArray26);
        int int28 = multiDirectional22.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getIterations();
        int int31 = multiDirectional29.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxEvaluations();
        int int34 = multiDirectional32.getMaxIterations();
        double[] doubleArray36 = new double[] { 100 };
        multiDirectional32.setStartConfiguration(doubleArray36);
        int int38 = multiDirectional32.getEvaluations();
        int int39 = multiDirectional32.getMaxIterations();
        int int40 = multiDirectional32.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional41.setMaxIterations(100);
        int int44 = multiDirectional41.getEvaluations();
        multiDirectional41.setMaxEvaluations((int) ' ');
        double[] doubleArray47 = new double[] {};
        double[][] doubleArray48 = new double[][] { doubleArray47 };
        multiDirectional41.setStartConfiguration(doubleArray48);
        multiDirectional32.setStartConfiguration(doubleArray48);
        multiDirectional29.setStartConfiguration(doubleArray48);
        multiDirectional22.setStartConfiguration(doubleArray48);
        multiDirectional8.setStartConfiguration(doubleArray48);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker54 = multiDirectional8.getConvergenceChecker();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker55 = multiDirectional8.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker55);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker57 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxIterations(32);
        java.lang.Class<?> wildcardClass60 = multiDirectional0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertNotNull(realConvergenceChecker54);
        org.junit.Assert.assertNotNull(realConvergenceChecker55);
        org.junit.Assert.assertNotNull(realConvergenceChecker57);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 100L, (double) (-1L));
        int int3 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        multiDirectional2.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional7.setMaxEvaluations((int) (short) -1);
        int int10 = multiDirectional7.getIterations();
        int int11 = multiDirectional7.getIterations();
        int int12 = multiDirectional7.getIterations();
        multiDirectional7.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int16 = multiDirectional15.getMaxEvaluations();
        multiDirectional15.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional15.getConvergenceChecker();
        int int20 = multiDirectional15.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional21.setMaxIterations(100);
        int int24 = multiDirectional21.getEvaluations();
        multiDirectional21.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional27 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional27.setMaxIterations(100);
        int int30 = multiDirectional27.getEvaluations();
        multiDirectional27.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional33.setMaxIterations(100);
        int int36 = multiDirectional33.getEvaluations();
        multiDirectional33.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker39 = multiDirectional33.getConvergenceChecker();
        multiDirectional27.setConvergenceChecker(realConvergenceChecker39);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int42 = multiDirectional41.getMaxEvaluations();
        multiDirectional41.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker45 = multiDirectional41.getConvergenceChecker();
        double[] doubleArray46 = new double[] {};
        multiDirectional41.setStartConfiguration(doubleArray46);
        multiDirectional27.setStartConfiguration(doubleArray46);
        multiDirectional21.setStartConfiguration(doubleArray46);
        multiDirectional15.setStartConfiguration(doubleArray46);
        multiDirectional7.setStartConfiguration(doubleArray46);
        multiDirectional2.setStartConfiguration(doubleArray46);
        int int53 = multiDirectional2.getMaxEvaluations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator54 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker45);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getEvaluations();
        multiDirectional6.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional12.setMaxIterations(100);
        int int15 = multiDirectional12.getEvaluations();
        multiDirectional12.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional12.getConvergenceChecker();
        multiDirectional6.setConvergenceChecker(realConvergenceChecker18);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker18);
        int int21 = multiDirectional0.getMaxIterations();
        int int22 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = multiDirectional0.getConvergenceChecker();
        int int24 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        multiDirectional0.setMaxIterations((int) (byte) 1);
        multiDirectional0.setMaxEvaluations((int) '#');
        multiDirectional0.setMaxIterations((int) (byte) 10);
        multiDirectional0.setMaxEvaluations(1);
        int int13 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker14);
        multiDirectional0.setMaxEvaluations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        multiDirectional18.setMaxEvaluations((int) (short) 1);
        multiDirectional18.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker25 = multiDirectional18.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int27 = multiDirectional26.getMaxEvaluations();
        int int28 = multiDirectional26.getMaxIterations();
        double[] doubleArray30 = new double[] { 100 };
        multiDirectional26.setStartConfiguration(doubleArray30);
        int int32 = multiDirectional26.getEvaluations();
        int int33 = multiDirectional26.getMaxIterations();
        int int34 = multiDirectional26.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional35.setMaxIterations(100);
        int int38 = multiDirectional35.getEvaluations();
        multiDirectional35.setMaxEvaluations((int) ' ');
        double[] doubleArray41 = new double[] {};
        double[][] doubleArray42 = new double[][] { doubleArray41 };
        multiDirectional35.setStartConfiguration(doubleArray42);
        multiDirectional26.setStartConfiguration(doubleArray42);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int46 = multiDirectional45.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional47 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional47.setMaxIterations(100);
        multiDirectional47.setMaxEvaluations((int) (short) 1);
        multiDirectional47.setMaxEvaluations((int) (short) 1);
        int int54 = multiDirectional47.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional55.setMaxIterations(100);
        int int58 = multiDirectional55.getEvaluations();
        multiDirectional55.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional61 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional61.setMaxIterations(100);
        int int64 = multiDirectional61.getEvaluations();
        multiDirectional61.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker67 = multiDirectional61.getConvergenceChecker();
        multiDirectional55.setConvergenceChecker(realConvergenceChecker67);
        multiDirectional47.setConvergenceChecker(realConvergenceChecker67);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional70 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int71 = multiDirectional70.getMaxEvaluations();
        int int72 = multiDirectional70.getMaxIterations();
        double[] doubleArray74 = new double[] { 100 };
        multiDirectional70.setStartConfiguration(doubleArray74);
        int int76 = multiDirectional70.getMaxEvaluations();
        int int77 = multiDirectional70.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional78 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int79 = multiDirectional78.getMaxEvaluations();
        int int80 = multiDirectional78.getMaxIterations();
        double[] doubleArray82 = new double[] { 100 };
        multiDirectional78.setStartConfiguration(doubleArray82);
        multiDirectional70.setStartConfiguration(doubleArray82);
        multiDirectional47.setStartConfiguration(doubleArray82);
        multiDirectional45.setStartConfiguration(doubleArray82);
        multiDirectional26.setStartConfiguration(doubleArray82);
        multiDirectional18.setStartConfiguration(doubleArray82);
        multiDirectional18.setMaxEvaluations((int) (byte) -1);
        int int91 = multiDirectional18.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker92 = multiDirectional18.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker92);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker67);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2147483647 + "'", int72 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2147483647 + "'", int76 == 2147483647);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2147483647 + "'", int79 == 2147483647);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 2147483647 + "'", int80 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 100 + "'", int91 == 100);
        org.junit.Assert.assertNotNull(realConvergenceChecker92);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 100, (double) (-1L));
        int int3 = multiDirectional2.getIterations();
        int int4 = multiDirectional2.getEvaluations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) 1L);
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction3 = null;
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional5.setMaxIterations(100);
        int int8 = multiDirectional5.getMaxEvaluations();
        multiDirectional5.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = multiDirectional5.getConvergenceChecker();
        int int12 = multiDirectional5.getMaxIterations();
        multiDirectional5.setMaxIterations((int) (byte) 100);
        int int15 = multiDirectional5.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional5.getConvergenceChecker();
        int int17 = multiDirectional5.getIterations();
        int int18 = multiDirectional5.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional19.setMaxIterations(100);
        multiDirectional19.setMaxEvaluations((int) (short) 1);
        multiDirectional19.setMaxEvaluations((int) (short) 1);
        int int26 = multiDirectional19.getIterations();
        int int27 = multiDirectional19.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional28.setMaxIterations(100);
        int int31 = multiDirectional28.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional32.setMaxIterations(100);
        multiDirectional32.setMaxEvaluations((int) (short) 1);
        int int37 = multiDirectional32.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int39 = multiDirectional38.getMaxEvaluations();
        multiDirectional38.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = multiDirectional38.getConvergenceChecker();
        double[] doubleArray43 = new double[] {};
        multiDirectional38.setStartConfiguration(doubleArray43);
        multiDirectional32.setStartConfiguration(doubleArray43);
        multiDirectional28.setStartConfiguration(doubleArray43);
        int int47 = multiDirectional28.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional50 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (double) '4');
        int int51 = multiDirectional50.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional52 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int53 = multiDirectional52.getMaxEvaluations();
        multiDirectional52.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker56 = multiDirectional52.getConvergenceChecker();
        int int57 = multiDirectional52.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional58 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional58.setMaxIterations(100);
        int int61 = multiDirectional58.getEvaluations();
        multiDirectional58.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional64 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional64.setMaxIterations(100);
        int int67 = multiDirectional64.getEvaluations();
        multiDirectional64.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional70 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional70.setMaxIterations(100);
        int int73 = multiDirectional70.getEvaluations();
        multiDirectional70.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker76 = multiDirectional70.getConvergenceChecker();
        multiDirectional64.setConvergenceChecker(realConvergenceChecker76);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional78 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int79 = multiDirectional78.getMaxEvaluations();
        multiDirectional78.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker82 = multiDirectional78.getConvergenceChecker();
        double[] doubleArray83 = new double[] {};
        multiDirectional78.setStartConfiguration(doubleArray83);
        multiDirectional64.setStartConfiguration(doubleArray83);
        multiDirectional58.setStartConfiguration(doubleArray83);
        multiDirectional52.setStartConfiguration(doubleArray83);
        multiDirectional50.setStartConfiguration(doubleArray83);
        multiDirectional28.setStartConfiguration(doubleArray83);
        multiDirectional19.setStartConfiguration(doubleArray83);
        multiDirectional5.setStartConfiguration(doubleArray83);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair92 = multiDirectional2.optimize(multivariateRealFunction3, goalType4, doubleArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker42);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2147483647 + "'", int79 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker82);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(100.0d, (double) (-1));
        int int3 = multiDirectional2.getMaxIterations();
        int int4 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional1 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int2 = multiDirectional1.getMaxEvaluations();
        multiDirectional1.setMaxIterations((int) (byte) 0);
        int int5 = multiDirectional1.getMaxEvaluations();
        multiDirectional1.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional8.setMaxIterations(100);
        multiDirectional8.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional8.getConvergenceChecker();
        multiDirectional1.setConvergenceChecker(realConvergenceChecker13);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker13);
        multiDirectional0.setMaxIterations((int) (byte) -1);
        multiDirectional0.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 100L, (double) 100L);
        int int23 = multiDirectional22.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int25 = multiDirectional24.getMaxEvaluations();
        multiDirectional24.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional24.getConvergenceChecker();
        double[] doubleArray29 = new double[] {};
        multiDirectional24.setStartConfiguration(doubleArray29);
        multiDirectional22.setStartConfiguration(doubleArray29);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker32 = multiDirectional22.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional35.setMaxEvaluations((int) (short) -1);
        int int38 = multiDirectional35.getIterations();
        multiDirectional35.setMaxIterations((int) '#');
        int int41 = multiDirectional35.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional42.setMaxIterations(100);
        int int45 = multiDirectional42.getEvaluations();
        multiDirectional42.setMaxEvaluations((int) ' ');
        double[] doubleArray48 = new double[] {};
        double[][] doubleArray49 = new double[][] { doubleArray48 };
        multiDirectional42.setStartConfiguration(doubleArray49);
        multiDirectional35.setStartConfiguration(doubleArray49);
        int int52 = multiDirectional35.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker53 = multiDirectional35.getConvergenceChecker();
        multiDirectional22.setConvergenceChecker(realConvergenceChecker53);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker53);
        java.lang.Class<?> wildcardClass56 = multiDirectional0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker53);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int4 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional3.getConvergenceChecker();
        double[] doubleArray8 = new double[] {};
        multiDirectional3.setStartConfiguration(doubleArray8);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional3.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker10);
        int int12 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional7.setMaxIterations(100);
        int int10 = multiDirectional7.getEvaluations();
        multiDirectional7.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional13.setMaxIterations(100);
        int int16 = multiDirectional13.getEvaluations();
        multiDirectional13.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional13.getConvergenceChecker();
        multiDirectional7.setConvergenceChecker(realConvergenceChecker19);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker19);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        multiDirectional22.setMaxEvaluations((int) (short) 1);
        multiDirectional22.setMaxEvaluations((int) (short) 1);
        int int29 = multiDirectional22.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional30.setMaxIterations(100);
        int int33 = multiDirectional30.getEvaluations();
        multiDirectional30.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional36.setMaxIterations(100);
        int int39 = multiDirectional36.getEvaluations();
        multiDirectional36.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = multiDirectional36.getConvergenceChecker();
        multiDirectional30.setConvergenceChecker(realConvergenceChecker42);
        multiDirectional22.setConvergenceChecker(realConvergenceChecker42);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker42);
        int int46 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker47 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int49 = multiDirectional48.getMaxEvaluations();
        int int50 = multiDirectional48.getMaxIterations();
        double[] doubleArray52 = new double[] { 100 };
        multiDirectional48.setStartConfiguration(doubleArray52);
        int int54 = multiDirectional48.getEvaluations();
        int int55 = multiDirectional48.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker56 = multiDirectional48.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker56);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional60 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10, (double) ' ');
        int int61 = multiDirectional60.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional62 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional62.setMaxIterations(100);
        multiDirectional62.setMaxEvaluations((int) (short) 1);
        multiDirectional62.setMaxEvaluations((int) (short) 1);
        int int69 = multiDirectional62.getMaxEvaluations();
        int int70 = multiDirectional62.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker71 = multiDirectional62.getConvergenceChecker();
        multiDirectional60.setConvergenceChecker(realConvergenceChecker71);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker71);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker74 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional75 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional75.setMaxIterations(100);
        multiDirectional75.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker80 = multiDirectional75.getConvergenceChecker();
        int int81 = multiDirectional75.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker82 = multiDirectional75.getConvergenceChecker();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker83 = multiDirectional75.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker83);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertNotNull(realConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker56);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 1 + "'", int69 == 1);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker71);
        org.junit.Assert.assertNotNull(realConvergenceChecker74);
        org.junit.Assert.assertNotNull(realConvergenceChecker80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker82);
        org.junit.Assert.assertNotNull(realConvergenceChecker83);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        int int5 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        multiDirectional6.setMaxEvaluations((int) (short) 1);
        multiDirectional6.setMaxEvaluations((int) (short) 1);
        int int13 = multiDirectional6.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional14.setMaxIterations(100);
        int int17 = multiDirectional14.getEvaluations();
        multiDirectional14.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional20.setMaxIterations(100);
        int int23 = multiDirectional20.getEvaluations();
        multiDirectional20.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = multiDirectional20.getConvergenceChecker();
        multiDirectional14.setConvergenceChecker(realConvergenceChecker26);
        multiDirectional6.setConvergenceChecker(realConvergenceChecker26);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getIterations();
        int int31 = multiDirectional29.getEvaluations();
        int int32 = multiDirectional29.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional33.setMaxIterations(100);
        int int36 = multiDirectional33.getEvaluations();
        multiDirectional33.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker39 = multiDirectional33.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional40.setMaxIterations(100);
        int int43 = multiDirectional40.getEvaluations();
        multiDirectional40.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional46.setMaxIterations(100);
        int int49 = multiDirectional46.getEvaluations();
        multiDirectional46.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker52 = multiDirectional46.getConvergenceChecker();
        multiDirectional40.setConvergenceChecker(realConvergenceChecker52);
        multiDirectional33.setConvergenceChecker(realConvergenceChecker52);
        multiDirectional29.setConvergenceChecker(realConvergenceChecker52);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional56.setMaxIterations(100);
        int int59 = multiDirectional56.getEvaluations();
        multiDirectional56.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker62 = multiDirectional56.getConvergenceChecker();
        multiDirectional29.setConvergenceChecker(realConvergenceChecker62);
        multiDirectional6.setConvergenceChecker(realConvergenceChecker62);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional67 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker68 = multiDirectional67.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional69 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int70 = multiDirectional69.getMaxEvaluations();
        int int71 = multiDirectional69.getMaxIterations();
        double[] doubleArray73 = new double[] { 100 };
        multiDirectional69.setStartConfiguration(doubleArray73);
        int int75 = multiDirectional69.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional76 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int77 = multiDirectional76.getMaxEvaluations();
        int int78 = multiDirectional76.getMaxIterations();
        double[] doubleArray80 = new double[] { 100 };
        multiDirectional76.setStartConfiguration(doubleArray80);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker82 = multiDirectional76.getConvergenceChecker();
        multiDirectional69.setConvergenceChecker(realConvergenceChecker82);
        multiDirectional67.setConvergenceChecker(realConvergenceChecker82);
        multiDirectional6.setConvergenceChecker(realConvergenceChecker82);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker86 = multiDirectional6.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker86);
        int int88 = multiDirectional0.getMaxEvaluations();
        int int89 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker52);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker62);
        org.junit.Assert.assertNotNull(realConvergenceChecker68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2147483647 + "'", int70 == 2147483647);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2147483647 + "'", int77 == 2147483647);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2147483647 + "'", int78 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker82);
        org.junit.Assert.assertNotNull(realConvergenceChecker86);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 1 + "'", int88 == 1);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 100 + "'", int89 == 100);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (double) 35);
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction3 = null;
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1L, (double) 35);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), 100.0d);
        multiDirectional10.setMaxEvaluations((int) (short) 1);
        multiDirectional10.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int16 = multiDirectional15.getIterations();
        int int17 = multiDirectional15.getEvaluations();
        int int18 = multiDirectional15.getMaxIterations();
        multiDirectional15.setMaxIterations((int) (byte) -1);
        int int21 = multiDirectional15.getIterations();
        int int22 = multiDirectional15.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional23.setMaxIterations(100);
        int int26 = multiDirectional23.getEvaluations();
        multiDirectional23.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional29.setMaxIterations(100);
        int int32 = multiDirectional29.getEvaluations();
        multiDirectional29.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional35.setMaxIterations(100);
        int int38 = multiDirectional35.getEvaluations();
        multiDirectional35.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker41 = multiDirectional35.getConvergenceChecker();
        multiDirectional29.setConvergenceChecker(realConvergenceChecker41);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int44 = multiDirectional43.getMaxEvaluations();
        multiDirectional43.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker47 = multiDirectional43.getConvergenceChecker();
        double[] doubleArray48 = new double[] {};
        multiDirectional43.setStartConfiguration(doubleArray48);
        multiDirectional29.setStartConfiguration(doubleArray48);
        multiDirectional23.setStartConfiguration(doubleArray48);
        multiDirectional15.setStartConfiguration(doubleArray48);
        multiDirectional10.setStartConfiguration(doubleArray48);
        multiDirectional7.setStartConfiguration(doubleArray48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair55 = multiDirectional2.optimize(multivariateRealFunction3, goalType4, doubleArray48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        multiDirectional5.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = multiDirectional5.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker9);
        int int11 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        int int3 = multiDirectional0.getMaxEvaluations();
        int int4 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1), (double) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional8.setMaxIterations(100);
        int int11 = multiDirectional8.getEvaluations();
        multiDirectional8.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = multiDirectional8.getConvergenceChecker();
        multiDirectional8.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int18 = multiDirectional17.getMaxEvaluations();
        multiDirectional17.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker21 = multiDirectional17.getConvergenceChecker();
        double[] doubleArray22 = new double[] {};
        multiDirectional17.setStartConfiguration(doubleArray22);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional17.getConvergenceChecker();
        int int25 = multiDirectional17.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional26.setMaxIterations(100);
        int int29 = multiDirectional26.getEvaluations();
        multiDirectional26.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional32.setMaxIterations(100);
        int int35 = multiDirectional32.getEvaluations();
        multiDirectional32.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional38.setMaxIterations(100);
        int int41 = multiDirectional38.getEvaluations();
        multiDirectional38.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker44 = multiDirectional38.getConvergenceChecker();
        multiDirectional32.setConvergenceChecker(realConvergenceChecker44);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int47 = multiDirectional46.getMaxEvaluations();
        multiDirectional46.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker50 = multiDirectional46.getConvergenceChecker();
        double[] doubleArray51 = new double[] {};
        multiDirectional46.setStartConfiguration(doubleArray51);
        multiDirectional32.setStartConfiguration(doubleArray51);
        multiDirectional26.setStartConfiguration(doubleArray51);
        multiDirectional17.setStartConfiguration(doubleArray51);
        multiDirectional8.setStartConfiguration(doubleArray51);
        multiDirectional7.setStartConfiguration(doubleArray51);
        multiDirectional0.setStartConfiguration(doubleArray51);
        int int59 = multiDirectional0.getMaxEvaluations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator60 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.iterateSimplex(realPointValuePairComparator60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getMaxEvaluations();
        int int7 = multiDirectional0.getEvaluations();
        int int8 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        multiDirectional11.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int15 = multiDirectional14.getIterations();
        int int16 = multiDirectional14.getEvaluations();
        int int17 = multiDirectional14.getMaxIterations();
        double[] doubleArray18 = new double[] {};
        multiDirectional14.setStartConfiguration(doubleArray18);
        multiDirectional11.setStartConfiguration(doubleArray18);
        multiDirectional0.setStartConfiguration(doubleArray18);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int23 = multiDirectional22.getMaxEvaluations();
        int int24 = multiDirectional22.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional25.setMaxIterations(100);
        int int28 = multiDirectional25.getEvaluations();
        multiDirectional25.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker31 = multiDirectional25.getConvergenceChecker();
        multiDirectional25.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional34.setMaxIterations(100);
        int int37 = multiDirectional34.getEvaluations();
        multiDirectional34.setMaxEvaluations((int) ' ');
        double[] doubleArray40 = new double[] {};
        double[][] doubleArray41 = new double[][] { doubleArray40 };
        multiDirectional34.setStartConfiguration(doubleArray41);
        multiDirectional25.setStartConfiguration(doubleArray41);
        multiDirectional22.setStartConfiguration(doubleArray41);
        int int45 = multiDirectional22.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional46.setMaxIterations(100);
        int int49 = multiDirectional46.getMaxEvaluations();
        multiDirectional46.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker52 = multiDirectional46.getConvergenceChecker();
        int int53 = multiDirectional46.getMaxIterations();
        multiDirectional46.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int57 = multiDirectional56.getMaxEvaluations();
        int int58 = multiDirectional56.getMaxIterations();
        double[] doubleArray60 = new double[] { 100 };
        multiDirectional56.setStartConfiguration(doubleArray60);
        multiDirectional46.setStartConfiguration(doubleArray60);
        multiDirectional22.setStartConfiguration(doubleArray60);
        multiDirectional0.setStartConfiguration(doubleArray60);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 100 + "'", int53 == 100);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        double[] doubleArray5 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray5);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        int int9 = multiDirectional0.getIterations();
        int int10 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional15.setMaxEvaluations((int) (short) -1);
        int int18 = multiDirectional15.getIterations();
        multiDirectional15.setMaxIterations((int) '#');
        int int21 = multiDirectional15.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        int int25 = multiDirectional22.getEvaluations();
        multiDirectional22.setMaxEvaluations((int) ' ');
        double[] doubleArray28 = new double[] {};
        double[][] doubleArray29 = new double[][] { doubleArray28 };
        multiDirectional22.setStartConfiguration(doubleArray29);
        multiDirectional15.setStartConfiguration(doubleArray29);
        int int32 = multiDirectional15.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional15.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker33);
        int int35 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional36.setMaxIterations(100);
        int int39 = multiDirectional36.getEvaluations();
        multiDirectional36.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional42.setMaxIterations(100);
        int int45 = multiDirectional42.getEvaluations();
        multiDirectional42.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker48 = multiDirectional42.getConvergenceChecker();
        multiDirectional36.setConvergenceChecker(realConvergenceChecker48);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional50 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int51 = multiDirectional50.getMaxEvaluations();
        int int52 = multiDirectional50.getMaxIterations();
        double[] doubleArray54 = new double[] { 100 };
        multiDirectional50.setStartConfiguration(doubleArray54);
        int int56 = multiDirectional50.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int58 = multiDirectional57.getIterations();
        int int59 = multiDirectional57.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional60 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int61 = multiDirectional60.getMaxEvaluations();
        int int62 = multiDirectional60.getMaxIterations();
        double[] doubleArray64 = new double[] { 100 };
        multiDirectional60.setStartConfiguration(doubleArray64);
        int int66 = multiDirectional60.getEvaluations();
        int int67 = multiDirectional60.getMaxIterations();
        int int68 = multiDirectional60.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional69 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional69.setMaxIterations(100);
        int int72 = multiDirectional69.getEvaluations();
        multiDirectional69.setMaxEvaluations((int) ' ');
        double[] doubleArray75 = new double[] {};
        double[][] doubleArray76 = new double[][] { doubleArray75 };
        multiDirectional69.setStartConfiguration(doubleArray76);
        multiDirectional60.setStartConfiguration(doubleArray76);
        multiDirectional57.setStartConfiguration(doubleArray76);
        multiDirectional50.setStartConfiguration(doubleArray76);
        multiDirectional36.setStartConfiguration(doubleArray76);
        multiDirectional0.setStartConfiguration(doubleArray76);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker83 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker48);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2147483647 + "'", int62 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertNotNull(realConvergenceChecker83);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional5.setMaxIterations(100);
        int int8 = multiDirectional5.getEvaluations();
        multiDirectional5.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = multiDirectional5.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional12.setMaxIterations(100);
        int int15 = multiDirectional12.getEvaluations();
        multiDirectional12.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional18.getConvergenceChecker();
        multiDirectional12.setConvergenceChecker(realConvergenceChecker24);
        multiDirectional5.setConvergenceChecker(realConvergenceChecker24);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker24);
        int int28 = multiDirectional0.getMaxEvaluations();
        int int29 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional0.getConvergenceChecker();
        java.lang.Class<?> wildcardClass31 = realConvergenceChecker30.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional2.setMaxEvaluations((int) (short) -1);
        int int5 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        multiDirectional9.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional9.getConvergenceChecker();
        double[] doubleArray14 = new double[] {};
        multiDirectional9.setStartConfiguration(doubleArray14);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional9.getConvergenceChecker();
        multiDirectional6.setConvergenceChecker(realConvergenceChecker16);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        int int24 = multiDirectional23.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int26 = multiDirectional25.getIterations();
        int int27 = multiDirectional25.getEvaluations();
        int int28 = multiDirectional25.getMaxIterations();
        double[] doubleArray29 = new double[] {};
        multiDirectional25.setStartConfiguration(doubleArray29);
        multiDirectional23.setStartConfiguration(doubleArray29);
        multiDirectional20.setStartConfiguration(doubleArray29);
        multiDirectional6.setStartConfiguration(doubleArray29);
        multiDirectional2.setStartConfiguration(doubleArray29);
        int int35 = multiDirectional2.getIterations();
        int int36 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        int int5 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int4 = multiDirectional3.getMaxEvaluations();
        int int5 = multiDirectional3.getMaxIterations();
        double[] doubleArray7 = new double[] { 100 };
        multiDirectional3.setStartConfiguration(doubleArray7);
        int int9 = multiDirectional3.getEvaluations();
        int int10 = multiDirectional3.getMaxIterations();
        int int11 = multiDirectional3.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional12.setMaxIterations(100);
        int int15 = multiDirectional12.getEvaluations();
        multiDirectional12.setMaxEvaluations((int) ' ');
        double[] doubleArray18 = new double[] {};
        double[][] doubleArray19 = new double[][] { doubleArray18 };
        multiDirectional12.setStartConfiguration(doubleArray19);
        multiDirectional3.setStartConfiguration(doubleArray19);
        multiDirectional0.setStartConfiguration(doubleArray19);
        multiDirectional0.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional25.setMaxIterations(100);
        multiDirectional25.setMaxEvaluations((int) (short) 1);
        multiDirectional25.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker32 = multiDirectional25.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker32);
        int int34 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int36 = multiDirectional35.getMaxEvaluations();
        int int37 = multiDirectional35.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        int int41 = multiDirectional40.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = multiDirectional40.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int44 = multiDirectional43.getMaxEvaluations();
        int int45 = multiDirectional43.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional46.setMaxIterations(100);
        multiDirectional46.setMaxEvaluations((int) (short) 1);
        int int51 = multiDirectional46.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional52 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int53 = multiDirectional52.getMaxEvaluations();
        multiDirectional52.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker56 = multiDirectional52.getConvergenceChecker();
        double[] doubleArray57 = new double[] {};
        multiDirectional52.setStartConfiguration(doubleArray57);
        multiDirectional46.setStartConfiguration(doubleArray57);
        multiDirectional43.setStartConfiguration(doubleArray57);
        multiDirectional40.setStartConfiguration(doubleArray57);
        multiDirectional35.setStartConfiguration(doubleArray57);
        multiDirectional0.setStartConfiguration(doubleArray57);
        int int64 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(realConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker56);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 100.0f, (double) (short) 1);
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (double) '4');
        int int3 = multiDirectional2.getIterations();
        int int4 = multiDirectional2.getIterations();
        int int5 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional7.setMaxIterations(100);
        int int10 = multiDirectional7.getMaxEvaluations();
        multiDirectional7.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional7.getConvergenceChecker();
        int int14 = multiDirectional7.getMaxIterations();
        multiDirectional7.setMaxIterations((int) (byte) 100);
        int int17 = multiDirectional7.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional7.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker18);
        int int20 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(10);
        int int23 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional24.setMaxIterations(100);
        int int27 = multiDirectional24.getEvaluations();
        multiDirectional24.setMaxEvaluations((int) ' ');
        int int30 = multiDirectional24.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        int int34 = multiDirectional31.getEvaluations();
        multiDirectional31.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional31.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional38.setMaxIterations(100);
        int int41 = multiDirectional38.getEvaluations();
        multiDirectional38.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional44 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional44.setMaxIterations(100);
        int int47 = multiDirectional44.getEvaluations();
        multiDirectional44.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker50 = multiDirectional44.getConvergenceChecker();
        multiDirectional38.setConvergenceChecker(realConvergenceChecker50);
        multiDirectional31.setConvergenceChecker(realConvergenceChecker50);
        multiDirectional24.setConvergenceChecker(realConvergenceChecker50);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional54 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional54.setMaxIterations(100);
        int int57 = multiDirectional54.getMaxEvaluations();
        multiDirectional54.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker60 = multiDirectional54.getConvergenceChecker();
        int int61 = multiDirectional54.getMaxIterations();
        int int62 = multiDirectional54.getMaxEvaluations();
        multiDirectional54.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional67 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional67.setMaxEvaluations((int) (short) -1);
        int int70 = multiDirectional67.getIterations();
        multiDirectional67.setMaxIterations((int) '#');
        int int73 = multiDirectional67.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional74 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional74.setMaxIterations(100);
        int int77 = multiDirectional74.getEvaluations();
        multiDirectional74.setMaxEvaluations((int) ' ');
        double[] doubleArray80 = new double[] {};
        double[][] doubleArray81 = new double[][] { doubleArray80 };
        multiDirectional74.setStartConfiguration(doubleArray81);
        multiDirectional67.setStartConfiguration(doubleArray81);
        multiDirectional54.setStartConfiguration(doubleArray81);
        multiDirectional24.setStartConfiguration(doubleArray81);
        multiDirectional0.setStartConfiguration(doubleArray81);
        int int87 = multiDirectional0.getMaxIterations();
        int int88 = multiDirectional0.getIterations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator89 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.iterateSimplex(realPointValuePairComparator89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker50);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 100 + "'", int61 == 100);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 35 + "'", int73 == 35);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2147483647 + "'", int87 == 2147483647);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 0 + "'", int88 == 0);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker2 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker2);
        int int4 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = multiDirectional0.getConvergenceChecker();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = realConvergenceChecker5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNull(realConvergenceChecker5);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        int int7 = multiDirectional0.getIterations();
        int int8 = multiDirectional0.getEvaluations();
        int int9 = multiDirectional0.getIterations();
        int int10 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getMaxEvaluations();
        int int13 = multiDirectional11.getMaxIterations();
        double[] doubleArray15 = new double[] { 100 };
        multiDirectional11.setStartConfiguration(doubleArray15);
        int int17 = multiDirectional11.getMaxEvaluations();
        int int18 = multiDirectional11.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional11.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker19);
        int int21 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional24.setMaxEvaluations((int) (short) -1);
        int int27 = multiDirectional24.getMaxIterations();
        multiDirectional24.setMaxIterations((int) (short) -1);
        int int30 = multiDirectional24.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, 0.0d);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional36.setMaxEvaluations((int) (short) -1);
        int int39 = multiDirectional36.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional42.setMaxEvaluations((int) (short) -1);
        int int45 = multiDirectional42.getIterations();
        multiDirectional42.setMaxIterations((int) '#');
        int int48 = multiDirectional42.getMaxIterations();
        int int49 = multiDirectional42.getMaxEvaluations();
        int int50 = multiDirectional42.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional51 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional51.setMaxIterations(100);
        int int54 = multiDirectional51.getEvaluations();
        multiDirectional51.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional57.setMaxIterations(100);
        int int60 = multiDirectional57.getEvaluations();
        multiDirectional57.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker63 = multiDirectional57.getConvergenceChecker();
        multiDirectional51.setConvergenceChecker(realConvergenceChecker63);
        multiDirectional51.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional67 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional67.setMaxIterations(100);
        int int70 = multiDirectional67.getEvaluations();
        multiDirectional67.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker73 = multiDirectional67.getConvergenceChecker();
        multiDirectional67.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional76 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional76.setMaxIterations(100);
        int int79 = multiDirectional76.getEvaluations();
        multiDirectional76.setMaxEvaluations((int) ' ');
        double[] doubleArray82 = new double[] {};
        double[][] doubleArray83 = new double[][] { doubleArray82 };
        multiDirectional76.setStartConfiguration(doubleArray83);
        multiDirectional67.setStartConfiguration(doubleArray83);
        multiDirectional51.setStartConfiguration(doubleArray83);
        multiDirectional42.setStartConfiguration(doubleArray83);
        multiDirectional36.setStartConfiguration(doubleArray83);
        multiDirectional33.setStartConfiguration(doubleArray83);
        multiDirectional24.setStartConfiguration(doubleArray83);
        multiDirectional0.setStartConfiguration(doubleArray83);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker63);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker73);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertArrayEquals(doubleArray82, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray83);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getMaxEvaluations();
        int int7 = multiDirectional0.getEvaluations();
        int int8 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getIterations();
        int int11 = multiDirectional9.getMaxEvaluations();
        int int12 = multiDirectional9.getEvaluations();
        int int13 = multiDirectional9.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int15 = multiDirectional14.getIterations();
        int int16 = multiDirectional14.getEvaluations();
        int int17 = multiDirectional14.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional18.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional25.setMaxIterations(100);
        int int28 = multiDirectional25.getEvaluations();
        multiDirectional25.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        int int34 = multiDirectional31.getEvaluations();
        multiDirectional31.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional31.getConvergenceChecker();
        multiDirectional25.setConvergenceChecker(realConvergenceChecker37);
        multiDirectional18.setConvergenceChecker(realConvergenceChecker37);
        multiDirectional14.setConvergenceChecker(realConvergenceChecker37);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional41.setMaxIterations(100);
        int int44 = multiDirectional41.getEvaluations();
        multiDirectional41.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker47 = multiDirectional41.getConvergenceChecker();
        multiDirectional14.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional9.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker47);
        int int51 = multiDirectional0.getEvaluations();
        int int52 = multiDirectional0.getMaxEvaluations();
        int int53 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional9.setMaxIterations(100);
        int int12 = multiDirectional9.getEvaluations();
        multiDirectional9.setMaxEvaluations((int) ' ');
        double[] doubleArray15 = new double[] {};
        double[][] doubleArray16 = new double[][] { doubleArray15 };
        multiDirectional9.setStartConfiguration(doubleArray16);
        multiDirectional0.setStartConfiguration(doubleArray16);
        int int19 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional20.setMaxIterations(100);
        int int23 = multiDirectional20.getEvaluations();
        multiDirectional20.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional26.setMaxIterations(100);
        int int29 = multiDirectional26.getEvaluations();
        multiDirectional26.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker32 = multiDirectional26.getConvergenceChecker();
        multiDirectional20.setConvergenceChecker(realConvergenceChecker32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int35 = multiDirectional34.getMaxEvaluations();
        int int36 = multiDirectional34.getMaxIterations();
        double[] doubleArray38 = new double[] { 100 };
        multiDirectional34.setStartConfiguration(doubleArray38);
        int int40 = multiDirectional34.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int42 = multiDirectional41.getIterations();
        int int43 = multiDirectional41.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional44 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int45 = multiDirectional44.getMaxEvaluations();
        int int46 = multiDirectional44.getMaxIterations();
        double[] doubleArray48 = new double[] { 100 };
        multiDirectional44.setStartConfiguration(doubleArray48);
        int int50 = multiDirectional44.getEvaluations();
        int int51 = multiDirectional44.getMaxIterations();
        int int52 = multiDirectional44.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional53.setMaxIterations(100);
        int int56 = multiDirectional53.getEvaluations();
        multiDirectional53.setMaxEvaluations((int) ' ');
        double[] doubleArray59 = new double[] {};
        double[][] doubleArray60 = new double[][] { doubleArray59 };
        multiDirectional53.setStartConfiguration(doubleArray60);
        multiDirectional44.setStartConfiguration(doubleArray60);
        multiDirectional41.setStartConfiguration(doubleArray60);
        multiDirectional34.setStartConfiguration(doubleArray60);
        multiDirectional20.setStartConfiguration(doubleArray60);
        multiDirectional0.setStartConfiguration(doubleArray60);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker67 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertNotNull(realConvergenceChecker67);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) (byte) 0);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        multiDirectional5.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = multiDirectional5.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker9);
        int int11 = multiDirectional0.getEvaluations();
        int int12 = multiDirectional0.getEvaluations();
        int int13 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int17 = multiDirectional16.getIterations();
        int int18 = multiDirectional16.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional16.getConvergenceChecker();
        int int20 = multiDirectional16.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker21 = multiDirectional16.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker21);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = multiDirectional25.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker26);
        multiDirectional0.setMaxIterations(100);
        int int30 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker21);
        org.junit.Assert.assertNotNull(realConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = multiDirectional0.getConvergenceChecker();
        int int6 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations((int) '4');
        int int9 = multiDirectional0.getEvaluations();
        int int10 = multiDirectional0.getIterations();
        java.lang.Class<?> wildcardClass11 = multiDirectional0.getClass();
        org.junit.Assert.assertNotNull(realConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getEvaluations();
        multiDirectional6.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional12.setMaxIterations(100);
        int int15 = multiDirectional12.getEvaluations();
        multiDirectional12.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional12.getConvergenceChecker();
        multiDirectional6.setConvergenceChecker(realConvergenceChecker18);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker18);
        int int21 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        int int27 = multiDirectional26.getIterations();
        multiDirectional26.setMaxEvaluations(1);
        int int30 = multiDirectional26.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        multiDirectional31.setMaxEvaluations((int) (byte) 10);
        multiDirectional31.setMaxIterations(0);
        int int38 = multiDirectional31.getEvaluations();
        int int39 = multiDirectional31.getMaxIterations();
        int int40 = multiDirectional31.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int42 = multiDirectional41.getMaxEvaluations();
        int int43 = multiDirectional41.getMaxIterations();
        double[] doubleArray45 = new double[] { 100 };
        multiDirectional41.setStartConfiguration(doubleArray45);
        int int47 = multiDirectional41.getMaxEvaluations();
        int int48 = multiDirectional41.getEvaluations();
        int int49 = multiDirectional41.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional52 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        multiDirectional52.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int56 = multiDirectional55.getIterations();
        int int57 = multiDirectional55.getEvaluations();
        int int58 = multiDirectional55.getMaxIterations();
        double[] doubleArray59 = new double[] {};
        multiDirectional55.setStartConfiguration(doubleArray59);
        multiDirectional52.setStartConfiguration(doubleArray59);
        multiDirectional41.setStartConfiguration(doubleArray59);
        multiDirectional31.setStartConfiguration(doubleArray59);
        multiDirectional26.setStartConfiguration(doubleArray59);
        multiDirectional0.setStartConfiguration(doubleArray59);
        int int66 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction67 = null;
        org.apache.commons.math.optimization.GoalType goalType68 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional69 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional69.setMaxIterations(100);
        int int72 = multiDirectional69.getEvaluations();
        multiDirectional69.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional75 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional75.setMaxIterations(100);
        int int78 = multiDirectional75.getEvaluations();
        multiDirectional75.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker81 = multiDirectional75.getConvergenceChecker();
        multiDirectional69.setConvergenceChecker(realConvergenceChecker81);
        int int83 = multiDirectional69.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional86 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        multiDirectional86.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional89 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int90 = multiDirectional89.getIterations();
        int int91 = multiDirectional89.getEvaluations();
        int int92 = multiDirectional89.getMaxIterations();
        double[] doubleArray93 = new double[] {};
        multiDirectional89.setStartConfiguration(doubleArray93);
        multiDirectional86.setStartConfiguration(doubleArray93);
        multiDirectional69.setStartConfiguration(doubleArray93);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair97 = multiDirectional0.optimize(multivariateRealFunction67, goalType68, doubleArray93);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 100 + "'", int66 == 100);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 32 + "'", int83 == 32);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 0 + "'", int90 == 0);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 2147483647 + "'", int92 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray93);
        org.junit.Assert.assertArrayEquals(doubleArray93, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) ' ');
        int int6 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional7.setMaxIterations(100);
        int int10 = multiDirectional7.getEvaluations();
        multiDirectional7.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional7.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional14.setMaxIterations(100);
        int int17 = multiDirectional14.getEvaluations();
        multiDirectional14.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional20.setMaxIterations(100);
        int int23 = multiDirectional20.getEvaluations();
        multiDirectional20.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = multiDirectional20.getConvergenceChecker();
        multiDirectional14.setConvergenceChecker(realConvergenceChecker26);
        multiDirectional7.setConvergenceChecker(realConvergenceChecker26);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker26);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional0.getConvergenceChecker();
        int int31 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations(10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int35 = multiDirectional34.getMaxEvaluations();
        multiDirectional34.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = multiDirectional34.getConvergenceChecker();
        double[] doubleArray39 = new double[] {};
        multiDirectional34.setStartConfiguration(doubleArray39);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker41 = multiDirectional34.getConvergenceChecker();
        int int42 = multiDirectional34.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional43.setMaxIterations(100);
        int int46 = multiDirectional43.getEvaluations();
        multiDirectional43.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional49 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional49.setMaxIterations(100);
        int int52 = multiDirectional49.getEvaluations();
        multiDirectional49.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional55.setMaxIterations(100);
        int int58 = multiDirectional55.getEvaluations();
        multiDirectional55.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker61 = multiDirectional55.getConvergenceChecker();
        multiDirectional49.setConvergenceChecker(realConvergenceChecker61);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional63 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int64 = multiDirectional63.getMaxEvaluations();
        multiDirectional63.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker67 = multiDirectional63.getConvergenceChecker();
        double[] doubleArray68 = new double[] {};
        multiDirectional63.setStartConfiguration(doubleArray68);
        multiDirectional49.setStartConfiguration(doubleArray68);
        multiDirectional43.setStartConfiguration(doubleArray68);
        multiDirectional34.setStartConfiguration(doubleArray68);
        multiDirectional0.setStartConfiguration(doubleArray68);
        int int74 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker26);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker38);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker67);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        int int7 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations((int) (byte) 100);
        int int10 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        int int13 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int15 = multiDirectional14.getMaxEvaluations();
        int int16 = multiDirectional14.getEvaluations();
        int int17 = multiDirectional14.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional24.setMaxIterations(100);
        int int27 = multiDirectional24.getEvaluations();
        multiDirectional24.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional24.getConvergenceChecker();
        multiDirectional18.setConvergenceChecker(realConvergenceChecker30);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxEvaluations();
        int int34 = multiDirectional32.getMaxIterations();
        double[] doubleArray36 = new double[] { 100 };
        multiDirectional32.setStartConfiguration(doubleArray36);
        int int38 = multiDirectional32.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getIterations();
        int int41 = multiDirectional39.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int43 = multiDirectional42.getMaxEvaluations();
        int int44 = multiDirectional42.getMaxIterations();
        double[] doubleArray46 = new double[] { 100 };
        multiDirectional42.setStartConfiguration(doubleArray46);
        int int48 = multiDirectional42.getEvaluations();
        int int49 = multiDirectional42.getMaxIterations();
        int int50 = multiDirectional42.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional51 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional51.setMaxIterations(100);
        int int54 = multiDirectional51.getEvaluations();
        multiDirectional51.setMaxEvaluations((int) ' ');
        double[] doubleArray57 = new double[] {};
        double[][] doubleArray58 = new double[][] { doubleArray57 };
        multiDirectional51.setStartConfiguration(doubleArray58);
        multiDirectional42.setStartConfiguration(doubleArray58);
        multiDirectional39.setStartConfiguration(doubleArray58);
        multiDirectional32.setStartConfiguration(doubleArray58);
        multiDirectional18.setStartConfiguration(doubleArray58);
        multiDirectional14.setStartConfiguration(doubleArray58);
        int int65 = multiDirectional14.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional68 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional69 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional69.setMaxIterations(100);
        multiDirectional69.setMaxEvaluations((int) (short) 1);
        int int74 = multiDirectional69.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional75 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int76 = multiDirectional75.getMaxEvaluations();
        multiDirectional75.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker79 = multiDirectional75.getConvergenceChecker();
        double[] doubleArray80 = new double[] {};
        multiDirectional75.setStartConfiguration(doubleArray80);
        multiDirectional69.setStartConfiguration(doubleArray80);
        multiDirectional68.setStartConfiguration(doubleArray80);
        multiDirectional14.setStartConfiguration(doubleArray80);
        multiDirectional0.setStartConfiguration(doubleArray80);
        int int86 = multiDirectional0.getMaxIterations();
        int int87 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker88 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2147483647 + "'", int76 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker79);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int86 + "' != '" + 0 + "'", int86 == 0);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker88);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(1);
        multiDirectional0.setMaxEvaluations(1);
        int int6 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int8 = multiDirectional7.getMaxEvaluations();
        multiDirectional7.setMaxEvaluations(1);
        int int11 = multiDirectional7.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int13 = multiDirectional12.getMaxEvaluations();
        multiDirectional12.setMaxIterations((int) (byte) 0);
        int int16 = multiDirectional12.getMaxEvaluations();
        multiDirectional12.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1), (double) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        int int25 = multiDirectional22.getEvaluations();
        multiDirectional22.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional22.getConvergenceChecker();
        multiDirectional22.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int32 = multiDirectional31.getMaxEvaluations();
        multiDirectional31.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker35 = multiDirectional31.getConvergenceChecker();
        double[] doubleArray36 = new double[] {};
        multiDirectional31.setStartConfiguration(doubleArray36);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = multiDirectional31.getConvergenceChecker();
        int int39 = multiDirectional31.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional40.setMaxIterations(100);
        int int43 = multiDirectional40.getEvaluations();
        multiDirectional40.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional46.setMaxIterations(100);
        int int49 = multiDirectional46.getEvaluations();
        multiDirectional46.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional52 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional52.setMaxIterations(100);
        int int55 = multiDirectional52.getEvaluations();
        multiDirectional52.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker58 = multiDirectional52.getConvergenceChecker();
        multiDirectional46.setConvergenceChecker(realConvergenceChecker58);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional60 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int61 = multiDirectional60.getMaxEvaluations();
        multiDirectional60.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker64 = multiDirectional60.getConvergenceChecker();
        double[] doubleArray65 = new double[] {};
        multiDirectional60.setStartConfiguration(doubleArray65);
        multiDirectional46.setStartConfiguration(doubleArray65);
        multiDirectional40.setStartConfiguration(doubleArray65);
        multiDirectional31.setStartConfiguration(doubleArray65);
        multiDirectional22.setStartConfiguration(doubleArray65);
        multiDirectional21.setStartConfiguration(doubleArray65);
        multiDirectional12.setStartConfiguration(doubleArray65);
        multiDirectional7.setStartConfiguration(doubleArray65);
        multiDirectional0.setStartConfiguration(doubleArray65);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2147483647 + "'", int39 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker64);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional2.setMaxEvaluations((int) (short) -1);
        multiDirectional2.setMaxIterations(0);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 100L, (double) 100L);
        int int3 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getMaxEvaluations();
        multiDirectional4.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker8 = multiDirectional4.getConvergenceChecker();
        double[] doubleArray9 = new double[] {};
        multiDirectional4.setStartConfiguration(doubleArray9);
        multiDirectional2.setStartConfiguration(doubleArray9);
        int int12 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 1, (double) 10L);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional3.setMaxIterations(100);
        int int6 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional9.setMaxIterations(100);
        int int12 = multiDirectional9.getEvaluations();
        multiDirectional9.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional15.setMaxIterations(100);
        int int18 = multiDirectional15.getEvaluations();
        multiDirectional15.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker21 = multiDirectional15.getConvergenceChecker();
        multiDirectional9.setConvergenceChecker(realConvergenceChecker21);
        multiDirectional3.setConvergenceChecker(realConvergenceChecker21);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker21);
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator25 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker21);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations(35);
        int int5 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional6.getConvergenceChecker();
        int int13 = multiDirectional6.getMaxIterations();
        int int14 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int18 = multiDirectional17.getMaxEvaluations();
        multiDirectional17.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker21 = multiDirectional17.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int23 = multiDirectional22.getMaxEvaluations();
        multiDirectional22.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = multiDirectional22.getConvergenceChecker();
        multiDirectional17.setConvergenceChecker(realConvergenceChecker26);
        int int28 = multiDirectional17.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional29.setMaxIterations(100);
        int int32 = multiDirectional29.getEvaluations();
        multiDirectional29.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional35.setMaxIterations(100);
        int int38 = multiDirectional35.getEvaluations();
        multiDirectional35.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker41 = multiDirectional35.getConvergenceChecker();
        multiDirectional29.setConvergenceChecker(realConvergenceChecker41);
        multiDirectional17.setConvergenceChecker(realConvergenceChecker41);
        multiDirectional6.setConvergenceChecker(realConvergenceChecker41);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker41);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional2.setMaxIterations(100);
        multiDirectional2.setMaxEvaluations((int) (short) 1);
        multiDirectional2.setMaxEvaluations((int) (short) 1);
        int int9 = multiDirectional2.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional10.setMaxIterations(100);
        int int13 = multiDirectional10.getEvaluations();
        multiDirectional10.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional16.setMaxIterations(100);
        int int19 = multiDirectional16.getEvaluations();
        multiDirectional16.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = multiDirectional16.getConvergenceChecker();
        multiDirectional10.setConvergenceChecker(realConvergenceChecker22);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker22);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int26 = multiDirectional25.getMaxEvaluations();
        int int27 = multiDirectional25.getMaxIterations();
        double[] doubleArray29 = new double[] { 100 };
        multiDirectional25.setStartConfiguration(doubleArray29);
        int int31 = multiDirectional25.getMaxEvaluations();
        int int32 = multiDirectional25.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int34 = multiDirectional33.getMaxEvaluations();
        int int35 = multiDirectional33.getMaxIterations();
        double[] doubleArray37 = new double[] { 100 };
        multiDirectional33.setStartConfiguration(doubleArray37);
        multiDirectional25.setStartConfiguration(doubleArray37);
        multiDirectional2.setStartConfiguration(doubleArray37);
        multiDirectional0.setStartConfiguration(doubleArray37);
        int int42 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker43 = multiDirectional0.getConvergenceChecker();
        int int44 = multiDirectional0.getMaxEvaluations();
        int int45 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        int int3 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getMaxEvaluations();
        multiDirectional4.setMaxIterations((int) (byte) 0);
        int int8 = multiDirectional4.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = null;
        multiDirectional4.setConvergenceChecker(realConvergenceChecker9);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional13.setMaxEvaluations((int) (short) -1);
        int int16 = multiDirectional13.getIterations();
        multiDirectional13.setMaxIterations((int) '#');
        int int19 = multiDirectional13.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional20.setMaxIterations(100);
        int int23 = multiDirectional20.getEvaluations();
        multiDirectional20.setMaxEvaluations((int) ' ');
        double[] doubleArray26 = new double[] {};
        double[][] doubleArray27 = new double[][] { doubleArray26 };
        multiDirectional20.setStartConfiguration(doubleArray27);
        multiDirectional13.setStartConfiguration(doubleArray27);
        multiDirectional4.setStartConfiguration(doubleArray27);
        multiDirectional0.setStartConfiguration(doubleArray27);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxEvaluations();
        multiDirectional32.setMaxIterations((int) (byte) 0);
        int int36 = multiDirectional32.getMaxEvaluations();
        multiDirectional32.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional39.setMaxIterations(100);
        multiDirectional39.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker44 = multiDirectional39.getConvergenceChecker();
        multiDirectional32.setConvergenceChecker(realConvergenceChecker44);
        multiDirectional32.setMaxEvaluations(2147483647);
        int int48 = multiDirectional32.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional49 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int50 = multiDirectional49.getMaxEvaluations();
        int int51 = multiDirectional49.getEvaluations();
        int int52 = multiDirectional49.getMaxEvaluations();
        int int53 = multiDirectional49.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional54 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int55 = multiDirectional54.getIterations();
        int int56 = multiDirectional54.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int58 = multiDirectional57.getMaxEvaluations();
        int int59 = multiDirectional57.getMaxIterations();
        double[] doubleArray61 = new double[] { 100 };
        multiDirectional57.setStartConfiguration(doubleArray61);
        int int63 = multiDirectional57.getEvaluations();
        int int64 = multiDirectional57.getMaxIterations();
        int int65 = multiDirectional57.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional66 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional66.setMaxIterations(100);
        int int69 = multiDirectional66.getEvaluations();
        multiDirectional66.setMaxEvaluations((int) ' ');
        double[] doubleArray72 = new double[] {};
        double[][] doubleArray73 = new double[][] { doubleArray72 };
        multiDirectional66.setStartConfiguration(doubleArray73);
        multiDirectional57.setStartConfiguration(doubleArray73);
        multiDirectional54.setStartConfiguration(doubleArray73);
        multiDirectional49.setStartConfiguration(doubleArray73);
        multiDirectional32.setStartConfiguration(doubleArray73);
        multiDirectional0.setStartConfiguration(doubleArray73);
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator80 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.iterateSimplex(realPointValuePairComparator80);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker44);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray73);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        int int3 = multiDirectional0.getEvaluations();
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations(0);
        double[] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.setStartConfiguration(doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int3 = multiDirectional2.getIterations();
        multiDirectional2.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        multiDirectional9.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional9.getConvergenceChecker();
        double[] doubleArray14 = new double[] {};
        multiDirectional9.setStartConfiguration(doubleArray14);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional9.getConvergenceChecker();
        multiDirectional6.setConvergenceChecker(realConvergenceChecker16);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker16);
        multiDirectional2.setMaxEvaluations(35);
        int int21 = multiDirectional2.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int23 = multiDirectional22.getMaxEvaluations();
        multiDirectional22.setMaxIterations((int) (byte) 0);
        int int26 = multiDirectional22.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = null;
        multiDirectional22.setConvergenceChecker(realConvergenceChecker27);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional31.setMaxEvaluations((int) (short) -1);
        int int34 = multiDirectional31.getIterations();
        multiDirectional31.setMaxIterations((int) '#');
        int int37 = multiDirectional31.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional38.setMaxIterations(100);
        int int41 = multiDirectional38.getEvaluations();
        multiDirectional38.setMaxEvaluations((int) ' ');
        double[] doubleArray44 = new double[] {};
        double[][] doubleArray45 = new double[][] { doubleArray44 };
        multiDirectional38.setStartConfiguration(doubleArray45);
        multiDirectional31.setStartConfiguration(doubleArray45);
        multiDirectional22.setStartConfiguration(doubleArray45);
        multiDirectional2.setStartConfiguration(doubleArray45);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional50 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int51 = multiDirectional50.getMaxEvaluations();
        multiDirectional50.setMaxIterations((int) (byte) 0);
        int int54 = multiDirectional50.getMaxEvaluations();
        multiDirectional50.setMaxEvaluations(1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker57 = multiDirectional50.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker57);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional59 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional59.setMaxIterations(100);
        int int62 = multiDirectional59.getEvaluations();
        multiDirectional59.setMaxEvaluations((int) ' ');
        int int65 = multiDirectional59.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional66 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional66.setMaxIterations(100);
        int int69 = multiDirectional66.getEvaluations();
        multiDirectional66.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker72 = multiDirectional66.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional73 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional73.setMaxIterations(100);
        int int76 = multiDirectional73.getEvaluations();
        multiDirectional73.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional79 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional79.setMaxIterations(100);
        int int82 = multiDirectional79.getEvaluations();
        multiDirectional79.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker85 = multiDirectional79.getConvergenceChecker();
        multiDirectional73.setConvergenceChecker(realConvergenceChecker85);
        multiDirectional66.setConvergenceChecker(realConvergenceChecker85);
        multiDirectional59.setConvergenceChecker(realConvergenceChecker85);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker85);
        int int90 = multiDirectional2.getMaxIterations();
        int int91 = multiDirectional2.getMaxEvaluations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator92 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker57);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker72);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker85);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 2147483647 + "'", int90 == 2147483647);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 35 + "'", int91 == 35);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (double) 0.0f);
        double[][] doubleArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.setStartConfiguration(doubleArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getEvaluations();
        multiDirectional6.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional6.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker12);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        int int16 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxIterations((int) (short) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getEvaluations();
        int int7 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional8.setMaxIterations(100);
        multiDirectional8.setMaxEvaluations((int) (short) 1);
        int int13 = multiDirectional8.getEvaluations();
        multiDirectional8.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional8.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker16);
        int int18 = multiDirectional0.getEvaluations();
        int int19 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker20 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, (double) '4');
        multiDirectional2.setMaxEvaluations(32);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1), (double) (-1L));
        multiDirectional2.setMaxEvaluations((-1));
        multiDirectional2.setMaxEvaluations(100);
        multiDirectional2.setMaxIterations(32);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        int int7 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional8.setMaxIterations(100);
        int int11 = multiDirectional8.getEvaluations();
        multiDirectional8.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional14.setMaxIterations(100);
        int int17 = multiDirectional14.getEvaluations();
        multiDirectional14.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker20 = multiDirectional14.getConvergenceChecker();
        multiDirectional8.setConvergenceChecker(realConvergenceChecker20);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker20);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getIterations();
        int int25 = multiDirectional23.getEvaluations();
        int int26 = multiDirectional23.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional27 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional27.setMaxIterations(100);
        int int30 = multiDirectional27.getEvaluations();
        multiDirectional27.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional27.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional34.setMaxIterations(100);
        int int37 = multiDirectional34.getEvaluations();
        multiDirectional34.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional40.setMaxIterations(100);
        int int43 = multiDirectional40.getEvaluations();
        multiDirectional40.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker46 = multiDirectional40.getConvergenceChecker();
        multiDirectional34.setConvergenceChecker(realConvergenceChecker46);
        multiDirectional27.setConvergenceChecker(realConvergenceChecker46);
        multiDirectional23.setConvergenceChecker(realConvergenceChecker46);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional50 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional50.setMaxIterations(100);
        int int53 = multiDirectional50.getEvaluations();
        multiDirectional50.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker56 = multiDirectional50.getConvergenceChecker();
        multiDirectional23.setConvergenceChecker(realConvergenceChecker56);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker56);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional61 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker62 = multiDirectional61.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional63 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int64 = multiDirectional63.getMaxEvaluations();
        int int65 = multiDirectional63.getMaxIterations();
        double[] doubleArray67 = new double[] { 100 };
        multiDirectional63.setStartConfiguration(doubleArray67);
        int int69 = multiDirectional63.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional70 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int71 = multiDirectional70.getMaxEvaluations();
        int int72 = multiDirectional70.getMaxIterations();
        double[] doubleArray74 = new double[] { 100 };
        multiDirectional70.setStartConfiguration(doubleArray74);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker76 = multiDirectional70.getConvergenceChecker();
        multiDirectional63.setConvergenceChecker(realConvergenceChecker76);
        multiDirectional61.setConvergenceChecker(realConvergenceChecker76);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker76);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker80 = multiDirectional0.getConvergenceChecker();
        int int81 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker46);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker56);
        org.junit.Assert.assertNotNull(realConvergenceChecker62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2147483647 + "'", int65 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2147483647 + "'", int72 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker76);
        org.junit.Assert.assertNotNull(realConvergenceChecker80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 1 + "'", int81 == 1);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((-1.0d), (double) 0);
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getEvaluations();
        int int7 = multiDirectional0.getMaxIterations();
        int int8 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations(10);
        multiDirectional0.setMaxEvaluations((int) (byte) 100);
        int int13 = multiDirectional0.getEvaluations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator14 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional0.iterateSimplex(realPointValuePairComparator14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        int int3 = multiDirectional2.getEvaluations();
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction4 = null;
        org.apache.commons.math.optimization.GoalType goalType5 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        multiDirectional6.setMaxEvaluations((int) (short) 1);
        multiDirectional6.setMaxIterations((int) (byte) 1);
        multiDirectional6.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int18 = multiDirectional17.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional19.setMaxIterations(100);
        multiDirectional19.setMaxEvaluations((int) (short) 1);
        int int24 = multiDirectional19.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int26 = multiDirectional25.getMaxEvaluations();
        multiDirectional25.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker29 = multiDirectional25.getConvergenceChecker();
        double[] doubleArray30 = new double[] {};
        multiDirectional25.setStartConfiguration(doubleArray30);
        multiDirectional19.setStartConfiguration(doubleArray30);
        multiDirectional17.setStartConfiguration(doubleArray30);
        multiDirectional6.setStartConfiguration(doubleArray30);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair35 = multiDirectional2.optimize(multivariateRealFunction4, goalType5, doubleArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        int int4 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker5);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional9.setMaxEvaluations((int) (short) -1);
        int int12 = multiDirectional9.getIterations();
        multiDirectional9.setMaxIterations((int) '#');
        int int15 = multiDirectional9.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional16.setMaxIterations(100);
        int int19 = multiDirectional16.getEvaluations();
        multiDirectional16.setMaxEvaluations((int) ' ');
        double[] doubleArray22 = new double[] {};
        double[][] doubleArray23 = new double[][] { doubleArray22 };
        multiDirectional16.setStartConfiguration(doubleArray23);
        multiDirectional9.setStartConfiguration(doubleArray23);
        multiDirectional0.setStartConfiguration(doubleArray23);
        multiDirectional0.setMaxIterations((int) 'a');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional29.setMaxIterations(100);
        int int32 = multiDirectional29.getMaxEvaluations();
        multiDirectional29.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional35.setMaxIterations(100);
        int int38 = multiDirectional35.getEvaluations();
        multiDirectional35.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional41.setMaxIterations(100);
        int int44 = multiDirectional41.getEvaluations();
        multiDirectional41.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker47 = multiDirectional41.getConvergenceChecker();
        multiDirectional35.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional29.setConvergenceChecker(realConvergenceChecker47);
        int int50 = multiDirectional29.getMaxIterations();
        int int51 = multiDirectional29.getMaxIterations();
        int int52 = multiDirectional29.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int56 = multiDirectional55.getIterations();
        int int57 = multiDirectional55.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker58 = multiDirectional55.getConvergenceChecker();
        multiDirectional29.setConvergenceChecker(realConvergenceChecker58);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker58);
        int int61 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 100 + "'", int50 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 100 + "'", int51 == 100);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 100 + "'", int52 == 100);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(1.0d, (double) '#');
        int int3 = multiDirectional2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getEvaluations();
        multiDirectional6.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional12.setMaxIterations(100);
        int int15 = multiDirectional12.getEvaluations();
        multiDirectional12.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional12.getConvergenceChecker();
        multiDirectional6.setConvergenceChecker(realConvergenceChecker18);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int21 = multiDirectional20.getMaxEvaluations();
        multiDirectional20.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional20.getConvergenceChecker();
        double[] doubleArray25 = new double[] {};
        multiDirectional20.setStartConfiguration(doubleArray25);
        multiDirectional6.setStartConfiguration(doubleArray25);
        multiDirectional0.setStartConfiguration(doubleArray25);
        int int29 = multiDirectional0.getEvaluations();
        int int30 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker31 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional32.setMaxIterations(100);
        int int35 = multiDirectional32.getMaxEvaluations();
        multiDirectional32.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = multiDirectional32.getConvergenceChecker();
        int int39 = multiDirectional32.getMaxIterations();
        multiDirectional32.setMaxIterations((int) (byte) 100);
        int int42 = multiDirectional32.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional43.setMaxIterations(100);
        int int46 = multiDirectional43.getEvaluations();
        multiDirectional43.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional49 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional49.setMaxIterations(100);
        int int52 = multiDirectional49.getEvaluations();
        multiDirectional49.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional55.setMaxIterations(100);
        int int58 = multiDirectional55.getEvaluations();
        multiDirectional55.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker61 = multiDirectional55.getConvergenceChecker();
        multiDirectional49.setConvergenceChecker(realConvergenceChecker61);
        multiDirectional43.setConvergenceChecker(realConvergenceChecker61);
        multiDirectional32.setConvergenceChecker(realConvergenceChecker61);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker61);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 100 + "'", int30 == 100);
        org.junit.Assert.assertNotNull(realConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 100 + "'", int39 == 100);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker61);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        multiDirectional2.setMaxIterations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional7.setMaxEvaluations((int) (short) -1);
        int int10 = multiDirectional7.getIterations();
        int int11 = multiDirectional7.getIterations();
        int int12 = multiDirectional7.getIterations();
        multiDirectional7.setMaxIterations((int) '#');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int16 = multiDirectional15.getMaxEvaluations();
        multiDirectional15.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional15.getConvergenceChecker();
        int int20 = multiDirectional15.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional21.setMaxIterations(100);
        int int24 = multiDirectional21.getEvaluations();
        multiDirectional21.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional27 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional27.setMaxIterations(100);
        int int30 = multiDirectional27.getEvaluations();
        multiDirectional27.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional33.setMaxIterations(100);
        int int36 = multiDirectional33.getEvaluations();
        multiDirectional33.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker39 = multiDirectional33.getConvergenceChecker();
        multiDirectional27.setConvergenceChecker(realConvergenceChecker39);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int42 = multiDirectional41.getMaxEvaluations();
        multiDirectional41.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker45 = multiDirectional41.getConvergenceChecker();
        double[] doubleArray46 = new double[] {};
        multiDirectional41.setStartConfiguration(doubleArray46);
        multiDirectional27.setStartConfiguration(doubleArray46);
        multiDirectional21.setStartConfiguration(doubleArray46);
        multiDirectional15.setStartConfiguration(doubleArray46);
        multiDirectional7.setStartConfiguration(doubleArray46);
        multiDirectional2.setStartConfiguration(doubleArray46);
        multiDirectional2.setMaxEvaluations(52);
        int int55 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker45);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 52 + "'", int55 == 52);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 1, (double) 10L);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional3.setMaxIterations(100);
        int int6 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxEvaluations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional9.setMaxIterations(100);
        int int12 = multiDirectional9.getEvaluations();
        multiDirectional9.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional15.setMaxIterations(100);
        int int18 = multiDirectional15.getEvaluations();
        multiDirectional15.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker21 = multiDirectional15.getConvergenceChecker();
        multiDirectional9.setConvergenceChecker(realConvergenceChecker21);
        multiDirectional3.setConvergenceChecker(realConvergenceChecker21);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker21);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker25 = multiDirectional2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker21);
        org.junit.Assert.assertNotNull(realConvergenceChecker25);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        int int7 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int9 = multiDirectional8.getMaxEvaluations();
        multiDirectional8.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional8.getConvergenceChecker();
        double[] doubleArray13 = new double[] {};
        multiDirectional8.setStartConfiguration(doubleArray13);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional8.getConvergenceChecker();
        int int16 = multiDirectional8.getMaxEvaluations();
        int int17 = multiDirectional8.getEvaluations();
        int int18 = multiDirectional8.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int20 = multiDirectional19.getMaxEvaluations();
        multiDirectional19.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = multiDirectional19.getConvergenceChecker();
        multiDirectional19.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional26.setMaxIterations(100);
        int int29 = multiDirectional26.getEvaluations();
        multiDirectional26.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional32.setMaxIterations(100);
        int int35 = multiDirectional32.getEvaluations();
        multiDirectional32.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional38.setMaxIterations(100);
        int int41 = multiDirectional38.getEvaluations();
        multiDirectional38.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker44 = multiDirectional38.getConvergenceChecker();
        multiDirectional32.setConvergenceChecker(realConvergenceChecker44);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int47 = multiDirectional46.getMaxEvaluations();
        multiDirectional46.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker50 = multiDirectional46.getConvergenceChecker();
        double[] doubleArray51 = new double[] {};
        multiDirectional46.setStartConfiguration(doubleArray51);
        multiDirectional32.setStartConfiguration(doubleArray51);
        multiDirectional26.setStartConfiguration(doubleArray51);
        int int55 = multiDirectional26.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker56 = multiDirectional26.getConvergenceChecker();
        multiDirectional19.setConvergenceChecker(realConvergenceChecker56);
        multiDirectional8.setConvergenceChecker(realConvergenceChecker56);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker56);
        int int60 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional63 = new org.apache.commons.math.optimization.direct.MultiDirectional(10.0d, (double) (short) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker64 = multiDirectional63.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker64);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional66 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional66.setMaxIterations(100);
        multiDirectional66.setMaxIterations((int) (byte) 0);
        int int71 = multiDirectional66.getMaxEvaluations();
        int int72 = multiDirectional66.getIterations();
        int int73 = multiDirectional66.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker74 = multiDirectional66.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker74);
        int int76 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker50);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker56);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertNotNull(realConvergenceChecker64);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 2147483647 + "'", int71 == 2147483647);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        int int3 = multiDirectional2.getIterations();
        multiDirectional2.setMaxEvaluations(1);
        int int6 = multiDirectional2.getMaxIterations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator7 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        int int4 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker5);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional9.setMaxEvaluations((int) (short) -1);
        int int12 = multiDirectional9.getIterations();
        multiDirectional9.setMaxIterations((int) '#');
        int int15 = multiDirectional9.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional16.setMaxIterations(100);
        int int19 = multiDirectional16.getEvaluations();
        multiDirectional16.setMaxEvaluations((int) ' ');
        double[] doubleArray22 = new double[] {};
        double[][] doubleArray23 = new double[][] { doubleArray22 };
        multiDirectional16.setStartConfiguration(doubleArray23);
        multiDirectional9.setStartConfiguration(doubleArray23);
        multiDirectional0.setStartConfiguration(doubleArray23);
        int int27 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int29 = multiDirectional28.getMaxEvaluations();
        multiDirectional28.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker32 = multiDirectional28.getConvergenceChecker();
        double[] doubleArray33 = new double[] {};
        multiDirectional28.setStartConfiguration(doubleArray33);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker35 = multiDirectional28.getConvergenceChecker();
        int int36 = multiDirectional28.getMaxEvaluations();
        int int37 = multiDirectional28.getEvaluations();
        multiDirectional28.setMaxEvaluations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int41 = multiDirectional40.getIterations();
        int int42 = multiDirectional40.getEvaluations();
        int int43 = multiDirectional40.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional44 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int45 = multiDirectional44.getMaxEvaluations();
        multiDirectional44.setMaxIterations((int) (byte) 0);
        int int48 = multiDirectional44.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker49 = null;
        multiDirectional44.setConvergenceChecker(realConvergenceChecker49);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional53.setMaxEvaluations((int) (short) -1);
        int int56 = multiDirectional53.getIterations();
        multiDirectional53.setMaxIterations((int) '#');
        int int59 = multiDirectional53.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional60 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional60.setMaxIterations(100);
        int int63 = multiDirectional60.getEvaluations();
        multiDirectional60.setMaxEvaluations((int) ' ');
        double[] doubleArray66 = new double[] {};
        double[][] doubleArray67 = new double[][] { doubleArray66 };
        multiDirectional60.setStartConfiguration(doubleArray67);
        multiDirectional53.setStartConfiguration(doubleArray67);
        multiDirectional44.setStartConfiguration(doubleArray67);
        multiDirectional40.setStartConfiguration(doubleArray67);
        multiDirectional28.setStartConfiguration(doubleArray67);
        multiDirectional0.setStartConfiguration(doubleArray67);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 35 + "'", int59 == 35);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        int int7 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        int int12 = multiDirectional10.getMaxIterations();
        double[] doubleArray14 = new double[] { 100 };
        multiDirectional10.setStartConfiguration(doubleArray14);
        multiDirectional0.setStartConfiguration(doubleArray14);
        int int17 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional24.setMaxIterations(100);
        int int27 = multiDirectional24.getEvaluations();
        multiDirectional24.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional24.getConvergenceChecker();
        multiDirectional18.setConvergenceChecker(realConvergenceChecker30);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxEvaluations();
        int int34 = multiDirectional32.getMaxIterations();
        double[] doubleArray36 = new double[] { 100 };
        multiDirectional32.setStartConfiguration(doubleArray36);
        int int38 = multiDirectional32.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getIterations();
        int int41 = multiDirectional39.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int43 = multiDirectional42.getMaxEvaluations();
        int int44 = multiDirectional42.getMaxIterations();
        double[] doubleArray46 = new double[] { 100 };
        multiDirectional42.setStartConfiguration(doubleArray46);
        int int48 = multiDirectional42.getEvaluations();
        int int49 = multiDirectional42.getMaxIterations();
        int int50 = multiDirectional42.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional51 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional51.setMaxIterations(100);
        int int54 = multiDirectional51.getEvaluations();
        multiDirectional51.setMaxEvaluations((int) ' ');
        double[] doubleArray57 = new double[] {};
        double[][] doubleArray58 = new double[][] { doubleArray57 };
        multiDirectional51.setStartConfiguration(doubleArray58);
        multiDirectional42.setStartConfiguration(doubleArray58);
        multiDirectional39.setStartConfiguration(doubleArray58);
        multiDirectional32.setStartConfiguration(doubleArray58);
        multiDirectional18.setStartConfiguration(doubleArray58);
        multiDirectional0.setStartConfiguration(doubleArray58);
        int int65 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations((int) 'a');
        int int68 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        int int3 = multiDirectional2.getEvaluations();
        int int4 = multiDirectional2.getEvaluations();
        multiDirectional2.setMaxIterations((int) '#');
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = multiDirectional9.getConvergenceChecker();
        int int12 = multiDirectional9.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        int int15 = multiDirectional13.getMaxIterations();
        double[] doubleArray17 = new double[] { 100 };
        multiDirectional13.setStartConfiguration(doubleArray17);
        multiDirectional9.setStartConfiguration(doubleArray17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair20 = multiDirectional2.optimize(multivariateRealFunction7, goalType8, doubleArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(2147483647);
        int int5 = multiDirectional0.getMaxIterations();
        java.lang.Class<?> wildcardClass6 = multiDirectional0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker2 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker2);
        int int4 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        int int7 = multiDirectional5.getMaxIterations();
        double[] doubleArray9 = new double[] { 100 };
        multiDirectional5.setStartConfiguration(doubleArray9);
        int int11 = multiDirectional5.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int13 = multiDirectional12.getMaxEvaluations();
        int int14 = multiDirectional12.getMaxIterations();
        double[] doubleArray16 = new double[] { 100 };
        multiDirectional12.setStartConfiguration(doubleArray16);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional12.getConvergenceChecker();
        multiDirectional5.setConvergenceChecker(realConvergenceChecker18);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker18);
        multiDirectional0.setMaxEvaluations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getIterations();
        int int25 = multiDirectional23.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int27 = multiDirectional26.getMaxEvaluations();
        int int28 = multiDirectional26.getMaxIterations();
        double[] doubleArray30 = new double[] { 100 };
        multiDirectional26.setStartConfiguration(doubleArray30);
        int int32 = multiDirectional26.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int34 = multiDirectional33.getMaxEvaluations();
        int int35 = multiDirectional33.getMaxIterations();
        double[] doubleArray37 = new double[] { 100 };
        multiDirectional33.setStartConfiguration(doubleArray37);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker39 = multiDirectional33.getConvergenceChecker();
        multiDirectional26.setConvergenceChecker(realConvergenceChecker39);
        multiDirectional23.setConvergenceChecker(realConvergenceChecker39);
        int int42 = multiDirectional23.getEvaluations();
        multiDirectional23.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int46 = multiDirectional45.getMaxEvaluations();
        int int47 = multiDirectional45.getMaxIterations();
        double[] doubleArray49 = new double[] { 100 };
        multiDirectional45.setStartConfiguration(doubleArray49);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int54 = multiDirectional53.getIterations();
        multiDirectional53.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int58 = multiDirectional57.getIterations();
        int int59 = multiDirectional57.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional60 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int61 = multiDirectional60.getMaxEvaluations();
        int int62 = multiDirectional60.getMaxIterations();
        double[] doubleArray64 = new double[] { 100 };
        multiDirectional60.setStartConfiguration(doubleArray64);
        int int66 = multiDirectional60.getEvaluations();
        int int67 = multiDirectional60.getMaxIterations();
        int int68 = multiDirectional60.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional69 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional69.setMaxIterations(100);
        int int72 = multiDirectional69.getEvaluations();
        multiDirectional69.setMaxEvaluations((int) ' ');
        double[] doubleArray75 = new double[] {};
        double[][] doubleArray76 = new double[][] { doubleArray75 };
        multiDirectional69.setStartConfiguration(doubleArray76);
        multiDirectional60.setStartConfiguration(doubleArray76);
        multiDirectional57.setStartConfiguration(doubleArray76);
        multiDirectional53.setStartConfiguration(doubleArray76);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional81 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int82 = multiDirectional81.getMaxEvaluations();
        multiDirectional81.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker85 = multiDirectional81.getConvergenceChecker();
        double[] doubleArray86 = new double[] {};
        multiDirectional81.setStartConfiguration(doubleArray86);
        multiDirectional53.setStartConfiguration(doubleArray86);
        multiDirectional45.setStartConfiguration(doubleArray86);
        multiDirectional23.setStartConfiguration(doubleArray86);
        multiDirectional0.setStartConfiguration(doubleArray86);
        multiDirectional0.setMaxIterations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2147483647 + "'", int62 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2147483647 + "'", int82 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker85);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertArrayEquals(doubleArray86, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 1, (double) 1L);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) ' ');
        double[] doubleArray6 = new double[] {};
        double[][] doubleArray7 = new double[][] { doubleArray6 };
        multiDirectional0.setStartConfiguration(doubleArray7);
        multiDirectional0.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = multiDirectional0.getConvergenceChecker();
        int int12 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertNotNull(realConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        int int3 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional2.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        int int7 = multiDirectional5.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional8.setMaxIterations(100);
        multiDirectional8.setMaxEvaluations((int) (short) 1);
        int int13 = multiDirectional8.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int15 = multiDirectional14.getMaxEvaluations();
        multiDirectional14.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional14.getConvergenceChecker();
        double[] doubleArray19 = new double[] {};
        multiDirectional14.setStartConfiguration(doubleArray19);
        multiDirectional8.setStartConfiguration(doubleArray19);
        multiDirectional5.setStartConfiguration(doubleArray19);
        multiDirectional2.setStartConfiguration(doubleArray19);
        int int24 = multiDirectional2.getIterations();
        int int25 = multiDirectional2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional3.setMaxIterations(100);
        int int6 = multiDirectional3.getEvaluations();
        multiDirectional3.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = multiDirectional3.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        multiDirectional10.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = multiDirectional10.getConvergenceChecker();
        double[] doubleArray15 = new double[] {};
        multiDirectional10.setStartConfiguration(doubleArray15);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional10.getConvergenceChecker();
        int int18 = multiDirectional10.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional19.setMaxIterations(100);
        int int22 = multiDirectional19.getEvaluations();
        multiDirectional19.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional25.setMaxIterations(100);
        int int28 = multiDirectional25.getEvaluations();
        multiDirectional25.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        int int34 = multiDirectional31.getEvaluations();
        multiDirectional31.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional31.getConvergenceChecker();
        multiDirectional25.setConvergenceChecker(realConvergenceChecker37);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getMaxEvaluations();
        multiDirectional39.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker43 = multiDirectional39.getConvergenceChecker();
        double[] doubleArray44 = new double[] {};
        multiDirectional39.setStartConfiguration(doubleArray44);
        multiDirectional25.setStartConfiguration(doubleArray44);
        multiDirectional19.setStartConfiguration(doubleArray44);
        multiDirectional10.setStartConfiguration(doubleArray44);
        multiDirectional3.setStartConfiguration(doubleArray44);
        multiDirectional0.setStartConfiguration(doubleArray44);
        multiDirectional0.setMaxIterations((int) (byte) 10);
        int int53 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker43);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxIterations((int) (byte) 100);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        int int3 = multiDirectional2.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional2.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional5.setMaxIterations(100);
        multiDirectional5.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional10.setMaxIterations(100);
        int int13 = multiDirectional10.getEvaluations();
        multiDirectional10.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional10.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional17.setMaxIterations(100);
        int int20 = multiDirectional17.getEvaluations();
        multiDirectional17.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional23.setMaxIterations(100);
        int int26 = multiDirectional23.getEvaluations();
        multiDirectional23.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker29 = multiDirectional23.getConvergenceChecker();
        multiDirectional17.setConvergenceChecker(realConvergenceChecker29);
        multiDirectional10.setConvergenceChecker(realConvergenceChecker29);
        multiDirectional5.setConvergenceChecker(realConvergenceChecker29);
        int int33 = multiDirectional5.getMaxEvaluations();
        int int34 = multiDirectional5.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker35 = multiDirectional5.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker35);
        multiDirectional2.setMaxIterations((int) '#');
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator39 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker35);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional2.setMaxIterations(10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        int int8 = multiDirectional7.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        multiDirectional9.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional9.getConvergenceChecker();
        double[] doubleArray14 = new double[] {};
        multiDirectional9.setStartConfiguration(doubleArray14);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional9.getConvergenceChecker();
        int int17 = multiDirectional9.getMaxEvaluations();
        int int18 = multiDirectional9.getIterations();
        int int19 = multiDirectional9.getMaxIterations();
        multiDirectional9.setMaxEvaluations(100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker25 = multiDirectional24.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int27 = multiDirectional26.getMaxEvaluations();
        int int28 = multiDirectional26.getMaxIterations();
        double[] doubleArray30 = new double[] { 100 };
        multiDirectional26.setStartConfiguration(doubleArray30);
        int int32 = multiDirectional26.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int34 = multiDirectional33.getMaxEvaluations();
        int int35 = multiDirectional33.getMaxIterations();
        double[] doubleArray37 = new double[] { 100 };
        multiDirectional33.setStartConfiguration(doubleArray37);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker39 = multiDirectional33.getConvergenceChecker();
        multiDirectional26.setConvergenceChecker(realConvergenceChecker39);
        multiDirectional24.setConvergenceChecker(realConvergenceChecker39);
        multiDirectional9.setConvergenceChecker(realConvergenceChecker39);
        int int43 = multiDirectional9.getMaxIterations();
        multiDirectional9.setMaxIterations(0);
        int int46 = multiDirectional9.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional47 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int48 = multiDirectional47.getMaxEvaluations();
        int int49 = multiDirectional47.getMaxIterations();
        int int50 = multiDirectional47.getMaxEvaluations();
        int int51 = multiDirectional47.getIterations();
        multiDirectional47.setMaxIterations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional54 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int55 = multiDirectional54.getMaxEvaluations();
        multiDirectional54.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker58 = multiDirectional54.getConvergenceChecker();
        multiDirectional54.setMaxEvaluations((int) (byte) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional61 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int62 = multiDirectional61.getIterations();
        int int63 = multiDirectional61.getEvaluations();
        int int64 = multiDirectional61.getEvaluations();
        int int65 = multiDirectional61.getMaxIterations();
        int int66 = multiDirectional61.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional67 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int68 = multiDirectional67.getIterations();
        int int69 = multiDirectional67.getMaxEvaluations();
        int int70 = multiDirectional67.getEvaluations();
        int int71 = multiDirectional67.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional72 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int73 = multiDirectional72.getMaxEvaluations();
        int int74 = multiDirectional72.getMaxIterations();
        double[] doubleArray76 = new double[] { 100 };
        multiDirectional72.setStartConfiguration(doubleArray76);
        int int78 = multiDirectional72.getEvaluations();
        int int79 = multiDirectional72.getMaxIterations();
        int int80 = multiDirectional72.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional81 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional81.setMaxIterations(100);
        int int84 = multiDirectional81.getEvaluations();
        multiDirectional81.setMaxEvaluations((int) ' ');
        double[] doubleArray87 = new double[] {};
        double[][] doubleArray88 = new double[][] { doubleArray87 };
        multiDirectional81.setStartConfiguration(doubleArray88);
        multiDirectional72.setStartConfiguration(doubleArray88);
        multiDirectional67.setStartConfiguration(doubleArray88);
        multiDirectional61.setStartConfiguration(doubleArray88);
        multiDirectional54.setStartConfiguration(doubleArray88);
        multiDirectional47.setStartConfiguration(doubleArray88);
        multiDirectional9.setStartConfiguration(doubleArray88);
        multiDirectional7.setStartConfiguration(doubleArray88);
        multiDirectional2.setStartConfiguration(doubleArray88);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker39);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 100 + "'", int46 == 100);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker58);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2147483647 + "'", int65 == 2147483647);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2147483647 + "'", int69 == 2147483647);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2147483647 + "'", int73 == 2147483647);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2147483647 + "'", int74 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 2147483647 + "'", int79 == 2147483647);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 0 + "'", int84 == 0);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertArrayEquals(doubleArray87, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray88);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxIterations((int) (byte) 0);
        multiDirectional0.setMaxEvaluations(1);
        java.lang.Class<?> wildcardClass7 = multiDirectional0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        int int7 = multiDirectional0.getIterations();
        int int8 = multiDirectional0.getEvaluations();
        int int9 = multiDirectional0.getIterations();
        int int10 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getMaxEvaluations();
        int int13 = multiDirectional11.getMaxIterations();
        double[] doubleArray15 = new double[] { 100 };
        multiDirectional11.setStartConfiguration(doubleArray15);
        int int17 = multiDirectional11.getMaxEvaluations();
        int int18 = multiDirectional11.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional11.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker19);
        int int21 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional25.setMaxIterations(100);
        multiDirectional25.setMaxEvaluations((int) (short) 1);
        int int30 = multiDirectional25.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int32 = multiDirectional31.getMaxEvaluations();
        multiDirectional31.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker35 = multiDirectional31.getConvergenceChecker();
        double[] doubleArray36 = new double[] {};
        multiDirectional31.setStartConfiguration(doubleArray36);
        multiDirectional25.setStartConfiguration(doubleArray36);
        multiDirectional24.setStartConfiguration(doubleArray36);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional40.setMaxIterations(100);
        multiDirectional40.setMaxEvaluations((int) (short) 1);
        int int45 = multiDirectional40.getMaxIterations();
        multiDirectional40.setMaxIterations(0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional48.setMaxIterations(100);
        int int51 = multiDirectional48.getEvaluations();
        multiDirectional48.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional54 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional54.setMaxIterations(100);
        int int57 = multiDirectional54.getEvaluations();
        multiDirectional54.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker60 = multiDirectional54.getConvergenceChecker();
        multiDirectional48.setConvergenceChecker(realConvergenceChecker60);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional62 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int63 = multiDirectional62.getMaxEvaluations();
        multiDirectional62.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker66 = multiDirectional62.getConvergenceChecker();
        double[] doubleArray67 = new double[] {};
        multiDirectional62.setStartConfiguration(doubleArray67);
        multiDirectional48.setStartConfiguration(doubleArray67);
        multiDirectional40.setStartConfiguration(doubleArray67);
        multiDirectional24.setStartConfiguration(doubleArray67);
        multiDirectional0.setStartConfiguration(doubleArray67);
        multiDirectional0.setMaxEvaluations(100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2147483647 + "'", int13 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker66);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getEvaluations();
        multiDirectional6.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional6.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker12);
        int int14 = multiDirectional0.getEvaluations();
        int int15 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, (double) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional18.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker19);
        multiDirectional0.setMaxIterations(32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional23.setMaxIterations(100);
        int int26 = multiDirectional23.getMaxEvaluations();
        multiDirectional23.setMaxEvaluations((int) (byte) 1);
        multiDirectional23.setMaxEvaluations((int) (byte) 1);
        multiDirectional23.setMaxIterations((int) (byte) 100);
        int int33 = multiDirectional23.getMaxIterations();
        multiDirectional23.setMaxEvaluations((-1));
        int int36 = multiDirectional23.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional23.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, 10.0d);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional3.setMaxIterations(100);
        int int6 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = multiDirectional3.getConvergenceChecker();
        int int10 = multiDirectional3.getMaxIterations();
        multiDirectional3.setMaxIterations((int) (byte) 100);
        int int13 = multiDirectional3.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker14 = multiDirectional3.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int16 = multiDirectional15.getIterations();
        int int17 = multiDirectional15.getMaxEvaluations();
        int int18 = multiDirectional15.getEvaluations();
        int int19 = multiDirectional15.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int21 = multiDirectional20.getIterations();
        int int22 = multiDirectional20.getEvaluations();
        int int23 = multiDirectional20.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional24.setMaxIterations(100);
        int int27 = multiDirectional24.getEvaluations();
        multiDirectional24.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional24.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        int int34 = multiDirectional31.getEvaluations();
        multiDirectional31.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional37.setMaxIterations(100);
        int int40 = multiDirectional37.getEvaluations();
        multiDirectional37.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker43 = multiDirectional37.getConvergenceChecker();
        multiDirectional31.setConvergenceChecker(realConvergenceChecker43);
        multiDirectional24.setConvergenceChecker(realConvergenceChecker43);
        multiDirectional20.setConvergenceChecker(realConvergenceChecker43);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional47 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional47.setMaxIterations(100);
        int int50 = multiDirectional47.getEvaluations();
        multiDirectional47.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker53 = multiDirectional47.getConvergenceChecker();
        multiDirectional20.setConvergenceChecker(realConvergenceChecker53);
        multiDirectional15.setConvergenceChecker(realConvergenceChecker53);
        multiDirectional3.setConvergenceChecker(realConvergenceChecker53);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int58 = multiDirectional57.getMaxEvaluations();
        int int59 = multiDirectional57.getEvaluations();
        int int60 = multiDirectional57.getMaxEvaluations();
        int int61 = multiDirectional57.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional62 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int63 = multiDirectional62.getIterations();
        int int64 = multiDirectional62.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional65 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int66 = multiDirectional65.getMaxEvaluations();
        int int67 = multiDirectional65.getMaxIterations();
        double[] doubleArray69 = new double[] { 100 };
        multiDirectional65.setStartConfiguration(doubleArray69);
        int int71 = multiDirectional65.getEvaluations();
        int int72 = multiDirectional65.getMaxIterations();
        int int73 = multiDirectional65.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional74 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional74.setMaxIterations(100);
        int int77 = multiDirectional74.getEvaluations();
        multiDirectional74.setMaxEvaluations((int) ' ');
        double[] doubleArray80 = new double[] {};
        double[][] doubleArray81 = new double[][] { doubleArray80 };
        multiDirectional74.setStartConfiguration(doubleArray81);
        multiDirectional65.setStartConfiguration(doubleArray81);
        multiDirectional62.setStartConfiguration(doubleArray81);
        multiDirectional57.setStartConfiguration(doubleArray81);
        multiDirectional3.setStartConfiguration(doubleArray81);
        multiDirectional2.setStartConfiguration(doubleArray81);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker53);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2147483647 + "'", int64 == 2147483647);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2147483647 + "'", int66 == 2147483647);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2147483647 + "'", int72 == 2147483647);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 0 + "'", int77 == 0);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (double) '4');
        multiDirectional2.setMaxIterations((int) '4');
        int int5 = multiDirectional2.getMaxIterations();
        int int6 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        int int3 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations((int) (byte) -1);
        multiDirectional0.setMaxIterations((int) '4');
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        int int10 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) (short) 10);
        multiDirectional0.setMaxEvaluations((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int4 = multiDirectional3.getMaxEvaluations();
        int int5 = multiDirectional3.getMaxIterations();
        double[] doubleArray7 = new double[] { 100 };
        multiDirectional3.setStartConfiguration(doubleArray7);
        int int9 = multiDirectional3.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        int int12 = multiDirectional10.getMaxIterations();
        double[] doubleArray14 = new double[] { 100 };
        multiDirectional10.setStartConfiguration(doubleArray14);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional10.getConvergenceChecker();
        multiDirectional3.setConvergenceChecker(realConvergenceChecker16);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        multiDirectional18.setMaxEvaluations((int) (short) 1);
        multiDirectional18.setMaxEvaluations((int) (short) 1);
        int int25 = multiDirectional18.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional26.setMaxIterations(100);
        int int29 = multiDirectional26.getEvaluations();
        multiDirectional26.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional32.setMaxIterations(100);
        int int35 = multiDirectional32.getEvaluations();
        multiDirectional32.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = multiDirectional32.getConvergenceChecker();
        multiDirectional26.setConvergenceChecker(realConvergenceChecker38);
        multiDirectional18.setConvergenceChecker(realConvergenceChecker38);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int42 = multiDirectional41.getMaxEvaluations();
        int int43 = multiDirectional41.getMaxIterations();
        double[] doubleArray45 = new double[] { 100 };
        multiDirectional41.setStartConfiguration(doubleArray45);
        int int47 = multiDirectional41.getMaxEvaluations();
        int int48 = multiDirectional41.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional49 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int50 = multiDirectional49.getMaxEvaluations();
        int int51 = multiDirectional49.getMaxIterations();
        double[] doubleArray53 = new double[] { 100 };
        multiDirectional49.setStartConfiguration(doubleArray53);
        multiDirectional41.setStartConfiguration(doubleArray53);
        multiDirectional18.setStartConfiguration(doubleArray53);
        multiDirectional3.setStartConfiguration(doubleArray53);
        multiDirectional2.setStartConfiguration(doubleArray53);
        int int59 = multiDirectional2.getIterations();
        int int60 = multiDirectional2.getMaxEvaluations();
        int int61 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        int int5 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 100);
        int int8 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (short) 0);
        int int11 = multiDirectional0.getIterations();
        int int12 = multiDirectional0.getIterations();
        multiDirectional0.setMaxEvaluations((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        int int3 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations((int) (byte) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 'a', (double) (short) 1);
        multiDirectional9.setMaxEvaluations((-1));
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional9.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), 100.0d);
        int int3 = multiDirectional2.getMaxIterations();
        int int4 = multiDirectional2.getMaxEvaluations();
        multiDirectional2.setMaxEvaluations(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) -1, (-1.0d));
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = null;
        multiDirectional2.setConvergenceChecker(realConvergenceChecker3);
        int int5 = multiDirectional2.getEvaluations();
        int int6 = multiDirectional2.getIterations();
        multiDirectional2.setMaxIterations((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        multiDirectional0.setMaxIterations((int) (byte) 1);
        multiDirectional0.setMaxEvaluations((int) '#');
        multiDirectional0.setMaxIterations((int) (byte) 10);
        int int11 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) '#');
        multiDirectional0.setMaxIterations((int) '#');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 100, 1.0d);
        int int3 = multiDirectional2.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 0L);
        int int7 = multiDirectional6.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int9 = multiDirectional8.getIterations();
        int int10 = multiDirectional8.getEvaluations();
        int int11 = multiDirectional8.getMaxIterations();
        double[] doubleArray12 = new double[] {};
        multiDirectional8.setStartConfiguration(doubleArray12);
        multiDirectional6.setStartConfiguration(doubleArray12);
        int int15 = multiDirectional6.getEvaluations();
        multiDirectional6.setMaxIterations((-1));
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional6.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int20 = multiDirectional19.getMaxEvaluations();
        multiDirectional19.setMaxIterations((int) (byte) 0);
        int int23 = multiDirectional19.getMaxEvaluations();
        multiDirectional19.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional26.setMaxIterations(100);
        multiDirectional26.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker31 = multiDirectional26.getConvergenceChecker();
        multiDirectional19.setConvergenceChecker(realConvergenceChecker31);
        multiDirectional19.setMaxEvaluations(2147483647);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, 100.0d);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = multiDirectional37.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int40 = multiDirectional39.getIterations();
        int int41 = multiDirectional39.getMaxEvaluations();
        int int42 = multiDirectional39.getEvaluations();
        int int43 = multiDirectional39.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional44 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int45 = multiDirectional44.getMaxEvaluations();
        int int46 = multiDirectional44.getMaxIterations();
        double[] doubleArray48 = new double[] { 100 };
        multiDirectional44.setStartConfiguration(doubleArray48);
        int int50 = multiDirectional44.getEvaluations();
        int int51 = multiDirectional44.getMaxIterations();
        int int52 = multiDirectional44.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional53.setMaxIterations(100);
        int int56 = multiDirectional53.getEvaluations();
        multiDirectional53.setMaxEvaluations((int) ' ');
        double[] doubleArray59 = new double[] {};
        double[][] doubleArray60 = new double[][] { doubleArray59 };
        multiDirectional53.setStartConfiguration(doubleArray60);
        multiDirectional44.setStartConfiguration(doubleArray60);
        multiDirectional39.setStartConfiguration(doubleArray60);
        multiDirectional37.setStartConfiguration(doubleArray60);
        multiDirectional19.setStartConfiguration(doubleArray60);
        multiDirectional6.setStartConfiguration(doubleArray60);
        multiDirectional2.setStartConfiguration(doubleArray60);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker31);
        org.junit.Assert.assertNotNull(realConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2147483647 + "'", int41 == 2147483647);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2147483647 + "'", int51 == 2147483647);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(1.0d, (double) '4');
        multiDirectional2.setMaxEvaluations(0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional5.setMaxIterations(100);
        multiDirectional5.setMaxEvaluations((int) (short) 1);
        int int10 = multiDirectional5.getMaxIterations();
        multiDirectional5.setMaxIterations(0);
        int int13 = multiDirectional5.getMaxIterations();
        int int14 = multiDirectional5.getIterations();
        int int15 = multiDirectional5.getMaxIterations();
        int int16 = multiDirectional5.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional5.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        multiDirectional18.setMaxEvaluations((int) (short) 1);
        int int23 = multiDirectional18.getMaxIterations();
        int int24 = multiDirectional18.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker25 = multiDirectional18.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional26.setMaxIterations(100);
        int int29 = multiDirectional26.getEvaluations();
        multiDirectional26.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker32 = multiDirectional26.getConvergenceChecker();
        multiDirectional26.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int36 = multiDirectional35.getMaxEvaluations();
        multiDirectional35.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker39 = multiDirectional35.getConvergenceChecker();
        double[] doubleArray40 = new double[] {};
        multiDirectional35.setStartConfiguration(doubleArray40);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = multiDirectional35.getConvergenceChecker();
        int int43 = multiDirectional35.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional44 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional44.setMaxIterations(100);
        int int47 = multiDirectional44.getEvaluations();
        multiDirectional44.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional50 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional50.setMaxIterations(100);
        int int53 = multiDirectional50.getEvaluations();
        multiDirectional50.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional56.setMaxIterations(100);
        int int59 = multiDirectional56.getEvaluations();
        multiDirectional56.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker62 = multiDirectional56.getConvergenceChecker();
        multiDirectional50.setConvergenceChecker(realConvergenceChecker62);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional64 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int65 = multiDirectional64.getMaxEvaluations();
        multiDirectional64.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker68 = multiDirectional64.getConvergenceChecker();
        double[] doubleArray69 = new double[] {};
        multiDirectional64.setStartConfiguration(doubleArray69);
        multiDirectional50.setStartConfiguration(doubleArray69);
        multiDirectional44.setStartConfiguration(doubleArray69);
        multiDirectional35.setStartConfiguration(doubleArray69);
        multiDirectional26.setStartConfiguration(doubleArray69);
        multiDirectional18.setStartConfiguration(doubleArray69);
        multiDirectional5.setStartConfiguration(doubleArray69);
        multiDirectional2.setStartConfiguration(doubleArray69);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2147483647 + "'", int36 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker39);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2147483647 + "'", int65 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker68);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = multiDirectional0.getConvergenceChecker();
        int int6 = multiDirectional0.getIterations();
        int int7 = multiDirectional0.getIterations();
        int int8 = multiDirectional0.getMaxIterations();
        int int9 = multiDirectional0.getIterations();
        org.junit.Assert.assertNotNull(realConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional2.setMaxEvaluations((int) (short) -1);
        int int5 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional8.setMaxEvaluations((int) (short) -1);
        int int11 = multiDirectional8.getIterations();
        multiDirectional8.setMaxIterations((int) '#');
        int int14 = multiDirectional8.getMaxIterations();
        int int15 = multiDirectional8.getMaxEvaluations();
        int int16 = multiDirectional8.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional17.setMaxIterations(100);
        int int20 = multiDirectional17.getEvaluations();
        multiDirectional17.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional23.setMaxIterations(100);
        int int26 = multiDirectional23.getEvaluations();
        multiDirectional23.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker29 = multiDirectional23.getConvergenceChecker();
        multiDirectional17.setConvergenceChecker(realConvergenceChecker29);
        multiDirectional17.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional33.setMaxIterations(100);
        int int36 = multiDirectional33.getEvaluations();
        multiDirectional33.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker39 = multiDirectional33.getConvergenceChecker();
        multiDirectional33.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional42.setMaxIterations(100);
        int int45 = multiDirectional42.getEvaluations();
        multiDirectional42.setMaxEvaluations((int) ' ');
        double[] doubleArray48 = new double[] {};
        double[][] doubleArray49 = new double[][] { doubleArray48 };
        multiDirectional42.setStartConfiguration(doubleArray49);
        multiDirectional33.setStartConfiguration(doubleArray49);
        multiDirectional17.setStartConfiguration(doubleArray49);
        multiDirectional8.setStartConfiguration(doubleArray49);
        multiDirectional2.setStartConfiguration(doubleArray49);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        int int58 = multiDirectional57.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker59 = multiDirectional57.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker59);
        int int61 = multiDirectional2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker39);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10.0f, (double) 2147483647);
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction3 = null;
        org.apache.commons.math.optimization.GoalType goalType4 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getIterations();
        int int7 = multiDirectional5.getEvaluations();
        int int8 = multiDirectional5.getMaxIterations();
        double[] doubleArray9 = new double[] {};
        multiDirectional5.setStartConfiguration(doubleArray9);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional11.setMaxIterations(100);
        int int14 = multiDirectional11.getEvaluations();
        multiDirectional11.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional17.setMaxIterations(100);
        int int20 = multiDirectional17.getEvaluations();
        multiDirectional17.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = multiDirectional17.getConvergenceChecker();
        multiDirectional11.setConvergenceChecker(realConvergenceChecker23);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int26 = multiDirectional25.getMaxEvaluations();
        multiDirectional25.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker29 = multiDirectional25.getConvergenceChecker();
        double[] doubleArray30 = new double[] {};
        multiDirectional25.setStartConfiguration(doubleArray30);
        multiDirectional11.setStartConfiguration(doubleArray30);
        multiDirectional5.setStartConfiguration(doubleArray30);
        int int34 = multiDirectional5.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int36 = multiDirectional35.getIterations();
        int int37 = multiDirectional35.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = multiDirectional35.getConvergenceChecker();
        multiDirectional35.setMaxIterations((int) (byte) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int42 = multiDirectional41.getMaxEvaluations();
        int int43 = multiDirectional41.getMaxIterations();
        double[] doubleArray45 = new double[] { 100 };
        multiDirectional41.setStartConfiguration(doubleArray45);
        multiDirectional41.setMaxIterations((int) (short) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker49 = multiDirectional41.getConvergenceChecker();
        multiDirectional35.setConvergenceChecker(realConvergenceChecker49);
        multiDirectional5.setConvergenceChecker(realConvergenceChecker49);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional52 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional52.setMaxIterations(100);
        multiDirectional52.setMaxEvaluations((int) (short) 1);
        multiDirectional52.setMaxIterations((int) (byte) 1);
        multiDirectional52.setMaxEvaluations((int) '#');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional63 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int64 = multiDirectional63.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional65 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional65.setMaxIterations(100);
        multiDirectional65.setMaxEvaluations((int) (short) 1);
        int int70 = multiDirectional65.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional71 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int72 = multiDirectional71.getMaxEvaluations();
        multiDirectional71.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker75 = multiDirectional71.getConvergenceChecker();
        double[] doubleArray76 = new double[] {};
        multiDirectional71.setStartConfiguration(doubleArray76);
        multiDirectional65.setStartConfiguration(doubleArray76);
        multiDirectional63.setStartConfiguration(doubleArray76);
        multiDirectional52.setStartConfiguration(doubleArray76);
        multiDirectional5.setStartConfiguration(doubleArray76);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair82 = multiDirectional2.optimize(multivariateRealFunction3, goalType4, doubleArray76);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2147483647 + "'", int42 == 2147483647);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker49);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2147483647 + "'", int72 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker75);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertArrayEquals(doubleArray76, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional3.setMaxIterations(100);
        multiDirectional3.setMaxEvaluations((int) (short) 1);
        int int8 = multiDirectional3.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        multiDirectional9.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional9.getConvergenceChecker();
        double[] doubleArray14 = new double[] {};
        multiDirectional9.setStartConfiguration(doubleArray14);
        multiDirectional3.setStartConfiguration(doubleArray14);
        multiDirectional0.setStartConfiguration(doubleArray14);
        int int18 = multiDirectional0.getIterations();
        int int19 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, (double) (byte) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        multiDirectional23.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional23.getConvergenceChecker();
        double[] doubleArray28 = new double[] {};
        multiDirectional23.setStartConfiguration(doubleArray28);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional23.getConvergenceChecker();
        int int31 = multiDirectional23.getMaxEvaluations();
        int int32 = multiDirectional23.getEvaluations();
        multiDirectional23.setMaxIterations((int) (short) 10);
        multiDirectional23.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int40 = multiDirectional39.getIterations();
        multiDirectional39.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int44 = multiDirectional43.getIterations();
        int int45 = multiDirectional43.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int47 = multiDirectional46.getMaxEvaluations();
        int int48 = multiDirectional46.getMaxIterations();
        double[] doubleArray50 = new double[] { 100 };
        multiDirectional46.setStartConfiguration(doubleArray50);
        int int52 = multiDirectional46.getEvaluations();
        int int53 = multiDirectional46.getMaxIterations();
        int int54 = multiDirectional46.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional55.setMaxIterations(100);
        int int58 = multiDirectional55.getEvaluations();
        multiDirectional55.setMaxEvaluations((int) ' ');
        double[] doubleArray61 = new double[] {};
        double[][] doubleArray62 = new double[][] { doubleArray61 };
        multiDirectional55.setStartConfiguration(doubleArray62);
        multiDirectional46.setStartConfiguration(doubleArray62);
        multiDirectional43.setStartConfiguration(doubleArray62);
        multiDirectional39.setStartConfiguration(doubleArray62);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional67 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int68 = multiDirectional67.getMaxEvaluations();
        multiDirectional67.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker71 = multiDirectional67.getConvergenceChecker();
        double[] doubleArray72 = new double[] {};
        multiDirectional67.setStartConfiguration(doubleArray72);
        multiDirectional39.setStartConfiguration(doubleArray72);
        multiDirectional23.setStartConfiguration(doubleArray72);
        multiDirectional22.setStartConfiguration(doubleArray72);
        multiDirectional0.setStartConfiguration(doubleArray72);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker78 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations(52);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker71);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker78);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int7 = multiDirectional6.getIterations();
        multiDirectional6.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getIterations();
        int int12 = multiDirectional10.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        int int15 = multiDirectional13.getMaxIterations();
        double[] doubleArray17 = new double[] { 100 };
        multiDirectional13.setStartConfiguration(doubleArray17);
        int int19 = multiDirectional13.getEvaluations();
        int int20 = multiDirectional13.getMaxIterations();
        int int21 = multiDirectional13.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        int int25 = multiDirectional22.getEvaluations();
        multiDirectional22.setMaxEvaluations((int) ' ');
        double[] doubleArray28 = new double[] {};
        double[][] doubleArray29 = new double[][] { doubleArray28 };
        multiDirectional22.setStartConfiguration(doubleArray29);
        multiDirectional13.setStartConfiguration(doubleArray29);
        multiDirectional10.setStartConfiguration(doubleArray29);
        multiDirectional6.setStartConfiguration(doubleArray29);
        multiDirectional0.setStartConfiguration(doubleArray29);
        int int35 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        double[] doubleArray5 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray5);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional9.setMaxIterations(100);
        int int12 = multiDirectional9.getEvaluations();
        multiDirectional9.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional15 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional15.setMaxIterations(100);
        int int18 = multiDirectional15.getEvaluations();
        multiDirectional15.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional21 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional21.setMaxIterations(100);
        int int24 = multiDirectional21.getEvaluations();
        multiDirectional21.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional21.getConvergenceChecker();
        multiDirectional15.setConvergenceChecker(realConvergenceChecker27);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getMaxEvaluations();
        multiDirectional29.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional29.getConvergenceChecker();
        double[] doubleArray34 = new double[] {};
        multiDirectional29.setStartConfiguration(doubleArray34);
        multiDirectional15.setStartConfiguration(doubleArray34);
        multiDirectional9.setStartConfiguration(doubleArray34);
        multiDirectional0.setStartConfiguration(doubleArray34);
        int int39 = multiDirectional0.getEvaluations();
        int int40 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        multiDirectional0.setMaxIterations((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 10, (double) 1L);
        multiDirectional2.setMaxEvaluations((int) (short) 0);
        int int5 = multiDirectional2.getEvaluations();
        int int6 = multiDirectional2.getEvaluations();
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction7 = null;
        org.apache.commons.math.optimization.GoalType goalType8 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional11.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int15 = multiDirectional14.getMaxEvaluations();
        multiDirectional14.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker18 = multiDirectional14.getConvergenceChecker();
        double[] doubleArray19 = new double[] {};
        multiDirectional14.setStartConfiguration(doubleArray19);
        multiDirectional11.setStartConfiguration(doubleArray19);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair22 = multiDirectional2.optimize(multivariateRealFunction7, goalType8, doubleArray19);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math.FunctionEvaluationException; message: org.apache.commons.math.MaxEvaluationsExceededException: Maximal number of evaluations (0) exceeded");
        } catch (org.apache.commons.math.FunctionEvaluationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional2.getConvergenceChecker();
        int int4 = multiDirectional2.getMaxIterations();
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, (double) 100);
        int int3 = multiDirectional2.getEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 10, 0.0d);
        int int3 = multiDirectional2.getIterations();
        multiDirectional2.setMaxEvaluations(2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 10.0f);
        int int3 = multiDirectional2.getMaxIterations();
        int int4 = multiDirectional2.getMaxIterations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator5 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10, (double) ' ');
        int int3 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getIterations();
        int int6 = multiDirectional4.getMaxEvaluations();
        int int7 = multiDirectional4.getEvaluations();
        int int8 = multiDirectional4.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getIterations();
        int int11 = multiDirectional9.getEvaluations();
        int int12 = multiDirectional9.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional13.setMaxIterations(100);
        int int16 = multiDirectional13.getEvaluations();
        multiDirectional13.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional13.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional20.setMaxIterations(100);
        int int23 = multiDirectional20.getEvaluations();
        multiDirectional20.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional26.setMaxIterations(100);
        int int29 = multiDirectional26.getEvaluations();
        multiDirectional26.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker32 = multiDirectional26.getConvergenceChecker();
        multiDirectional20.setConvergenceChecker(realConvergenceChecker32);
        multiDirectional13.setConvergenceChecker(realConvergenceChecker32);
        multiDirectional9.setConvergenceChecker(realConvergenceChecker32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional36.setMaxIterations(100);
        int int39 = multiDirectional36.getEvaluations();
        multiDirectional36.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = multiDirectional36.getConvergenceChecker();
        multiDirectional9.setConvergenceChecker(realConvergenceChecker42);
        multiDirectional4.setConvergenceChecker(realConvergenceChecker42);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker45 = multiDirectional4.getConvergenceChecker();
        int int46 = multiDirectional4.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional49 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (-1.0d));
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional52 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int53 = multiDirectional52.getIterations();
        multiDirectional52.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int57 = multiDirectional56.getIterations();
        int int58 = multiDirectional56.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional59 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int60 = multiDirectional59.getMaxEvaluations();
        int int61 = multiDirectional59.getMaxIterations();
        double[] doubleArray63 = new double[] { 100 };
        multiDirectional59.setStartConfiguration(doubleArray63);
        int int65 = multiDirectional59.getEvaluations();
        int int66 = multiDirectional59.getMaxIterations();
        int int67 = multiDirectional59.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional68 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional68.setMaxIterations(100);
        int int71 = multiDirectional68.getEvaluations();
        multiDirectional68.setMaxEvaluations((int) ' ');
        double[] doubleArray74 = new double[] {};
        double[][] doubleArray75 = new double[][] { doubleArray74 };
        multiDirectional68.setStartConfiguration(doubleArray75);
        multiDirectional59.setStartConfiguration(doubleArray75);
        multiDirectional56.setStartConfiguration(doubleArray75);
        multiDirectional52.setStartConfiguration(doubleArray75);
        multiDirectional49.setStartConfiguration(doubleArray75);
        multiDirectional4.setStartConfiguration(doubleArray75);
        multiDirectional2.setStartConfiguration(doubleArray75);
        int int83 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker42);
        org.junit.Assert.assertNotNull(realConvergenceChecker45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2147483647 + "'", int58 == 2147483647);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2147483647 + "'", int61 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2147483647 + "'", int66 == 2147483647);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 2147483647 + "'", int83 == 2147483647);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations((int) (byte) 0);
        int int5 = multiDirectional0.getIterations();
        int int6 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        int int9 = multiDirectional0.getIterations();
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        int int7 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations((int) (byte) 100);
        int int10 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = multiDirectional0.getConvergenceChecker();
        int int12 = multiDirectional0.getIterations();
        int int13 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional14.setMaxIterations(100);
        multiDirectional14.setMaxEvaluations((int) (short) 1);
        multiDirectional14.setMaxEvaluations((int) (short) 1);
        int int21 = multiDirectional14.getIterations();
        int int22 = multiDirectional14.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional23.setMaxIterations(100);
        int int26 = multiDirectional23.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional27 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional27.setMaxIterations(100);
        multiDirectional27.setMaxEvaluations((int) (short) 1);
        int int32 = multiDirectional27.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int34 = multiDirectional33.getMaxEvaluations();
        multiDirectional33.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional33.getConvergenceChecker();
        double[] doubleArray38 = new double[] {};
        multiDirectional33.setStartConfiguration(doubleArray38);
        multiDirectional27.setStartConfiguration(doubleArray38);
        multiDirectional23.setStartConfiguration(doubleArray38);
        int int42 = multiDirectional23.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (double) '4');
        int int46 = multiDirectional45.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional47 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int48 = multiDirectional47.getMaxEvaluations();
        multiDirectional47.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker51 = multiDirectional47.getConvergenceChecker();
        int int52 = multiDirectional47.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional53.setMaxIterations(100);
        int int56 = multiDirectional53.getEvaluations();
        multiDirectional53.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional59 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional59.setMaxIterations(100);
        int int62 = multiDirectional59.getEvaluations();
        multiDirectional59.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional65 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional65.setMaxIterations(100);
        int int68 = multiDirectional65.getEvaluations();
        multiDirectional65.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker71 = multiDirectional65.getConvergenceChecker();
        multiDirectional59.setConvergenceChecker(realConvergenceChecker71);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional73 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int74 = multiDirectional73.getMaxEvaluations();
        multiDirectional73.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker77 = multiDirectional73.getConvergenceChecker();
        double[] doubleArray78 = new double[] {};
        multiDirectional73.setStartConfiguration(doubleArray78);
        multiDirectional59.setStartConfiguration(doubleArray78);
        multiDirectional53.setStartConfiguration(doubleArray78);
        multiDirectional47.setStartConfiguration(doubleArray78);
        multiDirectional45.setStartConfiguration(doubleArray78);
        multiDirectional23.setStartConfiguration(doubleArray78);
        multiDirectional14.setStartConfiguration(doubleArray78);
        multiDirectional0.setStartConfiguration(doubleArray78);
        multiDirectional0.setMaxEvaluations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2147483647 + "'", int26 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 2147483647 + "'", int74 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker77);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertArrayEquals(doubleArray78, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getMaxEvaluations();
        int int7 = multiDirectional0.getEvaluations();
        int int8 = multiDirectional0.getMaxIterations();
        int int9 = multiDirectional0.getIterations();
        int int10 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        multiDirectional5.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = multiDirectional5.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker9);
        int int11 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional12.setMaxIterations(100);
        int int15 = multiDirectional12.getEvaluations();
        multiDirectional12.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional18.getConvergenceChecker();
        multiDirectional12.setConvergenceChecker(realConvergenceChecker24);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker24);
        multiDirectional0.setMaxIterations((int) ' ');
        int int29 = multiDirectional0.getEvaluations();
        int int30 = multiDirectional0.getMaxIterations();
        java.lang.Class<?> wildcardClass31 = multiDirectional0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 32 + "'", int30 == 32);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0.0f, (double) 100);
        int int3 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getIterations();
        int int6 = multiDirectional4.getEvaluations();
        int int7 = multiDirectional4.getEvaluations();
        int int8 = multiDirectional4.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional9.setMaxIterations(100);
        int int12 = multiDirectional9.getEvaluations();
        multiDirectional9.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional9.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional16.setMaxIterations(100);
        int int19 = multiDirectional16.getEvaluations();
        multiDirectional16.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        int int25 = multiDirectional22.getEvaluations();
        multiDirectional22.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional22.getConvergenceChecker();
        multiDirectional16.setConvergenceChecker(realConvergenceChecker28);
        multiDirectional9.setConvergenceChecker(realConvergenceChecker28);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        multiDirectional31.setMaxEvaluations((int) (short) 1);
        multiDirectional31.setMaxEvaluations((int) (short) 1);
        int int38 = multiDirectional31.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional39.setMaxIterations(100);
        int int42 = multiDirectional39.getEvaluations();
        multiDirectional39.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional45.setMaxIterations(100);
        int int48 = multiDirectional45.getEvaluations();
        multiDirectional45.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker51 = multiDirectional45.getConvergenceChecker();
        multiDirectional39.setConvergenceChecker(realConvergenceChecker51);
        multiDirectional31.setConvergenceChecker(realConvergenceChecker51);
        multiDirectional9.setConvergenceChecker(realConvergenceChecker51);
        multiDirectional4.setConvergenceChecker(realConvergenceChecker51);
        int int56 = multiDirectional4.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional57.setMaxIterations(100);
        multiDirectional57.setMaxEvaluations((int) (short) 1);
        multiDirectional57.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker64 = multiDirectional57.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional65 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int66 = multiDirectional65.getMaxEvaluations();
        int int67 = multiDirectional65.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional68 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional68.setMaxIterations(100);
        int int71 = multiDirectional68.getEvaluations();
        multiDirectional68.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker74 = multiDirectional68.getConvergenceChecker();
        multiDirectional68.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional77 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional77.setMaxIterations(100);
        int int80 = multiDirectional77.getEvaluations();
        multiDirectional77.setMaxEvaluations((int) ' ');
        double[] doubleArray83 = new double[] {};
        double[][] doubleArray84 = new double[][] { doubleArray83 };
        multiDirectional77.setStartConfiguration(doubleArray84);
        multiDirectional68.setStartConfiguration(doubleArray84);
        multiDirectional65.setStartConfiguration(doubleArray84);
        multiDirectional57.setStartConfiguration(doubleArray84);
        multiDirectional4.setStartConfiguration(doubleArray84);
        multiDirectional2.setStartConfiguration(doubleArray84);
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator91 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2147483647 + "'", int66 == 2147483647);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker74);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertArrayEquals(doubleArray83, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray84);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (double) '4');
        int int3 = multiDirectional2.getIterations();
        int int4 = multiDirectional2.getIterations();
        int int5 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        multiDirectional6.setMaxEvaluations((int) (short) 1);
        multiDirectional6.setMaxIterations((int) (byte) 1);
        multiDirectional6.setMaxEvaluations((int) '#');
        multiDirectional6.setMaxIterations((int) (byte) 10);
        int int17 = multiDirectional6.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        multiDirectional18.setMaxEvaluations((int) (short) 1);
        int int23 = multiDirectional18.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int25 = multiDirectional24.getMaxEvaluations();
        multiDirectional24.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional24.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int30 = multiDirectional29.getMaxEvaluations();
        multiDirectional29.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional29.getConvergenceChecker();
        multiDirectional24.setConvergenceChecker(realConvergenceChecker33);
        int int35 = multiDirectional24.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional36.setMaxIterations(100);
        int int39 = multiDirectional36.getEvaluations();
        multiDirectional36.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional42.setMaxIterations(100);
        int int45 = multiDirectional42.getEvaluations();
        multiDirectional42.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker48 = multiDirectional42.getConvergenceChecker();
        multiDirectional36.setConvergenceChecker(realConvergenceChecker48);
        multiDirectional24.setConvergenceChecker(realConvergenceChecker48);
        multiDirectional18.setConvergenceChecker(realConvergenceChecker48);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker52 = multiDirectional18.getConvergenceChecker();
        multiDirectional6.setConvergenceChecker(realConvergenceChecker52);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker52);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional55.setMaxIterations(100);
        multiDirectional55.setMaxEvaluations((int) (short) 1);
        multiDirectional55.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker62 = multiDirectional55.getConvergenceChecker();
        int int63 = multiDirectional55.getMaxEvaluations();
        int int64 = multiDirectional55.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker65 = multiDirectional55.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker65);
        int int67 = multiDirectional2.getMaxEvaluations();
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator68 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator68);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker48);
        org.junit.Assert.assertNotNull(realConvergenceChecker52);
        org.junit.Assert.assertNotNull(realConvergenceChecker62);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2147483647 + "'", int67 == 2147483647);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        int int4 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = null;
        multiDirectional0.setConvergenceChecker(realConvergenceChecker5);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional9.setMaxEvaluations((int) (short) -1);
        int int12 = multiDirectional9.getIterations();
        multiDirectional9.setMaxIterations((int) '#');
        int int15 = multiDirectional9.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional16.setMaxIterations(100);
        int int19 = multiDirectional16.getEvaluations();
        multiDirectional16.setMaxEvaluations((int) ' ');
        double[] doubleArray22 = new double[] {};
        double[][] doubleArray23 = new double[][] { doubleArray22 };
        multiDirectional16.setStartConfiguration(doubleArray23);
        multiDirectional9.setStartConfiguration(doubleArray23);
        multiDirectional0.setStartConfiguration(doubleArray23);
        multiDirectional0.setMaxIterations((int) ' ');
        multiDirectional0.setMaxEvaluations((int) (byte) 0);
        int int31 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker5 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int7 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional12.setMaxEvaluations((int) (short) -1);
        int int15 = multiDirectional12.getIterations();
        multiDirectional12.setMaxIterations((int) '#');
        int int18 = multiDirectional12.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional19.setMaxIterations(100);
        int int22 = multiDirectional19.getEvaluations();
        multiDirectional19.setMaxEvaluations((int) ' ');
        double[] doubleArray25 = new double[] {};
        double[][] doubleArray26 = new double[][] { doubleArray25 };
        multiDirectional19.setStartConfiguration(doubleArray26);
        multiDirectional12.setStartConfiguration(doubleArray26);
        multiDirectional6.setStartConfiguration(doubleArray26);
        multiDirectional0.setStartConfiguration(doubleArray26);
        java.lang.Class<?> wildcardClass31 = doubleArray26.getClass();
        org.junit.Assert.assertNotNull(realConvergenceChecker5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations((int) ' ');
        int int10 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) '4');
        int int13 = multiDirectional0.getMaxIterations();
        int int14 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 100, (double) 32);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getMaxEvaluations();
        multiDirectional18.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker22 = multiDirectional18.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        multiDirectional23.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional23.getConvergenceChecker();
        multiDirectional18.setConvergenceChecker(realConvergenceChecker27);
        int int29 = multiDirectional18.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int31 = multiDirectional30.getIterations();
        int int32 = multiDirectional30.getEvaluations();
        int int33 = multiDirectional30.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int35 = multiDirectional34.getMaxEvaluations();
        multiDirectional34.setMaxIterations((int) (byte) 0);
        int int38 = multiDirectional34.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker39 = null;
        multiDirectional34.setConvergenceChecker(realConvergenceChecker39);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional43.setMaxEvaluations((int) (short) -1);
        int int46 = multiDirectional43.getIterations();
        multiDirectional43.setMaxIterations((int) '#');
        int int49 = multiDirectional43.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional50 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional50.setMaxIterations(100);
        int int53 = multiDirectional50.getEvaluations();
        multiDirectional50.setMaxEvaluations((int) ' ');
        double[] doubleArray56 = new double[] {};
        double[][] doubleArray57 = new double[][] { doubleArray56 };
        multiDirectional50.setStartConfiguration(doubleArray57);
        multiDirectional43.setStartConfiguration(doubleArray57);
        multiDirectional34.setStartConfiguration(doubleArray57);
        multiDirectional30.setStartConfiguration(doubleArray57);
        multiDirectional18.setStartConfiguration(doubleArray57);
        multiDirectional17.setStartConfiguration(doubleArray57);
        multiDirectional0.setStartConfiguration(doubleArray57);
        int int65 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2147483647 + "'", int35 == 2147483647);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 35 + "'", int49 == 35);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        int int4 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1), (double) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional10.setMaxIterations(100);
        int int13 = multiDirectional10.getEvaluations();
        multiDirectional10.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker16 = multiDirectional10.getConvergenceChecker();
        multiDirectional10.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int20 = multiDirectional19.getMaxEvaluations();
        multiDirectional19.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = multiDirectional19.getConvergenceChecker();
        double[] doubleArray24 = new double[] {};
        multiDirectional19.setStartConfiguration(doubleArray24);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = multiDirectional19.getConvergenceChecker();
        int int27 = multiDirectional19.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional28 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional28.setMaxIterations(100);
        int int31 = multiDirectional28.getEvaluations();
        multiDirectional28.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional34.setMaxIterations(100);
        int int37 = multiDirectional34.getEvaluations();
        multiDirectional34.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional40 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional40.setMaxIterations(100);
        int int43 = multiDirectional40.getEvaluations();
        multiDirectional40.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker46 = multiDirectional40.getConvergenceChecker();
        multiDirectional34.setConvergenceChecker(realConvergenceChecker46);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int49 = multiDirectional48.getMaxEvaluations();
        multiDirectional48.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker52 = multiDirectional48.getConvergenceChecker();
        double[] doubleArray53 = new double[] {};
        multiDirectional48.setStartConfiguration(doubleArray53);
        multiDirectional34.setStartConfiguration(doubleArray53);
        multiDirectional28.setStartConfiguration(doubleArray53);
        multiDirectional19.setStartConfiguration(doubleArray53);
        multiDirectional10.setStartConfiguration(doubleArray53);
        multiDirectional9.setStartConfiguration(doubleArray53);
        multiDirectional0.setStartConfiguration(doubleArray53);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker61 = multiDirectional0.getConvergenceChecker();
        int int62 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker63 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxIterations(100);
        int int66 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker52);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 1 + "'", int62 == 1);
        org.junit.Assert.assertNotNull(realConvergenceChecker63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional6.getConvergenceChecker();
        int int13 = multiDirectional6.getMaxIterations();
        multiDirectional6.setMaxIterations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int17 = multiDirectional16.getMaxEvaluations();
        int int18 = multiDirectional16.getMaxIterations();
        double[] doubleArray20 = new double[] { 100 };
        multiDirectional16.setStartConfiguration(doubleArray20);
        multiDirectional6.setStartConfiguration(doubleArray20);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int26 = multiDirectional25.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional27 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional27.setMaxIterations(100);
        multiDirectional27.setMaxEvaluations((int) (short) 1);
        int int32 = multiDirectional27.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional33 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int34 = multiDirectional33.getMaxEvaluations();
        multiDirectional33.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional33.getConvergenceChecker();
        double[] doubleArray38 = new double[] {};
        multiDirectional33.setStartConfiguration(doubleArray38);
        multiDirectional27.setStartConfiguration(doubleArray38);
        multiDirectional25.setStartConfiguration(doubleArray38);
        multiDirectional6.setStartConfiguration(doubleArray38);
        multiDirectional0.setStartConfiguration(doubleArray38);
        int int44 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2147483647 + "'", int34 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        double[] doubleArray4 = new double[] { 100 };
        multiDirectional0.setStartConfiguration(doubleArray4);
        int int6 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int8 = multiDirectional7.getIterations();
        int int9 = multiDirectional7.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getMaxEvaluations();
        int int12 = multiDirectional10.getMaxIterations();
        double[] doubleArray14 = new double[] { 100 };
        multiDirectional10.setStartConfiguration(doubleArray14);
        int int16 = multiDirectional10.getEvaluations();
        int int17 = multiDirectional10.getMaxIterations();
        int int18 = multiDirectional10.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional19.setMaxIterations(100);
        int int22 = multiDirectional19.getEvaluations();
        multiDirectional19.setMaxEvaluations((int) ' ');
        double[] doubleArray25 = new double[] {};
        double[][] doubleArray26 = new double[][] { doubleArray25 };
        multiDirectional19.setStartConfiguration(doubleArray26);
        multiDirectional10.setStartConfiguration(doubleArray26);
        multiDirectional7.setStartConfiguration(doubleArray26);
        multiDirectional0.setStartConfiguration(doubleArray26);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker31 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations(2147483647);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional34 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int35 = multiDirectional34.getIterations();
        int int36 = multiDirectional34.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker37 = multiDirectional34.getConvergenceChecker();
        int int38 = multiDirectional34.getIterations();
        int int39 = multiDirectional34.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 0, (double) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int44 = multiDirectional43.getMaxEvaluations();
        int int45 = multiDirectional43.getMaxIterations();
        double[] doubleArray47 = new double[] { 100 };
        multiDirectional43.setStartConfiguration(doubleArray47);
        int int49 = multiDirectional43.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional50 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int51 = multiDirectional50.getIterations();
        int int52 = multiDirectional50.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int54 = multiDirectional53.getMaxEvaluations();
        int int55 = multiDirectional53.getMaxIterations();
        double[] doubleArray57 = new double[] { 100 };
        multiDirectional53.setStartConfiguration(doubleArray57);
        int int59 = multiDirectional53.getEvaluations();
        int int60 = multiDirectional53.getMaxIterations();
        int int61 = multiDirectional53.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional62 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional62.setMaxIterations(100);
        int int65 = multiDirectional62.getEvaluations();
        multiDirectional62.setMaxEvaluations((int) ' ');
        double[] doubleArray68 = new double[] {};
        double[][] doubleArray69 = new double[][] { doubleArray68 };
        multiDirectional62.setStartConfiguration(doubleArray69);
        multiDirectional53.setStartConfiguration(doubleArray69);
        multiDirectional50.setStartConfiguration(doubleArray69);
        multiDirectional43.setStartConfiguration(doubleArray69);
        multiDirectional42.setStartConfiguration(doubleArray69);
        multiDirectional34.setStartConfiguration(doubleArray69);
        multiDirectional0.setStartConfiguration(doubleArray69);
        int int77 = multiDirectional0.getMaxIterations();
        int int78 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2147483647 + "'", int9 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2147483647 + "'", int11 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(realConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2147483647 + "'", int54 == 2147483647);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertArrayEquals(doubleArray68, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 2147483647 + "'", int77 == 2147483647);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 2147483647 + "'", int78 == 2147483647);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 1, (double) (short) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int4 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxIterations((int) (byte) 0);
        int int7 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1), (double) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional13.setMaxIterations(100);
        int int16 = multiDirectional13.getEvaluations();
        multiDirectional13.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional13.getConvergenceChecker();
        multiDirectional13.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int23 = multiDirectional22.getMaxEvaluations();
        multiDirectional22.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = multiDirectional22.getConvergenceChecker();
        double[] doubleArray27 = new double[] {};
        multiDirectional22.setStartConfiguration(doubleArray27);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker29 = multiDirectional22.getConvergenceChecker();
        int int30 = multiDirectional22.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        int int34 = multiDirectional31.getEvaluations();
        multiDirectional31.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional37.setMaxIterations(100);
        int int40 = multiDirectional37.getEvaluations();
        multiDirectional37.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional43.setMaxIterations(100);
        int int46 = multiDirectional43.getEvaluations();
        multiDirectional43.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker49 = multiDirectional43.getConvergenceChecker();
        multiDirectional37.setConvergenceChecker(realConvergenceChecker49);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional51 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int52 = multiDirectional51.getMaxEvaluations();
        multiDirectional51.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker55 = multiDirectional51.getConvergenceChecker();
        double[] doubleArray56 = new double[] {};
        multiDirectional51.setStartConfiguration(doubleArray56);
        multiDirectional37.setStartConfiguration(doubleArray56);
        multiDirectional31.setStartConfiguration(doubleArray56);
        multiDirectional22.setStartConfiguration(doubleArray56);
        multiDirectional13.setStartConfiguration(doubleArray56);
        multiDirectional12.setStartConfiguration(doubleArray56);
        multiDirectional3.setStartConfiguration(doubleArray56);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker64 = multiDirectional3.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker64);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker66 = multiDirectional2.getConvergenceChecker();
        multiDirectional2.setMaxEvaluations((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2147483647 + "'", int30 == 2147483647);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker55);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker64);
        org.junit.Assert.assertNotNull(realConvergenceChecker66);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 100, (double) 10L);
        int int3 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations((int) (byte) -1);
        int int7 = multiDirectional0.getIterations();
        int int8 = multiDirectional0.getIterations();
        int int9 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getIterations();
        int int12 = multiDirectional10.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        int int15 = multiDirectional13.getMaxIterations();
        double[] doubleArray17 = new double[] { 100 };
        multiDirectional13.setStartConfiguration(doubleArray17);
        int int19 = multiDirectional13.getEvaluations();
        int int20 = multiDirectional13.getMaxIterations();
        int int21 = multiDirectional13.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        int int25 = multiDirectional22.getEvaluations();
        multiDirectional22.setMaxEvaluations((int) ' ');
        double[] doubleArray28 = new double[] {};
        double[][] doubleArray29 = new double[][] { doubleArray28 };
        multiDirectional22.setStartConfiguration(doubleArray29);
        multiDirectional13.setStartConfiguration(doubleArray29);
        multiDirectional10.setStartConfiguration(doubleArray29);
        multiDirectional0.setStartConfiguration(doubleArray29);
        int int34 = multiDirectional0.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker35 = multiDirectional0.getConvergenceChecker();
        int int36 = multiDirectional0.getMaxEvaluations();
        int int37 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = multiDirectional0.getConvergenceChecker();
        int int39 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(realConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (byte) -1);
        int int3 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getIterations();
        int int6 = multiDirectional4.getEvaluations();
        int int7 = multiDirectional4.getEvaluations();
        int int8 = multiDirectional4.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional9.setMaxIterations(100);
        int int12 = multiDirectional9.getEvaluations();
        multiDirectional9.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional9.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional16.setMaxIterations(100);
        int int19 = multiDirectional16.getEvaluations();
        multiDirectional16.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        int int25 = multiDirectional22.getEvaluations();
        multiDirectional22.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional22.getConvergenceChecker();
        multiDirectional16.setConvergenceChecker(realConvergenceChecker28);
        multiDirectional9.setConvergenceChecker(realConvergenceChecker28);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        multiDirectional31.setMaxEvaluations((int) (short) 1);
        multiDirectional31.setMaxEvaluations((int) (short) 1);
        int int38 = multiDirectional31.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional39.setMaxIterations(100);
        int int42 = multiDirectional39.getEvaluations();
        multiDirectional39.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional45.setMaxIterations(100);
        int int48 = multiDirectional45.getEvaluations();
        multiDirectional45.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker51 = multiDirectional45.getConvergenceChecker();
        multiDirectional39.setConvergenceChecker(realConvergenceChecker51);
        multiDirectional31.setConvergenceChecker(realConvergenceChecker51);
        multiDirectional9.setConvergenceChecker(realConvergenceChecker51);
        multiDirectional4.setConvergenceChecker(realConvergenceChecker51);
        int int56 = multiDirectional4.getMaxIterations();
        multiDirectional4.setMaxIterations(1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker59 = multiDirectional4.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker59);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker51);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2147483647 + "'", int56 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker59);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (byte) 100, (double) 10L);
        multiDirectional2.setMaxEvaluations(2147483647);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional2.setMaxEvaluations((int) (short) -1);
        int int5 = multiDirectional2.getIterations();
        multiDirectional2.setMaxIterations((int) '#');
        int int8 = multiDirectional2.getMaxIterations();
        int int9 = multiDirectional2.getMaxEvaluations();
        int int10 = multiDirectional2.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional11.setMaxIterations(100);
        int int14 = multiDirectional11.getEvaluations();
        multiDirectional11.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional11.getConvergenceChecker();
        multiDirectional11.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional20.setMaxIterations(100);
        int int23 = multiDirectional20.getEvaluations();
        multiDirectional20.setMaxEvaluations((int) ' ');
        double[] doubleArray26 = new double[] {};
        double[][] doubleArray27 = new double[][] { doubleArray26 };
        multiDirectional20.setStartConfiguration(doubleArray27);
        multiDirectional11.setStartConfiguration(doubleArray27);
        multiDirectional2.setStartConfiguration(doubleArray27);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker31 = multiDirectional2.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional32 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int33 = multiDirectional32.getMaxEvaluations();
        multiDirectional32.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker36 = multiDirectional32.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int38 = multiDirectional37.getMaxEvaluations();
        multiDirectional37.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker41 = multiDirectional37.getConvergenceChecker();
        multiDirectional32.setConvergenceChecker(realConvergenceChecker41);
        int int43 = multiDirectional32.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional44 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int45 = multiDirectional44.getIterations();
        int int46 = multiDirectional44.getEvaluations();
        int int47 = multiDirectional44.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int49 = multiDirectional48.getMaxEvaluations();
        multiDirectional48.setMaxIterations((int) (byte) 0);
        int int52 = multiDirectional48.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker53 = null;
        multiDirectional48.setConvergenceChecker(realConvergenceChecker53);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional57.setMaxEvaluations((int) (short) -1);
        int int60 = multiDirectional57.getIterations();
        multiDirectional57.setMaxIterations((int) '#');
        int int63 = multiDirectional57.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional64 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional64.setMaxIterations(100);
        int int67 = multiDirectional64.getEvaluations();
        multiDirectional64.setMaxEvaluations((int) ' ');
        double[] doubleArray70 = new double[] {};
        double[][] doubleArray71 = new double[][] { doubleArray70 };
        multiDirectional64.setStartConfiguration(doubleArray71);
        multiDirectional57.setStartConfiguration(doubleArray71);
        multiDirectional48.setStartConfiguration(doubleArray71);
        multiDirectional44.setStartConfiguration(doubleArray71);
        multiDirectional32.setStartConfiguration(doubleArray71);
        multiDirectional2.setStartConfiguration(doubleArray71);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker78 = multiDirectional2.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertNotNull(realConvergenceChecker31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2147483647 + "'", int38 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 35 + "'", int63 == 35);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertNotNull(realConvergenceChecker78);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) 0L);
        multiDirectional2.setMaxIterations(100);
        multiDirectional2.setMaxEvaluations(32);
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) 10.0f);
        int int3 = multiDirectional2.getMaxIterations();
        java.lang.Class<?> wildcardClass4 = multiDirectional2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2147483647 + "'", int3 == 2147483647);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10.0f, 1.0d);
        multiDirectional2.setMaxIterations(0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional5.setMaxIterations(100);
        multiDirectional5.setMaxEvaluations((int) (short) 1);
        int int10 = multiDirectional5.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getMaxEvaluations();
        multiDirectional11.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional11.getConvergenceChecker();
        double[] doubleArray16 = new double[] {};
        multiDirectional11.setStartConfiguration(doubleArray16);
        multiDirectional5.setStartConfiguration(doubleArray16);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int20 = multiDirectional19.getIterations();
        int int21 = multiDirectional19.getEvaluations();
        int int22 = multiDirectional19.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional23.setMaxIterations(100);
        int int26 = multiDirectional23.getEvaluations();
        multiDirectional23.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker29 = multiDirectional23.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional30 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional30.setMaxIterations(100);
        int int33 = multiDirectional30.getEvaluations();
        multiDirectional30.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional36.setMaxIterations(100);
        int int39 = multiDirectional36.getEvaluations();
        multiDirectional36.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker42 = multiDirectional36.getConvergenceChecker();
        multiDirectional30.setConvergenceChecker(realConvergenceChecker42);
        multiDirectional23.setConvergenceChecker(realConvergenceChecker42);
        multiDirectional19.setConvergenceChecker(realConvergenceChecker42);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional46.setMaxIterations(100);
        int int49 = multiDirectional46.getEvaluations();
        multiDirectional46.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker52 = multiDirectional46.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional53 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional53.setMaxIterations(100);
        int int56 = multiDirectional53.getEvaluations();
        multiDirectional53.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional59 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional59.setMaxIterations(100);
        int int62 = multiDirectional59.getEvaluations();
        multiDirectional59.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker65 = multiDirectional59.getConvergenceChecker();
        multiDirectional53.setConvergenceChecker(realConvergenceChecker65);
        multiDirectional46.setConvergenceChecker(realConvergenceChecker65);
        multiDirectional19.setConvergenceChecker(realConvergenceChecker65);
        multiDirectional5.setConvergenceChecker(realConvergenceChecker65);
        multiDirectional2.setConvergenceChecker(realConvergenceChecker65);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional71 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional72 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int73 = multiDirectional72.getMaxEvaluations();
        multiDirectional72.setMaxIterations((int) (byte) 0);
        int int76 = multiDirectional72.getMaxEvaluations();
        multiDirectional72.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional79 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional79.setMaxIterations(100);
        multiDirectional79.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker84 = multiDirectional79.getConvergenceChecker();
        multiDirectional72.setConvergenceChecker(realConvergenceChecker84);
        multiDirectional71.setConvergenceChecker(realConvergenceChecker84);
        multiDirectional71.setMaxEvaluations((int) (short) 100);
        int int89 = multiDirectional71.getEvaluations();
        multiDirectional71.setMaxIterations(10);
        int int92 = multiDirectional71.getMaxEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker93 = multiDirectional71.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker93);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker29);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker42);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker52);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker65);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2147483647 + "'", int73 == 2147483647);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2147483647 + "'", int76 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker84);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 100 + "'", int92 == 100);
        org.junit.Assert.assertNotNull(realConvergenceChecker93);
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getMaxEvaluations();
        int int3 = multiDirectional0.getEvaluations();
        int int4 = multiDirectional0.getEvaluations();
        int int5 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker6 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional7 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int8 = multiDirectional7.getMaxEvaluations();
        int int9 = multiDirectional7.getIterations();
        int int10 = multiDirectional7.getMaxIterations();
        multiDirectional7.setMaxEvaluations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getIterations();
        int int15 = multiDirectional13.getEvaluations();
        int int16 = multiDirectional13.getMaxIterations();
        multiDirectional13.setMaxIterations((int) (byte) -1);
        int int19 = multiDirectional13.getIterations();
        int int20 = multiDirectional13.getMaxEvaluations();
        int int21 = multiDirectional13.getMaxIterations();
        int int22 = multiDirectional13.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional23.setMaxIterations(100);
        multiDirectional23.setMaxEvaluations((int) (short) 1);
        int int28 = multiDirectional23.getMaxIterations();
        multiDirectional23.setMaxIterations(0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional31.setMaxIterations(100);
        int int34 = multiDirectional31.getEvaluations();
        multiDirectional31.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional37 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional37.setMaxIterations(100);
        int int40 = multiDirectional37.getEvaluations();
        multiDirectional37.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker43 = multiDirectional37.getConvergenceChecker();
        multiDirectional31.setConvergenceChecker(realConvergenceChecker43);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int46 = multiDirectional45.getMaxEvaluations();
        multiDirectional45.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker49 = multiDirectional45.getConvergenceChecker();
        double[] doubleArray50 = new double[] {};
        multiDirectional45.setStartConfiguration(doubleArray50);
        multiDirectional31.setStartConfiguration(doubleArray50);
        multiDirectional23.setStartConfiguration(doubleArray50);
        multiDirectional13.setStartConfiguration(doubleArray50);
        multiDirectional7.setStartConfiguration(doubleArray50);
        multiDirectional0.setStartConfiguration(doubleArray50);
        java.lang.Class<?> wildcardClass57 = doubleArray50.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2147483647 + "'", int16 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2147483647 + "'", int22 == 2147483647);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2147483647 + "'", int46 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker49);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (double) 100L);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int4 = multiDirectional3.getMaxEvaluations();
        int int5 = multiDirectional3.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int7 = multiDirectional6.getMaxEvaluations();
        multiDirectional6.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional6.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int12 = multiDirectional11.getMaxEvaluations();
        multiDirectional11.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker15 = multiDirectional11.getConvergenceChecker();
        multiDirectional6.setConvergenceChecker(realConvergenceChecker15);
        int int17 = multiDirectional6.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional24 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional24.setMaxIterations(100);
        int int27 = multiDirectional24.getEvaluations();
        multiDirectional24.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional24.getConvergenceChecker();
        multiDirectional18.setConvergenceChecker(realConvergenceChecker30);
        multiDirectional6.setConvergenceChecker(realConvergenceChecker30);
        multiDirectional3.setConvergenceChecker(realConvergenceChecker30);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker34 = multiDirectional3.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker34);
        multiDirectional2.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker38 = null;
        multiDirectional2.setConvergenceChecker(realConvergenceChecker38);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2147483647 + "'", int7 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertNotNull(realConvergenceChecker34);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional2.setMaxEvaluations((int) (short) -1);
        int int5 = multiDirectional2.getIterations();
        multiDirectional2.setMaxIterations((int) '#');
        int int8 = multiDirectional2.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional9.setMaxIterations(100);
        int int12 = multiDirectional9.getEvaluations();
        multiDirectional9.setMaxEvaluations((int) ' ');
        double[] doubleArray15 = new double[] {};
        double[][] doubleArray16 = new double[][] { doubleArray15 };
        multiDirectional9.setStartConfiguration(doubleArray16);
        multiDirectional2.setStartConfiguration(doubleArray16);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional19 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional19.setMaxIterations(100);
        int int22 = multiDirectional19.getEvaluations();
        multiDirectional19.setMaxEvaluations((int) ' ');
        double[] doubleArray25 = new double[] {};
        double[][] doubleArray26 = new double[][] { doubleArray25 };
        multiDirectional19.setStartConfiguration(doubleArray26);
        multiDirectional2.setStartConfiguration(doubleArray26);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional(100.0d, 0.0d);
        int int32 = multiDirectional31.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker33 = multiDirectional31.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker33);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker33);
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        multiDirectional2.setMaxEvaluations((int) (short) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        multiDirectional5.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = multiDirectional5.getConvergenceChecker();
        double[] doubleArray10 = new double[] {};
        multiDirectional5.setStartConfiguration(doubleArray10);
        multiDirectional2.setStartConfiguration(doubleArray10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional13.setMaxIterations(100);
        multiDirectional13.setMaxEvaluations((int) (short) 1);
        multiDirectional13.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker20 = multiDirectional13.getConvergenceChecker();
        int int21 = multiDirectional13.getMaxEvaluations();
        int int22 = multiDirectional13.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = multiDirectional13.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker23);
        int int25 = multiDirectional2.getMaxEvaluations();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int6 = multiDirectional5.getMaxEvaluations();
        multiDirectional5.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker9 = multiDirectional5.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker9);
        int int11 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        multiDirectional0.setMaxEvaluations((int) (byte) -1);
        int int7 = multiDirectional0.getIterations();
        int int8 = multiDirectional0.getIterations();
        int int9 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int11 = multiDirectional10.getIterations();
        int int12 = multiDirectional10.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getMaxEvaluations();
        int int15 = multiDirectional13.getMaxIterations();
        double[] doubleArray17 = new double[] { 100 };
        multiDirectional13.setStartConfiguration(doubleArray17);
        int int19 = multiDirectional13.getEvaluations();
        int int20 = multiDirectional13.getMaxIterations();
        int int21 = multiDirectional13.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        int int25 = multiDirectional22.getEvaluations();
        multiDirectional22.setMaxEvaluations((int) ' ');
        double[] doubleArray28 = new double[] {};
        double[][] doubleArray29 = new double[][] { doubleArray28 };
        multiDirectional22.setStartConfiguration(doubleArray29);
        multiDirectional13.setStartConfiguration(doubleArray29);
        multiDirectional10.setStartConfiguration(doubleArray29);
        multiDirectional0.setStartConfiguration(doubleArray29);
        int int34 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) (short) 100);
        int int37 = multiDirectional0.getIterations();
        int int38 = multiDirectional0.getMaxIterations();
        java.lang.Class<?> wildcardClass39 = multiDirectional0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2147483647 + "'", int14 == 2147483647);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2147483647 + "'", int20 == 2147483647);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getMaxEvaluations();
        int int3 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional4.setMaxIterations(100);
        int int7 = multiDirectional4.getEvaluations();
        multiDirectional4.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker10 = multiDirectional4.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional11.setMaxIterations(100);
        int int14 = multiDirectional11.getEvaluations();
        multiDirectional11.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional17.setMaxIterations(100);
        int int20 = multiDirectional17.getEvaluations();
        multiDirectional17.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker23 = multiDirectional17.getConvergenceChecker();
        multiDirectional11.setConvergenceChecker(realConvergenceChecker23);
        multiDirectional4.setConvergenceChecker(realConvergenceChecker23);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker23);
        int int27 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxEvaluations((int) (short) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional0.getConvergenceChecker();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker23);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2147483647 + "'", int27 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        int int9 = multiDirectional0.getMaxEvaluations();
        int int10 = multiDirectional0.getMaxIterations();
        int int11 = multiDirectional0.getMaxEvaluations();
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        int int7 = multiDirectional0.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional8 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional8.setMaxIterations(100);
        int int11 = multiDirectional8.getEvaluations();
        multiDirectional8.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional14.setMaxIterations(100);
        int int17 = multiDirectional14.getEvaluations();
        multiDirectional14.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker20 = multiDirectional14.getConvergenceChecker();
        multiDirectional8.setConvergenceChecker(realConvergenceChecker20);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker20);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        int int25 = multiDirectional23.getMaxIterations();
        double[] doubleArray27 = new double[] { 100 };
        multiDirectional23.setStartConfiguration(doubleArray27);
        int int29 = multiDirectional23.getMaxEvaluations();
        int int30 = multiDirectional23.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int32 = multiDirectional31.getMaxEvaluations();
        int int33 = multiDirectional31.getMaxIterations();
        double[] doubleArray35 = new double[] { 100 };
        multiDirectional31.setStartConfiguration(doubleArray35);
        multiDirectional23.setStartConfiguration(doubleArray35);
        multiDirectional0.setStartConfiguration(doubleArray35);
        int int39 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) '4');
        int int42 = multiDirectional0.getIterations();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker20);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        multiDirectional0.setMaxEvaluations((int) (short) 1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        int int9 = multiDirectional0.getMaxEvaluations();
        int int10 = multiDirectional0.getMaxIterations();
        int int11 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations((int) (short) 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0, (double) ' ');
        int int3 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (short) 1, (double) (byte) 0);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int4 = multiDirectional3.getMaxEvaluations();
        int int5 = multiDirectional3.getMaxIterations();
        int int6 = multiDirectional3.getMaxEvaluations();
        int int7 = multiDirectional3.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional10 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1), (double) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional11 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional11.setMaxIterations(100);
        int int14 = multiDirectional11.getEvaluations();
        multiDirectional11.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker17 = multiDirectional11.getConvergenceChecker();
        multiDirectional11.setMaxIterations(1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int21 = multiDirectional20.getMaxEvaluations();
        multiDirectional20.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional20.getConvergenceChecker();
        double[] doubleArray25 = new double[] {};
        multiDirectional20.setStartConfiguration(doubleArray25);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional20.getConvergenceChecker();
        int int28 = multiDirectional20.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional29.setMaxIterations(100);
        int int32 = multiDirectional29.getEvaluations();
        multiDirectional29.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional35.setMaxIterations(100);
        int int38 = multiDirectional35.getEvaluations();
        multiDirectional35.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional41.setMaxIterations(100);
        int int44 = multiDirectional41.getEvaluations();
        multiDirectional41.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker47 = multiDirectional41.getConvergenceChecker();
        multiDirectional35.setConvergenceChecker(realConvergenceChecker47);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional49 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int50 = multiDirectional49.getMaxEvaluations();
        multiDirectional49.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker53 = multiDirectional49.getConvergenceChecker();
        double[] doubleArray54 = new double[] {};
        multiDirectional49.setStartConfiguration(doubleArray54);
        multiDirectional35.setStartConfiguration(doubleArray54);
        multiDirectional29.setStartConfiguration(doubleArray54);
        multiDirectional20.setStartConfiguration(doubleArray54);
        multiDirectional11.setStartConfiguration(doubleArray54);
        multiDirectional10.setStartConfiguration(doubleArray54);
        multiDirectional3.setStartConfiguration(doubleArray54);
        multiDirectional2.setStartConfiguration(doubleArray54);
        int int63 = multiDirectional2.getIterations();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker17);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2147483647 + "'", int28 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker53);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1L), (double) (-1L));
        int int3 = multiDirectional2.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional4 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int5 = multiDirectional4.getMaxEvaluations();
        int int6 = multiDirectional4.getMaxIterations();
        double[] doubleArray8 = new double[] { 100 };
        multiDirectional4.setStartConfiguration(doubleArray8);
        int int10 = multiDirectional4.getMaxEvaluations();
        int int11 = multiDirectional4.getEvaluations();
        int int12 = multiDirectional4.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getIterations();
        int int15 = multiDirectional13.getMaxEvaluations();
        int int16 = multiDirectional13.getEvaluations();
        int int17 = multiDirectional13.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int19 = multiDirectional18.getIterations();
        int int20 = multiDirectional18.getEvaluations();
        int int21 = multiDirectional18.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional22.setMaxIterations(100);
        int int25 = multiDirectional22.getEvaluations();
        multiDirectional22.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker28 = multiDirectional22.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional29.setMaxIterations(100);
        int int32 = multiDirectional29.getEvaluations();
        multiDirectional29.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional35.setMaxIterations(100);
        int int38 = multiDirectional35.getEvaluations();
        multiDirectional35.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker41 = multiDirectional35.getConvergenceChecker();
        multiDirectional29.setConvergenceChecker(realConvergenceChecker41);
        multiDirectional22.setConvergenceChecker(realConvergenceChecker41);
        multiDirectional18.setConvergenceChecker(realConvergenceChecker41);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional45.setMaxIterations(100);
        int int48 = multiDirectional45.getEvaluations();
        multiDirectional45.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker51 = multiDirectional45.getConvergenceChecker();
        multiDirectional18.setConvergenceChecker(realConvergenceChecker51);
        multiDirectional13.setConvergenceChecker(realConvergenceChecker51);
        multiDirectional4.setConvergenceChecker(realConvergenceChecker51);
        int int55 = multiDirectional4.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional56 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int57 = multiDirectional56.getMaxEvaluations();
        multiDirectional56.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker60 = multiDirectional56.getConvergenceChecker();
        int int61 = multiDirectional56.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional62 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int63 = multiDirectional62.getMaxEvaluations();
        multiDirectional62.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker66 = multiDirectional62.getConvergenceChecker();
        double[] doubleArray67 = new double[] {};
        multiDirectional62.setStartConfiguration(doubleArray67);
        multiDirectional56.setStartConfiguration(doubleArray67);
        multiDirectional4.setStartConfiguration(doubleArray67);
        multiDirectional2.setStartConfiguration(doubleArray67);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker72 = multiDirectional2.getConvergenceChecker();
        multiDirectional2.setMaxIterations((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2147483647 + "'", int5 == 2147483647);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2147483647 + "'", int6 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2147483647 + "'", int12 == 2147483647);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2147483647 + "'", int21 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker41);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2147483647 + "'", int55 == 2147483647);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2147483647 + "'", int63 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker66);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertArrayEquals(doubleArray67, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker72);
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(100.0d, 100.0d);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker3 = multiDirectional2.getConvergenceChecker();
        org.junit.Assert.assertNotNull(realConvergenceChecker3);
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        double[] doubleArray5 = new double[] {};
        multiDirectional0.setStartConfiguration(doubleArray5);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional0.getConvergenceChecker();
        int int8 = multiDirectional0.getMaxEvaluations();
        int int9 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 10);
        multiDirectional0.setMaxEvaluations(100);
        int int14 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.analysis.MultivariateRealFunction multivariateRealFunction15 = null;
        org.apache.commons.math.optimization.GoalType goalType16 = null;
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional17 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int18 = multiDirectional17.getMaxEvaluations();
        int int19 = multiDirectional17.getMaxIterations();
        double[] doubleArray21 = new double[] { 100 };
        multiDirectional17.setStartConfiguration(doubleArray21);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        int int25 = multiDirectional23.getMaxIterations();
        double[] doubleArray27 = new double[] { 100 };
        multiDirectional23.setStartConfiguration(doubleArray27);
        int int29 = multiDirectional23.getMaxEvaluations();
        int int30 = multiDirectional23.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional31 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int32 = multiDirectional31.getMaxEvaluations();
        int int33 = multiDirectional31.getMaxIterations();
        double[] doubleArray35 = new double[] { 100 };
        multiDirectional31.setStartConfiguration(doubleArray35);
        multiDirectional23.setStartConfiguration(doubleArray35);
        multiDirectional17.setStartConfiguration(doubleArray35);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.optimization.RealPointValuePair realPointValuePair39 = multiDirectional0.optimize(multivariateRealFunction15, goalType16, doubleArray35);
            org.junit.Assert.fail("Expected anonymous exception");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
            if (!e.getClass().isAnonymousClass()) {
                org.junit.Assert.fail("Expected anonymous exception, got " + e.getClass().getCanonicalName());
            }
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2147483647 + "'", int8 == 2147483647);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2147483647 + "'", int19 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2147483647 + "'", int25 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2147483647 + "'", int29 == 2147483647);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2147483647 + "'", int32 == 2147483647);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2147483647 + "'", int33 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d }, 1.0E-15);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional0.setMaxIterations(100);
        int int3 = multiDirectional0.getEvaluations();
        multiDirectional0.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        int int9 = multiDirectional6.getEvaluations();
        multiDirectional6.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker12 = multiDirectional6.getConvergenceChecker();
        multiDirectional0.setConvergenceChecker(realConvergenceChecker12);
        int int14 = multiDirectional0.getIterations();
        multiDirectional0.setMaxEvaluations((-1));
        multiDirectional0.setMaxEvaluations((int) (byte) -1);
        int int19 = multiDirectional0.getMaxIterations();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional3.setMaxIterations(100);
        multiDirectional3.setMaxEvaluations((int) (short) 1);
        int int8 = multiDirectional3.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        multiDirectional9.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional9.getConvergenceChecker();
        double[] doubleArray14 = new double[] {};
        multiDirectional9.setStartConfiguration(doubleArray14);
        multiDirectional3.setStartConfiguration(doubleArray14);
        multiDirectional0.setStartConfiguration(doubleArray14);
        int int18 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker19 = multiDirectional0.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional20.setMaxIterations(100);
        int int23 = multiDirectional20.getEvaluations();
        multiDirectional20.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional26 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional26.setMaxIterations(100);
        int int29 = multiDirectional26.getEvaluations();
        multiDirectional26.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker32 = multiDirectional26.getConvergenceChecker();
        multiDirectional20.setConvergenceChecker(realConvergenceChecker32);
        int int34 = multiDirectional20.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional35.setMaxIterations(100);
        int int38 = multiDirectional35.getEvaluations();
        multiDirectional35.setMaxEvaluations((int) ' ');
        double[] doubleArray41 = new double[] {};
        double[][] doubleArray42 = new double[][] { doubleArray41 };
        multiDirectional35.setStartConfiguration(doubleArray42);
        multiDirectional35.setMaxEvaluations((int) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker46 = multiDirectional35.getConvergenceChecker();
        multiDirectional20.setConvergenceChecker(realConvergenceChecker46);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional48 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int49 = multiDirectional48.getMaxEvaluations();
        int int50 = multiDirectional48.getMaxIterations();
        double[] doubleArray52 = new double[] { 100 };
        multiDirectional48.setStartConfiguration(doubleArray52);
        int int54 = multiDirectional48.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int56 = multiDirectional55.getIterations();
        int int57 = multiDirectional55.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional58 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int59 = multiDirectional58.getMaxEvaluations();
        int int60 = multiDirectional58.getMaxIterations();
        double[] doubleArray62 = new double[] { 100 };
        multiDirectional58.setStartConfiguration(doubleArray62);
        int int64 = multiDirectional58.getEvaluations();
        int int65 = multiDirectional58.getMaxIterations();
        int int66 = multiDirectional58.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional67 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional67.setMaxIterations(100);
        int int70 = multiDirectional67.getEvaluations();
        multiDirectional67.setMaxEvaluations((int) ' ');
        double[] doubleArray73 = new double[] {};
        double[][] doubleArray74 = new double[][] { doubleArray73 };
        multiDirectional67.setStartConfiguration(doubleArray74);
        multiDirectional58.setStartConfiguration(doubleArray74);
        multiDirectional55.setStartConfiguration(doubleArray74);
        multiDirectional48.setStartConfiguration(doubleArray74);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker79 = multiDirectional48.getConvergenceChecker();
        multiDirectional20.setConvergenceChecker(realConvergenceChecker79);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker79);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 32 + "'", int34 == 32);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertNotNull(realConvergenceChecker46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2147483647 + "'", int49 == 2147483647);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2147483647 + "'", int50 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertArrayEquals(doubleArray52, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2147483647 + "'", int57 == 2147483647);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2147483647 + "'", int59 == 2147483647);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2147483647 + "'", int60 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2147483647 + "'", int65 == 2147483647);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertArrayEquals(doubleArray73, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertNotNull(realConvergenceChecker79);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional(0.0d, (double) (byte) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int4 = multiDirectional3.getMaxEvaluations();
        multiDirectional3.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker7 = multiDirectional3.getConvergenceChecker();
        multiDirectional3.setMaxEvaluations((int) (byte) -1);
        int int10 = multiDirectional3.getIterations();
        int int11 = multiDirectional3.getIterations();
        int int12 = multiDirectional3.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional13 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int14 = multiDirectional13.getIterations();
        int int15 = multiDirectional13.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional16 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int17 = multiDirectional16.getMaxEvaluations();
        int int18 = multiDirectional16.getMaxIterations();
        double[] doubleArray20 = new double[] { 100 };
        multiDirectional16.setStartConfiguration(doubleArray20);
        int int22 = multiDirectional16.getEvaluations();
        int int23 = multiDirectional16.getMaxIterations();
        int int24 = multiDirectional16.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional25 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional25.setMaxIterations(100);
        int int28 = multiDirectional25.getEvaluations();
        multiDirectional25.setMaxEvaluations((int) ' ');
        double[] doubleArray31 = new double[] {};
        double[][] doubleArray32 = new double[][] { doubleArray31 };
        multiDirectional25.setStartConfiguration(doubleArray32);
        multiDirectional16.setStartConfiguration(doubleArray32);
        multiDirectional13.setStartConfiguration(doubleArray32);
        multiDirectional3.setStartConfiguration(doubleArray32);
        int int37 = multiDirectional3.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional38 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int39 = multiDirectional38.getIterations();
        int int40 = multiDirectional38.getMaxEvaluations();
        int int41 = multiDirectional38.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional42 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int43 = multiDirectional42.getMaxEvaluations();
        int int44 = multiDirectional42.getMaxIterations();
        double[] doubleArray46 = new double[] { 100 };
        multiDirectional42.setStartConfiguration(doubleArray46);
        multiDirectional38.setStartConfiguration(doubleArray46);
        multiDirectional3.setStartConfiguration(doubleArray46);
        multiDirectional2.setStartConfiguration(doubleArray46);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional51 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int52 = multiDirectional51.getIterations();
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker53 = multiDirectional51.getConvergenceChecker();
        multiDirectional2.setConvergenceChecker(realConvergenceChecker53);
        java.lang.Class<?> wildcardClass55 = multiDirectional2.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2147483647 + "'", int15 == 2147483647);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2147483647 + "'", int17 == 2147483647);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2147483647 + "'", int18 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2147483647 + "'", int23 == 2147483647);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2147483647 + "'", int40 == 2147483647);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2147483647 + "'", int43 == 2147483647);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker53);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        int int2 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional3 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional3.setMaxIterations(100);
        multiDirectional3.setMaxEvaluations((int) (short) 1);
        int int8 = multiDirectional3.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional9 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int10 = multiDirectional9.getMaxEvaluations();
        multiDirectional9.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker13 = multiDirectional9.getConvergenceChecker();
        double[] doubleArray14 = new double[] {};
        multiDirectional9.setStartConfiguration(doubleArray14);
        multiDirectional3.setStartConfiguration(doubleArray14);
        multiDirectional0.setStartConfiguration(doubleArray14);
        int int18 = multiDirectional0.getIterations();
        int int19 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional22 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 10L, (double) (byte) -1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional23 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int24 = multiDirectional23.getMaxEvaluations();
        multiDirectional23.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker27 = multiDirectional23.getConvergenceChecker();
        double[] doubleArray28 = new double[] {};
        multiDirectional23.setStartConfiguration(doubleArray28);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker30 = multiDirectional23.getConvergenceChecker();
        int int31 = multiDirectional23.getMaxEvaluations();
        int int32 = multiDirectional23.getEvaluations();
        multiDirectional23.setMaxIterations((int) (short) 10);
        multiDirectional23.setMaxIterations((int) (byte) 1);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional39 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) (-1.0f), (double) (-1));
        int int40 = multiDirectional39.getIterations();
        multiDirectional39.setMaxEvaluations((int) (byte) 100);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional43 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int44 = multiDirectional43.getIterations();
        int int45 = multiDirectional43.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional46 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int47 = multiDirectional46.getMaxEvaluations();
        int int48 = multiDirectional46.getMaxIterations();
        double[] doubleArray50 = new double[] { 100 };
        multiDirectional46.setStartConfiguration(doubleArray50);
        int int52 = multiDirectional46.getEvaluations();
        int int53 = multiDirectional46.getMaxIterations();
        int int54 = multiDirectional46.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional55 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional55.setMaxIterations(100);
        int int58 = multiDirectional55.getEvaluations();
        multiDirectional55.setMaxEvaluations((int) ' ');
        double[] doubleArray61 = new double[] {};
        double[][] doubleArray62 = new double[][] { doubleArray61 };
        multiDirectional55.setStartConfiguration(doubleArray62);
        multiDirectional46.setStartConfiguration(doubleArray62);
        multiDirectional43.setStartConfiguration(doubleArray62);
        multiDirectional39.setStartConfiguration(doubleArray62);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional67 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int68 = multiDirectional67.getMaxEvaluations();
        multiDirectional67.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker71 = multiDirectional67.getConvergenceChecker();
        double[] doubleArray72 = new double[] {};
        multiDirectional67.setStartConfiguration(doubleArray72);
        multiDirectional39.setStartConfiguration(doubleArray72);
        multiDirectional23.setStartConfiguration(doubleArray72);
        multiDirectional22.setStartConfiguration(doubleArray72);
        multiDirectional0.setStartConfiguration(doubleArray72);
        multiDirectional0.setMaxEvaluations(97);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2147483647 + "'", int2 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2147483647 + "'", int10 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2147483647 + "'", int24 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2147483647 + "'", int31 == 2147483647);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2147483647 + "'", int45 == 2147483647);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2147483647 + "'", int47 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2147483647 + "'", int48 == 2147483647);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2147483647 + "'", int53 == 2147483647);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2147483647 + "'", int68 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker71);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertArrayEquals(doubleArray72, new double[] {}, 1.0E-15);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional2 = new org.apache.commons.math.optimization.direct.MultiDirectional((double) 0L, 10.0d);
        java.util.Comparator<org.apache.commons.math.optimization.RealPointValuePair> realPointValuePairComparator3 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiDirectional2.iterateSimplex(realPointValuePairComparator3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getIterations();
        int int2 = multiDirectional0.getEvaluations();
        int int3 = multiDirectional0.getEvaluations();
        int int4 = multiDirectional0.getMaxIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional5 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional5.setMaxIterations(100);
        int int8 = multiDirectional5.getEvaluations();
        multiDirectional5.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker11 = multiDirectional5.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional12 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional12.setMaxIterations(100);
        int int15 = multiDirectional12.getEvaluations();
        multiDirectional12.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional18 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional18.setMaxIterations(100);
        int int21 = multiDirectional18.getEvaluations();
        multiDirectional18.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker24 = multiDirectional18.getConvergenceChecker();
        multiDirectional12.setConvergenceChecker(realConvergenceChecker24);
        multiDirectional5.setConvergenceChecker(realConvergenceChecker24);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional27 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional27.setMaxIterations(100);
        multiDirectional27.setMaxEvaluations((int) (short) 1);
        multiDirectional27.setMaxEvaluations((int) (short) 1);
        int int34 = multiDirectional27.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional35 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional35.setMaxIterations(100);
        int int38 = multiDirectional35.getEvaluations();
        multiDirectional35.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional41 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional41.setMaxIterations(100);
        int int44 = multiDirectional41.getEvaluations();
        multiDirectional41.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker47 = multiDirectional41.getConvergenceChecker();
        multiDirectional35.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional27.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional5.setConvergenceChecker(realConvergenceChecker47);
        multiDirectional0.setConvergenceChecker(realConvergenceChecker47);
        int int52 = multiDirectional0.getMaxIterations();
        multiDirectional0.setMaxIterations(1);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker55 = multiDirectional0.getConvergenceChecker();
        int int56 = multiDirectional0.getIterations();
        multiDirectional0.setMaxIterations((int) ' ');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2147483647 + "'", int4 == 2147483647);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker24);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker47);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 2147483647 + "'", int52 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional0 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int1 = multiDirectional0.getMaxEvaluations();
        multiDirectional0.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker4 = multiDirectional0.getConvergenceChecker();
        int int5 = multiDirectional0.getEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional6 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional6.setMaxIterations(100);
        multiDirectional6.setMaxEvaluations((int) (short) 1);
        multiDirectional6.setMaxEvaluations((int) (short) 1);
        int int13 = multiDirectional6.getIterations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional14 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional14.setMaxIterations(100);
        int int17 = multiDirectional14.getEvaluations();
        multiDirectional14.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional20 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional20.setMaxIterations(100);
        int int23 = multiDirectional20.getEvaluations();
        multiDirectional20.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker26 = multiDirectional20.getConvergenceChecker();
        multiDirectional14.setConvergenceChecker(realConvergenceChecker26);
        multiDirectional6.setConvergenceChecker(realConvergenceChecker26);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional29 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional29.setMaxIterations(100);
        int int32 = multiDirectional29.getEvaluations();
        multiDirectional29.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker35 = multiDirectional29.getConvergenceChecker();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional36 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int37 = multiDirectional36.getMaxEvaluations();
        multiDirectional36.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker40 = multiDirectional36.getConvergenceChecker();
        double[] doubleArray41 = new double[] {};
        multiDirectional36.setStartConfiguration(doubleArray41);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker43 = multiDirectional36.getConvergenceChecker();
        int int44 = multiDirectional36.getMaxEvaluations();
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional45 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional45.setMaxIterations(100);
        int int48 = multiDirectional45.getEvaluations();
        multiDirectional45.setMaxEvaluations((int) (byte) 10);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional51 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional51.setMaxIterations(100);
        int int54 = multiDirectional51.getEvaluations();
        multiDirectional51.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional57 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        multiDirectional57.setMaxIterations(100);
        int int60 = multiDirectional57.getEvaluations();
        multiDirectional57.setMaxEvaluations((int) ' ');
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker63 = multiDirectional57.getConvergenceChecker();
        multiDirectional51.setConvergenceChecker(realConvergenceChecker63);
        org.apache.commons.math.optimization.direct.MultiDirectional multiDirectional65 = new org.apache.commons.math.optimization.direct.MultiDirectional();
        int int66 = multiDirectional65.getMaxEvaluations();
        multiDirectional65.setMaxIterations((int) (byte) 0);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker69 = multiDirectional65.getConvergenceChecker();
        double[] doubleArray70 = new double[] {};
        multiDirectional65.setStartConfiguration(doubleArray70);
        multiDirectional51.setStartConfiguration(doubleArray70);
        multiDirectional45.setStartConfiguration(doubleArray70);
        multiDirectional36.setStartConfiguration(doubleArray70);
        multiDirectional29.setStartConfiguration(doubleArray70);
        multiDirectional6.setStartConfiguration(doubleArray70);
        multiDirectional0.setStartConfiguration(doubleArray70);
        multiDirectional0.setMaxIterations((int) (short) 100);
        org.apache.commons.math.optimization.RealConvergenceChecker realConvergenceChecker80 = multiDirectional0.getConvergenceChecker();
        int int81 = multiDirectional0.getEvaluations();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2147483647 + "'", int1 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker26);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2147483647 + "'", int37 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker40);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2147483647 + "'", int44 == 2147483647);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(realConvergenceChecker63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2147483647 + "'", int66 == 2147483647);
        org.junit.Assert.assertNotNull(realConvergenceChecker69);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertArrayEquals(doubleArray70, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realConvergenceChecker80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
    }
}

