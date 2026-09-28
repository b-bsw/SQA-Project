package org.apache.commons.math.stat.regression;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

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
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        // The following exception was thrown during execution in test generation
        try {
            double double1 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass14 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass4 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        java.lang.Class<?> wildcardClass2 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        java.lang.Class<?> wildcardClass14 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval((double) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getMeanSquareError();
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(100.0d, (double) (byte) 10);
        simpleRegression0.addData((-1.0d), (double) 100.0f);
        double[][] doubleArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSlopeConfidenceInterval((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.predict((double) 10.0f);
        double double5 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSignificance();
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        java.lang.Class<?> wildcardClass2 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        java.lang.Class<?> wildcardClass4 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) 1, (double) 0L);
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getSlope();
        java.lang.Class<?> wildcardClass24 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((double) 0L, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        long long9 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval((double) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        java.lang.Class<?> wildcardClass13 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) 1, (double) 0L);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = simpleRegression0.getSlopeConfidenceInterval((double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSumSquaredErrors();
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlope();
        simpleRegression0.addData((double) 1, (double) 0L);
        double double17 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = simpleRegression0.getSlopeConfidenceInterval((double) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getRSquare();
        double double16 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double[] doubleArray15 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray22 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray29 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray36 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray43 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray44 = new double[][] { doubleArray15, doubleArray22, doubleArray29, doubleArray36, doubleArray43 };
        simpleRegression0.addData(doubleArray44);
        double double46 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double48 = simpleRegression0.getSlopeConfidenceInterval((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double double9 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getTotalSumSquares();
        double double24 = simpleRegression0.getIntercept();
        double[] doubleArray25 = new double[] {};
        double[] doubleArray26 = new double[] {};
        double[] doubleArray27 = new double[] {};
        double[][] doubleArray28 = new double[][] { doubleArray25, doubleArray26, doubleArray27 };
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getIntercept();
        double double8 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double15 = simpleRegression0.predict((double) (byte) -1);
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        double double30 = simpleRegression0.getSlope();
        double double31 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double32 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double8 = simpleRegression7.getMeanSquareError();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) (short) -1);
        double double12 = simpleRegression7.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double14 = simpleRegression13.getIntercept();
        double double15 = simpleRegression13.getMeanSquareError();
        long long16 = simpleRegression13.getN();
        double double17 = simpleRegression13.getSumSquaredErrors();
        double double18 = simpleRegression13.getR();
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray32 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray33 = new double[][] { doubleArray25, doubleArray32 };
        simpleRegression13.addData(doubleArray33);
        simpleRegression7.addData(doubleArray33);
        simpleRegression0.addData(doubleArray33);
        java.lang.Class<?> wildcardClass37 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getSignificance();
        double double16 = simpleRegression0.getSignificance();
        java.lang.Class<?> wildcardClass17 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getIntercept();
        double double23 = simpleRegression0.getTotalSumSquares();
        double double25 = simpleRegression0.predict((double) 100L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval((double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double15 = simpleRegression0.predict((double) 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        simpleRegression0.clear();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double double9 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(100.0d, (double) (byte) 10);
        simpleRegression0.addData((-1.0d), (double) 100.0f);
        double double10 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99.10891089108911d + "'", double10 == 99.10891089108911d);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval((double) 2L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval((-4.547473508864641E-13d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData((double) (byte) -1, (double) '#');
        long long6 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double8 = simpleRegression7.getMeanSquareError();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) (short) -1);
        double double12 = simpleRegression7.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double14 = simpleRegression13.getIntercept();
        double double15 = simpleRegression13.getMeanSquareError();
        long long16 = simpleRegression13.getN();
        double double17 = simpleRegression13.getSumSquaredErrors();
        double double18 = simpleRegression13.getR();
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray32 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray33 = new double[][] { doubleArray25, doubleArray32 };
        simpleRegression13.addData(doubleArray33);
        simpleRegression7.addData(doubleArray33);
        simpleRegression0.addData(doubleArray33);
        // The following exception was thrown during execution in test generation
        try {
            double double37 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getRegressionSumSquares();
        java.lang.Class<?> wildcardClass3 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double10 = simpleRegression0.predict((double) (-1L));
        double double11 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        long long9 = simpleRegression0.getN();
        simpleRegression0.addData((double) (byte) 1, (-1.0d));
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass15 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getMeanSquareError();
        double double32 = simpleRegression26.getSlopeStdErr();
        double double34 = simpleRegression26.predict((double) (byte) 1);
        double[] doubleArray41 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray70 = new double[][] { doubleArray41, doubleArray48, doubleArray55, doubleArray62, doubleArray69 };
        simpleRegression26.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        simpleRegression0.addData((double) 1L, (-4.547473508864641E-13d));
        double double76 = simpleRegression0.getR();
        double double77 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.9984957532976854d + "'", double76 == 0.9984957532976854d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + (-1.4010282776350316d) + "'", double77 == (-1.4010282776350316d));
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        double double30 = simpleRegression0.getSlope();
        long long31 = simpleRegression0.getN();
        double[][] doubleArray32 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2L + "'", long31 == 2L);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression3 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[] doubleArray14 = new double[] { 100.0f, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray8, doubleArray11, doubleArray14 };
        simpleRegression4.addData(doubleArray15);
        simpleRegression3.addData(doubleArray15);
        simpleRegression0.addData(doubleArray15);
        double double19 = simpleRegression0.getSlopeStdErr();
        double double20 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval((double) 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = simpleRegression0.getSlopeConfidenceInterval((double) 10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double10 = simpleRegression9.getMeanSquareError();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double13 = simpleRegression9.predict((double) (short) -1);
        double double14 = simpleRegression9.getIntercept();
        double double15 = simpleRegression9.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double18 = simpleRegression17.getMeanSquareError();
        double[] doubleArray21 = new double[] { 100.0f, 100L };
        double[] doubleArray24 = new double[] { 100.0f, 100L };
        double[] doubleArray27 = new double[] { 100.0f, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray21, doubleArray24, doubleArray27 };
        simpleRegression17.addData(doubleArray28);
        simpleRegression16.addData(doubleArray28);
        simpleRegression9.addData(doubleArray28);
        simpleRegression0.addData(doubleArray28);
        java.lang.Class<?> wildcardClass33 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        simpleRegression0.clear();
        double double10 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression10 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double11 = simpleRegression10.getMeanSquareError();
        double double12 = simpleRegression10.getSumSquaredErrors();
        double double14 = simpleRegression10.predict((double) (short) -1);
        double double15 = simpleRegression10.getMeanSquareError();
        double double16 = simpleRegression10.getSlopeStdErr();
        double double18 = simpleRegression10.predict((double) (byte) 1);
        simpleRegression10.addData(Double.NaN, (double) (byte) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double23 = simpleRegression22.getMeanSquareError();
        double double24 = simpleRegression22.getSumSquaredErrors();
        double double25 = simpleRegression22.getMeanSquareError();
        double double26 = simpleRegression22.getInterceptStdErr();
        double double27 = simpleRegression22.getRegressionSumSquares();
        simpleRegression22.clear();
        double double29 = simpleRegression22.getInterceptStdErr();
        simpleRegression22.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double32 = simpleRegression31.getMeanSquareError();
        double double33 = simpleRegression31.getSumSquaredErrors();
        double double35 = simpleRegression31.predict((double) (short) -1);
        double double36 = simpleRegression31.getIntercept();
        double double37 = simpleRegression31.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression38 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double40 = simpleRegression39.getMeanSquareError();
        double[] doubleArray43 = new double[] { 100.0f, 100L };
        double[] doubleArray46 = new double[] { 100.0f, 100L };
        double[] doubleArray49 = new double[] { 100.0f, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray43, doubleArray46, doubleArray49 };
        simpleRegression39.addData(doubleArray50);
        simpleRegression38.addData(doubleArray50);
        simpleRegression31.addData(doubleArray50);
        simpleRegression22.addData(doubleArray50);
        simpleRegression10.addData(doubleArray50);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression56 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double57 = simpleRegression56.getMeanSquareError();
        double[] doubleArray60 = new double[] { 100.0f, 100L };
        double[] doubleArray63 = new double[] { 100.0f, 100L };
        double[] doubleArray66 = new double[] { 100.0f, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray60, doubleArray63, doubleArray66 };
        simpleRegression56.addData(doubleArray67);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression69 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double70 = simpleRegression69.getMeanSquareError();
        double double71 = simpleRegression69.getSumSquaredErrors();
        double double72 = simpleRegression69.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression73 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double74 = simpleRegression73.getMeanSquareError();
        double double75 = simpleRegression73.getSumSquaredErrors();
        double double76 = simpleRegression73.getMeanSquareError();
        double double78 = simpleRegression73.predict((double) 10);
        simpleRegression73.clear();
        double[] doubleArray85 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray91 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray92 = new double[][] { doubleArray85, doubleArray91 };
        simpleRegression73.addData(doubleArray92);
        simpleRegression69.addData(doubleArray92);
        simpleRegression56.addData(doubleArray92);
        simpleRegression10.addData(doubleArray92);
        simpleRegression0.addData(doubleArray92);
        java.lang.Class<?> wildcardClass98 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getRegressionSumSquares();
        long long16 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = simpleRegression0.getSlopeConfidenceInterval(40.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        simpleRegression0.addData(Double.NaN, (double) (byte) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression12 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double13 = simpleRegression12.getMeanSquareError();
        double double14 = simpleRegression12.getSumSquaredErrors();
        double double15 = simpleRegression12.getMeanSquareError();
        double double16 = simpleRegression12.getInterceptStdErr();
        double double17 = simpleRegression12.getRegressionSumSquares();
        simpleRegression12.clear();
        double double19 = simpleRegression12.getInterceptStdErr();
        simpleRegression12.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double22 = simpleRegression21.getMeanSquareError();
        double double23 = simpleRegression21.getSumSquaredErrors();
        double double25 = simpleRegression21.predict((double) (short) -1);
        double double26 = simpleRegression21.getIntercept();
        double double27 = simpleRegression21.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double30 = simpleRegression29.getMeanSquareError();
        double[] doubleArray33 = new double[] { 100.0f, 100L };
        double[] doubleArray36 = new double[] { 100.0f, 100L };
        double[] doubleArray39 = new double[] { 100.0f, 100L };
        double[][] doubleArray40 = new double[][] { doubleArray33, doubleArray36, doubleArray39 };
        simpleRegression29.addData(doubleArray40);
        simpleRegression28.addData(doubleArray40);
        simpleRegression21.addData(doubleArray40);
        simpleRegression12.addData(doubleArray40);
        simpleRegression0.addData(doubleArray40);
        // The following exception was thrown during execution in test generation
        try {
            double double47 = simpleRegression0.getSlopeConfidenceInterval((double) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getSlope();
        java.lang.Class<?> wildcardClass6 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double4 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlopeStdErr();
        java.lang.Class<?> wildcardClass7 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        long long9 = simpleRegression0.getN();
        simpleRegression0.addData((double) (byte) 1, (-1.0d));
        long long13 = simpleRegression0.getN();
        long long14 = simpleRegression0.getN();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getTotalSumSquares();
        double double9 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval(6.185682326621923d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval(6.185682326621923d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval(93.16554809843402d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression3 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[] doubleArray14 = new double[] { 100.0f, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray8, doubleArray11, doubleArray14 };
        simpleRegression4.addData(doubleArray15);
        simpleRegression3.addData(doubleArray15);
        simpleRegression0.addData(doubleArray15);
        double double19 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double21 = simpleRegression0.getSlopeConfidenceInterval(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.predict(100.0d);
        double double11 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression10 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double11 = simpleRegression10.getMeanSquareError();
        double double12 = simpleRegression10.getSumSquaredErrors();
        double double14 = simpleRegression10.predict((double) (short) -1);
        double double15 = simpleRegression10.getMeanSquareError();
        double double16 = simpleRegression10.getSlopeStdErr();
        double double18 = simpleRegression10.predict((double) (byte) 1);
        simpleRegression10.addData(Double.NaN, (double) (byte) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double23 = simpleRegression22.getMeanSquareError();
        double double24 = simpleRegression22.getSumSquaredErrors();
        double double25 = simpleRegression22.getMeanSquareError();
        double double26 = simpleRegression22.getInterceptStdErr();
        double double27 = simpleRegression22.getRegressionSumSquares();
        simpleRegression22.clear();
        double double29 = simpleRegression22.getInterceptStdErr();
        simpleRegression22.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double32 = simpleRegression31.getMeanSquareError();
        double double33 = simpleRegression31.getSumSquaredErrors();
        double double35 = simpleRegression31.predict((double) (short) -1);
        double double36 = simpleRegression31.getIntercept();
        double double37 = simpleRegression31.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression38 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double40 = simpleRegression39.getMeanSquareError();
        double[] doubleArray43 = new double[] { 100.0f, 100L };
        double[] doubleArray46 = new double[] { 100.0f, 100L };
        double[] doubleArray49 = new double[] { 100.0f, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray43, doubleArray46, doubleArray49 };
        simpleRegression39.addData(doubleArray50);
        simpleRegression38.addData(doubleArray50);
        simpleRegression31.addData(doubleArray50);
        simpleRegression22.addData(doubleArray50);
        simpleRegression10.addData(doubleArray50);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression56 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double57 = simpleRegression56.getMeanSquareError();
        double[] doubleArray60 = new double[] { 100.0f, 100L };
        double[] doubleArray63 = new double[] { 100.0f, 100L };
        double[] doubleArray66 = new double[] { 100.0f, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray60, doubleArray63, doubleArray66 };
        simpleRegression56.addData(doubleArray67);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression69 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double70 = simpleRegression69.getMeanSquareError();
        double double71 = simpleRegression69.getSumSquaredErrors();
        double double72 = simpleRegression69.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression73 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double74 = simpleRegression73.getMeanSquareError();
        double double75 = simpleRegression73.getSumSquaredErrors();
        double double76 = simpleRegression73.getMeanSquareError();
        double double78 = simpleRegression73.predict((double) 10);
        simpleRegression73.clear();
        double[] doubleArray85 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray91 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray92 = new double[][] { doubleArray85, doubleArray91 };
        simpleRegression73.addData(doubleArray92);
        simpleRegression69.addData(doubleArray92);
        simpleRegression56.addData(doubleArray92);
        simpleRegression10.addData(doubleArray92);
        simpleRegression0.addData(doubleArray92);
        double double98 = simpleRegression0.getRegressionSumSquares();
        double double99 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertTrue(Double.isNaN(double98));
        org.junit.Assert.assertTrue(Double.isNaN(double99));
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        double double6 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval(6.185682326621923d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getTotalSumSquares();
        double double24 = simpleRegression0.getIntercept();
        java.lang.Class<?> wildcardClass25 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        java.lang.Class<?> wildcardClass6 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 0);
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double16 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getMeanSquareError();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double14 = simpleRegression11.getSlopeStdErr();
        double double15 = simpleRegression11.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double17 = simpleRegression16.getMeanSquareError();
        double double18 = simpleRegression16.getSumSquaredErrors();
        double double20 = simpleRegression16.predict((double) (short) -1);
        double double21 = simpleRegression16.getIntercept();
        double double22 = simpleRegression16.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression23 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression24 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double25 = simpleRegression24.getMeanSquareError();
        double[] doubleArray28 = new double[] { 100.0f, 100L };
        double[] doubleArray31 = new double[] { 100.0f, 100L };
        double[] doubleArray34 = new double[] { 100.0f, 100L };
        double[][] doubleArray35 = new double[][] { doubleArray28, doubleArray31, doubleArray34 };
        simpleRegression24.addData(doubleArray35);
        simpleRegression23.addData(doubleArray35);
        simpleRegression16.addData(doubleArray35);
        simpleRegression11.addData(doubleArray35);
        simpleRegression0.addData(doubleArray35);
        // The following exception was thrown during execution in test generation
        try {
            double double42 = simpleRegression0.getSlopeConfidenceInterval(99.10891089108911d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.getSlope();
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = simpleRegression0.getSlopeConfidenceInterval((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        long long8 = simpleRegression0.getN();
        long long9 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getIntercept();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval((-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double[] doubleArray15 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray22 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray29 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray36 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray43 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray44 = new double[][] { doubleArray15, doubleArray22, doubleArray29, doubleArray36, doubleArray43 };
        simpleRegression0.addData(doubleArray44);
        double double46 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double48 = simpleRegression0.getSlopeConfidenceInterval((double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((double) (-1.0f), (double) 100L);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.predict(100.0d);
        double double11 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval((double) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double3 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        long long9 = simpleRegression0.getN();
        simpleRegression0.addData((double) (byte) 1, (-1.0d));
        double double14 = simpleRegression0.predict((double) 100.0f);
        double double15 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double14 = simpleRegression0.getSlopeConfidenceInterval();
        double double15 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.predict(Double.NaN);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((-989.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = simpleRegression0.getSlopeConfidenceInterval(1851.4285714285716d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(40.5d, (double) (short) 0);
        double double11 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval((double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double10 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        java.lang.Class<?> wildcardClass26 = doubleArray23.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getSlope();
        double double30 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass31 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData((double) 12L, 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        long long9 = simpleRegression0.getN();
        simpleRegression0.addData((double) (byte) 1, (-1.0d));
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getSumSquaredErrors();
        double[][] doubleArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getInterceptStdErr();
        double double17 = simpleRegression0.getSlopeConfidenceInterval();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = simpleRegression0.getSlopeConfidenceInterval(40.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double10 = simpleRegression0.predict((double) (-1L));
        long long11 = simpleRegression0.getN();
        simpleRegression0.addData((double) 0.0f, (double) 3L);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getMeanSquareError();
        double double32 = simpleRegression26.getSlopeStdErr();
        double double34 = simpleRegression26.predict((double) (byte) 1);
        double[] doubleArray41 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray70 = new double[][] { doubleArray41, doubleArray48, doubleArray55, doubleArray62, doubleArray69 };
        simpleRegression26.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        simpleRegression0.addData((double) 1L, (-4.547473508864641E-13d));
        double double76 = simpleRegression0.getR();
        double double77 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.9984957532976854d + "'", double76 == 0.9984957532976854d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.19906283479973047d + "'", double77 == 0.19906283479973047d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((double) (-1.0f), (double) 100L);
        double double14 = simpleRegression0.predict((double) 10);
        double double15 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-989.0d) + "'", double14 == (-989.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getSumSquaredErrors();
        long long8 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double15 = simpleRegression0.predict(0.0d);
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getRegressionSumSquares();
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        long long9 = simpleRegression0.getN();
        double[][] doubleArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            simpleRegression0.addData(doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        double double10 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((double) 0L, (double) 10.0f);
        simpleRegression0.clear();
        double double6 = simpleRegression0.predict((double) (byte) 0);
        long long7 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval((double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        long long9 = simpleRegression0.getN();
        simpleRegression0.addData((double) (byte) 1, (-1.0d));
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getTotalSumSquares();
        double double15 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 2L + "'", long13 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        java.lang.Class<?> wildcardClass29 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        java.lang.Class<?> wildcardClass15 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double25 = simpleRegression0.getSlopeConfidenceInterval((-1.4010282776350316d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getSumSquaredErrors();
        double double24 = simpleRegression0.getIntercept();
        java.lang.Class<?> wildcardClass25 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSlope();
        long long11 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double10 = simpleRegression9.getMeanSquareError();
        double double11 = simpleRegression9.getSumSquaredErrors();
        double double13 = simpleRegression9.predict((double) (short) -1);
        double double14 = simpleRegression9.getIntercept();
        double double15 = simpleRegression9.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double18 = simpleRegression17.getMeanSquareError();
        double[] doubleArray21 = new double[] { 100.0f, 100L };
        double[] doubleArray24 = new double[] { 100.0f, 100L };
        double[] doubleArray27 = new double[] { 100.0f, 100L };
        double[][] doubleArray28 = new double[][] { doubleArray21, doubleArray24, doubleArray27 };
        simpleRegression17.addData(doubleArray28);
        simpleRegression16.addData(doubleArray28);
        simpleRegression9.addData(doubleArray28);
        simpleRegression0.addData(doubleArray28);
        double double33 = simpleRegression0.getTotalSumSquares();
        long long34 = simpleRegression0.getN();
        double double35 = simpleRegression0.getSignificance();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 3L + "'", long34 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((double) (-1.0f), (double) 100L);
        double double13 = simpleRegression0.getSumSquaredErrors();
        double double14 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 4900.5d + "'", double14 == 4900.5d);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, Double.NaN);
        long long9 = simpleRegression0.getN();
        simpleRegression0.addData((double) (byte) 1, (-1.0d));
        double double14 = simpleRegression0.predict((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double[] doubleArray12 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray18 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray18 };
        simpleRegression0.addData(doubleArray19);
        simpleRegression0.addData((double) 1.0f, 99.10891089108911d);
        java.lang.Class<?> wildcardClass24 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getRSquare();
        simpleRegression0.addData((double) (-1L), (double) (short) 0);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((double) 0L, (double) 10.0f);
        simpleRegression0.clear();
        double double6 = simpleRegression0.predict((double) (byte) 0);
        long long7 = simpleRegression0.getN();
        double double8 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        double double6 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData((double) (short) 100, (double) 1.0f);
        double double10 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((double) (byte) -1);
        double double7 = simpleRegression0.predict((double) 10L);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression3 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[] doubleArray14 = new double[] { 100.0f, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray8, doubleArray11, doubleArray14 };
        simpleRegression4.addData(doubleArray15);
        simpleRegression3.addData(doubleArray15);
        simpleRegression0.addData(doubleArray15);
        double double19 = simpleRegression0.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double21 = simpleRegression20.getMeanSquareError();
        double[] doubleArray24 = new double[] { 100.0f, 100L };
        double[] doubleArray27 = new double[] { 100.0f, 100L };
        double[] doubleArray30 = new double[] { 100.0f, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray24, doubleArray27, doubleArray30 };
        simpleRegression20.addData(doubleArray31);
        simpleRegression0.addData(doubleArray31);
        double double34 = simpleRegression0.getRSquare();
        double double35 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getMeanSquareError();
        double double32 = simpleRegression26.getSlopeStdErr();
        double double34 = simpleRegression26.predict((double) (byte) 1);
        double[] doubleArray41 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray70 = new double[][] { doubleArray41, doubleArray48, doubleArray55, doubleArray62, doubleArray69 };
        simpleRegression26.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        // The following exception was thrown during execution in test generation
        try {
            double double74 = simpleRegression0.getSlopeConfidenceInterval((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double8 = simpleRegression7.getMeanSquareError();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) (short) -1);
        double double12 = simpleRegression7.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double14 = simpleRegression13.getIntercept();
        double double15 = simpleRegression13.getMeanSquareError();
        long long16 = simpleRegression13.getN();
        double double17 = simpleRegression13.getSumSquaredErrors();
        double double18 = simpleRegression13.getR();
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray32 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray33 = new double[][] { doubleArray25, doubleArray32 };
        simpleRegression13.addData(doubleArray33);
        simpleRegression7.addData(doubleArray33);
        simpleRegression0.addData(doubleArray33);
        simpleRegression0.addData(10.0d, (double) '#');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double14 = simpleRegression0.predict((double) 10);
        double double16 = simpleRegression0.predict((double) 1L);
        double double17 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(100.0d, (double) (byte) 10);
        simpleRegression0.addData((-1.0d), (double) 100.0f);
        double double10 = simpleRegression0.getIntercept();
        long long11 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99.10891089108911d + "'", double10 == 99.10891089108911d);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 2L + "'", long11 == 2L);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSlope();
        long long15 = simpleRegression0.getN();
        double double16 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        long long6 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass7 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        simpleRegression0.addData(Double.NaN, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression3 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[] doubleArray14 = new double[] { 100.0f, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray8, doubleArray11, doubleArray14 };
        simpleRegression4.addData(doubleArray15);
        simpleRegression3.addData(doubleArray15);
        simpleRegression0.addData(doubleArray15);
        double double19 = simpleRegression0.getRegressionSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double21 = simpleRegression20.getMeanSquareError();
        double[] doubleArray24 = new double[] { 100.0f, 100L };
        double[] doubleArray27 = new double[] { 100.0f, 100L };
        double[] doubleArray30 = new double[] { 100.0f, 100L };
        double[][] doubleArray31 = new double[][] { doubleArray24, doubleArray27, doubleArray30 };
        simpleRegression20.addData(doubleArray31);
        simpleRegression0.addData(doubleArray31);
        double double34 = simpleRegression0.getRSquare();
        simpleRegression0.addData((-1.0d), (double) 100.0f);
        double double38 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSlope();
        double double11 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getR();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval((-4.547473508864641E-13d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval(187.30505569837212d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double10 = simpleRegression0.predict((double) (-1L));
        double double11 = simpleRegression0.getMeanSquareError();
        double double13 = simpleRegression0.predict((double) 0.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getRegressionSumSquares();
        double double10 = simpleRegression0.getIntercept();
        double double11 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        simpleRegression0.addData((double) (-1.0f), (double) (short) -1);
        double double12 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 2.0d + "'", double12 == 2.0d);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData((double) 10L, (double) (byte) -1);
        double double10 = simpleRegression0.predict(99.10891089108911d);
        double double11 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.predict((double) 0.0f);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getMeanSquareError();
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[] doubleArray13 = new double[] { 100.0f, 100L };
        double[] doubleArray16 = new double[] { 100.0f, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        simpleRegression6.addData(doubleArray17);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double20 = simpleRegression19.getMeanSquareError();
        simpleRegression19.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression23 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double24 = simpleRegression23.getMeanSquareError();
        double[] doubleArray27 = new double[] { 100.0f, 100L };
        double[] doubleArray30 = new double[] { 100.0f, 100L };
        double[] doubleArray33 = new double[] { 100.0f, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray27, doubleArray30, doubleArray33 };
        simpleRegression23.addData(doubleArray34);
        simpleRegression22.addData(doubleArray34);
        simpleRegression19.addData(doubleArray34);
        simpleRegression6.addData(doubleArray34);
        simpleRegression0.addData(doubleArray34);
        double double40 = simpleRegression0.getSlope();
        simpleRegression0.addData(0.9984957532976854d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getIntercept();
        double double3 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.predict(10.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getRegressionSumSquares();
        java.lang.Class<?> wildcardClass7 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.getSlope();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression16 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double17 = simpleRegression16.getMeanSquareError();
        double double18 = simpleRegression16.getSumSquaredErrors();
        double double19 = simpleRegression16.getMeanSquareError();
        double double20 = simpleRegression16.getInterceptStdErr();
        double double21 = simpleRegression16.getRegressionSumSquares();
        simpleRegression16.clear();
        double double23 = simpleRegression16.getInterceptStdErr();
        simpleRegression16.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double26 = simpleRegression25.getMeanSquareError();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double29 = simpleRegression25.predict((double) (short) -1);
        double double30 = simpleRegression25.getIntercept();
        double double31 = simpleRegression25.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression32 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression33 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double34 = simpleRegression33.getMeanSquareError();
        double[] doubleArray37 = new double[] { 100.0f, 100L };
        double[] doubleArray40 = new double[] { 100.0f, 100L };
        double[] doubleArray43 = new double[] { 100.0f, 100L };
        double[][] doubleArray44 = new double[][] { doubleArray37, doubleArray40, doubleArray43 };
        simpleRegression33.addData(doubleArray44);
        simpleRegression32.addData(doubleArray44);
        simpleRegression25.addData(doubleArray44);
        simpleRegression16.addData(doubleArray44);
        simpleRegression0.addData(doubleArray44);
        double double50 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertArrayEquals(doubleArray40, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getIntercept();
        double double23 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSignificance();
        double[][] doubleArray16 = new double[][] {};
        simpleRegression0.addData(doubleArray16);
        double double18 = simpleRegression0.getTotalSumSquares();
        double double20 = simpleRegression0.predict(0.9984957532976854d);
        double double21 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[][] {});
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        double double30 = simpleRegression0.getIntercept();
        double double31 = simpleRegression0.getSlopeStdErr();
        double double32 = simpleRegression0.getInterceptStdErr();
        double double33 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double34 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getInterceptStdErr();
        double double16 = simpleRegression0.predict((double) 0);
        double double17 = simpleRegression0.getSlope();
        double double18 = simpleRegression0.getMeanSquareError();
        double double19 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getSlopeStdErr();
        double double5 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        double double30 = simpleRegression0.getSlope();
        long long31 = simpleRegression0.getN();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression33 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double34 = simpleRegression33.getMeanSquareError();
        double double35 = simpleRegression33.getSumSquaredErrors();
        double double36 = simpleRegression33.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression37 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double38 = simpleRegression37.getMeanSquareError();
        double[] doubleArray41 = new double[] { 100.0f, 100L };
        double[] doubleArray44 = new double[] { 100.0f, 100L };
        double[] doubleArray47 = new double[] { 100.0f, 100L };
        double[][] doubleArray48 = new double[][] { doubleArray41, doubleArray44, doubleArray47 };
        simpleRegression37.addData(doubleArray48);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression50 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double51 = simpleRegression50.getMeanSquareError();
        simpleRegression50.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression53 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression54 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double55 = simpleRegression54.getMeanSquareError();
        double[] doubleArray58 = new double[] { 100.0f, 100L };
        double[] doubleArray61 = new double[] { 100.0f, 100L };
        double[] doubleArray64 = new double[] { 100.0f, 100L };
        double[][] doubleArray65 = new double[][] { doubleArray58, doubleArray61, doubleArray64 };
        simpleRegression54.addData(doubleArray65);
        simpleRegression53.addData(doubleArray65);
        simpleRegression50.addData(doubleArray65);
        simpleRegression37.addData(doubleArray65);
        simpleRegression33.addData(doubleArray65);
        simpleRegression0.addData(doubleArray65);
        simpleRegression0.clear();
        double double73 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2L + "'", long31 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertArrayEquals(doubleArray47, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertArrayEquals(doubleArray58, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.predict(Double.NaN);
        java.lang.Class<?> wildcardClass6 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double14 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double17 = simpleRegression0.predict((double) 1L);
        double double18 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getSumSquaredErrors();
        double double24 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.predict((double) (short) 100);
        double double8 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval((double) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getSumSquaredErrors();
        double double8 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        double double4 = simpleRegression0.getR();
        double double5 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        long long9 = simpleRegression0.getN();
        long long10 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval(1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getMeanSquareError();
        double double32 = simpleRegression26.getSlopeStdErr();
        double double34 = simpleRegression26.predict((double) (byte) 1);
        double[] doubleArray41 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray70 = new double[][] { doubleArray41, doubleArray48, doubleArray55, doubleArray62, doubleArray69 };
        simpleRegression26.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        simpleRegression0.addData((double) 1L, (-4.547473508864641E-13d));
        double double76 = simpleRegression0.getR();
        simpleRegression0.clear();
        simpleRegression0.addData((double) (byte) 10, (double) 0.0f);
        double double81 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.9984957532976854d + "'", double76 == 0.9984957532976854d);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(100.0d, (double) (byte) 10);
        simpleRegression0.addData((-1.0d), (double) 100.0f);
        double double10 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval(20402.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99.10891089108911d + "'", double10 == 99.10891089108911d);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        long long8 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double10 = simpleRegression0.getRSquare();
        double double11 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval((-1.4010282776350316d));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        long long8 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression13 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double14 = simpleRegression13.getMeanSquareError();
        double double15 = simpleRegression13.getSumSquaredErrors();
        double double16 = simpleRegression13.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double18 = simpleRegression17.getMeanSquareError();
        double double19 = simpleRegression17.getSumSquaredErrors();
        double double20 = simpleRegression17.getMeanSquareError();
        double double22 = simpleRegression17.predict((double) 10);
        simpleRegression17.clear();
        double[] doubleArray29 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray35 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray36 = new double[][] { doubleArray29, doubleArray35 };
        simpleRegression17.addData(doubleArray36);
        simpleRegression13.addData(doubleArray36);
        simpleRegression0.addData(doubleArray36);
        double double40 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        simpleRegression0.clear();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.0d + "'", double40 == 0.0d);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.predict((double) (short) 100);
        double double8 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.predict((double) 1L);
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 0);
        simpleRegression0.clear();
        double double11 = simpleRegression0.predict((double) 10);
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData((double) (byte) -1, (double) '#');
        long long6 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass7 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getMeanSquareError();
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[] doubleArray22 = new double[] { 100.0f, 100L };
        double[] doubleArray25 = new double[] { 100.0f, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray19, doubleArray22, doubleArray25 };
        simpleRegression15.addData(doubleArray26);
        double double28 = simpleRegression15.getR();
        double double29 = simpleRegression15.getSignificance();
        double double30 = simpleRegression15.getR();
        double double31 = simpleRegression15.getR();
        double[] doubleArray36 = new double[] { 10.0d, (short) -1, (-1.0d), (short) -1 };
        double[] doubleArray41 = new double[] { 10.0d, (short) -1, (-1.0d), (short) -1 };
        double[] doubleArray46 = new double[] { 10.0d, (short) -1, (-1.0d), (short) -1 };
        double[][] doubleArray47 = new double[][] { doubleArray36, doubleArray41, doubleArray46 };
        simpleRegression15.addData(doubleArray47);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression49 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double50 = simpleRegression49.getMeanSquareError();
        double double51 = simpleRegression49.getSumSquaredErrors();
        double double52 = simpleRegression49.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression53 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double54 = simpleRegression53.getMeanSquareError();
        double[] doubleArray57 = new double[] { 100.0f, 100L };
        double[] doubleArray60 = new double[] { 100.0f, 100L };
        double[] doubleArray63 = new double[] { 100.0f, 100L };
        double[][] doubleArray64 = new double[][] { doubleArray57, doubleArray60, doubleArray63 };
        simpleRegression53.addData(doubleArray64);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression66 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double67 = simpleRegression66.getMeanSquareError();
        simpleRegression66.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression69 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression70 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double71 = simpleRegression70.getMeanSquareError();
        double[] doubleArray74 = new double[] { 100.0f, 100L };
        double[] doubleArray77 = new double[] { 100.0f, 100L };
        double[] doubleArray80 = new double[] { 100.0f, 100L };
        double[][] doubleArray81 = new double[][] { doubleArray74, doubleArray77, doubleArray80 };
        simpleRegression70.addData(doubleArray81);
        simpleRegression69.addData(doubleArray81);
        simpleRegression66.addData(doubleArray81);
        simpleRegression53.addData(doubleArray81);
        simpleRegression49.addData(doubleArray81);
        simpleRegression15.addData(doubleArray81);
        simpleRegression0.addData(doubleArray81);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 10.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 10.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 10.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertArrayEquals(doubleArray57, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertArrayEquals(doubleArray74, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertArrayEquals(doubleArray77, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertArrayEquals(doubleArray80, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((double) 3L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long4 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass5 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData((double) 10L, (double) (byte) -1);
        double double10 = simpleRegression0.predict(99.10891089108911d);
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval(6.185682326621923d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getMeanSquareError();
        double double32 = simpleRegression26.getSlopeStdErr();
        double double34 = simpleRegression26.predict((double) (byte) 1);
        double[] doubleArray41 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray70 = new double[][] { doubleArray41, doubleArray48, doubleArray55, doubleArray62, doubleArray69 };
        simpleRegression26.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        simpleRegression0.addData((double) 1L, (-4.547473508864641E-13d));
        double double77 = simpleRegression0.predict((double) '4');
        java.lang.Class<?> wildcardClass78 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 187.30505569837212d + "'", double77 == 187.30505569837212d);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.predict(1851.4285714285716d);
        double double5 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSignificance();
        double[][] doubleArray16 = new double[][] {};
        simpleRegression0.addData(doubleArray16);
        double double18 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass19 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[][] {});
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSlopeConfidenceInterval((double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getIntercept();
        double double13 = simpleRegression11.getMeanSquareError();
        simpleRegression11.clear();
        double double15 = simpleRegression11.getSumSquaredErrors();
        simpleRegression11.addData((double) (byte) 0, (double) 1.0f);
        double double19 = simpleRegression11.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double21 = simpleRegression20.getMeanSquareError();
        double double22 = simpleRegression20.getSumSquaredErrors();
        double double24 = simpleRegression20.predict((double) (short) -1);
        double double25 = simpleRegression20.getIntercept();
        double double26 = simpleRegression20.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double29 = simpleRegression28.getMeanSquareError();
        double[] doubleArray32 = new double[] { 100.0f, 100L };
        double[] doubleArray35 = new double[] { 100.0f, 100L };
        double[] doubleArray38 = new double[] { 100.0f, 100L };
        double[][] doubleArray39 = new double[][] { doubleArray32, doubleArray35, doubleArray38 };
        simpleRegression28.addData(doubleArray39);
        simpleRegression27.addData(doubleArray39);
        simpleRegression20.addData(doubleArray39);
        simpleRegression11.addData(doubleArray39);
        simpleRegression0.addData(doubleArray39);
        double double45 = simpleRegression0.getIntercept();
        double double46 = simpleRegression0.getMeanSquareError();
        double double47 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getTotalSumSquares();
        double double7 = simpleRegression0.getSlopeStdErr();
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getIntercept();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass6 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double10 = simpleRegression0.predict((double) (-1L));
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getMeanSquareError();
        java.lang.Class<?> wildcardClass13 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getMeanSquareError();
        double double32 = simpleRegression26.getSlopeStdErr();
        double double34 = simpleRegression26.predict((double) (byte) 1);
        double[] doubleArray41 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray70 = new double[][] { doubleArray41, doubleArray48, doubleArray55, doubleArray62, doubleArray69 };
        simpleRegression26.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        double double73 = simpleRegression0.getSumSquaredErrors();
        double double74 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double76 = simpleRegression0.getSlopeConfidenceInterval((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + (-4.547473508864641E-13d) + "'", double73 == (-4.547473508864641E-13d));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1851.4285714285716d + "'", double74 == 1851.4285714285716d);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.predict(0.0d);
        long long18 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getSlope();
        double double24 = simpleRegression0.getSlopeConfidenceInterval();
        double double25 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double27 = simpleRegression0.getSlopeConfidenceInterval((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        java.lang.Class<?> wildcardClass30 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getMeanSquareError();
        double double32 = simpleRegression26.getSlopeStdErr();
        double double34 = simpleRegression26.predict((double) (byte) 1);
        double[] doubleArray41 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray70 = new double[][] { doubleArray41, doubleArray48, doubleArray55, doubleArray62, doubleArray69 };
        simpleRegression26.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        simpleRegression0.addData((double) 1L, (-4.547473508864641E-13d));
        double double76 = simpleRegression0.getIntercept();
        double double77 = simpleRegression0.getRegressionSumSquares();
        double double78 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + (-1.4010282776350316d) + "'", double76 == (-1.4010282776350316d));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1921.0823693230564d + "'", double77 == 1921.0823693230564d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.4010282776350316d) + "'", double78 == (-1.4010282776350316d));
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.predict((double) (short) 100);
        double double8 = simpleRegression0.getTotalSumSquares();
        double double9 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double14 = simpleRegression0.getR();
        simpleRegression0.addData((double) 1L, 0.19906283479973047d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double6 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        double double30 = simpleRegression0.getIntercept();
        double double31 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double14 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double17 = simpleRegression0.predict((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = simpleRegression0.getSlopeConfidenceInterval((double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getSumSquaredErrors();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getMeanSquareError();
        double double32 = simpleRegression26.getSlopeStdErr();
        double double34 = simpleRegression26.predict((double) (byte) 1);
        double[] doubleArray41 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray70 = new double[][] { doubleArray41, doubleArray48, doubleArray55, doubleArray62, doubleArray69 };
        simpleRegression26.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        double double73 = simpleRegression0.getTotalSumSquares();
        long long74 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1851.4285714285713d + "'", double73 == 1851.4285714285713d);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 7L + "'", long74 == 7L);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((double) 0L, (double) 10.0f);
        simpleRegression0.clear();
        double double5 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getIntercept();
        double double23 = simpleRegression0.getTotalSumSquares();
        double double24 = simpleRegression0.getSumSquaredErrors();
        double double25 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double26 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 0);
        simpleRegression0.clear();
        double double11 = simpleRegression0.predict((double) 10);
        double double12 = simpleRegression0.getSlope();
        double double13 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double10 = simpleRegression0.predict((double) (-1L));
        long long11 = simpleRegression0.getN();
        simpleRegression0.addData((double) 0.0f, (double) 3L);
        java.lang.Class<?> wildcardClass15 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        java.lang.Class<?> wildcardClass22 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        double double7 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        simpleRegression0.addData((double) 'a', Double.NaN);
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.predict(100.0d);
        double double11 = simpleRegression0.getInterceptStdErr();
        double double13 = simpleRegression0.predict(0.010000000000000009d);
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSlope();
        long long15 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass16 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 3L + "'", long15 == 3L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        double double30 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double31 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getR();
        double[] doubleArray21 = new double[] { 10.0d, (short) -1, (-1.0d), (short) -1 };
        double[] doubleArray26 = new double[] { 10.0d, (short) -1, (-1.0d), (short) -1 };
        double[] doubleArray31 = new double[] { 10.0d, (short) -1, (-1.0d), (short) -1 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        simpleRegression0.addData(doubleArray32);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double35 = simpleRegression34.getMeanSquareError();
        double double36 = simpleRegression34.getSumSquaredErrors();
        double double37 = simpleRegression34.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression38 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double39 = simpleRegression38.getMeanSquareError();
        double[] doubleArray42 = new double[] { 100.0f, 100L };
        double[] doubleArray45 = new double[] { 100.0f, 100L };
        double[] doubleArray48 = new double[] { 100.0f, 100L };
        double[][] doubleArray49 = new double[][] { doubleArray42, doubleArray45, doubleArray48 };
        simpleRegression38.addData(doubleArray49);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression51 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double52 = simpleRegression51.getMeanSquareError();
        simpleRegression51.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression54 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression55 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double56 = simpleRegression55.getMeanSquareError();
        double[] doubleArray59 = new double[] { 100.0f, 100L };
        double[] doubleArray62 = new double[] { 100.0f, 100L };
        double[] doubleArray65 = new double[] { 100.0f, 100L };
        double[][] doubleArray66 = new double[][] { doubleArray59, doubleArray62, doubleArray65 };
        simpleRegression55.addData(doubleArray66);
        simpleRegression54.addData(doubleArray66);
        simpleRegression51.addData(doubleArray66);
        simpleRegression38.addData(doubleArray66);
        simpleRegression34.addData(doubleArray66);
        simpleRegression0.addData(doubleArray66);
        double double73 = simpleRegression0.getRegressionSumSquares();
        double double74 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 20402.0d + "'", double73 == 20402.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 1.0d + "'", double74 == 1.0d);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getIntercept();
        double double13 = simpleRegression11.getMeanSquareError();
        simpleRegression11.clear();
        double double15 = simpleRegression11.getSumSquaredErrors();
        simpleRegression11.addData((double) (byte) 0, (double) 1.0f);
        double double19 = simpleRegression11.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double21 = simpleRegression20.getMeanSquareError();
        double double22 = simpleRegression20.getSumSquaredErrors();
        double double24 = simpleRegression20.predict((double) (short) -1);
        double double25 = simpleRegression20.getIntercept();
        double double26 = simpleRegression20.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double29 = simpleRegression28.getMeanSquareError();
        double[] doubleArray32 = new double[] { 100.0f, 100L };
        double[] doubleArray35 = new double[] { 100.0f, 100L };
        double[] doubleArray38 = new double[] { 100.0f, 100L };
        double[][] doubleArray39 = new double[][] { doubleArray32, doubleArray35, doubleArray38 };
        simpleRegression28.addData(doubleArray39);
        simpleRegression27.addData(doubleArray39);
        simpleRegression20.addData(doubleArray39);
        simpleRegression11.addData(doubleArray39);
        simpleRegression0.addData(doubleArray39);
        double double45 = simpleRegression0.getR();
        long long46 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 3L + "'", long46 == 3L);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass7 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        long long8 = simpleRegression0.getN();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getMeanSquareError();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.predict((double) (short) -1);
        long long16 = simpleRegression11.getN();
        double double17 = simpleRegression11.getIntercept();
        simpleRegression11.clear();
        long long19 = simpleRegression11.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double22 = simpleRegression21.getMeanSquareError();
        double[] doubleArray25 = new double[] { 100.0f, 100L };
        double[] doubleArray28 = new double[] { 100.0f, 100L };
        double[] doubleArray31 = new double[] { 100.0f, 100L };
        double[][] doubleArray32 = new double[][] { doubleArray25, doubleArray28, doubleArray31 };
        simpleRegression21.addData(doubleArray32);
        simpleRegression20.addData(doubleArray32);
        simpleRegression11.addData(doubleArray32);
        simpleRegression0.addData(doubleArray32);
        double double37 = simpleRegression0.getR();
        double double38 = simpleRegression0.getSignificance();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double15 = simpleRegression0.predict(0.0d);
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getSlope();
        long long7 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getTotalSumSquares();
        double double23 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        simpleRegression0.addData(93.16554809843402d, 1.0d);
        double double29 = simpleRegression0.predict((double) 12L);
        // The following exception was thrown during execution in test generation
        try {
            double double31 = simpleRegression0.getSlopeConfidenceInterval((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.predict((double) (-1L));
        simpleRegression0.clear();
        double double18 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getTotalSumSquares();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getTotalSumSquares();
        double double24 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        simpleRegression0.clear();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[] doubleArray14 = new double[] { 100.0f, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray8, doubleArray11, doubleArray14 };
        simpleRegression4.addData(doubleArray15);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression17 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double18 = simpleRegression17.getMeanSquareError();
        simpleRegression17.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double22 = simpleRegression21.getMeanSquareError();
        double[] doubleArray25 = new double[] { 100.0f, 100L };
        double[] doubleArray28 = new double[] { 100.0f, 100L };
        double[] doubleArray31 = new double[] { 100.0f, 100L };
        double[][] doubleArray32 = new double[][] { doubleArray25, doubleArray28, doubleArray31 };
        simpleRegression21.addData(doubleArray32);
        simpleRegression20.addData(doubleArray32);
        simpleRegression17.addData(doubleArray32);
        simpleRegression4.addData(doubleArray32);
        simpleRegression0.addData(doubleArray32);
        double double38 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double40 = simpleRegression0.getSlopeConfidenceInterval(7500.000000000001d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getRSquare();
        simpleRegression0.addData(7350.75d, 1851.4285714285716d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getIntercept();
        double double17 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double19 = simpleRegression18.getMeanSquareError();
        double double20 = simpleRegression18.getSlopeStdErr();
        double double21 = simpleRegression18.getSumSquaredErrors();
        double double22 = simpleRegression18.getSumSquaredErrors();
        double double23 = simpleRegression18.getTotalSumSquares();
        double double24 = simpleRegression18.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double26 = simpleRegression25.getMeanSquareError();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double29 = simpleRegression25.predict((double) (short) -1);
        double double30 = simpleRegression25.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double32 = simpleRegression31.getIntercept();
        double double33 = simpleRegression31.getMeanSquareError();
        long long34 = simpleRegression31.getN();
        double double35 = simpleRegression31.getSumSquaredErrors();
        double double36 = simpleRegression31.getR();
        double[] doubleArray43 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray50 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray51 = new double[][] { doubleArray43, doubleArray50 };
        simpleRegression31.addData(doubleArray51);
        simpleRegression25.addData(doubleArray51);
        simpleRegression18.addData(doubleArray51);
        simpleRegression0.addData(doubleArray51);
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double57 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval(7500.000000000001d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSlopeConfidenceInterval((double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(100.0d, (double) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double6 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getRegressionSumSquares();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval((double) 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        simpleRegression0.addData(Double.NaN, (double) (byte) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression12 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double13 = simpleRegression12.getMeanSquareError();
        double double14 = simpleRegression12.getSumSquaredErrors();
        double double15 = simpleRegression12.getMeanSquareError();
        double double16 = simpleRegression12.getInterceptStdErr();
        double double17 = simpleRegression12.getRegressionSumSquares();
        simpleRegression12.clear();
        double double19 = simpleRegression12.getInterceptStdErr();
        simpleRegression12.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double22 = simpleRegression21.getMeanSquareError();
        double double23 = simpleRegression21.getSumSquaredErrors();
        double double25 = simpleRegression21.predict((double) (short) -1);
        double double26 = simpleRegression21.getIntercept();
        double double27 = simpleRegression21.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double30 = simpleRegression29.getMeanSquareError();
        double[] doubleArray33 = new double[] { 100.0f, 100L };
        double[] doubleArray36 = new double[] { 100.0f, 100L };
        double[] doubleArray39 = new double[] { 100.0f, 100L };
        double[][] doubleArray40 = new double[][] { doubleArray33, doubleArray36, doubleArray39 };
        simpleRegression29.addData(doubleArray40);
        simpleRegression28.addData(doubleArray40);
        simpleRegression21.addData(doubleArray40);
        simpleRegression12.addData(doubleArray40);
        simpleRegression0.addData(doubleArray40);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double47 = simpleRegression46.getMeanSquareError();
        double[] doubleArray50 = new double[] { 100.0f, 100L };
        double[] doubleArray53 = new double[] { 100.0f, 100L };
        double[] doubleArray56 = new double[] { 100.0f, 100L };
        double[][] doubleArray57 = new double[][] { doubleArray50, doubleArray53, doubleArray56 };
        simpleRegression46.addData(doubleArray57);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression59 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double60 = simpleRegression59.getMeanSquareError();
        double double61 = simpleRegression59.getSumSquaredErrors();
        double double62 = simpleRegression59.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression63 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double64 = simpleRegression63.getMeanSquareError();
        double double65 = simpleRegression63.getSumSquaredErrors();
        double double66 = simpleRegression63.getMeanSquareError();
        double double68 = simpleRegression63.predict((double) 10);
        simpleRegression63.clear();
        double[] doubleArray75 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray81 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray82 = new double[][] { doubleArray75, doubleArray81 };
        simpleRegression63.addData(doubleArray82);
        simpleRegression59.addData(doubleArray82);
        simpleRegression46.addData(doubleArray82);
        simpleRegression0.addData(doubleArray82);
        double double87 = simpleRegression0.getRegressionSumSquares();
        double double88 = simpleRegression0.getSignificance();
        double double89 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertTrue(Double.isNaN(double89));
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(7500.000000000001d, Double.NaN);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        long long9 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getSlopeStdErr();
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((double) 0L, (double) 10.0f);
        double double4 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval(4900.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getIntercept();
        double double23 = simpleRegression0.getMeanSquareError();
        double double24 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.predict(100.0d);
        double double11 = simpleRegression0.getR();
        simpleRegression0.addData((-1.4010282776350316d), (double) (-1L));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSignificance();
        double double16 = simpleRegression0.getTotalSumSquares();
        double double17 = simpleRegression0.getSlope();
        double double18 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getSumSquaredErrors();
        double double7 = simpleRegression0.getTotalSumSquares();
        long long8 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.predict((double) 10.0f);
        double double6 = simpleRegression0.predict((double) 1L);
        double double7 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSignificance();
        double double16 = simpleRegression0.getMeanSquareError();
        double double17 = simpleRegression0.getRSquare();
        long long18 = simpleRegression0.getN();
        double double19 = simpleRegression0.getSignificance();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 3L + "'", long18 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(100.0d, (double) (byte) 10);
        double double7 = simpleRegression0.getIntercept();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData((double) 10L, (double) 3L);
        long long11 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1L + "'", long11 == 1L);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval((double) 12L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        double double8 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        simpleRegression0.clear();
        double double9 = simpleRegression0.getSumSquaredErrors();
        double double10 = simpleRegression0.getSlopeStdErr();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        long long12 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData((double) 10L, (double) 3L);
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.predict(1851.4285714285716d);
        double double5 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.predict((double) (short) 100);
        double double8 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.predict((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getR();
        long long16 = simpleRegression0.getN();
        double double17 = simpleRegression0.getR();
        double double18 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getInterceptStdErr();
        double double17 = simpleRegression0.getTotalSumSquares();
        double double18 = simpleRegression0.getRSquare();
        simpleRegression0.addData(93.16554809843402d, (-99.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getMeanSquareError();
        double double32 = simpleRegression26.getSlopeStdErr();
        double double34 = simpleRegression26.predict((double) (byte) 1);
        double[] doubleArray41 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray70 = new double[][] { doubleArray41, doubleArray48, doubleArray55, doubleArray62, doubleArray69 };
        simpleRegression26.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        simpleRegression0.addData((double) 1L, (-4.547473508864641E-13d));
        double double76 = simpleRegression0.getR();
        simpleRegression0.clear();
        simpleRegression0.addData((double) (byte) 10, (double) 0.0f);
        double double82 = simpleRegression0.predict((double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.9984957532976854d + "'", double76 == 0.9984957532976854d);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData((double) (-1.0f), (double) 100L);
        double double13 = simpleRegression0.getSumSquaredErrors();
        long long14 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 2L + "'", long14 == 2L);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData((double) 10L, (double) (byte) -1);
        double double9 = simpleRegression0.getRegressionSumSquares();
        java.lang.Class<?> wildcardClass10 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getTotalSumSquares();
        double double7 = simpleRegression0.predict((double) (byte) 100);
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        simpleRegression0.addData((double) 'a', (double) 10L);
        double double11 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        simpleRegression0.addData(Double.NaN, (double) (byte) 10);
        double double12 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getR();
        double double17 = simpleRegression0.getRegressionSumSquares();
        double double18 = simpleRegression0.getSlopeConfidenceInterval();
        double double19 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getRegressionSumSquares();
        long long16 = simpleRegression0.getN();
        double double17 = simpleRegression0.getRSquare();
        java.lang.Class<?> wildcardClass18 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        simpleRegression0.addData((double) 'a', (double) 10L);
        double double11 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.getRegressionSumSquares();
        double double13 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 40.5d + "'", double12 == 40.5d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.5d + "'", double13 == 40.5d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval(40.5d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        double double30 = simpleRegression0.getSlope();
        double double31 = simpleRegression0.getInterceptStdErr();
        double double32 = simpleRegression0.getR();
        double double33 = simpleRegression0.getMeanSquareError();
        double double34 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double8 = simpleRegression7.getMeanSquareError();
        double double9 = simpleRegression7.getSumSquaredErrors();
        double double11 = simpleRegression7.predict((double) (short) -1);
        double double12 = simpleRegression7.getIntercept();
        double double13 = simpleRegression7.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression14 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression15 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double16 = simpleRegression15.getMeanSquareError();
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[] doubleArray22 = new double[] { 100.0f, 100L };
        double[] doubleArray25 = new double[] { 100.0f, 100L };
        double[][] doubleArray26 = new double[][] { doubleArray19, doubleArray22, doubleArray25 };
        simpleRegression15.addData(doubleArray26);
        simpleRegression14.addData(doubleArray26);
        simpleRegression7.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        long long31 = simpleRegression0.getN();
        double double32 = simpleRegression0.getSignificance();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 3L + "'", long31 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getR();
        double double17 = simpleRegression0.getRegressionSumSquares();
        double double18 = simpleRegression0.getSlopeConfidenceInterval();
        double double20 = simpleRegression0.predict(93.16554809843402d);
        simpleRegression0.addData((double) 0, 1.0d);
        double double24 = simpleRegression0.getTotalSumSquares();
        double double25 = simpleRegression0.getR();
        double double26 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double28 = simpleRegression0.getSlopeConfidenceInterval((double) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 7350.75d + "'", double24 == 7350.75d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        java.lang.Class<?> wildcardClass8 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval(1851.4285714285716d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double15 = simpleRegression0.predict((double) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = simpleRegression0.getSlopeConfidenceInterval((double) 12L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        double double26 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        simpleRegression0.addData(Double.NaN, (double) (byte) 10);
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double14 = simpleRegression0.predict((double) 10);
        double double15 = simpleRegression0.getSignificance();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        double double30 = simpleRegression0.getSlope();
        long long31 = simpleRegression0.getN();
        simpleRegression0.clear();
        double double33 = simpleRegression0.getMeanSquareError();
        double double34 = simpleRegression0.getInterceptStdErr();
        double double35 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 2L + "'", long31 == 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getRSquare();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double12 = simpleRegression0.predict((double) (short) -1);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        double double3 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval(2.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getInterceptStdErr();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getInterceptStdErr();
        double double7 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double10 = simpleRegression0.getRSquare();
        double double11 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass12 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        simpleRegression0.addData(Double.NaN, (double) (byte) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression12 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double13 = simpleRegression12.getMeanSquareError();
        double double14 = simpleRegression12.getSumSquaredErrors();
        double double15 = simpleRegression12.getMeanSquareError();
        double double16 = simpleRegression12.getInterceptStdErr();
        double double17 = simpleRegression12.getRegressionSumSquares();
        simpleRegression12.clear();
        double double19 = simpleRegression12.getInterceptStdErr();
        simpleRegression12.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double22 = simpleRegression21.getMeanSquareError();
        double double23 = simpleRegression21.getSumSquaredErrors();
        double double25 = simpleRegression21.predict((double) (short) -1);
        double double26 = simpleRegression21.getIntercept();
        double double27 = simpleRegression21.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double30 = simpleRegression29.getMeanSquareError();
        double[] doubleArray33 = new double[] { 100.0f, 100L };
        double[] doubleArray36 = new double[] { 100.0f, 100L };
        double[] doubleArray39 = new double[] { 100.0f, 100L };
        double[][] doubleArray40 = new double[][] { doubleArray33, doubleArray36, doubleArray39 };
        simpleRegression29.addData(doubleArray40);
        simpleRegression28.addData(doubleArray40);
        simpleRegression21.addData(doubleArray40);
        simpleRegression12.addData(doubleArray40);
        simpleRegression0.addData(doubleArray40);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression46 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double47 = simpleRegression46.getMeanSquareError();
        double[] doubleArray50 = new double[] { 100.0f, 100L };
        double[] doubleArray53 = new double[] { 100.0f, 100L };
        double[] doubleArray56 = new double[] { 100.0f, 100L };
        double[][] doubleArray57 = new double[][] { doubleArray50, doubleArray53, doubleArray56 };
        simpleRegression46.addData(doubleArray57);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression59 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double60 = simpleRegression59.getMeanSquareError();
        double double61 = simpleRegression59.getSumSquaredErrors();
        double double62 = simpleRegression59.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression63 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double64 = simpleRegression63.getMeanSquareError();
        double double65 = simpleRegression63.getSumSquaredErrors();
        double double66 = simpleRegression63.getMeanSquareError();
        double double68 = simpleRegression63.predict((double) 10);
        simpleRegression63.clear();
        double[] doubleArray75 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray81 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray82 = new double[][] { doubleArray75, doubleArray81 };
        simpleRegression63.addData(doubleArray82);
        simpleRegression59.addData(doubleArray82);
        simpleRegression46.addData(doubleArray82);
        simpleRegression0.addData(doubleArray82);
        double double87 = simpleRegression0.getRegressionSumSquares();
        double double88 = simpleRegression0.getSignificance();
        double double89 = simpleRegression0.getRSquare();
        double double90 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertArrayEquals(doubleArray39, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertArrayEquals(doubleArray75, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertArrayEquals(doubleArray81, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertTrue(Double.isNaN(double87));
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertTrue(Double.isNaN(double89));
        org.junit.Assert.assertTrue(Double.isNaN(double90));
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getMeanSquareError();
        double double32 = simpleRegression26.getSlopeStdErr();
        double double34 = simpleRegression26.predict((double) (byte) 1);
        double[] doubleArray41 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray70 = new double[][] { doubleArray41, doubleArray48, doubleArray55, doubleArray62, doubleArray69 };
        simpleRegression26.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        double double73 = simpleRegression0.getTotalSumSquares();
        double double74 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 1851.4285714285713d + "'", double73 == 1851.4285714285713d);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getSlopeConfidenceInterval();
        double double15 = simpleRegression0.predict(0.0d);
        double double16 = simpleRegression0.getRegressionSumSquares();
        long long17 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 3L + "'", long17 == 3L);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        double double10 = simpleRegression0.getInterceptStdErr();
        double double11 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression0.predict(10.0d);
        double double3 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression10 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double11 = simpleRegression10.getMeanSquareError();
        double double12 = simpleRegression10.getSumSquaredErrors();
        double double14 = simpleRegression10.predict((double) (short) -1);
        double double15 = simpleRegression10.getMeanSquareError();
        double double16 = simpleRegression10.getSlopeStdErr();
        double double18 = simpleRegression10.predict((double) (byte) 1);
        simpleRegression10.addData(Double.NaN, (double) (byte) 10);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double23 = simpleRegression22.getMeanSquareError();
        double double24 = simpleRegression22.getSumSquaredErrors();
        double double25 = simpleRegression22.getMeanSquareError();
        double double26 = simpleRegression22.getInterceptStdErr();
        double double27 = simpleRegression22.getRegressionSumSquares();
        simpleRegression22.clear();
        double double29 = simpleRegression22.getInterceptStdErr();
        simpleRegression22.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double32 = simpleRegression31.getMeanSquareError();
        double double33 = simpleRegression31.getSumSquaredErrors();
        double double35 = simpleRegression31.predict((double) (short) -1);
        double double36 = simpleRegression31.getIntercept();
        double double37 = simpleRegression31.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression38 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression39 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double40 = simpleRegression39.getMeanSquareError();
        double[] doubleArray43 = new double[] { 100.0f, 100L };
        double[] doubleArray46 = new double[] { 100.0f, 100L };
        double[] doubleArray49 = new double[] { 100.0f, 100L };
        double[][] doubleArray50 = new double[][] { doubleArray43, doubleArray46, doubleArray49 };
        simpleRegression39.addData(doubleArray50);
        simpleRegression38.addData(doubleArray50);
        simpleRegression31.addData(doubleArray50);
        simpleRegression22.addData(doubleArray50);
        simpleRegression10.addData(doubleArray50);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression56 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double57 = simpleRegression56.getMeanSquareError();
        double[] doubleArray60 = new double[] { 100.0f, 100L };
        double[] doubleArray63 = new double[] { 100.0f, 100L };
        double[] doubleArray66 = new double[] { 100.0f, 100L };
        double[][] doubleArray67 = new double[][] { doubleArray60, doubleArray63, doubleArray66 };
        simpleRegression56.addData(doubleArray67);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression69 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double70 = simpleRegression69.getMeanSquareError();
        double double71 = simpleRegression69.getSumSquaredErrors();
        double double72 = simpleRegression69.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression73 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double74 = simpleRegression73.getMeanSquareError();
        double double75 = simpleRegression73.getSumSquaredErrors();
        double double76 = simpleRegression73.getMeanSquareError();
        double double78 = simpleRegression73.predict((double) 10);
        simpleRegression73.clear();
        double[] doubleArray85 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray91 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray92 = new double[][] { doubleArray85, doubleArray91 };
        simpleRegression73.addData(doubleArray92);
        simpleRegression69.addData(doubleArray92);
        simpleRegression56.addData(doubleArray92);
        simpleRegression10.addData(doubleArray92);
        simpleRegression0.addData(doubleArray92);
        double double98 = simpleRegression0.getR();
        double double99 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertArrayEquals(doubleArray49, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertArrayEquals(doubleArray60, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertArrayEquals(doubleArray63, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertArrayEquals(doubleArray66, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertArrayEquals(doubleArray85, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray91);
        org.junit.Assert.assertArrayEquals(doubleArray91, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertTrue(Double.isNaN(double98));
        org.junit.Assert.assertTrue(Double.isNaN(double99));
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getIntercept();
        double double13 = simpleRegression11.getMeanSquareError();
        long long14 = simpleRegression11.getN();
        double double15 = simpleRegression11.getSumSquaredErrors();
        double double16 = simpleRegression11.getR();
        double[] doubleArray23 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray30 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray31 = new double[][] { doubleArray23, doubleArray30 };
        simpleRegression11.addData(doubleArray31);
        double double33 = simpleRegression11.getSumSquaredErrors();
        double double34 = simpleRegression11.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression35 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double36 = simpleRegression35.getIntercept();
        double double37 = simpleRegression35.getMeanSquareError();
        simpleRegression35.clear();
        double double39 = simpleRegression35.getSumSquaredErrors();
        simpleRegression35.addData((double) (byte) 0, (double) 1.0f);
        double double43 = simpleRegression35.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression44 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double45 = simpleRegression44.getMeanSquareError();
        double double46 = simpleRegression44.getSumSquaredErrors();
        double double48 = simpleRegression44.predict((double) (short) -1);
        double double49 = simpleRegression44.getIntercept();
        double double50 = simpleRegression44.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression51 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression52 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double53 = simpleRegression52.getMeanSquareError();
        double[] doubleArray56 = new double[] { 100.0f, 100L };
        double[] doubleArray59 = new double[] { 100.0f, 100L };
        double[] doubleArray62 = new double[] { 100.0f, 100L };
        double[][] doubleArray63 = new double[][] { doubleArray56, doubleArray59, doubleArray62 };
        simpleRegression52.addData(doubleArray63);
        simpleRegression51.addData(doubleArray63);
        simpleRegression44.addData(doubleArray63);
        simpleRegression35.addData(doubleArray63);
        simpleRegression11.addData(doubleArray63);
        simpleRegression0.addData(doubleArray63);
        double double70 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        long long72 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double73 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 0L + "'", long72 == 0L);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getR();
        simpleRegression0.addData((double) '#', 0.19906283479973047d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getInterceptStdErr();
        double double17 = simpleRegression0.getTotalSumSquares();
        double double18 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = simpleRegression0.getSlopeConfidenceInterval((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getSlopeConfidenceInterval();
        java.lang.Class<?> wildcardClass17 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double double9 = simpleRegression0.getIntercept();
        double double10 = simpleRegression0.getSlope();
        double double11 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval(7350.75d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getTotalSumSquares();
        double double3 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.predict(20402.0d);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval((double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getR();
        simpleRegression0.clear();
        double double18 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = simpleRegression0.getSlopeConfidenceInterval((double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getIntercept();
        double double13 = simpleRegression11.getMeanSquareError();
        long long14 = simpleRegression11.getN();
        double double15 = simpleRegression11.getSumSquaredErrors();
        double double16 = simpleRegression11.getR();
        double[] doubleArray23 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray30 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray31 = new double[][] { doubleArray23, doubleArray30 };
        simpleRegression11.addData(doubleArray31);
        double double33 = simpleRegression11.getSumSquaredErrors();
        double double34 = simpleRegression11.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression35 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double36 = simpleRegression35.getIntercept();
        double double37 = simpleRegression35.getMeanSquareError();
        simpleRegression35.clear();
        double double39 = simpleRegression35.getSumSquaredErrors();
        simpleRegression35.addData((double) (byte) 0, (double) 1.0f);
        double double43 = simpleRegression35.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression44 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double45 = simpleRegression44.getMeanSquareError();
        double double46 = simpleRegression44.getSumSquaredErrors();
        double double48 = simpleRegression44.predict((double) (short) -1);
        double double49 = simpleRegression44.getIntercept();
        double double50 = simpleRegression44.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression51 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression52 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double53 = simpleRegression52.getMeanSquareError();
        double[] doubleArray56 = new double[] { 100.0f, 100L };
        double[] doubleArray59 = new double[] { 100.0f, 100L };
        double[] doubleArray62 = new double[] { 100.0f, 100L };
        double[][] doubleArray63 = new double[][] { doubleArray56, doubleArray59, doubleArray62 };
        simpleRegression52.addData(doubleArray63);
        simpleRegression51.addData(doubleArray63);
        simpleRegression44.addData(doubleArray63);
        simpleRegression35.addData(doubleArray63);
        simpleRegression11.addData(doubleArray63);
        simpleRegression0.addData(doubleArray63);
        double double70 = simpleRegression0.getSlopeStdErr();
        double double71 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 7350.75d + "'", double71 == 7350.75d);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval(0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getIntercept();
        double double13 = simpleRegression11.getMeanSquareError();
        simpleRegression11.clear();
        double double15 = simpleRegression11.getSumSquaredErrors();
        simpleRegression11.addData((double) (byte) 0, (double) 1.0f);
        double double19 = simpleRegression11.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double21 = simpleRegression20.getMeanSquareError();
        double double22 = simpleRegression20.getSumSquaredErrors();
        double double24 = simpleRegression20.predict((double) (short) -1);
        double double25 = simpleRegression20.getIntercept();
        double double26 = simpleRegression20.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double29 = simpleRegression28.getMeanSquareError();
        double[] doubleArray32 = new double[] { 100.0f, 100L };
        double[] doubleArray35 = new double[] { 100.0f, 100L };
        double[] doubleArray38 = new double[] { 100.0f, 100L };
        double[][] doubleArray39 = new double[][] { doubleArray32, doubleArray35, doubleArray38 };
        simpleRegression28.addData(doubleArray39);
        simpleRegression27.addData(doubleArray39);
        simpleRegression20.addData(doubleArray39);
        simpleRegression11.addData(doubleArray39);
        simpleRegression0.addData(doubleArray39);
        double double45 = simpleRegression0.getIntercept();
        double double46 = simpleRegression0.getMeanSquareError();
        double double47 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        double double30 = simpleRegression0.getIntercept();
        double double31 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.addData(100.0d, (double) (byte) 10);
        simpleRegression0.addData((-1.0d), (double) 100.0f);
        double double10 = simpleRegression0.getIntercept();
        double double12 = simpleRegression0.predict((double) (short) -1);
        double double13 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 99.10891089108911d + "'", double10 == 99.10891089108911d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.predict((double) 0.0f);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getMeanSquareError();
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[] doubleArray13 = new double[] { 100.0f, 100L };
        double[] doubleArray16 = new double[] { 100.0f, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        simpleRegression6.addData(doubleArray17);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double20 = simpleRegression19.getMeanSquareError();
        simpleRegression19.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression23 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double24 = simpleRegression23.getMeanSquareError();
        double[] doubleArray27 = new double[] { 100.0f, 100L };
        double[] doubleArray30 = new double[] { 100.0f, 100L };
        double[] doubleArray33 = new double[] { 100.0f, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray27, doubleArray30, doubleArray33 };
        simpleRegression23.addData(doubleArray34);
        simpleRegression22.addData(doubleArray34);
        simpleRegression19.addData(doubleArray34);
        simpleRegression6.addData(doubleArray34);
        simpleRegression0.addData(doubleArray34);
        double double40 = simpleRegression0.getMeanSquareError();
        double double41 = simpleRegression0.getSlopeConfidenceInterval();
        double double42 = simpleRegression0.getIntercept();
        double double43 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getIntercept();
        double double13 = simpleRegression11.getMeanSquareError();
        simpleRegression11.clear();
        double double15 = simpleRegression11.getSumSquaredErrors();
        simpleRegression11.addData((double) (byte) 0, (double) 1.0f);
        double double19 = simpleRegression11.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double21 = simpleRegression20.getMeanSquareError();
        double double22 = simpleRegression20.getSumSquaredErrors();
        double double24 = simpleRegression20.predict((double) (short) -1);
        double double25 = simpleRegression20.getIntercept();
        double double26 = simpleRegression20.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression28 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double29 = simpleRegression28.getMeanSquareError();
        double[] doubleArray32 = new double[] { 100.0f, 100L };
        double[] doubleArray35 = new double[] { 100.0f, 100L };
        double[] doubleArray38 = new double[] { 100.0f, 100L };
        double[][] doubleArray39 = new double[][] { doubleArray32, doubleArray35, doubleArray38 };
        simpleRegression28.addData(doubleArray39);
        simpleRegression27.addData(doubleArray39);
        simpleRegression20.addData(doubleArray39);
        simpleRegression11.addData(doubleArray39);
        simpleRegression0.addData(doubleArray39);
        double double45 = simpleRegression0.getR();
        double double46 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getRegressionSumSquares();
        double double3 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getRSquare();
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getSlopeStdErr();
        java.lang.Class<?> wildcardClass18 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        long long3 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double4 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getR();
        double double7 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getR();
        double double17 = simpleRegression0.predict((double) 10L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        simpleRegression0.addData((double) (-1), (double) 100);
        double double10 = simpleRegression0.getR();
        simpleRegression0.addData(Double.NaN, (double) 1.0f);
        double double14 = simpleRegression0.getSlope();
        double double15 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getRSquare();
        simpleRegression0.addData((double) '#', (double) 10.0f);
        double double12 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getMeanSquareError();
        double double16 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getSlopeConfidenceInterval();
        double double17 = simpleRegression0.getSlopeStdErr();
        double double18 = simpleRegression0.getSlopeConfidenceInterval();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = simpleRegression0.getSlopeConfidenceInterval((double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getRSquare();
        double double15 = simpleRegression0.getMeanSquareError();
        double double16 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getSlopeStdErr();
        double double17 = simpleRegression0.getRegressionSumSquares();
        double double18 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass19 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSlopeStdErr();
        long long8 = simpleRegression0.getN();
        java.lang.Class<?> wildcardClass9 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getRegressionSumSquares();
        long long16 = simpleRegression0.getN();
        double double17 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getRSquare();
        simpleRegression0.addData(100.0d, 6.185682326621923d);
        double double11 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getR();
        double double17 = simpleRegression0.getRegressionSumSquares();
        double double18 = simpleRegression0.getSlopeConfidenceInterval();
        double double19 = simpleRegression0.getInterceptStdErr();
        double double20 = simpleRegression0.getRegressionSumSquares();
        double double21 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(40.5d, (double) (short) 0);
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getSumSquaredErrors();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getSlope();
        double double24 = simpleRegression0.getSlopeConfidenceInterval();
        double double26 = simpleRegression0.predict(476.8680089485456d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.getTotalSumSquares();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getIntercept();
        double double13 = simpleRegression11.getMeanSquareError();
        long long14 = simpleRegression11.getN();
        double double15 = simpleRegression11.getSumSquaredErrors();
        double double16 = simpleRegression11.getR();
        double[] doubleArray23 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray30 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray31 = new double[][] { doubleArray23, doubleArray30 };
        simpleRegression11.addData(doubleArray31);
        double double33 = simpleRegression11.getSumSquaredErrors();
        double double34 = simpleRegression11.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression35 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double36 = simpleRegression35.getIntercept();
        double double37 = simpleRegression35.getMeanSquareError();
        simpleRegression35.clear();
        double double39 = simpleRegression35.getSumSquaredErrors();
        simpleRegression35.addData((double) (byte) 0, (double) 1.0f);
        double double43 = simpleRegression35.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression44 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double45 = simpleRegression44.getMeanSquareError();
        double double46 = simpleRegression44.getSumSquaredErrors();
        double double48 = simpleRegression44.predict((double) (short) -1);
        double double49 = simpleRegression44.getIntercept();
        double double50 = simpleRegression44.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression51 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression52 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double53 = simpleRegression52.getMeanSquareError();
        double[] doubleArray56 = new double[] { 100.0f, 100L };
        double[] doubleArray59 = new double[] { 100.0f, 100L };
        double[] doubleArray62 = new double[] { 100.0f, 100L };
        double[][] doubleArray63 = new double[][] { doubleArray56, doubleArray59, doubleArray62 };
        simpleRegression52.addData(doubleArray63);
        simpleRegression51.addData(doubleArray63);
        simpleRegression44.addData(doubleArray63);
        simpleRegression35.addData(doubleArray63);
        simpleRegression11.addData(doubleArray63);
        simpleRegression0.addData(doubleArray63);
        double double70 = simpleRegression0.getSlopeStdErr();
        double double71 = simpleRegression0.getR();
        double double72 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.0d + "'", double70 == 0.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 1.0d + "'", double71 == 1.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 7350.75d + "'", double72 == 7350.75d);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        double double10 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getR();
        double double6 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        double double30 = simpleRegression0.getIntercept();
        double double31 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        long long6 = simpleRegression0.getN();
        double double7 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((double) 0L, (double) 10.0f);
        simpleRegression0.clear();
        double double6 = simpleRegression0.predict((double) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double[] doubleArray15 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray22 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray29 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray36 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray43 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray44 = new double[][] { doubleArray15, doubleArray22, doubleArray29, doubleArray36, doubleArray43 };
        simpleRegression0.addData(doubleArray44);
        double double46 = simpleRegression0.getRSquare();
        double double48 = simpleRegression0.predict((double) (-1));
        double double49 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) 'a');
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 1);
        double double9 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getTotalSumSquares();
        double double8 = simpleRegression0.getSlope();
        simpleRegression0.clear();
        double double10 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSlopeConfidenceInterval((double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSumSquaredErrors();
        double double6 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        long long8 = simpleRegression0.getN();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getInterceptStdErr();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getIntercept();
        double double6 = simpleRegression4.getMeanSquareError();
        long long7 = simpleRegression4.getN();
        double double8 = simpleRegression4.getSumSquaredErrors();
        double double10 = simpleRegression4.predict((-1.4010282776350316d));
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getMeanSquareError();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double14 = simpleRegression11.getMeanSquareError();
        double double15 = simpleRegression11.getInterceptStdErr();
        double double16 = simpleRegression11.getRegressionSumSquares();
        simpleRegression11.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double19 = simpleRegression18.getMeanSquareError();
        double double20 = simpleRegression18.getSumSquaredErrors();
        double double22 = simpleRegression18.predict((double) (short) -1);
        double double23 = simpleRegression18.getIntercept();
        double double24 = simpleRegression18.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double[] doubleArray30 = new double[] { 100.0f, 100L };
        double[] doubleArray33 = new double[] { 100.0f, 100L };
        double[] doubleArray36 = new double[] { 100.0f, 100L };
        double[][] doubleArray37 = new double[][] { doubleArray30, doubleArray33, doubleArray36 };
        simpleRegression26.addData(doubleArray37);
        simpleRegression25.addData(doubleArray37);
        simpleRegression18.addData(doubleArray37);
        simpleRegression11.addData(doubleArray37);
        simpleRegression4.addData(doubleArray37);
        simpleRegression0.addData(doubleArray37);
        double double44 = simpleRegression0.getTotalSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double46 = simpleRegression0.getSlopeConfidenceInterval(93.16554809843402d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertArrayEquals(doubleArray36, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.0d + "'", double44 == 0.0d);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getIntercept();
        double double8 = simpleRegression6.getMeanSquareError();
        long long9 = simpleRegression6.getN();
        double double10 = simpleRegression6.getSumSquaredErrors();
        double double11 = simpleRegression6.getR();
        double[] doubleArray18 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray25 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray26 = new double[][] { doubleArray18, doubleArray25 };
        simpleRegression6.addData(doubleArray26);
        simpleRegression0.addData(doubleArray26);
        double double29 = simpleRegression0.getRegressionSumSquares();
        double double30 = simpleRegression0.getIntercept();
        double double31 = simpleRegression0.getSlopeStdErr();
        double double32 = simpleRegression0.getInterceptStdErr();
        double double33 = simpleRegression0.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double35 = simpleRegression34.getMeanSquareError();
        double[] doubleArray38 = new double[] { 100.0f, 100L };
        double[] doubleArray41 = new double[] { 100.0f, 100L };
        double[] doubleArray44 = new double[] { 100.0f, 100L };
        double[][] doubleArray45 = new double[][] { doubleArray38, doubleArray41, doubleArray44 };
        simpleRegression34.addData(doubleArray45);
        double double47 = simpleRegression34.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression48 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression49 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double50 = simpleRegression49.getMeanSquareError();
        double[] doubleArray53 = new double[] { 100.0f, 100L };
        double[] doubleArray56 = new double[] { 100.0f, 100L };
        double[] doubleArray59 = new double[] { 100.0f, 100L };
        double[][] doubleArray60 = new double[][] { doubleArray53, doubleArray56, doubleArray59 };
        simpleRegression49.addData(doubleArray60);
        simpleRegression48.addData(doubleArray60);
        double double63 = simpleRegression48.getSignificance();
        double[][] doubleArray64 = new double[][] {};
        simpleRegression48.addData(doubleArray64);
        simpleRegression34.addData(doubleArray64);
        simpleRegression0.addData(doubleArray64);
        double double68 = simpleRegression0.getMeanSquareError();
        simpleRegression0.addData((-4.547473508864641E-13d), (double) 'a');
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertArrayEquals(doubleArray38, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertArrayEquals(doubleArray44, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertArrayEquals(doubleArray53, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertArrayEquals(doubleArray56, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertArrayEquals(doubleArray64, new double[][] {});
        org.junit.Assert.assertTrue(Double.isNaN(double68));
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double11 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getRSquare();
        simpleRegression0.addData((double) (-1.0f), (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSlopeConfidenceInterval((double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getIntercept();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getSlopeStdErr();
        double double10 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.predict(4900.5d);
        double double13 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        long long8 = simpleRegression0.getN();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double12 = simpleRegression11.getMeanSquareError();
        double double13 = simpleRegression11.getSumSquaredErrors();
        double double15 = simpleRegression11.predict((double) (short) -1);
        long long16 = simpleRegression11.getN();
        double double17 = simpleRegression11.getIntercept();
        simpleRegression11.clear();
        long long19 = simpleRegression11.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression20 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression21 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double22 = simpleRegression21.getMeanSquareError();
        double[] doubleArray25 = new double[] { 100.0f, 100L };
        double[] doubleArray28 = new double[] { 100.0f, 100L };
        double[] doubleArray31 = new double[] { 100.0f, 100L };
        double[][] doubleArray32 = new double[][] { doubleArray25, doubleArray28, doubleArray31 };
        simpleRegression21.addData(doubleArray32);
        simpleRegression20.addData(doubleArray32);
        simpleRegression11.addData(doubleArray32);
        simpleRegression0.addData(doubleArray32);
        double double37 = simpleRegression0.getR();
        double double39 = simpleRegression0.predict(4900.5d);
        double double40 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getSlopeConfidenceInterval();
        double double17 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = simpleRegression0.getSlopeConfidenceInterval((double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 0);
        simpleRegression0.clear();
        double double11 = simpleRegression0.predict((double) 10);
        simpleRegression0.addData((double) 0L, (-989.0d));
        simpleRegression0.addData(20402.0d, (double) 8L);
        // The following exception was thrown during execution in test generation
        try {
            double double18 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getIntercept();
        double double23 = simpleRegression0.getMeanSquareError();
        double double24 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        double double4 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.predict(100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getTotalSumSquares();
        double double9 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.getRegressionSumSquares();
        double double11 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getRSquare();
        simpleRegression0.addData((double) (-1.0f), (double) (-1));
        double double12 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = simpleRegression0.getSlopeConfidenceInterval((double) 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getInterceptStdErr();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSignificance();
        double[][] doubleArray16 = new double[][] {};
        simpleRegression0.addData(doubleArray16);
        double double18 = simpleRegression0.getTotalSumSquares();
        double double19 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) 10L, (double) 2L);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[][] {});
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getIntercept();
        double double17 = simpleRegression0.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression18 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double19 = simpleRegression18.getMeanSquareError();
        double double20 = simpleRegression18.getSlopeStdErr();
        double double21 = simpleRegression18.getSumSquaredErrors();
        double double22 = simpleRegression18.getSumSquaredErrors();
        double double23 = simpleRegression18.getTotalSumSquares();
        double double24 = simpleRegression18.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression25 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double26 = simpleRegression25.getMeanSquareError();
        double double27 = simpleRegression25.getSumSquaredErrors();
        double double29 = simpleRegression25.predict((double) (short) -1);
        double double30 = simpleRegression25.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression31 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double32 = simpleRegression31.getIntercept();
        double double33 = simpleRegression31.getMeanSquareError();
        long long34 = simpleRegression31.getN();
        double double35 = simpleRegression31.getSumSquaredErrors();
        double double36 = simpleRegression31.getR();
        double[] doubleArray43 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray50 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray51 = new double[][] { doubleArray43, doubleArray50 };
        simpleRegression31.addData(doubleArray51);
        simpleRegression25.addData(doubleArray51);
        simpleRegression18.addData(doubleArray51);
        simpleRegression0.addData(doubleArray51);
        simpleRegression0.clear();
        double double57 = simpleRegression0.getRegressionSumSquares();
        double double58 = simpleRegression0.getR();
        double double59 = simpleRegression0.getRSquare();
        // The following exception was thrown during execution in test generation
        try {
            double double60 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertArrayEquals(doubleArray43, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertArrayEquals(doubleArray50, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getMeanSquareError();
        double double9 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getSignificance();
        double double16 = simpleRegression0.getSlope();
        double double17 = simpleRegression0.getR();
        double double19 = simpleRegression0.predict((double) ' ');
        double double21 = simpleRegression0.predict((-1.0d));
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getTotalSumSquares();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getRegressionSumSquares();
        long long16 = simpleRegression0.getN();
        double double17 = simpleRegression0.getRSquare();
        simpleRegression0.addData(0.0d, (double) 1.0f);
        double double21 = simpleRegression0.getTotalSumSquares();
        double double22 = simpleRegression0.getRegressionSumSquares();
        double double23 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 3L + "'", long16 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 7350.75d + "'", double21 == 7350.75d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 7350.75d + "'", double22 == 7350.75d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double9 = simpleRegression0.getSlopeConfidenceInterval(Double.NaN);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression3 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[] doubleArray14 = new double[] { 100.0f, 100L };
        double[][] doubleArray15 = new double[][] { doubleArray8, doubleArray11, doubleArray14 };
        simpleRegression4.addData(doubleArray15);
        simpleRegression3.addData(doubleArray15);
        simpleRegression0.addData(doubleArray15);
        java.lang.Class<?> wildcardClass19 = doubleArray15.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getR();
        double double10 = simpleRegression0.predict((double) (-1L));
        double double11 = simpleRegression0.getMeanSquareError();
        double double12 = simpleRegression0.getMeanSquareError();
        double double14 = simpleRegression0.predict((double) 3L);
        double double15 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) (byte) 100, (double) 10.0f);
        java.lang.Class<?> wildcardClass19 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression12 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double13 = simpleRegression12.getMeanSquareError();
        double[] doubleArray16 = new double[] { 100.0f, 100L };
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[] doubleArray22 = new double[] { 100.0f, 100L };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray19, doubleArray22 };
        simpleRegression12.addData(doubleArray23);
        simpleRegression11.addData(doubleArray23);
        double double26 = simpleRegression11.getSumSquaredErrors();
        double double27 = simpleRegression11.getIntercept();
        double double28 = simpleRegression11.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double30 = simpleRegression29.getMeanSquareError();
        double double31 = simpleRegression29.getSlopeStdErr();
        double double32 = simpleRegression29.getSumSquaredErrors();
        double double33 = simpleRegression29.getSumSquaredErrors();
        double double34 = simpleRegression29.getTotalSumSquares();
        double double35 = simpleRegression29.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double37 = simpleRegression36.getMeanSquareError();
        double double38 = simpleRegression36.getSumSquaredErrors();
        double double40 = simpleRegression36.predict((double) (short) -1);
        double double41 = simpleRegression36.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression42 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double43 = simpleRegression42.getIntercept();
        double double44 = simpleRegression42.getMeanSquareError();
        long long45 = simpleRegression42.getN();
        double double46 = simpleRegression42.getSumSquaredErrors();
        double double47 = simpleRegression42.getR();
        double[] doubleArray54 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray61 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray62 = new double[][] { doubleArray54, doubleArray61 };
        simpleRegression42.addData(doubleArray62);
        simpleRegression36.addData(doubleArray62);
        simpleRegression29.addData(doubleArray62);
        simpleRegression11.addData(doubleArray62);
        simpleRegression0.addData(doubleArray62);
        double double68 = simpleRegression0.getSumSquaredErrors();
        long long69 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + long69 + "' != '" + 2L + "'", long69 == 2L);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        long long8 = simpleRegression0.getN();
        long long9 = simpleRegression0.getN();
        double double10 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        simpleRegression0.addData((double) 0L, (double) 10.0f);
        simpleRegression0.clear();
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getRSquare();
        double double8 = simpleRegression0.getTotalSumSquares();
        double double9 = simpleRegression0.getRegressionSumSquares();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getRSquare();
        double double6 = simpleRegression0.predict((double) 3L);
        double double7 = simpleRegression0.getSlopeStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double3 = simpleRegression0.getRSquare();
        long long4 = simpleRegression0.getN();
        double double5 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.predict((double) (short) 100);
        double double8 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRSquare();
        double double6 = simpleRegression0.getTotalSumSquares();
        double double7 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getSlopeStdErr();
        double double17 = simpleRegression0.getRegressionSumSquares();
        double double18 = simpleRegression0.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double20 = simpleRegression19.getIntercept();
        double double21 = simpleRegression19.getMeanSquareError();
        simpleRegression19.clear();
        double double23 = simpleRegression19.getTotalSumSquares();
        double double24 = simpleRegression19.getIntercept();
        double double25 = simpleRegression19.getSlopeStdErr();
        long long26 = simpleRegression19.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression27 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double28 = simpleRegression27.getMeanSquareError();
        double[] doubleArray31 = new double[] { 100.0f, 100L };
        double[] doubleArray34 = new double[] { 100.0f, 100L };
        double[] doubleArray37 = new double[] { 100.0f, 100L };
        double[][] doubleArray38 = new double[][] { doubleArray31, doubleArray34, doubleArray37 };
        simpleRegression27.addData(doubleArray38);
        long long40 = simpleRegression27.getN();
        double double41 = simpleRegression27.getRSquare();
        double double42 = simpleRegression27.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression43 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double44 = simpleRegression43.getMeanSquareError();
        double double45 = simpleRegression43.getSumSquaredErrors();
        double double46 = simpleRegression43.getMeanSquareError();
        double double48 = simpleRegression43.predict((double) 10);
        simpleRegression43.clear();
        double[] doubleArray55 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray61 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray62 = new double[][] { doubleArray55, doubleArray61 };
        simpleRegression43.addData(doubleArray62);
        simpleRegression27.addData(doubleArray62);
        simpleRegression19.addData(doubleArray62);
        simpleRegression0.addData(doubleArray62);
        double double67 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 3L + "'", long40 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 27.77777777777778d + "'", double67 == 27.77777777777778d);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getTotalSumSquares();
        double double24 = simpleRegression0.getR();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getTotalSumSquares();
        double double10 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression11 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression12 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double13 = simpleRegression12.getMeanSquareError();
        double[] doubleArray16 = new double[] { 100.0f, 100L };
        double[] doubleArray19 = new double[] { 100.0f, 100L };
        double[] doubleArray22 = new double[] { 100.0f, 100L };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray19, doubleArray22 };
        simpleRegression12.addData(doubleArray23);
        simpleRegression11.addData(doubleArray23);
        double double26 = simpleRegression11.getSumSquaredErrors();
        double double27 = simpleRegression11.getIntercept();
        double double28 = simpleRegression11.getRSquare();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression29 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double30 = simpleRegression29.getMeanSquareError();
        double double31 = simpleRegression29.getSlopeStdErr();
        double double32 = simpleRegression29.getSumSquaredErrors();
        double double33 = simpleRegression29.getSumSquaredErrors();
        double double34 = simpleRegression29.getTotalSumSquares();
        double double35 = simpleRegression29.getInterceptStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression36 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double37 = simpleRegression36.getMeanSquareError();
        double double38 = simpleRegression36.getSumSquaredErrors();
        double double40 = simpleRegression36.predict((double) (short) -1);
        double double41 = simpleRegression36.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression42 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double43 = simpleRegression42.getIntercept();
        double double44 = simpleRegression42.getMeanSquareError();
        long long45 = simpleRegression42.getN();
        double double46 = simpleRegression42.getSumSquaredErrors();
        double double47 = simpleRegression42.getR();
        double[] doubleArray54 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray61 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray62 = new double[][] { doubleArray54, doubleArray61 };
        simpleRegression42.addData(doubleArray62);
        simpleRegression36.addData(doubleArray62);
        simpleRegression29.addData(doubleArray62);
        simpleRegression11.addData(doubleArray62);
        simpleRegression0.addData(doubleArray62);
        double double68 = simpleRegression0.getInterceptStdErr();
        double double70 = simpleRegression0.predict((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertArrayEquals(doubleArray54, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertArrayEquals(doubleArray61, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getSumSquaredErrors();
        double double23 = simpleRegression0.getR();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getSumSquaredErrors();
        double double9 = simpleRegression0.getSumSquaredErrors();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression1 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double2 = simpleRegression1.getMeanSquareError();
        double[] doubleArray5 = new double[] { 100.0f, 100L };
        double[] doubleArray8 = new double[] { 100.0f, 100L };
        double[] doubleArray11 = new double[] { 100.0f, 100L };
        double[][] doubleArray12 = new double[][] { doubleArray5, doubleArray8, doubleArray11 };
        simpleRegression1.addData(doubleArray12);
        simpleRegression0.addData(doubleArray12);
        double double15 = simpleRegression0.getSlopeStdErr();
        double double16 = simpleRegression0.getRegressionSumSquares();
        double double17 = simpleRegression0.getR();
        double double18 = simpleRegression0.getTotalSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRSquare();
        double double7 = simpleRegression0.getMeanSquareError();
        // The following exception was thrown during execution in test generation
        try {
            double double8 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double3 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getSumSquaredErrors();
        double double23 = simpleRegression0.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression24 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double25 = simpleRegression24.getIntercept();
        double double26 = simpleRegression24.getMeanSquareError();
        simpleRegression24.clear();
        double double28 = simpleRegression24.getSumSquaredErrors();
        simpleRegression24.addData((double) (byte) 0, (double) 1.0f);
        double double32 = simpleRegression24.getR();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression33 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double34 = simpleRegression33.getMeanSquareError();
        double double35 = simpleRegression33.getSumSquaredErrors();
        double double37 = simpleRegression33.predict((double) (short) -1);
        double double38 = simpleRegression33.getIntercept();
        double double39 = simpleRegression33.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression40 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression41 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double42 = simpleRegression41.getMeanSquareError();
        double[] doubleArray45 = new double[] { 100.0f, 100L };
        double[] doubleArray48 = new double[] { 100.0f, 100L };
        double[] doubleArray51 = new double[] { 100.0f, 100L };
        double[][] doubleArray52 = new double[][] { doubleArray45, doubleArray48, doubleArray51 };
        simpleRegression41.addData(doubleArray52);
        simpleRegression40.addData(doubleArray52);
        simpleRegression33.addData(doubleArray52);
        simpleRegression24.addData(doubleArray52);
        simpleRegression0.addData(doubleArray52);
        double double58 = simpleRegression0.getSlopeConfidenceInterval();
        double double59 = simpleRegression0.getSlopeConfidenceInterval();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertArrayEquals(doubleArray51, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getSlope();
        double double24 = simpleRegression0.getSlopeConfidenceInterval();
        double double25 = simpleRegression0.getIntercept();
        double double26 = simpleRegression0.getRSquare();
        double double27 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getTotalSumSquares();
        double double23 = simpleRegression0.getInterceptStdErr();
        simpleRegression0.clear();
        simpleRegression0.addData(93.16554809843402d, 1.0d);
        long long28 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double29 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double4 = simpleRegression0.getSumSquaredErrors();
        double double5 = simpleRegression0.getR();
        double[] doubleArray12 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[] doubleArray19 = new double[] { (byte) 100, (byte) 0, '#', (short) 1, 10, (byte) 100 };
        double[][] doubleArray20 = new double[][] { doubleArray12, doubleArray19 };
        simpleRegression0.addData(doubleArray20);
        double double22 = simpleRegression0.getTotalSumSquares();
        java.lang.Class<?> wildcardClass23 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 0.0d, 35.0d, 1.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.predict((double) 10);
        double double9 = simpleRegression0.predict(0.010000000000000009d);
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double7 = simpleRegression0.predict(0.0d);
        simpleRegression0.clear();
        double double9 = simpleRegression0.getSumSquaredErrors();
        double double10 = simpleRegression0.getR();
        java.lang.Class<?> wildcardClass11 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getRegressionSumSquares();
        double double5 = simpleRegression0.predict((double) 0.0f);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression6 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double7 = simpleRegression6.getMeanSquareError();
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[] doubleArray13 = new double[] { 100.0f, 100L };
        double[] doubleArray16 = new double[] { 100.0f, 100L };
        double[][] doubleArray17 = new double[][] { doubleArray10, doubleArray13, doubleArray16 };
        simpleRegression6.addData(doubleArray17);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression19 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double20 = simpleRegression19.getMeanSquareError();
        simpleRegression19.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression22 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression23 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double24 = simpleRegression23.getMeanSquareError();
        double[] doubleArray27 = new double[] { 100.0f, 100L };
        double[] doubleArray30 = new double[] { 100.0f, 100L };
        double[] doubleArray33 = new double[] { 100.0f, 100L };
        double[][] doubleArray34 = new double[][] { doubleArray27, doubleArray30, doubleArray33 };
        simpleRegression23.addData(doubleArray34);
        simpleRegression22.addData(doubleArray34);
        simpleRegression19.addData(doubleArray34);
        simpleRegression6.addData(doubleArray34);
        simpleRegression0.addData(doubleArray34);
        double double40 = simpleRegression0.getSlopeStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double42 = simpleRegression0.getSlopeConfidenceInterval((double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(40.5d, (double) (short) 0);
        double double11 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData(1851.4285714285713d, (double) 6L);
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getMeanSquareError();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double7 = simpleRegression0.getRegressionSumSquares();
        simpleRegression0.addData(40.5d, (double) (short) 0);
        double double11 = simpleRegression0.getTotalSumSquares();
        double double12 = simpleRegression0.getSumSquaredErrors();
        java.lang.Class<?> wildcardClass13 = simpleRegression0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getInterceptStdErr();
        double double3 = simpleRegression0.getRSquare();
        double double5 = simpleRegression0.predict(100.0d);
        double double6 = simpleRegression0.getSlope();
        double double7 = simpleRegression0.getRegressionSumSquares();
        double double8 = simpleRegression0.getRSquare();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        double double5 = simpleRegression0.getSlopeStdErr();
        double double6 = simpleRegression0.getIntercept();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getRegressionSumSquares();
        double double6 = simpleRegression0.getSlopeStdErr();
        double double8 = simpleRegression0.predict((double) (byte) 0);
        simpleRegression0.clear();
        double double11 = simpleRegression0.predict((double) 10);
        double double12 = simpleRegression0.getSlope();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = simpleRegression0.getSignificance();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double4 = simpleRegression0.getInterceptStdErr();
        double double5 = simpleRegression0.getSlope();
        double double6 = simpleRegression0.getMeanSquareError();
        double double7 = simpleRegression0.getSlope();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getTotalSumSquares();
        simpleRegression0.addData((double) (short) -1, (double) (-1.0f));
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getTotalSumSquares();
        double double24 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) 0, (double) (byte) 1);
        double double28 = simpleRegression0.getInterceptStdErr();
        double double29 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 7350.75d + "'", double29 == 7350.75d);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        long long5 = simpleRegression0.getN();
        double double6 = simpleRegression0.getIntercept();
        simpleRegression0.clear();
        long long8 = simpleRegression0.getN();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression9 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression10 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double11 = simpleRegression10.getMeanSquareError();
        double[] doubleArray14 = new double[] { 100.0f, 100L };
        double[] doubleArray17 = new double[] { 100.0f, 100L };
        double[] doubleArray20 = new double[] { 100.0f, 100L };
        double[][] doubleArray21 = new double[][] { doubleArray14, doubleArray17, doubleArray20 };
        simpleRegression10.addData(doubleArray21);
        simpleRegression9.addData(doubleArray21);
        simpleRegression0.addData(doubleArray21);
        java.lang.Class<?> wildcardClass25 = doubleArray21.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getSlopeStdErr();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression4 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double5 = simpleRegression4.getMeanSquareError();
        double double6 = simpleRegression4.getSumSquaredErrors();
        double double7 = simpleRegression4.getMeanSquareError();
        double double9 = simpleRegression4.predict((double) 10);
        simpleRegression4.clear();
        double[] doubleArray16 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[] doubleArray22 = new double[] { 10.0d, '#', (short) -1, 0.0d, (byte) -1 };
        double[][] doubleArray23 = new double[][] { doubleArray16, doubleArray22 };
        simpleRegression4.addData(doubleArray23);
        simpleRegression0.addData(doubleArray23);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression26 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double27 = simpleRegression26.getMeanSquareError();
        double double28 = simpleRegression26.getSumSquaredErrors();
        double double30 = simpleRegression26.predict((double) (short) -1);
        double double31 = simpleRegression26.getMeanSquareError();
        double double32 = simpleRegression26.getSlopeStdErr();
        double double34 = simpleRegression26.predict((double) (byte) 1);
        double[] doubleArray41 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray48 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray55 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray62 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[] doubleArray69 = new double[] { 0L, (-1L), 10L, 'a', (byte) 100, (short) 0 };
        double[][] doubleArray70 = new double[][] { doubleArray41, doubleArray48, doubleArray55, doubleArray62, doubleArray69 };
        simpleRegression26.addData(doubleArray70);
        simpleRegression0.addData(doubleArray70);
        simpleRegression0.addData((double) 1L, (-4.547473508864641E-13d));
        double double76 = simpleRegression0.getR();
        simpleRegression0.clear();
        simpleRegression0.addData((double) (byte) 10, (double) 0.0f);
        double double81 = simpleRegression0.getSlopeStdErr();
        long long82 = simpleRegression0.getN();
        // The following exception was thrown during execution in test generation
        try {
            double double84 = simpleRegression0.getSlopeConfidenceInterval((double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 35.0d, (-1.0d), 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertArrayEquals(doubleArray55, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertArrayEquals(doubleArray69, new double[] { 0.0d, (-1.0d), 10.0d, 97.0d, 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.9984957532976854d + "'", double76 == 0.9984957532976854d);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + long82 + "' != '" + 1L + "'", long82 == 1L);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.addData((double) (byte) 0, (double) 1.0f);
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        long long13 = simpleRegression0.getN();
        double double14 = simpleRegression0.getSumSquaredErrors();
        double double15 = simpleRegression0.getSumSquaredErrors();
        double double16 = simpleRegression0.getSignificance();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double[] doubleArray4 = new double[] { 100.0f, 100L };
        double[] doubleArray7 = new double[] { 100.0f, 100L };
        double[] doubleArray10 = new double[] { 100.0f, 100L };
        double[][] doubleArray11 = new double[][] { doubleArray4, doubleArray7, doubleArray10 };
        simpleRegression0.addData(doubleArray11);
        double double13 = simpleRegression0.getR();
        double double14 = simpleRegression0.getSignificance();
        double double15 = simpleRegression0.getR();
        double double16 = simpleRegression0.getR();
        double[] doubleArray21 = new double[] { 10.0d, (short) -1, (-1.0d), (short) -1 };
        double[] doubleArray26 = new double[] { 10.0d, (short) -1, (-1.0d), (short) -1 };
        double[] doubleArray31 = new double[] { 10.0d, (short) -1, (-1.0d), (short) -1 };
        double[][] doubleArray32 = new double[][] { doubleArray21, doubleArray26, doubleArray31 };
        simpleRegression0.addData(doubleArray32);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression34 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double35 = simpleRegression34.getMeanSquareError();
        double double36 = simpleRegression34.getSumSquaredErrors();
        double double37 = simpleRegression34.getMeanSquareError();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression38 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double39 = simpleRegression38.getMeanSquareError();
        double[] doubleArray42 = new double[] { 100.0f, 100L };
        double[] doubleArray45 = new double[] { 100.0f, 100L };
        double[] doubleArray48 = new double[] { 100.0f, 100L };
        double[][] doubleArray49 = new double[][] { doubleArray42, doubleArray45, doubleArray48 };
        simpleRegression38.addData(doubleArray49);
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression51 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double52 = simpleRegression51.getMeanSquareError();
        simpleRegression51.clear();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression54 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression55 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double56 = simpleRegression55.getMeanSquareError();
        double[] doubleArray59 = new double[] { 100.0f, 100L };
        double[] doubleArray62 = new double[] { 100.0f, 100L };
        double[] doubleArray65 = new double[] { 100.0f, 100L };
        double[][] doubleArray66 = new double[][] { doubleArray59, doubleArray62, doubleArray65 };
        simpleRegression55.addData(doubleArray66);
        simpleRegression54.addData(doubleArray66);
        simpleRegression51.addData(doubleArray66);
        simpleRegression38.addData(doubleArray66);
        simpleRegression34.addData(doubleArray66);
        simpleRegression0.addData(doubleArray66);
        simpleRegression0.clear();
        double double74 = simpleRegression0.getMeanSquareError();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 10.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 10.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 10.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertArrayEquals(doubleArray42, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertArrayEquals(doubleArray45, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertArrayEquals(doubleArray59, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertArrayEquals(doubleArray62, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertArrayEquals(doubleArray65, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertTrue(Double.isNaN(double74));
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        simpleRegression0.clear();
        double double5 = simpleRegression0.predict((double) (byte) 10);
        double double6 = simpleRegression0.getRegressionSumSquares();
        double double7 = simpleRegression0.getSlope();
        double double8 = simpleRegression0.getSlopeStdErr();
        double double9 = simpleRegression0.getInterceptStdErr();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getTotalSumSquares();
        double double24 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) 0, (double) (byte) 1);
        double double28 = simpleRegression0.getInterceptStdErr();
        double double30 = simpleRegression0.predict(6.185682326621923d);
        double double31 = simpleRegression0.getIntercept();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 7.123825503355704d + "'", double30 == 7.123825503355704d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getIntercept();
        double double2 = simpleRegression0.getMeanSquareError();
        long long3 = simpleRegression0.getN();
        double double5 = simpleRegression0.predict((double) (byte) -1);
        double double6 = simpleRegression0.getRSquare();
        simpleRegression0.clear();
        double double8 = simpleRegression0.getRSquare();
        double double9 = simpleRegression0.getSumSquaredErrors();
        long long10 = simpleRegression0.getN();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSlopeStdErr();
        double double3 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.getSumSquaredErrors();
        simpleRegression0.clear();
        // The following exception was thrown during execution in test generation
        try {
            double double6 = simpleRegression0.getSlopeConfidenceInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: degrees of freedom must be positive.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double3 = simpleRegression0.getMeanSquareError();
        double double5 = simpleRegression0.predict((double) 10);
        simpleRegression0.clear();
        double double7 = simpleRegression0.getInterceptStdErr();
        double double8 = simpleRegression0.getR();
        double double9 = simpleRegression0.getMeanSquareError();
        double double10 = simpleRegression0.getSumSquaredErrors();
        double double11 = simpleRegression0.getRegressionSumSquares();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression0 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double1 = simpleRegression0.getMeanSquareError();
        double double2 = simpleRegression0.getSumSquaredErrors();
        double double4 = simpleRegression0.predict((double) (short) -1);
        double double5 = simpleRegression0.getIntercept();
        double double6 = simpleRegression0.getIntercept();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression7 = new org.apache.commons.math.stat.regression.SimpleRegression();
        org.apache.commons.math.stat.regression.SimpleRegression simpleRegression8 = new org.apache.commons.math.stat.regression.SimpleRegression();
        double double9 = simpleRegression8.getMeanSquareError();
        double[] doubleArray12 = new double[] { 100.0f, 100L };
        double[] doubleArray15 = new double[] { 100.0f, 100L };
        double[] doubleArray18 = new double[] { 100.0f, 100L };
        double[][] doubleArray19 = new double[][] { doubleArray12, doubleArray15, doubleArray18 };
        simpleRegression8.addData(doubleArray19);
        simpleRegression7.addData(doubleArray19);
        simpleRegression0.addData(doubleArray19);
        double double23 = simpleRegression0.getTotalSumSquares();
        double double24 = simpleRegression0.getIntercept();
        simpleRegression0.addData((double) 0, (double) (byte) 1);
        double double28 = simpleRegression0.getInterceptStdErr();
        // The following exception was thrown during execution in test generation
        try {
            double double30 = simpleRegression0.getSlopeConfidenceInterval(515.3034511711904d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
    }
}

