package org.apache.commons.math3.analysis.differentiation;

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
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray7 = new double[] { (-1L), 'a', 0L, (short) 0 };
        double[] doubleArray10 = new double[] { (-1) };
        double[] doubleArray12 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.add(doubleArray7, (int) '#', doubleArray10, (int) '#', doubleArray12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), 97.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] {}, 1.0E-15);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray9 = new double[] { 10, 1.0f, '4', 1, 10.0f };
        double[] doubleArray12 = null;
        double[] doubleArray21 = new double[] { (-1L), 10, (byte) 10, (short) 0, (-1.0f), (byte) 100 };
        double[] doubleArray27 = new double[] { (-1.0d), (-1L), 100, (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination((double) 0L, doubleArray9, (int) (byte) 1, (double) (-1L), doubleArray12, 0, (double) (-1), doubleArray21, (-1), doubleArray27, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 1.0d, 52.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { (-1.0d), 10.0d, 10.0d, 0.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { (-1.0d), (-1.0d), 100.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray3 = new double[] {};
        double[] doubleArray6 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.pow(doubleArray3, 0, (int) '#', doubleArray6, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.checkCompatibility(dSCompiler3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray7 = new double[] { 100.0f, 10, 1L, (byte) 1 };
        double[] doubleArray10 = new double[] { '4' };
        double[] doubleArray15 = new double[] { (-1L), 1.0d, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.add(doubleArray7, (int) (byte) 100, doubleArray10, (int) 'a', doubleArray15, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray8 = new double[] { (short) 10, (byte) 10, 100.0d, 100L, (short) -1 };
        double[] doubleArray12 = new double[] { (-1.0f), 35 };
        double[] doubleArray18 = new double[] { 35, 100.0d, 1L, 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.multiply(doubleArray8, 0, doubleArray12, (int) (short) -1, doubleArray18, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 10.0d, 100.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 35.0d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray7 = new double[] { (short) -1, (-1), (short) 10 };
        double[] doubleArray11 = new double[] { ' ', 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.cosh(doubleArray7, (int) (byte) 1, doubleArray11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 32.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray3 = new double[] {};
        double[] doubleArray9 = new double[] { 10.0f, 100, 10.0d, 100L };
        double[] doubleArray13 = new double[] { (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan2(doubleArray3, 35, doubleArray9, (int) (byte) 10, doubleArray13, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 100.0d, 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray8 = new double[] { (short) -1, (byte) 1, 1, 1L };
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.exp(doubleArray8, 0, doubleArray10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 1.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray5 = new double[] { 100.0f };
        double[] doubleArray11 = new double[] { '#', 100, (byte) 1, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.tanh(doubleArray5, (int) (short) 0, doubleArray11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 35.0d, 100.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray10 = new double[] { 10.0f, ' ', (byte) 10, 0L, 10L, 10 };
        double[] doubleArray17 = new double[] { (byte) 1, 1.0d, 'a', 0.0d, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.log10(doubleArray10, (int) (short) 0, doubleArray17, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 5 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 32.0d, 10.0d, 0.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, 1.3897423420904058d, 0.4342944819032518d, 0.0d, 0.4342944819032518d }, 1.0E-15);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray8 = new double[] { (-1), '#', 100 };
        double[] doubleArray15 = new double[] { 100L, 0L, 10L, '#', 1 };
        double[] doubleArray19 = new double[] { '#', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.remainder(doubleArray8, 10, doubleArray15, (int) '4', doubleArray19, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { (-1.0d), 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 0.0d, 10.0d, 35.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray5 = new double[] { '4', 1.0f };
        double[] doubleArray12 = new double[] { 10L, 10.0d, 0.0d, 0L };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.pow(doubleArray5, (int) (byte) 1, (int) (byte) 10, doubleArray12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 10.0d, 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray10 = new double[] { (short) 100, 35, 0.0f, 10 };
        double[] doubleArray17 = new double[] { 100.0d, 10, 1, (byte) 1 };
        double[] doubleArray24 = new double[] { (-1.0d), 100.0f, 100L, 1 };
        double[] doubleArray30 = new double[] { (byte) 1, (byte) 1, 100.0d, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination(0.0d, doubleArray10, (int) (short) 10, (double) ' ', doubleArray17, (int) (short) -1, (double) ' ', doubleArray24, 0, doubleArray30, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 35.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 10.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { (-1.0d), 100.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 1.0d, 1.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray3 = new double[] {};
        double[] doubleArray11 = new double[] { (-1L), (-1.0d), 0L, 10.0f, 100.0d, 1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.asinh(doubleArray3, (int) '4', doubleArray11, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), (-1.0d), 0.0d, 10.0d, 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray10 = new double[] { 1.0d, 100L, 10, 100L, (-1.0f) };
        double[] doubleArray13 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.rootN(doubleArray10, (-1), (int) (byte) -1, doubleArray13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 100.0d, 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] {}, 1.0E-15);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray3 = new double[] {};
        double[] doubleArray7 = new double[] { 1, (short) 10 };
        double[] doubleArray14 = new double[] { 1.0d, 10.0f, (byte) 10, (short) 1, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.remainder(doubleArray3, 0, doubleArray7, 0, doubleArray14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.0d, 10.0d, 10.0d, 1.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray5 = null;
        double[] doubleArray10 = new double[] { 0L, 0.0f, (-1.0d) };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.tanh(doubleArray5, 0, doubleArray10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray7 = new double[] { 0L, 10L };
        double[] doubleArray9 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.sinh(doubleArray7, (int) (byte) 10, doubleArray9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray8 = new double[] { 100.0f, (byte) -1, (short) -1, 0L, 10.0f };
        double[] doubleArray12 = new double[] { (byte) 0, 0.0f };
        double[] doubleArray20 = new double[] { (byte) 10, 100, 'a', 1.0f, (byte) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.subtract(doubleArray8, (int) (byte) 1, doubleArray12, (int) (byte) 0, doubleArray20, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 100.0d, (-1.0d), (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertArrayEquals(doubleArray20, new double[] { (-1.0d), (-1.0d), 97.0d, 1.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray8 = new double[] { 1, (byte) 1, 0.0d, (short) -1, 100.0d };
        double[] doubleArray15 = new double[] { 100.0f, 1, ' ', 10.0d, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.cos(doubleArray8, (int) '#', doubleArray15, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, 1.0d, 0.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 1.0d, 32.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray9 = new double[] { 0L, (byte) 100, (-1.0f), (byte) 1, 0.0f };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan(doubleArray9, (int) '#', doubleArray11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, 100.0d, (-1.0d), 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray10 = new double[] { 0L, 0L, '#', 1, 0 };
        double[] doubleArray14 = new double[] { 10.0f, 0.0f };
        double[] doubleArray22 = new double[] { 10L, 0, (short) 0, (byte) 10, ' ', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.subtract(doubleArray10, (int) (byte) 0, doubleArray14, (int) (short) 100, doubleArray22, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 0.0d, 35.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertArrayEquals(doubleArray22, new double[] { 10.0d, 0.0d, 0.0d, 10.0d, 32.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray4 = new double[] { 10.0d };
        double[] doubleArray10 = new double[] { (-1L), (short) 0, (short) -1, (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            double double11 = dSCompiler2.taylor(doubleArray4, (int) '4', doubleArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 87 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 0.0d, (-1.0d), 0.0d }, 1.0E-15);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray11 = new double[] { 10.0f, (byte) 0, 1, (byte) 100, (byte) 0, (byte) 1 };
        double[] doubleArray18 = new double[] { (short) 100, 100, (-1.0f), (byte) 100, 1L };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.acosh(doubleArray11, (int) (byte) 100, doubleArray18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, 0.0d, 1.0d, 100.0d, 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 100.0d, (-1.0d), 100.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray10 = new double[] { (byte) 0, (short) -1, (byte) 100, 10L, (-1.0f), 1.0d };
        double[] doubleArray18 = new double[] { (short) -1, 100, (-1L), 35, (short) 10, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.acosh(doubleArray10, (int) ' ', doubleArray18, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, (-1.0d), 100.0d, 10.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), 100.0d, (-1.0d), 35.0d, 10.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray9 = new double[] { 10.0f, (byte) -1, (byte) -1, (-1.0f) };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.sin(doubleArray9, 10, doubleArray11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, (-1.0d), (-1.0d), (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray9 = new double[] { 1L, (byte) 0, (byte) 10, 0.0d };
        double[] doubleArray15 = new double[] { 100.0f, 0.0f, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.cosh(doubleArray9, (int) (byte) -1, doubleArray15, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 1.0d, 0.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, 0.0d, 1.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray8 = new double[] { ' ', 10L, (-1) };
        double[] doubleArray11 = null;
        double[] doubleArray15 = new double[] { (byte) 0 };
        double[] doubleArray21 = new double[] { 1.0d, (short) 10, 1.0f };
        double[] doubleArray25 = new double[] { (short) 10, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination((double) 100, doubleArray8, 1, (double) (-1L), doubleArray11, (int) '4', 0.0d, doubleArray15, (int) (byte) 100, 0.0d, doubleArray21, 1, doubleArray25, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 1.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray6 = new double[] { (byte) 1, (short) -1, (byte) 1 };
        double[] doubleArray10 = new double[] { (byte) -1, (byte) 100 };
        double[] doubleArray16 = new double[] { (byte) 1, (byte) -1, 0, 1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.add(doubleArray6, (int) (short) 10, doubleArray10, (int) '4', doubleArray16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 1.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 1.0d, (-1.0d), 0.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray5 = new double[] {};
        double[] doubleArray13 = new double[] { 10.0d, (short) 1, 0L, (short) -1, (byte) 0, 0L };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.tan(doubleArray5, 100, doubleArray13, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 10.0d, 1.0d, 0.0d, (-1.0d), 0.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray5 = new double[] {};
        double[] doubleArray10 = new double[] { (byte) 10, 100.0f, 10.0f };
        double[] doubleArray17 = new double[] { 100L, '4', ' ', 10, 100L };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.subtract(doubleArray5, (int) (short) 0, doubleArray10, (int) (byte) 0, doubleArray17, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 52.0d, 32.0d, 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        double[] doubleArray6 = new double[] { (byte) 100, 100.0d, ' ' };
        double[] doubleArray14 = new double[] { 0, (short) 0, 1.0f, (short) 100, (byte) -1, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.sinh(doubleArray6, (int) (byte) 1, doubleArray14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d, 100.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.3440585709080678E43d, 4.300987426905817E44d, 1.0d, 100.0d, (-1.0d), 1.0d }, 1.0E-15);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray5 = new double[] { 100.0f };
        double[] doubleArray9 = new double[] { 10.0f, 100.0f };
        double[] doubleArray13 = new double[] { (byte) 1, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.divide(doubleArray5, (int) (byte) 0, doubleArray9, (int) (short) 1, doubleArray13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 1.0d, 32.0d }, 1.0E-15);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray7 = new double[] { (byte) 10, 0L, 10 };
        double[] doubleArray15 = new double[] { (byte) 1, '#', (byte) 10, 10, (byte) 10, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.tan(doubleArray7, (int) '#', doubleArray15, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 35.0d, 10.0d, 10.0d, 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        double[] doubleArray6 = new double[] {};
        double[] doubleArray12 = new double[] { '#', '#', (short) 1, 1.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.tanh(doubleArray6, (int) (short) 1, doubleArray12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 35.0d, 35.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        double[] doubleArray8 = new double[] { (short) 0, 1.0f };
        double[] doubleArray10 = null;
        double[] doubleArray15 = new double[] { (byte) 10, '4', 35 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.multiply(doubleArray8, (int) (byte) 10, doubleArray10, 1, doubleArray15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 52.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray5 = new double[] {};
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.log10(doubleArray5, (int) (short) 100, doubleArray7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        double[] doubleArray12 = new double[] { (short) 10, 10L, 10.0f, 10, 0.0d, 10L };
        double[] doubleArray18 = new double[] { (short) -1, (short) -1, 0.0d, 0.0f };
        double[] doubleArray25 = new double[] { 10L, 10.0f, (-1.0d), (short) 0, 100 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.add(doubleArray12, 1, doubleArray18, (int) (short) 10, doubleArray25, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 10.0d, 10.0d, 10.0d, 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { (-1.0d), (-1.0d), 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 10.0d, 10.0d, (-1.0d), 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        double[] doubleArray6 = new double[] { (byte) 0, 100L, (byte) 1 };
        double[] doubleArray14 = new double[] { (byte) 1, (-1L), 100L, (short) 1, 1L };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.rootN(doubleArray6, 0, (int) 'a', doubleArray14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 0.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 0.0d, Double.POSITIVE_INFINITY, Double.NaN, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray5 = new double[] { ' ' };
        double[] doubleArray12 = new double[] { (byte) 10, (byte) 10, 35, 1, 0L };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.asin(doubleArray5, 1, doubleArray12, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 10.0d, 10.0d, 35.0d, 1.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        double[] doubleArray3 = null;
        double[] doubleArray8 = new double[] { 1, (-1.0f), 10L };
        double[] doubleArray13 = new double[] { '#', 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.add(doubleArray3, (int) (short) 100, doubleArray8, (int) (short) 0, doubleArray13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 35.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        double[] doubleArray4 = new double[] { (short) 0 };
        double[] doubleArray10 = new double[] { 100L, 10, '#', (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.log(doubleArray4, (int) (short) -1, doubleArray10, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, 10.0d, 35.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        double[] doubleArray11 = new double[] { (byte) 100, (-1L), (-1), 0L };
        double[] doubleArray15 = new double[] { '4' };
        double[] doubleArray19 = new double[] { (short) 1, (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination((double) (-1L), doubleArray11, 1, (double) 100L, doubleArray15, 100, doubleArray19, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-1.0d), (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray10 = new double[] { 0.0d, (byte) 100, (short) 0, 0, 35 };
        double[] doubleArray17 = new double[] { (-1.0d), (byte) 1, (byte) 100, (byte) -1 };
        double[] doubleArray24 = new double[] { (short) 10, 0.0d, (short) 0, ' ' };
        double[] doubleArray27 = new double[] { 'a' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination(100.0d, doubleArray10, (int) (byte) -1, 100.0d, doubleArray17, (int) (short) 0, (double) 0.0f, doubleArray24, (int) (short) -1, doubleArray27, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 0.0d, 100.0d, 0.0d, 0.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { (-1.0d), 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 10.0d, 0.0d, 0.0d, 32.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 97.0d }, 1.0E-15);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        double[] doubleArray8 = new double[] { (short) 1, (-1) };
        double[] doubleArray13 = new double[] { 0.0f, (-1L), (byte) 10 };
        double[] doubleArray17 = new double[] { 10.0f, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.divide(doubleArray8, 0, doubleArray13, (int) (byte) 100, doubleArray17, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 3 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 0.0d, (-1.0d), 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 10.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray5 = new double[] { 100.0d, 35 };
        double[] doubleArray12 = new double[] { (short) -1, '#', 100.0d, (short) 10, 1 };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.pow(doubleArray5, (int) (byte) 100, doubleArray12, (int) (short) 1, doubleArray14, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), 35.0d, 100.0d, 10.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray8 = new double[] { 0.0d, 0L, (-1) };
        double[] doubleArray16 = new double[] { '#', (byte) 10, 1L, 10, (short) 10, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.sin(doubleArray8, (-1), doubleArray16, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 35.0d, 10.0d, 1.0d, 10.0d, 10.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray7 = new double[] { 100L, 10L, (short) 100, (-1.0d) };
        double[] doubleArray14 = new double[] { (short) -1, 1L, 100.0d, (byte) 0, 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan(doubleArray7, (int) (byte) 0, doubleArray14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 4 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { 1.5607966601082315d, 9.99900009999E-4d, 0.009999000099990002d, (-9.999000099990002E-5d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray7 = new double[] { 100L, (byte) 0 };
        double[] doubleArray9 = new double[] {};
        double[] doubleArray11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.divide(doubleArray7, 1, doubleArray9, (int) (short) -1, doubleArray11, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray9 = new double[] { 100L, 100.0f, (byte) 1, 35, (-1.0f) };
        double[] doubleArray11 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.tanh(doubleArray9, 35, doubleArray11, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 100.0d, 1.0d, 35.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] {}, 1.0E-15);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        double[] doubleArray10 = new double[] { 100.0f, (-1), (short) 100, 1L };
        double[] doubleArray18 = new double[] { 100.0f, (short) 1, 100, 100, 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.acos(doubleArray10, (int) (short) 1, doubleArray18, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 100.0d, (-1.0d), 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 1.0d, 100.0d, 100.0d, 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray5 = new double[] { 0.0d, 1.0d };
        double[] doubleArray7 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.log1p(doubleArray5, (int) (short) 0, doubleArray7, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 0.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] {}, 1.0E-15);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        double[] doubleArray4 = new double[] { '4' };
        double[] doubleArray9 = new double[] { 0.0d, (-1L), (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.sin(doubleArray4, 35, doubleArray9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 0.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        double[] doubleArray8 = new double[] { 0L, (-1L), 0.0f, '#', 100.0d };
        double[] doubleArray16 = new double[] { (-1L), 100.0f, 10, 100L, (byte) -1, 10L };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.tanh(doubleArray8, 35, doubleArray16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, (-1.0d), 0.0d, 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), 100.0d, 10.0d, 100.0d, (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        int int3 = dSCompiler2.getOrder();
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler6 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray8 = dSCompiler6.getPartialDerivativeOrders(35);
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.checkCompatibility(dSCompiler6);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 1 != 35");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(dSCompiler6);
        org.junit.Assert.assertNotNull(intArray8);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        int[] intArray3 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dSCompiler2.getPartialDerivativeIndex(intArray3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 0 != 1");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertArrayEquals(intArray3, new int[] {});
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test60");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray7 = new double[] { 10.0f, (byte) 1, 10 };
        double[] doubleArray9 = new double[] {};
        double[] doubleArray16 = new double[] { (-1), (-1.0f), (byte) -1, 100, 'a' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.subtract(doubleArray7, (int) (short) 10, doubleArray9, (int) (short) 0, doubleArray16, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 10.0d, 1.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { (-1.0d), (-1.0d), (-1.0d), 100.0d, 97.0d }, 1.0E-15);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test61");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray10 = new double[] { 10.0d, ' ', (byte) 100, 0L, 100.0d, (-1.0d) };
        double[] doubleArray15 = new double[] { 1L, (byte) 100, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.tanh(doubleArray10, 100, doubleArray15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d, 32.0d, 100.0d, 0.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 1.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test62");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray8 = new double[] { ' ', 1.0d, 100, 10L, 10.0f };
        double[] doubleArray15 = new double[] { 0.0d, 1, ' ', 1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.pow(doubleArray8, (int) (byte) -1, (int) ' ', doubleArray15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 32.0d, 1.0d, 100.0d, 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 0.0d, 1.0d, 32.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test63");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        double[] doubleArray5 = new double[] { '4', 10.0d };
        double[] doubleArray8 = new double[] { 10L };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atanh(doubleArray5, 0, doubleArray8, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test64");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        double[] doubleArray4 = new double[] { (byte) -1 };
        double[] doubleArray9 = new double[] { 10.0f, 10, 1.0d };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.expm1(doubleArray4, 0, doubleArray9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-0.6321205588285577d), 10.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test65");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray5 = new double[] { 100.0f };
        double[] doubleArray11 = new double[] { '4', 100.0d, (-1L), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.expm1(doubleArray5, 10, doubleArray11, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 52.0d, 100.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test66");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray7 = new double[] { '#', (byte) 10, 0.0f };
        double[] doubleArray12 = new double[] { 1L, 100, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.exp(doubleArray7, (-1), doubleArray12, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 35.0d, 10.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 1.0d, 100.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test67");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        double[] doubleArray12 = new double[] { 100L, 1, 1.0f, 0.0f, (byte) -1, 100.0d };
        double[] doubleArray14 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.sinh(doubleArray12, 36, doubleArray14, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 100.0d, 1.0d, 1.0d, 0.0d, (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test68");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        double[] doubleArray13 = new double[] { (short) 100, (-1), 10.0f, '#', (short) 10, (-1) };
        double[] doubleArray18 = new double[] { (byte) 100, 'a' };
        double[] doubleArray26 = new double[] { (byte) -1, 100.0d, 100, (byte) 1, ' ', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination((double) 0.0f, doubleArray13, (int) (short) 1, (double) 'a', doubleArray18, (int) (byte) 100, doubleArray26, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 100.0d, (-1.0d), 10.0d, 35.0d, 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 100.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertArrayEquals(doubleArray26, new double[] { (-1.0d), 100.0d, 100.0d, 1.0d, 32.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test69");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray3 = new double[] {};
        double[] doubleArray8 = new double[] { 0L, (byte) 0, 0L };
        double[] doubleArray12 = new double[] { (byte) 0, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.pow(doubleArray3, 0, doubleArray8, (int) 'a', doubleArray12, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d, 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { 0.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test70");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        double[] doubleArray8 = new double[] { 10.0d, 100.0d, 35, 1, 100 };
        double[] doubleArray16 = new double[] { (short) 10, 0L, 0, 'a', 100.0f, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.sin(doubleArray8, (int) (byte) -1, doubleArray16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 100.0d, 35.0d, 1.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 10.0d, 0.0d, 0.0d, 97.0d, 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test71");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        int int6 = dSCompiler2.getSize();
        double[] doubleArray11 = new double[] { 10.0f, (-1.0d), 100.0f, 10.0f };
        double[] doubleArray15 = new double[] { (byte) 100, (-1.0d) };
        double[] doubleArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.subtract(doubleArray11, (int) 'a', doubleArray15, (int) (short) 1, doubleArray17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 10.0d, (-1.0d), 100.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 100.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test72");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        double[] doubleArray11 = new double[] { (byte) 1, (short) -1, (-1.0d), (-1L), 100.0f, (byte) 1 };
        double[] doubleArray17 = new double[] { (short) 1, (-1.0d), 1.0d, (short) -1 };
        double[] doubleArray23 = new double[] { (short) 1, ' ', 0.0f, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.remainder(doubleArray11, 35, doubleArray17, (int) (byte) 0, doubleArray23, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d, (-1.0d), (-1.0d), (-1.0d), 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 1.0d, (-1.0d), 1.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 32.0d, 0.0d, (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test73");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) '#');
        double[] doubleArray6 = new double[] {};
        double[] doubleArray10 = new double[] { '4', 0 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.tanh(doubleArray6, (int) (byte) 10, doubleArray10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 52.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test74");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 103");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test75");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) '#');
        int[] intArray7 = dSCompiler2.getPartialDerivativeOrders((int) (byte) 0);
        double[] doubleArray11 = new double[] { (short) -1, (byte) 10, 'a' };
        double[] doubleArray15 = new double[] { (-1.0d), (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.acos(doubleArray11, 100, doubleArray15, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 10.0d, 97.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test76");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray7 = new double[] { 100L, (short) -1, (short) 10, (-1.0d) };
        double[] doubleArray15 = new double[] { (short) -1, (-1L), (short) 10, 0.0d, 36, 100.0d };
        // The following exception was thrown during execution in test generation
        try {
            double double16 = dSCompiler2.taylor(doubleArray7, (int) (byte) 100, doubleArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 135 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, (-1.0d), 10.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), (-1.0d), 10.0d, 0.0d, 36.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test77");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) '#');
        double[] doubleArray10 = new double[] { (short) 1, 35, 100, 1L };
        double[] doubleArray17 = new double[] { 100, 35, '4', (-1), 1L };
        double[] doubleArray24 = new double[] { 1, (-1.0f), 10.0f, '4', (byte) -1, 100 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.compose(doubleArray10, (int) (short) 10, doubleArray17, doubleArray24, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 35.0d, 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertArrayEquals(doubleArray17, new double[] { 100.0d, 35.0d, 52.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertArrayEquals(doubleArray24, new double[] { 1.0d, (-1.0d), 10.0d, 52.0d, (-1.0d), 100.0d }, 1.0E-15);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test78");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) '#');
        int[] intArray7 = dSCompiler2.getPartialDerivativeOrders((int) (byte) 0);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler10 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        int int11 = dSCompiler10.getOrder();
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.checkCompatibility(dSCompiler10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.math3.exception.DimensionMismatchException; message: 35 != 1");
        } catch (org.apache.commons.math3.exception.DimensionMismatchException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(dSCompiler10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test79");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        double[] doubleArray7 = new double[] { (-1.0f) };
        double[] doubleArray15 = new double[] { 10.0d, (byte) 0, 0L, 10, '#', 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan(doubleArray7, (int) (byte) -1, doubleArray15, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { 10.0d, 0.0d, 0.0d, 10.0d, 35.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test80");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        int int3 = dSCompiler2.getSize();
        double[] doubleArray5 = new double[] { '4' };
        double[] doubleArray11 = new double[] { 100.0f, (-1), 36, '#' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.log10(doubleArray5, 11, doubleArray11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 11 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 52.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 100.0d, (-1.0d), 36.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test81");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.checkCompatibility(dSCompiler3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test82");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        double[] doubleArray4 = new double[] { 10L };
        double[] doubleArray11 = new double[] { ' ', (short) -1, 'a', 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.pow(doubleArray4, (int) '#', (int) (short) 1, doubleArray11, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 32.0d, (-1.0d), 97.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test83");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) '#');
        int[] intArray7 = dSCompiler2.getPartialDerivativeOrders((int) (byte) 0);
        double[] doubleArray11 = new double[] { (-1), 0, 10.0f };
        double[] doubleArray19 = new double[] { 100.0f, 100.0f, (short) 0, 0.0f, (-1.0f), (byte) 1 };
        double[] doubleArray27 = new double[] { (short) 100, (byte) 10, (byte) 100, '4', 1.0f, 1 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.add(doubleArray11, (int) (short) 0, doubleArray19, (int) (short) 10, doubleArray27, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { (-1.0d), 0.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { 100.0d, 100.0d, 0.0d, 0.0d, (-1.0d), 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertArrayEquals(doubleArray27, new double[] { 100.0d, 10.0d, 100.0d, 52.0d, 1.0d, 1.0d }, 1.0E-15);
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test84");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        int[] intArray7 = dSCompiler2.getPartialDerivativeOrders((int) '#');
        double[] doubleArray14 = new double[] { (-1L), 100.0f, (short) 100, 1, 0L };
        double[] doubleArray21 = new double[] { (short) 100, 0, 11, 10.0d };
        double[] doubleArray25 = new double[] { 0 };
        double[] doubleArray30 = new double[] { (short) 0, (-1.0d), 35 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination(100.0d, doubleArray14, (int) 'a', (double) (-1.0f), doubleArray21, (int) (byte) 0, (double) 0L, doubleArray25, 0, doubleArray30, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] { (-1.0d), 100.0d, 100.0d, 1.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 100.0d, 0.0d, 11.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertArrayEquals(doubleArray25, new double[] { 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertArrayEquals(doubleArray30, new double[] { 0.0d, (-1.0d), 35.0d }, 1.0E-15);
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test85");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        double[] doubleArray6 = new double[] { (byte) 10, (byte) 100, (-1.0d) };
        double[] doubleArray9 = new double[] { (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.log(doubleArray6, (int) (short) 100, doubleArray9, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 10.0d, 100.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 10.0d }, 1.0E-15);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test86");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int int4 = dSCompiler2.getSize();
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36 + "'", int4 == 36);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test87");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        int int6 = dSCompiler2.getSize();
        double[] doubleArray8 = new double[] { 1L };
        double[] doubleArray16 = new double[] { 100.0f, 1L, 0L, (-1.0f), (short) -1, 0.0f };
        double[] doubleArray23 = new double[] { 1.0d, 10.0d, 1.0d, (byte) 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.pow(doubleArray8, (int) (byte) 0, doubleArray16, (int) (short) 10, doubleArray23, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 1 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 100.0d, 1.0d, 0.0d, (-1.0d), (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 1.0d, 10.0d, 1.0d, 100.0d, 35.0d }, 1.0E-15);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test88");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        int int3 = dSCompiler2.getOrder();
        double[] doubleArray9 = new double[] { 100, (short) 1, 100.0f, (byte) 1, 1.0d };
        double[] doubleArray16 = new double[] { 35, (short) 100, 100, (short) -1, (-1.0f) };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.tanh(doubleArray9, (int) ' ', doubleArray16, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { 100.0d, 1.0d, 100.0d, 1.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertArrayEquals(doubleArray16, new double[] { 35.0d, 100.0d, 100.0d, (-1.0d), (-1.0d) }, 1.0E-15);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test89");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        int int6 = dSCompiler2.getSize();
        double[] doubleArray12 = new double[] { (byte) -1, (-1.0d), (byte) 0, 36, '#' };
        double[] doubleArray14 = new double[] {};
        double[] doubleArray21 = new double[] { ' ', 10L, (-1.0d), (-1.0d), 10 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan2(doubleArray12, 36, doubleArray14, (int) (short) -1, doubleArray21, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 36 + "'", int6 == 36);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertArrayEquals(doubleArray12, new double[] { (-1.0d), (-1.0d), 0.0d, 36.0d, 35.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertArrayEquals(doubleArray14, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertArrayEquals(doubleArray21, new double[] { 32.0d, 10.0d, (-1.0d), (-1.0d), 10.0d }, 1.0E-15);
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test90");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray3 = new double[] {};
        double[] doubleArray8 = new double[] { 10, 10.0d };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.rootN(doubleArray3, (int) (short) -1, (int) (byte) 10, doubleArray8, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertArrayEquals(doubleArray3, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 10.0d }, 1.0E-15);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test91");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray6 = new double[] { (byte) 100 };
        double[] doubleArray13 = new double[] { '#', (short) 100, '4', (short) 100 };
        double[] doubleArray18 = new double[] { 1.0d, 10, 0.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination((double) (byte) -1, doubleArray6, 0, (double) 10.0f, doubleArray13, (int) (short) 10, doubleArray18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 35.0d, 100.0d, 52.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 1.0d, 10.0d, 0.0d }, 1.0E-15);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test92");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        double[] doubleArray8 = new double[] { (byte) 10, (short) 10 };
        double[] doubleArray11 = new double[] { 1.0d };
        double[] doubleArray19 = new double[] { (byte) -1, (byte) -1, ' ', 10L, '#', 11 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.add(doubleArray8, (int) ' ', doubleArray11, (int) (short) 1, doubleArray19, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 10.0d, 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertArrayEquals(doubleArray11, new double[] { 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertArrayEquals(doubleArray19, new double[] { (-1.0d), (-1.0d), 32.0d, 10.0d, 35.0d, 11.0d }, 1.0E-15);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test93");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) '#');
        double[] doubleArray9 = new double[] { (byte) -1, (byte) 100 };
        double[] doubleArray18 = new double[] { 0, (short) 1, 1, 100L, 100.0f, 100 };
        double[] doubleArray23 = new double[] { 0.0f, 0.0f };
        double[] doubleArray31 = new double[] { ' ', (-1L), 1L, '4', (-1) };
        double[] doubleArray33 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.linearCombination(0.0d, doubleArray9, (int) (short) 100, (double) 100.0f, doubleArray18, (int) (byte) 100, (double) 100L, doubleArray23, 36, (double) 10, doubleArray31, (int) (short) 10, doubleArray33, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertArrayEquals(doubleArray9, new double[] { (-1.0d), 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertArrayEquals(doubleArray18, new double[] { 0.0d, 1.0d, 1.0d, 100.0d, 100.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertArrayEquals(doubleArray23, new double[] { 0.0d, 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertArrayEquals(doubleArray31, new double[] { 32.0d, (-1.0d), 1.0d, 52.0d, (-1.0d) }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertArrayEquals(doubleArray33, new double[] {}, 1.0E-15);
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test94");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        double[] doubleArray4 = new double[] {};
        double[] doubleArray6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.expm1(doubleArray4, 36, doubleArray6, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 36 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertArrayEquals(doubleArray4, new double[] {}, 1.0E-15);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test95");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) (short) 1, (int) (byte) 10);
        int int3 = dSCompiler2.getSize();
        double[] doubleArray6 = new double[] { 35, (short) 100 };
        double[] doubleArray10 = new double[] { (byte) 1, 36 };
        double[] doubleArray13 = new double[] { 36 };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.divide(doubleArray6, (int) (byte) 1, doubleArray10, (int) '#', doubleArray13, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 2 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 11 + "'", int3 == 11);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertArrayEquals(doubleArray6, new double[] { 35.0d, 100.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 1.0d, 36.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertArrayEquals(doubleArray13, new double[] { 36.0d }, 1.0E-15);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test96");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray5 = new double[] { 100L, 1.0f };
        double[] doubleArray8 = new double[] { 0.0d };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan(doubleArray5, (int) (short) 10, doubleArray8, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertArrayEquals(doubleArray5, new double[] { 100.0d, 1.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] { 0.0d }, 1.0E-15);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test97");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int int3 = dSCompiler2.getFreeParameters();
        int[] intArray5 = dSCompiler2.getPartialDerivativeOrders((int) (short) 0);
        int[] intArray7 = dSCompiler2.getPartialDerivativeOrders((int) '#');
        double[] doubleArray8 = new double[] {};
        double[] doubleArray10 = new double[] {};
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.asinh(doubleArray8, 0, doubleArray10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertArrayEquals(doubleArray8, new double[] {}, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] {}, 1.0E-15);
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test98");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        double[] doubleArray7 = new double[] { 100, ' ', (-1), 0.0d };
        double[] doubleArray10 = new double[] { 10.0d };
        double[] doubleArray15 = new double[] { (-1L), ' ', 100.0f };
        // The following exception was thrown during execution in test generation
        try {
            dSCompiler2.atan2(doubleArray7, 0, doubleArray10, (int) 'a', doubleArray15, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertArrayEquals(doubleArray7, new double[] { 100.0d, 32.0d, (-1.0d), 0.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertArrayEquals(doubleArray10, new double[] { 10.0d }, 1.0E-15);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertArrayEquals(doubleArray15, new double[] { (-1.0d), 32.0d, 100.0d }, 1.0E-15);
    }

    @Test
    public void test99() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test99");
        org.apache.commons.math3.analysis.differentiation.DSCompiler dSCompiler2 = org.apache.commons.math3.analysis.differentiation.DSCompiler.getCompiler((int) '#', 1);
        int[] intArray4 = dSCompiler2.getPartialDerivativeOrders(35);
        java.lang.Class<?> wildcardClass5 = dSCompiler2.getClass();
        org.junit.Assert.assertNotNull(dSCompiler2);
        org.junit.Assert.assertNotNull(intArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }
}

