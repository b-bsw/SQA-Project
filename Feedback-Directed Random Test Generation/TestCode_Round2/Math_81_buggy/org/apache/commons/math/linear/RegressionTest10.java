package org.apache.commons.math.linear;

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
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver6 = eigenDecompositionImpl4.getSolver();
        double double7 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl12.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(decompositionSolver6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        double double17 = eigenDecompositionImpl7.getDeterminant();
        double double18 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl7.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double double9 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 100L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 0.0f);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl14.getSolver();
        double[] doubleArray16 = eigenDecompositionImpl14.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getRealEigenvalues();
        double double9 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 0.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl12.getD();
        double[] doubleArray14 = eigenDecompositionImpl12.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl12.getSolver();
        double double17 = eigenDecompositionImpl12.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl12.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix18, 0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl20.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl23 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix21, (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl4.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        double double15 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray16 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getD();
        double[] doubleArray18 = eigenDecompositionImpl7.getRealEigenvalues();
        double double19 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl7.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        double double12 = eigenDecompositionImpl4.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl9 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix7, (double) 1L);
        double[] doubleArray10 = eigenDecompositionImpl9.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl9.getV();
        double[] doubleArray12 = eigenDecompositionImpl9.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl9.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        double double13 = eigenDecompositionImpl4.getImagEigenvalue(0);
        double[] doubleArray14 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealVector realVector17 = eigenDecompositionImpl4.getEigenvector(0);
        org.apache.commons.math.linear.RealVector realVector19 = eigenDecompositionImpl4.getEigenvector(0);
        java.lang.Class<?> wildcardClass20 = realVector19.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(realVector17);
        org.junit.Assert.assertNotNull(realVector19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        double double10 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 0);
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray13 = new double[] { (-1) };
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray13, doubleArray14, (double) (-1));
        double double18 = eigenDecompositionImpl16.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray19 = eigenDecompositionImpl16.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl16.getD();
        org.apache.commons.math.linear.RealVector realVector22 = eigenDecompositionImpl16.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl16.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = eigenDecompositionImpl16.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl26 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix24, (-1.0d));
        double[] doubleArray27 = eigenDecompositionImpl26.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl29 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray11, doubleArray27, (double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realVector22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        double[] doubleArray12 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getD();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        double double16 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getD();
        double[] doubleArray18 = eigenDecompositionImpl7.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        double[] doubleArray10 = eigenDecompositionImpl7.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray13 = new double[] { (-1) };
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray13, doubleArray14, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl16.getD();
        double[] doubleArray18 = eigenDecompositionImpl16.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver19 = eigenDecompositionImpl16.getSolver();
        double[] doubleArray20 = eigenDecompositionImpl16.getRealEigenvalues();
        double[] doubleArray21 = eigenDecompositionImpl16.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = eigenDecompositionImpl16.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver23 = eigenDecompositionImpl16.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = eigenDecompositionImpl16.getD();
        double[] doubleArray25 = eigenDecompositionImpl16.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl27 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray11, doubleArray25, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(decompositionSolver23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getV();
        double double16 = eigenDecompositionImpl4.getImagEigenvalue(0);
        double[] doubleArray17 = eigenDecompositionImpl4.getImagEigenvalues();
        double double18 = eigenDecompositionImpl4.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealVector realVector9 = eigenDecompositionImpl7.getEigenvector((int) (short) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        java.lang.Class<?> wildcardClass11 = eigenDecompositionImpl7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 1);
        java.lang.Class<?> wildcardClass15 = eigenDecompositionImpl14.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl12.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl12.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl12.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl12.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver20 = eigenDecompositionImpl18.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(decompositionSolver20);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) (byte) -1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl12.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, 10.0d);
        double double16 = eigenDecompositionImpl15.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        double double14 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray15 = eigenDecompositionImpl4.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (short) 1);
        double double15 = eigenDecompositionImpl14.getDeterminant();
        double double16 = eigenDecompositionImpl14.getDeterminant();
        double double17 = eigenDecompositionImpl14.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl14.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl14.getV();
        double[] doubleArray20 = eigenDecompositionImpl14.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getV();
        double double16 = eigenDecompositionImpl4.getImagEigenvalue(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector18 = eigenDecompositionImpl4.getEigenvector((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getV();
        double double12 = eigenDecompositionImpl7.getImagEigenvalue((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getVT();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        java.lang.Class<?> wildcardClass12 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray15 = new double[] { (-1) };
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray15, doubleArray16, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix19, (double) 10.0f);
        double[] doubleArray22 = eigenDecompositionImpl21.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl21.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver24 = eigenDecompositionImpl21.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = eigenDecompositionImpl21.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = eigenDecompositionImpl21.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = eigenDecompositionImpl21.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver28 = eigenDecompositionImpl21.getSolver();
        double[] doubleArray29 = eigenDecompositionImpl21.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl31 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray13, doubleArray29, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(decompositionSolver24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(decompositionSolver28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (byte) 10);
        double double13 = eigenDecompositionImpl12.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealVector realVector10 = eigenDecompositionImpl4.getEigenvector(0);
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl4.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(decompositionSolver15);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        double double12 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 0);
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl4.getImagEigenvalues();
        double double15 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray16 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl19 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix17, (double) 100.0f);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix17, (double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        double[] doubleArray16 = eigenDecompositionImpl7.getRealEigenvalues();
        double double17 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver18 = eigenDecompositionImpl7.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver18);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (byte) 100);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl13.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl13.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        double double13 = eigenDecompositionImpl4.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getV();
        double[] doubleArray15 = eigenDecompositionImpl4.getRealEigenvalues();
        java.lang.Class<?> wildcardClass16 = eigenDecompositionImpl4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        double double15 = eigenDecompositionImpl11.getImagEigenvalue((int) (byte) 0);
        double double16 = eigenDecompositionImpl11.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl11.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) (-1.0f));
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver19 = eigenDecompositionImpl18.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl18.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl18.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = eigenDecompositionImpl18.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(decompositionSolver19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl11.getSolver();
        java.lang.Class<?> wildcardClass14 = decompositionSolver13.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double double8 = eigenDecompositionImpl7.getDeterminant();
        double double10 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        double[] doubleArray10 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getVT();
        double double14 = eigenDecompositionImpl4.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 0L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (byte) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl15.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl15.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl19 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix17, (double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        double double15 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 0);
        double[] doubleArray16 = eigenDecompositionImpl4.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = eigenDecompositionImpl4.getRealEigenvalue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealVector realVector11 = eigenDecompositionImpl4.getEigenvector(0);
        double[] doubleArray12 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray14 = new double[] { (-1) };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray14, doubleArray15, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl17.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix18, (double) 10.0f);
        double[] doubleArray21 = eigenDecompositionImpl20.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = eigenDecompositionImpl20.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver23 = eigenDecompositionImpl20.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = eigenDecompositionImpl20.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver25 = eigenDecompositionImpl20.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = eigenDecompositionImpl20.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = eigenDecompositionImpl20.getVT();
        double[] doubleArray28 = eigenDecompositionImpl20.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = eigenDecompositionImpl20.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = eigenDecompositionImpl20.getD();
        org.apache.commons.math.linear.RealVector realVector32 = eigenDecompositionImpl20.getEigenvector((int) (byte) 0);
        double[] doubleArray33 = eigenDecompositionImpl20.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl35 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray12, doubleArray33, (double) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(decompositionSolver23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(decompositionSolver25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realVector32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        java.lang.Class<?> wildcardClass12 = eigenDecompositionImpl4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (-1.0f));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (byte) 1);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl14.getSolver();
        org.apache.commons.math.linear.RealVector realVector17 = eigenDecompositionImpl14.getEigenvector((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(realVector17);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        double double15 = eigenDecompositionImpl7.getRealEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray15 = eigenDecompositionImpl7.getRealEigenvalues();
        double double16 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getD();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = eigenDecompositionImpl7.getRealEigenvalue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver5 = eigenDecompositionImpl4.getSolver();
        double double7 = eigenDecompositionImpl4.getRealEigenvalue((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 100.0f);
        java.lang.Class<?> wildcardClass13 = realMatrix10.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        double double12 = eigenDecompositionImpl7.getDeterminant();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) (byte) 1);
        double[] doubleArray17 = eigenDecompositionImpl16.getImagEigenvalues();
        double[] doubleArray18 = eigenDecompositionImpl16.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver19 = eigenDecompositionImpl16.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver19);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (short) -1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 0.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl16.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver18 = eigenDecompositionImpl16.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(decompositionSolver18);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        double double12 = eigenDecompositionImpl7.getDeterminant();
        double double14 = eigenDecompositionImpl7.getRealEigenvalue((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = eigenDecompositionImpl7.getImagEigenvalue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        double double12 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        double double13 = eigenDecompositionImpl4.getImagEigenvalue(0);
        double double14 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) 1L);
        double double18 = eigenDecompositionImpl17.getDeterminant();
        double[] doubleArray19 = eigenDecompositionImpl17.getImagEigenvalues();
        double[] doubleArray20 = eigenDecompositionImpl17.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl17.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        double double12 = eigenDecompositionImpl4.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl9 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix7, (double) 1L);
        double[] doubleArray10 = eigenDecompositionImpl9.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl9.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl9.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl9.getD();
        double[] doubleArray14 = eigenDecompositionImpl9.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = eigenDecompositionImpl13.getRealEigenvalue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver8);
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 0);
        double[] doubleArray16 = eigenDecompositionImpl15.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl15.getV();
        java.lang.Class<?> wildcardClass18 = realMatrix17.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl7.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl4.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getRealEigenvalues();
        double double12 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl14.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl14.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, 1.0d);
        double[] doubleArray19 = eigenDecompositionImpl18.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl18.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl18.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) (short) 100);
        double[] doubleArray12 = eigenDecompositionImpl11.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl11.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 0);
        double double16 = eigenDecompositionImpl15.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl15.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl19 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix17, 0.0d);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver20 = eigenDecompositionImpl19.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl19.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(decompositionSolver20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = eigenDecompositionImpl4.getV();
        double[] doubleArray7 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getV();
        double[] doubleArray10 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray12 = new double[] { (-1) };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray12, doubleArray13, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl15.getD();
        double[] doubleArray17 = eigenDecompositionImpl15.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl15.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl15.getVT();
        double[] doubleArray20 = eigenDecompositionImpl15.getImagEigenvalues();
        double[] doubleArray21 = eigenDecompositionImpl15.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver22 = eigenDecompositionImpl15.getSolver();
        double double23 = eigenDecompositionImpl15.getDeterminant();
        double[] doubleArray24 = eigenDecompositionImpl15.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl26 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray10, doubleArray24, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray14 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealVector realVector17 = eigenDecompositionImpl7.getEigenvector((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl7.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) 100L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double15 = eigenDecompositionImpl13.getImagEigenvalue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl4.getSolver();
        double double13 = eigenDecompositionImpl4.getImagEigenvalue(0);
        double[] doubleArray14 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getVT();
        double double16 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl4.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(decompositionSolver11);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl7.getSolver();
        double double16 = eigenDecompositionImpl7.getDeterminant();
        double double18 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        double[] doubleArray10 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        double[] doubleArray12 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getV();
        java.lang.Class<?> wildcardClass14 = realMatrix13.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getD();
        double[] doubleArray17 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver18 = eigenDecompositionImpl7.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver18);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 1L);
        double[] doubleArray15 = eigenDecompositionImpl14.getImagEigenvalues();
        double[] doubleArray17 = new double[] { (-1) };
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray17, doubleArray18, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl20.getD();
        double[] doubleArray22 = eigenDecompositionImpl20.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl20.getD();
        double[] doubleArray24 = eigenDecompositionImpl20.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver25 = eigenDecompositionImpl20.getSolver();
        double[] doubleArray26 = eigenDecompositionImpl20.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = eigenDecompositionImpl20.getD();
        double[] doubleArray28 = eigenDecompositionImpl20.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl30 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray15, doubleArray28, (double) 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        double double15 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray16 = eigenDecompositionImpl7.getImagEigenvalues();
        double double17 = eigenDecompositionImpl7.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector19 = eigenDecompositionImpl7.getEigenvector((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (-1.0d));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 100L);
        double double15 = eigenDecompositionImpl14.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        double double15 = eigenDecompositionImpl4.getDeterminant();
        double double16 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl4.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) 0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, 1.0d);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) (short) 10);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, 1.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        double double14 = eigenDecompositionImpl7.getDeterminant();
        double double15 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray16 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix18, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl13.getV();
        org.apache.commons.math.linear.RealVector realVector16 = eigenDecompositionImpl13.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl13.getV();
        double[] doubleArray18 = eigenDecompositionImpl13.getRealEigenvalues();
        double double19 = eigenDecompositionImpl13.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver20 = eigenDecompositionImpl13.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl13.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realVector16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(decompositionSolver20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl4.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) 100);
        double[] doubleArray17 = eigenDecompositionImpl16.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl16.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl16.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        double double7 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl4.getSolver();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver8);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (short) 0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 'a');
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl14.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver8);
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double double9 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (short) -1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 0.0f);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) '#');
        // The following exception was thrown during execution in test generation
        try {
            double double20 = eigenDecompositionImpl18.getRealEigenvalue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) (byte) -1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl12.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 100);
        double[] doubleArray18 = eigenDecompositionImpl17.getRealEigenvalues();
        double[] doubleArray19 = eigenDecompositionImpl17.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl17.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl4.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver12);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        double double12 = eigenDecompositionImpl4.getDeterminant();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray14 = eigenDecompositionImpl4.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector16 = eigenDecompositionImpl4.getEigenvector((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) 1.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getRealEigenvalues();
        double double9 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 0.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl12.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl12.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl12.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl12.getD();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = eigenDecompositionImpl12.getImagEigenvalue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        double[] doubleArray17 = eigenDecompositionImpl7.getImagEigenvalues();
        double double18 = eigenDecompositionImpl7.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        double double14 = eigenDecompositionImpl4.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getVT();
        double double16 = eigenDecompositionImpl4.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = eigenDecompositionImpl4.getImagEigenvalue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl7.getD();
        double double9 = eigenDecompositionImpl7.getDeterminant();
        double double11 = eigenDecompositionImpl7.getImagEigenvalue((int) (short) 0);
        double double12 = eigenDecompositionImpl7.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            double double14 = eigenDecompositionImpl7.getRealEigenvalue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl17.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver6 = eigenDecompositionImpl4.getSolver();
        double double7 = eigenDecompositionImpl4.getDeterminant();
        double double8 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(decompositionSolver6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 1.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl15.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl15.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl15.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl15.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(decompositionSolver17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray16 = eigenDecompositionImpl7.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '4');
        double[] doubleArray12 = eigenDecompositionImpl11.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl11.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        double double7 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double double9 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 100L);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl12.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl12.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl12.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl12.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl12.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl12.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        double double10 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 1L);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl14.getD();
        double double17 = eigenDecompositionImpl14.getRealEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl14.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver19 = eigenDecompositionImpl14.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl14.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(decompositionSolver19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) (byte) -1);
        double double11 = eigenDecompositionImpl10.getDeterminant();
        double[] doubleArray12 = eigenDecompositionImpl10.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl10.getSolver();
        double[] doubleArray14 = eigenDecompositionImpl10.getRealEigenvalues();
        double double16 = eigenDecompositionImpl10.getRealEigenvalue(0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        double double12 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 0);
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector15 = eigenDecompositionImpl4.getEigenvector((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl4.getSolver();
        double double12 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(decompositionSolver11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getRealEigenvalues();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getD();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray16 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl7.getSolver();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray14 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) 0.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl17.getVT();
        org.apache.commons.math.linear.RealVector realVector20 = eigenDecompositionImpl17.getEigenvector((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = eigenDecompositionImpl17.getRealEigenvalue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realVector20);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getV();
        double double12 = eigenDecompositionImpl7.getImagEigenvalue((int) (short) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        double double15 = eigenDecompositionImpl7.getImagEigenvalue(0);
        // The following exception was thrown during execution in test generation
        try {
            double double17 = eigenDecompositionImpl7.getImagEigenvalue((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (-1L));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix19, (double) (byte) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = eigenDecompositionImpl21.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl24 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix22, (double) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double26 = eigenDecompositionImpl24.getImagEigenvalue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl7.getSolver();
        double double16 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray18 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealVector realVector20 = eigenDecompositionImpl7.getEigenvector((int) (short) 0);
        double double22 = eigenDecompositionImpl7.getRealEigenvalue((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector20);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl8 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix6, (double) (byte) 100);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix6, (double) 1.0f);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl10.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(decompositionSolver11);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double double10 = eigenDecompositionImpl4.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl4.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver14);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double double12 = eigenDecompositionImpl7.getRealEigenvalue((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        double double15 = eigenDecompositionImpl4.getDeterminant();
        double double16 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray17 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl4.getD();
        double double20 = eigenDecompositionImpl4.getRealEigenvalue(0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        double[] doubleArray17 = eigenDecompositionImpl7.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        double[] doubleArray12 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl19 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix17, (double) '4');
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix17, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double double11 = eigenDecompositionImpl4.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        double double14 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getD();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector18 = eigenDecompositionImpl7.getEigenvector((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double double8 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (short) 1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 1L);
        org.apache.commons.math.linear.RealVector realVector18 = eigenDecompositionImpl16.getEigenvector((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector18);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray16 = eigenDecompositionImpl4.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealVector realVector10 = eigenDecompositionImpl4.getEigenvector(0);
        double double12 = eigenDecompositionImpl4.getRealEigenvalue(0);
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl4.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = eigenDecompositionImpl4.getImagEigenvalue(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double double10 = eigenDecompositionImpl4.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) '#');
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (-1L));
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl15.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl15.getSolver();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector19 = eigenDecompositionImpl15.getEigenvector((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(decompositionSolver17);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver8);
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealVector realVector15 = eigenDecompositionImpl4.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getD();
        double double18 = eigenDecompositionImpl4.getRealEigenvalue(0);
        // The following exception was thrown during execution in test generation
        try {
            double double20 = eigenDecompositionImpl4.getImagEigenvalue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealVector realVector10 = eigenDecompositionImpl4.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl16.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealVector realVector12 = eigenDecompositionImpl4.getEigenvector(0);
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl4.getEigenvector((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realVector12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) '#');
        double[] doubleArray14 = eigenDecompositionImpl13.getImagEigenvalues();
        double double15 = eigenDecompositionImpl13.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = eigenDecompositionImpl13.getRealEigenvalue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl11.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl11.getVT();
        double double16 = eigenDecompositionImpl11.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = eigenDecompositionImpl4.getImagEigenvalue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) (short) 0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) (-1));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double10 = eigenDecompositionImpl4.getImagEigenvalue(0);
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        double double16 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl4.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver17);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        double[] doubleArray15 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(decompositionSolver17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix19, (double) (byte) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = eigenDecompositionImpl21.getVT();
        double double24 = eigenDecompositionImpl21.getRealEigenvalue((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double double9 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 100L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 0.0f);
        double double15 = eigenDecompositionImpl14.getDeterminant();
        double[] doubleArray16 = eigenDecompositionImpl14.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl14.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        double double10 = eigenDecompositionImpl4.getRealEigenvalue((int) (short) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl4.getSolver();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = eigenDecompositionImpl4.getImagEigenvalue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver11);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getV();
        double[] doubleArray10 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getV();
        double[] doubleArray16 = eigenDecompositionImpl4.getRealEigenvalues();
        double double18 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (-1L));
        java.lang.Class<?> wildcardClass14 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getVT();
        double[] doubleArray13 = eigenDecompositionImpl7.getRealEigenvalues();
        java.lang.Class<?> wildcardClass14 = eigenDecompositionImpl7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 100L);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl15.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (byte) 100);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (-1.0d));
        double[] doubleArray16 = eigenDecompositionImpl15.getImagEigenvalues();
        double[] doubleArray17 = eigenDecompositionImpl15.getImagEigenvalues();
        double[] doubleArray19 = new double[] { (-1) };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl22 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray19, doubleArray20, (double) (-1));
        double double24 = eigenDecompositionImpl22.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver25 = eigenDecompositionImpl22.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = eigenDecompositionImpl22.getVT();
        double double27 = eigenDecompositionImpl22.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = eigenDecompositionImpl22.getV();
        double double29 = eigenDecompositionImpl22.getDeterminant();
        double double31 = eigenDecompositionImpl22.getImagEigenvalue(0);
        double[] doubleArray32 = eigenDecompositionImpl22.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver33 = eigenDecompositionImpl22.getSolver();
        double[] doubleArray34 = eigenDecompositionImpl22.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl36 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray17, doubleArray34, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getV();
        double[] doubleArray16 = eigenDecompositionImpl4.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(decompositionSolver11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray15 = eigenDecompositionImpl4.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray14 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getV();
        double double16 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl4.getSolver();
        double double19 = eigenDecompositionImpl4.getRealEigenvalue(0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver17);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        double double14 = eigenDecompositionImpl7.getDeterminant();
        double double15 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver19 = eigenDecompositionImpl7.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(decompositionSolver19);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealVector realVector15 = eigenDecompositionImpl7.getEigenvector(0);
        double[] doubleArray16 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray18 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray19 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray20 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl7.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        double[] doubleArray12 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl7.getSolver();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray14 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) (short) 10);
        double double18 = eigenDecompositionImpl17.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) (byte) -1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) (byte) 1);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl13.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl13.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl13.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl13.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(decompositionSolver17);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 100.0f);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, 0.0d);
        java.lang.Class<?> wildcardClass16 = realMatrix11.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealVector realVector15 = eigenDecompositionImpl4.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) 10L);
        double[] doubleArray19 = eigenDecompositionImpl18.getImagEigenvalues();
        double[] doubleArray20 = eigenDecompositionImpl18.getImagEigenvalues();
        double[] doubleArray21 = eigenDecompositionImpl18.getImagEigenvalues();
        double[] doubleArray23 = new double[] { (-1) };
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl26 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray23, doubleArray24, (double) (-1));
        double double28 = eigenDecompositionImpl26.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix29 = eigenDecompositionImpl26.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = eigenDecompositionImpl26.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl32 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix30, (double) 1L);
        org.apache.commons.math.linear.RealMatrix realMatrix33 = eigenDecompositionImpl32.getV();
        double[] doubleArray34 = eigenDecompositionImpl32.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl36 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray21, doubleArray34, (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 1.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl17.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix18, (double) 100.0f);
        double[] doubleArray21 = eigenDecompositionImpl20.getImagEigenvalues();
        double[] doubleArray22 = eigenDecompositionImpl20.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        // The following exception was thrown during execution in test generation
        try {
            double double13 = eigenDecompositionImpl4.getRealEigenvalue((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl11.getV();
        double[] doubleArray16 = eigenDecompositionImpl11.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl11.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = eigenDecompositionImpl4.getV();
        double[] doubleArray7 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver8);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getVT();
        double[] doubleArray13 = eigenDecompositionImpl7.getRealEigenvalues();
        double double15 = eigenDecompositionImpl7.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl13.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl13.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl13.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 10L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 10.0f);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl12.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl12.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl12.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, 0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl17.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix18, (double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray15 = eigenDecompositionImpl7.getRealEigenvalues();
        double double16 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getD();
        double[] doubleArray18 = eigenDecompositionImpl7.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl9 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix7, (double) 1L);
        double[] doubleArray10 = eigenDecompositionImpl9.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl9.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl9.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl9.getD();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector15 = eigenDecompositionImpl9.getEigenvector((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        double double12 = eigenDecompositionImpl7.getDeterminant();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) (byte) 1);
        double[] doubleArray17 = eigenDecompositionImpl16.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver18 = eigenDecompositionImpl16.getSolver();
        double double19 = eigenDecompositionImpl16.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver13);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 1L);
        double[] doubleArray11 = eigenDecompositionImpl10.getImagEigenvalues();
        double[] doubleArray13 = new double[] { (-1) };
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray13, doubleArray14, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl16.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl19 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix17, (double) 10.0f);
        double[] doubleArray20 = eigenDecompositionImpl19.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl19.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver22 = eigenDecompositionImpl19.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl19.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver24 = eigenDecompositionImpl19.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = eigenDecompositionImpl19.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = eigenDecompositionImpl19.getVT();
        double[] doubleArray27 = eigenDecompositionImpl19.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = eigenDecompositionImpl19.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = eigenDecompositionImpl19.getD();
        org.apache.commons.math.linear.RealVector realVector31 = eigenDecompositionImpl19.getEigenvector((int) (byte) 0);
        double[] doubleArray32 = eigenDecompositionImpl19.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl34 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray11, doubleArray32, (double) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(decompositionSolver22);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(decompositionSolver24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realVector31);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertArrayEquals(doubleArray32, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double double12 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray7 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, 0.0d);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 0.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl12.getEigenvector((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        double double12 = eigenDecompositionImpl4.getDeterminant();
        double double14 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix19, (double) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector23 = eigenDecompositionImpl21.getEigenvector((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver5 = eigenDecompositionImpl4.getSolver();
        double double7 = eigenDecompositionImpl4.getRealEigenvalue((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 100);
        double double11 = eigenDecompositionImpl10.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl10.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = eigenDecompositionImpl14.getImagEigenvalue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        double double15 = eigenDecompositionImpl11.getImagEigenvalue((int) (byte) 0);
        double double16 = eigenDecompositionImpl11.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector18 = eigenDecompositionImpl11.getEigenvector((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        double double12 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray13 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl7.getSolver();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = eigenDecompositionImpl7.getRealEigenvalue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver14);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl7.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(decompositionSolver15);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl7.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        double double11 = eigenDecompositionImpl7.getRealEigenvalue(0);
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray13 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray15 = new double[] { (-1) };
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray15, doubleArray16, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix19, (double) 10.0f);
        double[] doubleArray22 = eigenDecompositionImpl21.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl21.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver24 = eigenDecompositionImpl21.getSolver();
        double[] doubleArray25 = eigenDecompositionImpl21.getRealEigenvalues();
        double[] doubleArray26 = eigenDecompositionImpl21.getImagEigenvalues();
        double double27 = eigenDecompositionImpl21.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = eigenDecompositionImpl21.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl30 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix28, (double) 100);
        double double31 = eigenDecompositionImpl30.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = eigenDecompositionImpl30.getVT();
        double[] doubleArray33 = eigenDecompositionImpl30.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl35 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray13, doubleArray33, (double) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(decompositionSolver24);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getV();
        double[] doubleArray10 = eigenDecompositionImpl4.getRealEigenvalues();
        double double12 = eigenDecompositionImpl4.getRealEigenvalue(0);
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl4.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double double12 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (-1L));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 10.0f);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl17.getD();
        double[] doubleArray19 = eigenDecompositionImpl17.getImagEigenvalues();
        double[] doubleArray21 = new double[] { (-1) };
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl24 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray21, doubleArray22, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix25 = eigenDecompositionImpl24.getD();
        double[] doubleArray26 = eigenDecompositionImpl24.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = eigenDecompositionImpl24.getD();
        double[] doubleArray28 = eigenDecompositionImpl24.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver29 = eigenDecompositionImpl24.getSolver();
        double[] doubleArray30 = eigenDecompositionImpl24.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver31 = eigenDecompositionImpl24.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = eigenDecompositionImpl24.getVT();
        double double33 = eigenDecompositionImpl24.getDeterminant();
        double[] doubleArray34 = eigenDecompositionImpl24.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl36 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray19, doubleArray34, (double) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver31);
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        double[] doubleArray12 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double double8 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        double double10 = eigenDecompositionImpl4.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) 100);
        double double17 = eigenDecompositionImpl16.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl16.getVT();
        double[] doubleArray19 = eigenDecompositionImpl16.getRealEigenvalues();
        double double20 = eigenDecompositionImpl16.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double10 = eigenDecompositionImpl4.getImagEigenvalue(0);
        double double11 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver16 = eigenDecompositionImpl4.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(decompositionSolver16);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealVector realVector9 = eigenDecompositionImpl7.getEigenvector((int) (short) 0);
        double[] doubleArray10 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getV();
        double[] doubleArray12 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector17 = eigenDecompositionImpl7.getEigenvector(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        double double12 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) ' ');
        double double16 = eigenDecompositionImpl15.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl15.getSolver();
        double double18 = eigenDecompositionImpl15.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl15.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        double double12 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getVT();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = eigenDecompositionImpl4.getRealEigenvalue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = new double[] { (-1) };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray10, doubleArray11, (double) (-1));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray8, doubleArray11, (double) (byte) -1);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl15.getV();
        java.lang.Class<?> wildcardClass17 = eigenDecompositionImpl15.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = eigenDecompositionImpl4.getV();
        double[] doubleArray7 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getD();
        double double14 = eigenDecompositionImpl11.getRealEigenvalue((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = eigenDecompositionImpl11.getRealEigenvalue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        double double10 = eigenDecompositionImpl4.getDeterminant();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 1L);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl10.getV();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector13 = eigenDecompositionImpl10.getEigenvector((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) (short) 10);
        double[] doubleArray16 = eigenDecompositionImpl15.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl15.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver17);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) (-1L));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 10.0f);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, 100.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl16.getV();
        double double18 = eigenDecompositionImpl16.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl16.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        double[] doubleArray12 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getD();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getD();
        double[] doubleArray17 = eigenDecompositionImpl7.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealVector realVector9 = eigenDecompositionImpl7.getEigenvector(0);
        double[] doubleArray10 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealVector realVector13 = eigenDecompositionImpl7.getEigenvector((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) 0L);
        double double19 = eigenDecompositionImpl17.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl17.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl17.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl4.getSolver();
        double double14 = eigenDecompositionImpl4.getRealEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getD();
        double[] doubleArray16 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray17 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray19 = new double[] { (-1) };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl22 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray19, doubleArray20, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl22.getD();
        double double24 = eigenDecompositionImpl22.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = eigenDecompositionImpl22.getD();
        double[] doubleArray26 = eigenDecompositionImpl22.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = eigenDecompositionImpl22.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = eigenDecompositionImpl22.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = eigenDecompositionImpl22.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix30 = eigenDecompositionImpl22.getD();
        double double31 = eigenDecompositionImpl22.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix32 = eigenDecompositionImpl22.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix33 = eigenDecompositionImpl22.getV();
        double[] doubleArray34 = eigenDecompositionImpl22.getImagEigenvalues();
        double[] doubleArray35 = eigenDecompositionImpl22.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix36 = eigenDecompositionImpl22.getD();
        double[] doubleArray37 = eigenDecompositionImpl22.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl39 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray17, doubleArray37, (double) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(realMatrix30);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix32);
        org.junit.Assert.assertNotNull(realMatrix33);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix36);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertArrayEquals(doubleArray37, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (short) -1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 0.0f);
        double[] doubleArray17 = eigenDecompositionImpl16.getRealEigenvalues();
        double double18 = eigenDecompositionImpl16.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        double double14 = eigenDecompositionImpl4.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl4.getVT();
        double double18 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 100L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl17.getV();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = eigenDecompositionImpl17.getRealEigenvalue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl4.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver14);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getD();
        double[] doubleArray15 = eigenDecompositionImpl4.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double double8 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver9);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getV();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        java.lang.Class<?> wildcardClass13 = realMatrix12.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver6 = eigenDecompositionImpl4.getSolver();
        double double7 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 1L);
        double[] doubleArray11 = eigenDecompositionImpl10.getRealEigenvalues();
        double double12 = eigenDecompositionImpl10.getDeterminant();
        double double13 = eigenDecompositionImpl10.getDeterminant();
        double double14 = eigenDecompositionImpl10.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(decompositionSolver6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray14, doubleArray15, (double) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double double12 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) ' ');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 0L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (byte) -1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 10.0f);
        double double18 = eigenDecompositionImpl17.getDeterminant();
        org.apache.commons.math.linear.RealVector realVector20 = eigenDecompositionImpl17.getEigenvector(0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertNotNull(realVector20);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl11.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl11.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        double[] doubleArray10 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl4.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double10 = eigenDecompositionImpl4.getImagEigenvalue(0);
        double double11 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray12 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getVT();
        double[] doubleArray14 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver18 = eigenDecompositionImpl7.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(decompositionSolver18);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getV();
        java.lang.Class<?> wildcardClass16 = eigenDecompositionImpl7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealVector realVector10 = eigenDecompositionImpl4.getEigenvector(0);
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealVector realVector15 = eigenDecompositionImpl4.getEigenvector((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 10L);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl10.getV();
        double double12 = eigenDecompositionImpl10.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl10.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl10.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl10.getD();
        double double16 = eigenDecompositionImpl10.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl10.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double double9 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 100L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (-1.0d));
        double[] doubleArray15 = eigenDecompositionImpl14.getRealEigenvalues();
        double[] doubleArray16 = eigenDecompositionImpl14.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl14.getV();
        double[] doubleArray18 = eigenDecompositionImpl14.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl14.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        double double12 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray13 = eigenDecompositionImpl7.getImagEigenvalues();
        double double14 = eigenDecompositionImpl7.getDeterminant();
        double double15 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver16 = eigenDecompositionImpl7.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver16);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl16.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl11.getV();
        double[] doubleArray16 = eigenDecompositionImpl11.getImagEigenvalues();
        java.lang.Class<?> wildcardClass17 = eigenDecompositionImpl11.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) 100L);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getVT();
        double double14 = eigenDecompositionImpl11.getRealEigenvalue(0);
        // The following exception was thrown during execution in test generation
        try {
            double double16 = eigenDecompositionImpl11.getRealEigenvalue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 10L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 10.0f);
        double[] doubleArray13 = eigenDecompositionImpl12.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl12.getD();
        java.lang.Class<?> wildcardClass15 = eigenDecompositionImpl12.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        double[] doubleArray0 = null;
        double[] doubleArray2 = new double[] { (-1) };
        double[] doubleArray3 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl5 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray2, doubleArray3, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix6 = eigenDecompositionImpl5.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl8 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix6, (double) 10.0f);
        double[] doubleArray9 = eigenDecompositionImpl8.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl8.getVT();
        double double11 = eigenDecompositionImpl8.getDeterminant();
        double[] doubleArray12 = eigenDecompositionImpl8.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray0, doubleArray12, (double) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealVector realVector9 = eigenDecompositionImpl7.getEigenvector(0);
        double double10 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl7.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver11);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) (short) 1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl17.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        double double12 = eigenDecompositionImpl7.getDeterminant();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray14 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        double[] doubleArray17 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray18 = eigenDecompositionImpl7.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        double double15 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray16 = eigenDecompositionImpl7.getImagEigenvalues();
        java.lang.Class<?> wildcardClass17 = eigenDecompositionImpl7.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = eigenDecompositionImpl4.getV();
        double[] doubleArray7 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray12 = new double[] { (-1) };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray12, doubleArray13, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl15.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) 10.0f);
        double[] doubleArray19 = eigenDecompositionImpl18.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl18.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl18.getD();
        double[] doubleArray22 = eigenDecompositionImpl18.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl18.getV();
        double[] doubleArray24 = eigenDecompositionImpl18.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = eigenDecompositionImpl18.getVT();
        double[] doubleArray26 = eigenDecompositionImpl18.getRealEigenvalues();
        double[] doubleArray27 = eigenDecompositionImpl18.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl29 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray10, doubleArray27, (double) (-1.0f));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        double[] doubleArray14 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray15 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealVector realVector19 = eigenDecompositionImpl7.getEigenvector((int) (byte) 0);
        double[] doubleArray20 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl7.getD();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector23 = eigenDecompositionImpl7.getEigenvector((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realVector19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (-1L));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 10.0f);
        double double16 = eigenDecompositionImpl15.getDeterminant();
        double[] doubleArray17 = eigenDecompositionImpl15.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver5 = eigenDecompositionImpl4.getSolver();
        double double7 = eigenDecompositionImpl4.getRealEigenvalue((int) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 100);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl10.getSolver();
        double[] doubleArray12 = eigenDecompositionImpl10.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(decompositionSolver11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealVector realVector15 = eigenDecompositionImpl4.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) 10L);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getD();
        double double20 = eigenDecompositionImpl18.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realVector15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getD();
        double[] doubleArray17 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl4.getVT();
        double double20 = eigenDecompositionImpl4.getRealEigenvalue((int) (short) 0);
        double double21 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        double double12 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 0);
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        double double15 = eigenDecompositionImpl4.getDeterminant();
        java.lang.Class<?> wildcardClass16 = eigenDecompositionImpl4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getV();
        double double15 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, 1.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getD();
        java.lang.Class<?> wildcardClass20 = realMatrix19.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 1.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double19 = eigenDecompositionImpl17.getRealEigenvalue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray13 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver16 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(decompositionSolver16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double double9 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 100L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (-1.0d));
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl14.getVT();
        double double16 = eigenDecompositionImpl14.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector18 = eigenDecompositionImpl14.getEigenvector((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        java.lang.Class<?> wildcardClass13 = eigenDecompositionImpl4.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        double double11 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 100.0f);
        double[] doubleArray15 = eigenDecompositionImpl14.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl14.getVT();
        double[] doubleArray17 = eigenDecompositionImpl14.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getV();
        double[] doubleArray16 = eigenDecompositionImpl4.getImagEigenvalues();
        double double17 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray18 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl4.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (short) 100);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (short) 1);
        double[] doubleArray15 = eigenDecompositionImpl14.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getRealEigenvalues();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl7.getSolver();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getV();
        double[] doubleArray17 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl7.getVT();
        double double19 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray20 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver21 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray22 = eigenDecompositionImpl7.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            double double24 = eigenDecompositionImpl7.getRealEigenvalue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver6 = eigenDecompositionImpl4.getSolver();
        double double7 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl11.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(decompositionSolver6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double double9 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl14.getSolver();
        double[] doubleArray16 = eigenDecompositionImpl14.getImagEigenvalues();
        double[] doubleArray18 = new double[] { (-1) };
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray18, doubleArray19, (double) (-1));
        double[] doubleArray22 = eigenDecompositionImpl21.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl21.getV();
        double[] doubleArray24 = eigenDecompositionImpl21.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = eigenDecompositionImpl21.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl27 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix25, (double) 1);
        double[] doubleArray28 = eigenDecompositionImpl27.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl30 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray16, doubleArray28, (double) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertArrayEquals(doubleArray28, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) (byte) -1);
        double[] doubleArray11 = eigenDecompositionImpl10.getRealEigenvalues();
        double double12 = eigenDecompositionImpl10.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl10.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = eigenDecompositionImpl4.getV();
        double[] doubleArray7 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl14.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        double double12 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray14 = eigenDecompositionImpl4.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        double double14 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver16 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray17 = eigenDecompositionImpl7.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(decompositionSolver16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl4.getImagEigenvalues();
        double double15 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getD();
        double[] doubleArray17 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl4.getV();
        double[] doubleArray19 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl4.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double double9 = eigenDecompositionImpl7.getImagEigenvalue(0);
        double[] doubleArray10 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray13 = new double[] { (-1) };
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray13, doubleArray14, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl16.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl19 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix17, (double) 10.0f);
        double[] doubleArray20 = eigenDecompositionImpl19.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl19.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = eigenDecompositionImpl19.getD();
        double[] doubleArray23 = eigenDecompositionImpl19.getImagEigenvalues();
        double[] doubleArray24 = eigenDecompositionImpl19.getImagEigenvalues();
        double[] doubleArray25 = eigenDecompositionImpl19.getImagEigenvalues();
        double[] doubleArray26 = eigenDecompositionImpl19.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl28 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray11, doubleArray26, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl13.getD();
        double double15 = eigenDecompositionImpl13.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl13.getV();
        double[] doubleArray17 = eigenDecompositionImpl13.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl13.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix18, (double) '4');
        org.apache.commons.math.linear.RealVector realVector22 = eigenDecompositionImpl20.getEigenvector(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector24 = eigenDecompositionImpl20.getEigenvector((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realVector22);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        double double17 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix19, (double) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = eigenDecompositionImpl21.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix18, (double) (short) 1);
        double[] doubleArray21 = eigenDecompositionImpl20.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        double double7 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray8 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray13 = new double[] { (-1) };
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray13, doubleArray14, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl16.getD();
        double[] doubleArray18 = eigenDecompositionImpl16.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl16.getD();
        double[] doubleArray20 = eigenDecompositionImpl16.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver21 = eigenDecompositionImpl16.getSolver();
        double double22 = eigenDecompositionImpl16.getDeterminant();
        double[] doubleArray23 = eigenDecompositionImpl16.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl25 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray11, doubleArray23, (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl11.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 100L);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl15.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) (byte) -1);
        double[] doubleArray19 = eigenDecompositionImpl18.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl18.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl13.getV();
        double double15 = eigenDecompositionImpl13.getDeterminant();
        double[] doubleArray16 = eigenDecompositionImpl13.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl13.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl4.getSolver();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector17 = eigenDecompositionImpl4.getEigenvector(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(decompositionSolver11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(decompositionSolver15);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double double9 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (byte) 10);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl15.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (byte) 100);
        double[] doubleArray14 = eigenDecompositionImpl13.getImagEigenvalues();
        java.lang.Class<?> wildcardClass15 = eigenDecompositionImpl13.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '4');
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl11.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl11.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl11.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(decompositionSolver14);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        double double15 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double double8 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getV();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        java.lang.Class<?> wildcardClass12 = doubleArray11.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) 0.0f);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl19 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (short) 10);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) ' ');
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl14.getVT();
        java.lang.Class<?> wildcardClass16 = realMatrix15.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getV();
        double[] doubleArray16 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray17 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix18, (double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector22 = eigenDecompositionImpl20.getEigenvector((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double double10 = eigenDecompositionImpl4.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) '#');
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl13.getV();
        double[] doubleArray15 = eigenDecompositionImpl13.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver16 = eigenDecompositionImpl13.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver16);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl12.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        double double12 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 0);
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray15 = new double[] { (-1) };
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray15, doubleArray16, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getD();
        double double20 = eigenDecompositionImpl18.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl18.getD();
        double[] doubleArray22 = eigenDecompositionImpl18.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl18.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = eigenDecompositionImpl18.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix25 = eigenDecompositionImpl18.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = eigenDecompositionImpl18.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = eigenDecompositionImpl18.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = eigenDecompositionImpl18.getVT();
        double[] doubleArray29 = eigenDecompositionImpl18.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver30 = eigenDecompositionImpl18.getSolver();
        double[] doubleArray31 = eigenDecompositionImpl18.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl33 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray13, doubleArray31, (-1.0d));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver30);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl7.getSolver();
        // The following exception was thrown during execution in test generation
        try {
            double double10 = eigenDecompositionImpl7.getRealEigenvalue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(decompositionSolver8);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = eigenDecompositionImpl4.getV();
        double double8 = eigenDecompositionImpl4.getRealEigenvalue(0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        // The following exception was thrown during execution in test generation
        try {
            double double12 = eigenDecompositionImpl4.getRealEigenvalue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        double[] doubleArray15 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver16 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray17 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray19 = new double[] { (-1) };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl22 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray19, doubleArray20, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl22.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl25 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix23, (double) 10.0f);
        double double27 = eigenDecompositionImpl25.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix28 = eigenDecompositionImpl25.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl30 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix28, (double) 100L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl32 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix28, (-1.0d));
        double[] doubleArray33 = eigenDecompositionImpl32.getRealEigenvalues();
        double[] doubleArray34 = eigenDecompositionImpl32.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl36 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray17, doubleArray34, 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector19 = eigenDecompositionImpl17.getEigenvector((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        double double15 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getD();
        double double17 = eigenDecompositionImpl7.getDeterminant();
        double double18 = eigenDecompositionImpl7.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        double double15 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray16 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray18 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl7.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = eigenDecompositionImpl7.getImagEigenvalue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl7.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = eigenDecompositionImpl7.getImagEigenvalue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        double double12 = eigenDecompositionImpl7.getDeterminant();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray14 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getVT();
        double[] doubleArray18 = eigenDecompositionImpl7.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getV();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = eigenDecompositionImpl4.getRealEigenvalue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl14.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl14.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, 1.0d);
        double[] doubleArray19 = eigenDecompositionImpl18.getRealEigenvalues();
        java.lang.Class<?> wildcardClass20 = doubleArray19.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 1.0f);
        double[] doubleArray16 = eigenDecompositionImpl15.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = eigenDecompositionImpl15.getRealEigenvalue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver6 = eigenDecompositionImpl4.getSolver();
        double double7 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(decompositionSolver6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        double double13 = eigenDecompositionImpl4.getImagEigenvalue(0);
        double[] doubleArray14 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl4.getVT();
        double double16 = eigenDecompositionImpl4.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            double double18 = eigenDecompositionImpl4.getRealEigenvalue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) '4');
        double[] doubleArray12 = eigenDecompositionImpl11.getImagEigenvalues();
        double[] doubleArray13 = eigenDecompositionImpl11.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = eigenDecompositionImpl11.getRealEigenvalue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        double double14 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, 0.0d);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, 0.0d);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl20.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl9 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix7, (double) (byte) 10);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix7, (double) (byte) -1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix7, (double) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix7);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealVector realVector9 = eigenDecompositionImpl7.getEigenvector(0);
        double double10 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getV();
        double double12 = eigenDecompositionImpl7.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl4.getImagEigenvalues();
        double double15 = eigenDecompositionImpl4.getDeterminant();
        double double16 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray17 = eigenDecompositionImpl4.getImagEigenvalues();
        double double19 = eigenDecompositionImpl4.getImagEigenvalue((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            double double21 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) 1L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) (-1.0f));
        double[] doubleArray21 = eigenDecompositionImpl20.getImagEigenvalues();
        java.lang.Class<?> wildcardClass22 = eigenDecompositionImpl20.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double double10 = eigenDecompositionImpl4.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) '#');
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (-1L));
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl15.getD();
        double[] doubleArray17 = eigenDecompositionImpl15.getRealEigenvalues();
        double double19 = eigenDecompositionImpl15.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl15.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl15.getD();
        double double22 = eigenDecompositionImpl15.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl15.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix23);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl7.getSolver();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver18 = eigenDecompositionImpl17.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl17.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix19, (double) (byte) 1);
        org.apache.commons.math.linear.RealMatrix realMatrix22 = eigenDecompositionImpl21.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(decompositionSolver18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix22);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl13.getV();
        double[] doubleArray15 = eigenDecompositionImpl13.getRealEigenvalues();
        double double16 = eigenDecompositionImpl13.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl13.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl19 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix17, (double) 0.0f);
        double[] doubleArray20 = eigenDecompositionImpl19.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl19.getV();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector23 = eigenDecompositionImpl19.getEigenvector((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix21);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (short) -1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 0.0f);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) '#');
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            double double22 = eigenDecompositionImpl20.getRealEigenvalue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double double12 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        double[] doubleArray14 = eigenDecompositionImpl7.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, 1.0d);
        double double18 = eigenDecompositionImpl17.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (short) 1);
        double double16 = eigenDecompositionImpl14.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl14.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl14.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl14.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 1.0d + "'", double16 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getRealEigenvalues();
        double double9 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 0.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl12.getD();
        double[] doubleArray14 = eigenDecompositionImpl12.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl12.getSolver();
        double double17 = eigenDecompositionImpl12.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl12.getD();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector20 = eigenDecompositionImpl12.getEigenvector((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealVector realVector10 = eigenDecompositionImpl4.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl4.getSolver();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector15 = eigenDecompositionImpl4.getEigenvector((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realVector10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(decompositionSolver13);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl13.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) 100L);
        double[] doubleArray17 = eigenDecompositionImpl16.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl16.getVT();
        double double20 = eigenDecompositionImpl16.getRealEigenvalue((int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 1.0d + "'", double20 == 1.0d);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealVector realVector12 = eigenDecompositionImpl4.getEigenvector((int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realVector12);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        double[] doubleArray12 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver13 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) (-1.0f));
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        double[] doubleArray12 = eigenDecompositionImpl4.getImagEigenvalues();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray14 = eigenDecompositionImpl4.getRealEigenvalues();
        java.lang.Class<?> wildcardClass15 = doubleArray14.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix6 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl8 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix6, (double) (byte) 100);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix6, 0.0d);
        double[] doubleArray11 = eigenDecompositionImpl10.getRealEigenvalues();
        double[] doubleArray13 = new double[] { (-1) };
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray13, doubleArray14, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl16.getD();
        double[] doubleArray18 = eigenDecompositionImpl16.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl16.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl16.getVT();
        double[] doubleArray21 = eigenDecompositionImpl16.getImagEigenvalues();
        double[] doubleArray22 = eigenDecompositionImpl16.getImagEigenvalues();
        double[] doubleArray23 = eigenDecompositionImpl16.getImagEigenvalues();
        double double25 = eigenDecompositionImpl16.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix26 = eigenDecompositionImpl16.getV();
        double[] doubleArray27 = eigenDecompositionImpl16.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl29 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray11, doubleArray27, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix6);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        double double14 = eigenDecompositionImpl4.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector16 = eigenDecompositionImpl4.getEigenvector((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 1L);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl14.getD();
        double double17 = eigenDecompositionImpl14.getRealEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl14.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl14.getV();
        double[] doubleArray20 = eigenDecompositionImpl14.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = eigenDecompositionImpl14.getImagEigenvalue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double[] doubleArray5 = eigenDecompositionImpl4.getRealEigenvalues();
        double[] doubleArray6 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealVector realVector8 = eigenDecompositionImpl4.getEigenvector((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector8);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getVT();
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getVT();
        double[] doubleArray10 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) 'a');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        double double13 = eigenDecompositionImpl4.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getVT();
        // The following exception was thrown during execution in test generation
        try {
            double double16 = eigenDecompositionImpl4.getRealEigenvalue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 0L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, 1.0d);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver18 = eigenDecompositionImpl17.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver18);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector12 = eigenDecompositionImpl4.getEigenvector((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double double8 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        double double10 = eigenDecompositionImpl4.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 10L);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 10.0f);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, 0.0d);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl14.getSolver();
        // The following exception was thrown during execution in test generation
        try {
            double double17 = eigenDecompositionImpl14.getRealEigenvalue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(decompositionSolver15);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        double double10 = eigenDecompositionImpl4.getRealEigenvalue((int) (short) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver11 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            double double15 = eigenDecompositionImpl4.getRealEigenvalue((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        double double7 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 0.0f);
        double[] doubleArray11 = eigenDecompositionImpl10.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl10.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl10.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl10.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double double9 = eigenDecompositionImpl7.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 100L);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl12.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl12.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl12.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl12.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) (short) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl21 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix19, (double) (byte) 1);
        double double23 = eigenDecompositionImpl21.getRealEigenvalue(0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        double[] doubleArray2 = new double[] { (byte) 0, 10 };
        double[] doubleArray4 = new double[] { (-1) };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray4, doubleArray5, (double) (-1));
        double double9 = eigenDecompositionImpl7.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray10 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealVector realVector13 = eigenDecompositionImpl7.getEigenvector(0);
        double double15 = eigenDecompositionImpl7.getRealEigenvalue(0);
        double[] doubleArray16 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray2, doubleArray16, (double) (short) 1);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver19 = eigenDecompositionImpl18.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl18.getV();
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver19);
        org.junit.Assert.assertNotNull(realMatrix20);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getD();
        double[] doubleArray17 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl7.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getVT();
        double[] doubleArray10 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 1);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) '4');
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(decompositionSolver14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double[] doubleArray13 = eigenDecompositionImpl4.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver18 = eigenDecompositionImpl7.getSolver();
        // The following exception was thrown during execution in test generation
        try {
            double double20 = eigenDecompositionImpl7.getImagEigenvalue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(decompositionSolver18);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getImagEigenvalues();
        double double14 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix15);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        double double13 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl4.getV();
        double double15 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver16 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl4.getSolver();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = eigenDecompositionImpl4.getRealEigenvalue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver16);
        org.junit.Assert.assertNotNull(decompositionSolver17);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl9 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix7, (double) 1L);
        double[] doubleArray10 = eigenDecompositionImpl9.getImagEigenvalues();
        double double11 = eigenDecompositionImpl9.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl9.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, 10.0d);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix12);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        double double14 = eigenDecompositionImpl7.getDeterminant();
        double double15 = eigenDecompositionImpl7.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector17 = eigenDecompositionImpl7.getEigenvector((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray12 = eigenDecompositionImpl7.getImagEigenvalues();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        double double16 = eigenDecompositionImpl7.getImagEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getVT();
        // The following exception was thrown during execution in test generation
        try {
            double double19 = eigenDecompositionImpl7.getImagEigenvalue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealVector realVector9 = eigenDecompositionImpl7.getEigenvector(0);
        double[] doubleArray10 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealVector realVector13 = eigenDecompositionImpl7.getEigenvector((int) (short) 0);
        double[] doubleArray14 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealVector realVector16 = eigenDecompositionImpl7.getEigenvector(0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realVector16);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix12, (double) (short) 0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl14.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix15, (double) (-1.0f));
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl17.getD();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver6 = eigenDecompositionImpl4.getSolver();
        double double7 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (-1.0d));
        double double11 = eigenDecompositionImpl10.getDeterminant();
        double double12 = eigenDecompositionImpl10.getDeterminant();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(decompositionSolver6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl11 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix9, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        double[] doubleArray11 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getV();
        double[] doubleArray13 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray15 = new double[] { (-1) };
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray15, doubleArray16, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix19 = eigenDecompositionImpl18.getD();
        double double20 = eigenDecompositionImpl18.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl18.getD();
        double[] doubleArray22 = eigenDecompositionImpl18.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix23 = eigenDecompositionImpl18.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix24 = eigenDecompositionImpl18.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl26 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix24, (double) (-1.0f));
        double[] doubleArray27 = eigenDecompositionImpl26.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver28 = eigenDecompositionImpl26.getSolver();
        double[] doubleArray29 = eigenDecompositionImpl26.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl31 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray13, doubleArray29, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix23);
        org.junit.Assert.assertNotNull(realMatrix24);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver28);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertArrayEquals(doubleArray29, new double[] { 1.0d }, 1.0E-15);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        double[] doubleArray11 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        double[] doubleArray13 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getVT();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray17 = new double[] { (-1) };
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray17, doubleArray18, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl20.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl23 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix21, (double) 10.0f);
        double[] doubleArray24 = eigenDecompositionImpl23.getImagEigenvalues();
        double[] doubleArray25 = eigenDecompositionImpl23.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = eigenDecompositionImpl23.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix27 = eigenDecompositionImpl23.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = eigenDecompositionImpl23.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = eigenDecompositionImpl23.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl31 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix29, (double) (byte) 100);
        double double32 = eigenDecompositionImpl31.getDeterminant();
        double[] doubleArray33 = eigenDecompositionImpl31.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl35 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray15, doubleArray33, (double) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix26);
        org.junit.Assert.assertNotNull(realMatrix27);
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) (byte) 100);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl13.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (-1.0d));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) (-1L));
        // The following exception was thrown during execution in test generation
        try {
            double double20 = eigenDecompositionImpl18.getImagEigenvalue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl9 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix7, (double) 1L);
        double[] doubleArray10 = eigenDecompositionImpl9.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl9.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl9.getVT();
        double[] doubleArray13 = eigenDecompositionImpl9.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        double[] doubleArray2 = new double[] { (byte) 0, 10 };
        double[] doubleArray4 = new double[] { (-1) };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray4, doubleArray5, (double) (-1));
        double double9 = eigenDecompositionImpl7.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray10 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealVector realVector13 = eigenDecompositionImpl7.getEigenvector(0);
        double double15 = eigenDecompositionImpl7.getRealEigenvalue(0);
        double[] doubleArray16 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray2, doubleArray16, (double) (short) 1);
        double[] doubleArray19 = eigenDecompositionImpl18.getRealEigenvalues();
        double[] doubleArray21 = new double[] { (-1) };
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl24 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray21, doubleArray22, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix25 = eigenDecompositionImpl24.getD();
        double double26 = eigenDecompositionImpl24.getDeterminant();
        double double27 = eigenDecompositionImpl24.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix28 = eigenDecompositionImpl24.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix29 = eigenDecompositionImpl24.getD();
        double[] doubleArray30 = eigenDecompositionImpl24.getRealEigenvalues();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl32 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray19, doubleArray30, (double) 0.0f);
        double[] doubleArray34 = new double[] { (-1) };
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl37 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray34, doubleArray35, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix38 = eigenDecompositionImpl37.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl40 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix38, (double) 10.0f);
        double[] doubleArray41 = eigenDecompositionImpl40.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix42 = eigenDecompositionImpl40.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver43 = eigenDecompositionImpl40.getSolver();
        double double45 = eigenDecompositionImpl40.getRealEigenvalue((int) (short) 0);
        double[] doubleArray46 = eigenDecompositionImpl40.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver47 = eigenDecompositionImpl40.getSolver();
        double[] doubleArray48 = eigenDecompositionImpl40.getImagEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl50 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray30, doubleArray48, (double) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix28);
        org.junit.Assert.assertNotNull(realMatrix29);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertArrayEquals(doubleArray34, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertArrayEquals(doubleArray35, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix38);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertArrayEquals(doubleArray41, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix42);
        org.junit.Assert.assertNotNull(decompositionSolver43);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + (-1.0d) + "'", double45 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertArrayEquals(doubleArray46, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver47);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertArrayEquals(doubleArray48, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        double double10 = eigenDecompositionImpl4.getImagEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        double double12 = eigenDecompositionImpl4.getDeterminant();
        double double14 = eigenDecompositionImpl4.getRealEigenvalue((int) (byte) 0);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(realMatrix16);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl13.getV();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl16 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix14, (double) 100L);
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl16.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl16.getVT();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix17);
        org.junit.Assert.assertNotNull(realMatrix18);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver9 = eigenDecompositionImpl4.getSolver();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray11 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(decompositionSolver9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realMatrix13);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver12 = eigenDecompositionImpl7.getSolver();
        double double13 = eigenDecompositionImpl7.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getV();
        double[] doubleArray17 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix18 = eigenDecompositionImpl7.getVT();
        double double19 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray20 = eigenDecompositionImpl7.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            double double22 = eigenDecompositionImpl7.getImagEigenvalue((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealVector realVector9 = eigenDecompositionImpl7.getEigenvector(0);
        double[] doubleArray10 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealVector realVector13 = eigenDecompositionImpl7.getEigenvector((int) (short) 0);
        double[] doubleArray14 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray15 = eigenDecompositionImpl7.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realVector9);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realVector13);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) (-1L));
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl14 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix10, (double) 0);
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(realMatrix10);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) (byte) -1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl12 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 0L);
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl12.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 0);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl17 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix13, (double) 100);
        double[] doubleArray18 = eigenDecompositionImpl17.getRealEigenvalues();
        double[] doubleArray19 = eigenDecompositionImpl17.getRealEigenvalues();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector21 = eigenDecompositionImpl17.getEigenvector((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        double double12 = eigenDecompositionImpl7.getDeterminant();
        double[] doubleArray13 = eigenDecompositionImpl7.getRealEigenvalues();
        double[] doubleArray14 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver15 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix17 = eigenDecompositionImpl7.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix17);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getVT();
        double[] doubleArray12 = eigenDecompositionImpl7.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix14 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver17 = eigenDecompositionImpl7.getSolver();
        double[] doubleArray18 = eigenDecompositionImpl7.getImagEigenvalues();
        double[] doubleArray19 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix20 = eigenDecompositionImpl7.getD();
        double[] doubleArray21 = eigenDecompositionImpl7.getRealEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(realMatrix14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(decompositionSolver17);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver8 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray10 = eigenDecompositionImpl4.getImagEigenvalues();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray12 = eigenDecompositionImpl4.getImagEigenvalues();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver8);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        double double6 = eigenDecompositionImpl4.getImagEigenvalue((int) (byte) 0);
        double[] doubleArray7 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        double double9 = eigenDecompositionImpl4.getDeterminant();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math.linear.RealVector realVector11 = eigenDecompositionImpl4.getEigenvector((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double double6 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix7 = eigenDecompositionImpl4.getD();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double[] doubleArray9 = eigenDecompositionImpl4.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix10 = eigenDecompositionImpl4.getD();
        double double11 = eigenDecompositionImpl4.getDeterminant();
        double[] doubleArray12 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix13 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl4.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix13);
        org.junit.Assert.assertNotNull(decompositionSolver14);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver6 = eigenDecompositionImpl4.getSolver();
        double double7 = eigenDecompositionImpl4.getDeterminant();
        org.apache.commons.math.linear.RealMatrix realMatrix8 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl10 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix8, (double) 1L);
        double[] doubleArray11 = eigenDecompositionImpl10.getRealEigenvalues();
        double double12 = eigenDecompositionImpl10.getDeterminant();
        double double13 = eigenDecompositionImpl10.getDeterminant();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver14 = eigenDecompositionImpl10.getSolver();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(decompositionSolver6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix8);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(decompositionSolver14);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl7 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix5, (double) 10.0f);
        double[] doubleArray8 = eigenDecompositionImpl7.getImagEigenvalues();
        org.apache.commons.math.linear.RealMatrix realMatrix9 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver10 = eigenDecompositionImpl7.getSolver();
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl7.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix12 = eigenDecompositionImpl7.getV();
        org.apache.commons.math.linear.RealVector realVector14 = eigenDecompositionImpl7.getEigenvector(0);
        org.apache.commons.math.linear.RealMatrix realMatrix15 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.RealMatrix realMatrix16 = eigenDecompositionImpl7.getVT();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl18 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) (short) 10);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl20 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix16, (double) (byte) 10);
        org.apache.commons.math.linear.RealMatrix realMatrix21 = eigenDecompositionImpl20.getV();
        org.apache.commons.math.linear.RealMatrix realMatrix22 = eigenDecompositionImpl20.getV();
        double double24 = eigenDecompositionImpl20.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix25 = eigenDecompositionImpl20.getD();
        org.apache.commons.math.linear.RealMatrix realMatrix26 = eigenDecompositionImpl20.getV();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix9);
        org.junit.Assert.assertNotNull(decompositionSolver10);
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(realMatrix12);
        org.junit.Assert.assertNotNull(realVector14);
        org.junit.Assert.assertNotNull(realMatrix15);
        org.junit.Assert.assertNotNull(realMatrix16);
        org.junit.Assert.assertNotNull(realMatrix21);
        org.junit.Assert.assertNotNull(realMatrix22);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
        org.junit.Assert.assertNotNull(realMatrix25);
        org.junit.Assert.assertNotNull(realMatrix26);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        double[] doubleArray1 = new double[] { (-1) };
        double[] doubleArray2 = new double[] {};
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl4 = new org.apache.commons.math.linear.EigenDecompositionImpl(doubleArray1, doubleArray2, (double) (-1));
        org.apache.commons.math.linear.RealMatrix realMatrix5 = eigenDecompositionImpl4.getD();
        double[] doubleArray6 = eigenDecompositionImpl4.getRealEigenvalues();
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver7 = eigenDecompositionImpl4.getSolver();
        double[] doubleArray8 = eigenDecompositionImpl4.getImagEigenvalues();
        double double10 = eigenDecompositionImpl4.getRealEigenvalue(0);
        org.apache.commons.math.linear.RealMatrix realMatrix11 = eigenDecompositionImpl4.getD();
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl13 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 1);
        org.apache.commons.math.linear.EigenDecompositionImpl eigenDecompositionImpl15 = new org.apache.commons.math.linear.EigenDecompositionImpl(realMatrix11, (double) 1.0f);
        org.apache.commons.math.linear.DecompositionSolver decompositionSolver16 = eigenDecompositionImpl15.getSolver();
        java.lang.Class<?> wildcardClass17 = decompositionSolver16.getClass();
        org.junit.Assert.assertNotNull(doubleArray1);
        org.junit.Assert.assertArrayEquals(doubleArray1, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray2);
        org.junit.Assert.assertArrayEquals(doubleArray2, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(realMatrix5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(decompositionSolver7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertNotNull(realMatrix11);
        org.junit.Assert.assertNotNull(decompositionSolver16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }
}

